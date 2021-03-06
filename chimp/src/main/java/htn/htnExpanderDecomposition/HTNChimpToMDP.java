package htn.htnExpanderDecomposition;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.logging.Logger;

import org.metacsp.meta.TCSP.TCSPSolver;
import org.metacsp.multi.TCSP.DistanceConstraint;
import org.metacsp.multi.TCSP.DistanceConstraintSolver;
import org.metacsp.multi.TCSP.MultiTimePoint;
import org.metacsp.time.Bounds;

import aima.core.probability.mdp.search.ValueIteration;
import edu.cmu.ita.htn.Constraint;
import edu.cmu.ita.htn.HTNFactory;
import edu.cmu.ita.htn.MultiState;
import edu.cmu.ita.htn.RunStats;
import edu.cmu.ita.mdp.TransitionMatrix;
import fluentSolver.FluentNetworkSolver;
import htn.IntegerConstraintTemplate;
import htn.MDPTemplate;
import htn.Stats;
import htn.Stats.Timer;
import htn.Stats.TimerName;
import jason.asSemantics.Unifier;
import jason.asSyntax.Term;
import mdpSolver.HTNAction;
import mdpSolver.HTNReward;
import mdpSolver.HTNState;
import mdpSolver.HTNTaskNetwork;
import mdpSolver.HTNTransitionProbabilityFunction;
import mdpSolver.HtnMdpFactory;
import planner.CHIMP.CHIMPBuilder;
import resourceFluent.ResourceUsageTemplate;
import resourceFluent.ResourceUsageTemplate.ResourceMan;

/**
 * @author meneguzzi ,
 * @updated by Hatem
 */
public class HTNChimpToMDP {

	private static final Logger logger = Logger.getLogger(HTNChimpToMDP.class.getName());
	static Boolean resourceSolver = false;
	public HTNTaskNetwork fullyExpanded;
	public HTNExpander expander;

	public final static HTNAction createMDPActions(LinkedList<htn.htnExpanderDecomposition.Task> linkedList) {
		HashSet<String> uniqueActions = new HashSet<String>();
		HTNAction actions = new HTNAction();
		int id = 0;
		for (Task t : linkedList) {
			String actionName = t.getActionName();
			if (!uniqueActions.contains(actionName)) {
				HTNAction a = new HTNAction(id++, actionName);
				actions.SetAction(a);
			}
		}
		return actions;
	}

	public final static Set<HTNState> createMDPStates(HashMap<Task, MultiState> mStates, List<Task> tasks) {
		logger.info("Creating MDP states");

		HTNState states[] = new HTNState[tasks.size()];

		for (int i = 0; i < tasks.size(); i++) {
			
			Task ti = tasks.get(i);
			MultiState m = new MultiState(mStates.get(ti), false);
			MultiState si = new MultiState(m, false);


			for (int j = 0; j < i; j++) {
				Task tj = tasks.get(j);
				//pour ignorer l'ecrasement 
				//if(!tj.getName().startsWith(ti.getName())) {
				//	si.removeAll(mStates.get(tj));
				//}
				si.removeAll(mStates.get(tj));


			}
			states[i] = new HTNState(i, si.toString(), si, ti);

			for (int j = 0; j < i; j++) {
				Task tj = tasks.get(j);
				if (states[i].htnState.intersects(mStates.get(tj))) {
					states[i].overlapping.add(states[j]);
				}
				states[i].htnState.removeAll(mStates.get(tj));
			}
			// We add s itself to the overlapping list to make it easier to calculate things
			// in #createTransitionTables
			if (!si.isEmpty()) {
				states[i].getOverlapping().add(states[i]);
			}
		}

		return new LinkedHashSet<HTNState>(Arrays.asList(states));
	}

	public final static HTNTransitionProbabilityFunction createTransitionModel(HTNAction actions,
			HTNTaskNetwork fullyExpanded, Set<HTNState> states, List<HTNState> finalStates) throws Exception {
		logger.info("Creating Transition Model for MDP");

		HTNTransitionProbabilityFunction transitionModel = new HTNTransitionProbabilityFunction(finalStates);
		HashMap<Task, HTNState> stateTable = new HashMap<Task, HTNState>();

		// TCSP
		int maxResourceLevel = 0;
		TCSPSolver metaSolver;
		DistanceConstraintSolver groundSolver = null;
		MultiTimePoint init = null;
		if (!fullyExpanded.getResourceSchedulers().isEmpty()) {
			resourceSolver = true;
			maxResourceLevel = fullyExpanded.getResourceSchedulers().get(0).getCapacity();
			// create TCSP solver and add variables for each state
			metaSolver = new TCSPSolver(0, maxResourceLevel, 0);
			groundSolver = (DistanceConstraintSolver) metaSolver.getConstraintSolvers()[0];
			init = groundSolver.getSink();

			for (HTNState s : states) {
				stateTable.put((Task) s.getTask(), s);
				((Task) s.getTask()).setRCVariable((MultiTimePoint) groundSolver.createVariable());
			}
		} else
			for (HTNState s : states) {
				stateTable.put((Task) s.getTask(), s);
			}

		for (HTNAction action : actions.actions()) {
			TransitionMatrix matrix = new TransitionMatrix(states.size());
			for (Constraint c : fullyExpanded.getConstraints()) {
				if (c.getTask2().getActionName().equals(action.getName())) {
					HTNState i = stateTable.get(c.getTask1());

					HTNState j = stateTable.get(c.getTask2());
					// j.setReward(c.getTask2().op.getCost());

					if (i == null)
						throw new RuntimeException(
								"Tried to create a transition for a non-existent state: " + c.getTask1());
					if (j == null)
						throw new RuntimeException(
								"Tried to create a transition for a non-existent state: " + c.getTask2());
					// If i is the origin of any transition, then it cannot be final
					i.setFinal(false);

//					double s = matrix.get(i, j);
//					matrix.set(i, j, s+1);
					for (HTNState si : i.overlapping) {
						for (HTNState sj : j.overlapping) {
							int sid = si.getId();
							int sjd = sj.getId();
							double s = matrix.get(sid, sjd);
							matrix.set(sid, sjd, s + (1 / j.modulo()));
						}
					}
				}
			}
			matrix.normalizeToOne(0, 0);
			List<HTNState> lstate = new ArrayList<>(states);

			for (int i = 0; i < states.size(); i++) {
				for (int j = 0; j < states.size(); j++) {
					double prob = matrix.get(i, j);
					if (prob != 0) {
						HTNState si = lstate.get(i);
						HTNState sj = lstate.get(j);

						MDPTemplate temMDP = ((Task) sj.getTask()).getmDPTemplate();
						List<MDPTemplate> templates = temMDP.getMdpTemplates();
						Unifier terms = sj.getTask().getUnifier();
						if (!templates.isEmpty())
							for (MDPTemplate m : templates) {
								// assign probability
								if (m.getTransitionProbability() != null) {
									String c = null;
									// update it with unifier
									c = HTNChimpDomain.convertLISPTerm(m.getValueRestriction().varName);
									Term var = terms.get(c);

									if (m.getValueRestriction().constants.contains(var.toString()))
										transitionModel.setTransitionProbability(si, action, sj,
												m.getTransitionProbability());
									else if ((temMDP.getTransitionProbability() != null)
											&& (!transitionModel.exists(si, action, sj)))
										transitionModel.setTransitionProbability(si, action, sj,
												temMDP.getTransitionProbability());
								} else { // when if (T)( Only Reward), assign the Else
									if ((temMDP.getTransitionProbability() != null)
											&& (!transitionModel.exists(si, action, sj)))
										transitionModel.setTransitionProbability(si, action, sj,
												temMDP.getTransitionProbability());
								}
							}
						// when no if else
						else if ((temMDP.getTransitionProbability() != null))
							transitionModel.setTransitionProbability(si, action, sj, temMDP.getTransitionProbability());

						// assign for the initial state
//						if ((si.getTask().toString().equals("s0")) && (!transitionModel.exists(si, action, sj)))
//							transitionModel.setTransitionProbability(si, action, sj, 1);

						if (resourceSolver) {
							// create the distance constraints of TCSP
							int level = ((Task) sj.getTask()).getResourceUsageIndicators().get(0)
									.getResourceUsageLevel();
							int levelI = (int) ((Task) si.getTask()).getRCVariable().getUpperBound();

							List<ResourceUsageTemplate> manipulationTemps = ((Task) sj.getTask())
									.getResourceUsageIndicators().get(0).getResourceManipulationTemplates();
							if (!manipulationTemps.isEmpty() || (manipulationTemps != null)) {
								for (ResourceUsageTemplate rt : manipulationTemps) {
									if (rt.getValueRestriction() != null) {
										// verify if the value restriction equal to value the parameter of the
										// operator(unifier)
										String c = HTNChimpDomain.convertLISPTerm(rt.getValueRestriction().varName);
										Term var = terms.get(c);
										if (rt.getValueRestriction().constants.contains(var.toString())) {
											if (rt.getResManip().equals(ResourceMan.Increase))
												level -= rt.getResourceUsageLevel();
											else if (rt.getResManip().equals(ResourceMan.Decrease))
												level += rt.getResourceUsageLevel();
										}

									} else {
										if (rt.getResManip().equals(ResourceMan.Increase))
											level -= rt.getResourceUsageLevel();
										if (rt.getResManip().equals(ResourceMan.Decrease))
											level += rt.getResourceUsageLevel();
									}

								}
							}

							// check that level will not surpass the maxResourceLevel
							// TODO to update!!
							if (maxResourceLevel < (levelI - level))
								level = levelI - maxResourceLevel;
							Bounds bounds = new Bounds(-level, -level);
							DistanceConstraint DC = new DistanceConstraint(bounds);

							if (si.getTask().toString().equals("s0"))
								DC.setFrom(init);
							else
								DC.setFrom(((Task) si.getTask()).getRCVariable());

							DC.setTo(((Task) sj.getTask()).getRCVariable());

							if (si.getRemainedResource())
								sj.setRemainedResource(groundSolver.addConstraint(DC));
							else
								sj.setRemainedResource(false);

						}

//						
//						if (((Task) si.getTask()).getmDPTemplate().getTransitionProbability() != null)
//							transitionModel.setTransitionProbability(si, action, sj,
//									((Task) si.getTask()).getmDPTemplate().getTransitionProbability());
//						else
//							transitionModel.setTransitionProbability(si, action, sj, 1);

//						if(si.getId()==2) 
//							transitionModel.setTransitionProbability(si, action, sj, 0.5);
//						
//						if((si.getId()==6) && (sj.getId() == 7) )
//							transitionModel.setTransitionProbability(si, action, sj, 0.3);
//						
//						if((si.getId()==6) && (sj.getId() == 8) )
//							transitionModel.setTransitionProbability(si, action, sj, 0.7);
//						
//						if((si.getId()==13) && (sj.getId() == 14) )
//							transitionModel.setTransitionProbability(si, action, sj, 0.3);
//						
//						if((si.getId()==13) && (sj.getId() == 15) )
//							transitionModel.setTransitionProbability(si, action, sj, 0.7);

						// update transition to test
//						HTNState s1 = lstate.get(1);//getCare
//						HTNState s2 = lstate.get(2);//at airport
//						HTNState s3 = lstate.get(6);//at Harbor
//						
//						if(si.equals(s1) && sj.equals(s2))
//							transitionModel.setTransitionProbability(si, action, sj, 0.1);
//
//						if(si.equals(s1) && sj.equals(s3))
//							transitionModel.setTransitionProbability(si, action, sj, 0.9);

					}
				}
			}
		}
		return transitionModel;
	}

	// a reward is constant everywhere except the goal
	public final static HTNReward useDefaultReward(Set<HTNState> states, HTNTaskNetwork fullyExpanded) {
		HTNReward rewardFunction = new HTNReward() {
		};
		for (HTNState sp : states) {
			MDPTemplate temMDP = ((Task) sp.getTask()).getmDPTemplate();
			List<MDPTemplate> templates = temMDP.getMdpTemplates();
			Unifier terms = sp.getTask().getUnifier();
			long remainedRC = -99;
			if ((resourceSolver) && (sp.getRemainedResource()))
				remainedRC = ((Task) sp.getTask()).getRCVariable().getUpperBound();
			if ((templates.size() > 0) && (temMDP.getReward() != null))
				for (MDPTemplate m : templates) {
					if (m.getReward() != null) {
						// assign the reward based on value restriction
						if (m.getValueRestriction() != null) {
							String c = null;
							// update it with unifier
							c = HTNChimpDomain.convertLISPTerm(m.getValueRestriction().varName);
							Term var = terms.get(c);
							if (m.getValueRestriction().constants.contains(var.toString()))
								rewardFunction.setReward(sp, m.getReward());
							else if ((temMDP.getReward() != null) && (!rewardFunction.exists(sp)))
								rewardFunction.setReward(sp, temMDP.getReward());
						} else if ((m.getRManip() != null)) {
							// increase/decrease the reward
							if (m.getIC() != null) {

//								IntegerConstraintTemplate integerConstr = m.getIC();
//								int threshold = integerConstr.cste;
//								System.out.println("switchf(remainedRC, m) :" + switchf(remainedRC, m));
//								System.out.println("threshold:" + threshold + "remainedRC" + remainedRC);
								if (switchf(remainedRC, m)) // if IC == True
									if (!sp.isFinal())
										rewardFunction.setReward(sp, rewardMan(m, temMDP));
									else {
										Double a = rewardMan(m, rewardFunction.getRewardFor(sp));
										rewardFunction.setReward(sp, rewardMan(m, rewardFunction.getRewardFor(sp)));

									}
								else if (sp.isFinal()) // for final states IC = False
									rewardFunction.setReward(sp, rewardFunction.getRewardFor(sp));
								else // non-final states + IC = False
									rewardFunction.setReward(sp, temMDP.getReward());

							}
						}

					}
				}
			else if ((temMDP.getReward() != null))
				rewardFunction.setReward(sp, temMDP.getReward());

			// assign the reward to the initial state
			if ((sp.getTask().toString().equals("s0")) && (!rewardFunction.exists(sp)))
				rewardFunction.setReward(sp, -0.4);
		}
		return rewardFunction;
	}

	private static Double rewardMan(MDPTemplate m, MDPTemplate temMDP) {
		double value = 0;
		switch (m.getRManip()) {
		case Decrease:
			value = temMDP.getReward() - m.getReward();
			return Math.round(value * 1e5) / 1e5;
		case Increase:
			value = temMDP.getReward() + m.getReward();
			return Math.round(value * 1e5) / 1e5;
		}
		return null;
	}

	private static Double rewardMan(MDPTemplate m, Double finalReward) {
		double value = 0;
		switch (m.getRManip()) {
		case Decrease:
			value = finalReward - m.getReward();
			return Math.round(value * 1e5) / 1e5;
		case Increase:
			value = finalReward + m.getReward();
			return Math.round(value * 1e5) / 1e5;
		}
		return null;
	}

	private static boolean switchf(long remained, MDPTemplate m) {
		IntegerConstraintTemplate integerConstr = m.getIC();
		int threshold = integerConstr.cste;
		String op = integerConstr.op1;
		Boolean verif = false;
		switch (op) {
		case ">=":
			verif = (remained >= threshold);
			break;
		case "<=":
			verif = (remained <= threshold);
			break;
		case "<":
			verif = (remained < threshold);
			break;
		case ">":
			verif = (remained > threshold);
			break;
		case "!=":
			verif = (remained != threshold);
			break;
		}
		return verif;
	}

	// a reward is constant everywhere except the goal
	public final static HTNReward createConstantRewardFunction(Set<HTNState> states, HTNTaskNetwork fullyExpanded) {
		HTNReward rewardFunction = new HTNReward() {
		};
		for (HTNState sp : states) {
			double reward = getBaseReward(sp.htnState);

			if (!sp.isFinal())
				rewardFunction.setReward(sp, reward * -0.04);
			else
				rewardFunction.setReward(sp, reward * 1);
		}
		return rewardFunction;
	}

	// a reward is proportional to distance to the goal
	// length to the goal task
	public final static HTNReward createProportionalRewardFunction(Set<HTNState> states, HTNTaskNetwork fullyExpanded) {
		HTNReward rewardFunction = new HTNReward() {
		};
		for (HTNState sp : states) {
			double reward = getBaseReward(sp.htnState);
			Task t0 = fullyExpanded.getFirstTask();
			double kappa = fullyExpanded.maxpath(t0, sp.getTask());
			// Here, the paper states that the reward is for (t0.getActionName(), sp.s)
			reward = kappa * reward;
			rewardFunction.setReward(sp, reward);
			;
		}
		return rewardFunction;
	}

	// a reward is favorise the shortest path via northTable
	public final static HTNReward createScenario1RewardFunction(Set<HTNState> states, HTNTaskNetwork fullyExpanded) {
		HTNReward rewardFunction = new HTNReward() {
		};
		for (HTNState sp : states) {
			double reward = getBaseReward(sp.htnState);

			if (!sp.isFinal()) {
				if (sp.getId() == 3)
					rewardFunction.setReward(sp, reward * -0.03);
				else
					rewardFunction.setReward(sp, reward * -0.04);
			} else {
				if (sp.getId() == 7)
					rewardFunction.setReward(sp, reward * 2);
				else
					rewardFunction.setReward(sp, reward * 1);
			}
		}
		return rewardFunction;
	}

	// a reward is favorise the longest/safer path via northTable
	public final static HTNReward createScenario2RewardFunction(Set<HTNState> states, HTNTaskNetwork fullyExpanded) {
		HTNReward rewardFunction = new HTNReward() {
		};
		for (HTNState sp : states) {
			double reward = getBaseReward(sp.htnState);

			if (!sp.isFinal()) {
				if (sp.getId() == 3)
					rewardFunction.setReward(sp, reward * -0.03);
				else
					rewardFunction.setReward(sp, reward * -0.04);
			} else {
				if (sp.getId() == 9)
					rewardFunction.setReward(sp, reward * 1.1);
				else
					rewardFunction.setReward(sp, reward * 1);
			}
		}
		return rewardFunction;
	}

	// a reward is favorise the longest/safer path via southTable
	public final static HTNReward createScenario3RewardFunction(Set<HTNState> states, HTNTaskNetwork fullyExpanded) {
		HTNReward rewardFunction = new HTNReward() {
		};
		for (HTNState sp : states) {
			double reward = getBaseReward(sp.htnState);

			if (!sp.isFinal()) {
				if (sp.getId() == 10)
					rewardFunction.setReward(sp, reward * -0.03);
				else
					rewardFunction.setReward(sp, reward * -0.04);
			} else {
				if (sp.getId() == 16)
					rewardFunction.setReward(sp, reward * 1.1);
				else
					rewardFunction.setReward(sp, reward * 1);
			}
		}
		return rewardFunction;
	}

	private final static int getBaseReward(MultiState state) {
		return 1;
	}

//	private final static Double getBaseReward(HTNState state) {
//		return state.getReward();
//	}

	public final HtnMdpFactory<HTNState, HTNAction> MDP(FluentNetworkSolver fluentSolver, CHIMPBuilder builder,
			HTNChimpDomain hTNd) throws Exception {
		//

		// expanding the HTN
		startTimer(TimerName.EXPANDER);
		expander = new HTNExpander();
		fullyExpanded = expander.createFullyExpandedHTN(fluentSolver, hTNd);
		endTimer(TimerName.EXPANDER);

		// get methods
		HashMap<Task, MultiState> mStates = expander.getMStates();

		gatherStatsHTNStates(mStates);

		// Get actions
		HTNAction actions = HTNChimpToMDP.createMDPActions(fullyExpanded.getOrderedTasks1());

		// We insert s0 here as a task so the full expansion will have constraints s0 <<
		// topLevelDerivations
		Task t0 = new Task(HTNFactory.createTask("s0"));
		mStates.put(t0, new MultiState(expander.getS0()));
		Collection<Task> unprec = fullyExpanded.getUnpreceededTasks1();
		fullyExpanded.addTask(t0);
		for (Task t : unprec) {
			fullyExpanded.addBeforeConstraint(t0, t);
		}

		List<Task> tasks = new ArrayList<Task>(fullyExpanded.getOrderedTasks1());

		// create states
		startTimer(TimerName.STATES);
		Set<HTNState> states = HTNChimpToMDP.createMDPStates(mStates, tasks);
		endTimer(TimerName.STATES);

		List<HTNState> finalStates = new ArrayList<HTNState>();

		// get transition function
		startTimer(TimerName.TRANSITION);
		HTNTransitionProbabilityFunction transitionModel = HTNChimpToMDP.createTransitionModel(actions, fullyExpanded,
				states, finalStates);
		endTimer(TimerName.TRANSITION);

		// Display transitions
		// transitionModel.display();

		// use the the specified rewards in the domain
		
		startTimer(TimerName.REWARD);
		HTNReward rewardFunction = HTNChimpToMDP.useDefaultReward(states, fullyExpanded);
		endTimer(TimerName.REWARD);

		// get or create reward function
		// HTNReward rewardFunction = createProportionalRewardFunction(states,
		// fullyExpanded);
		// HTNReward rewardFunction = HTNChimpToMDP.createConstantRewardFunction(states,
		// fullyExpanded);

		// a reward is favorise the shortest path via northTable
		// HTNReward rewardFunction =
		// HTNChimpToMDP.createScenario1RewardFunction(states, fullyExpanded);

		// a reward is favorise the longest/safer path via northTable
		// HTNReward rewardFunction =
		// HTNChimpToMDP.createScenario2RewardFunction(states, fullyExpanded);

		// a reward is favorise the longest/safer path via northTable
		// HTNReward rewardFunction =
		// HTNChimpToMDP.createScenario3RewardFunction(states, fullyExpanded);

		return new HtnMdpFactory<HTNState, HTNAction>(states, new ArrayList<>(states).get(0), actions, transitionModel,
				rewardFunction);
	}

	public HtnMdpFactory<HTNState, HTNAction> convertHTN(FluentNetworkSolver fluentSolver, CHIMPBuilder builder,
			HTNChimpDomain hTNd) throws Exception {

		startTimer(TimerName.CONVERTER);
		HtnMdpFactory<HTNState, HTNAction> mdp = MDP(fluentSolver, builder, hTNd);
		endTimer(TimerName.CONVERTER);
		return mdp;

	}

	public Map<HTNState, Double> PlanVI(HtnMdpFactory<HTNState, HTNAction> mdp, double discountFactor) {

		startTimer(TimerName.SOLVER);
		ValueIteration<HTNState, HTNAction> pi = new ValueIteration<HTNState, HTNAction>(discountFactor);
		Map<HTNState, Double> policy = pi.valueIteration(mdp, 0.0001);
		endTimer(TimerName.SOLVER);

		return policy;
	}

	public static Stats stats;

	/**
	 * A "macro" method to check the {@link RunStats} stats object before starting a
	 * {@link Timer}.
	 * 
	 * @param tm
	 */
	private final static void startTimer(TimerName tm) {
		if (stats != null) {
			stats.startRuntime(tm);
		}
	}

	/**
	 * A "macro" method to check the {@link RunStats} stats object before ending a
	 * {@link Timer}.
	 * 
	 * @param tm
	 */
	private final static void endTimer(TimerName tm) {
		if (stats != null) {
			stats.endRuntime(tm);
		}
	}

	/*
	 * Returns the number of unique states in the set of possible states
	 * 
	 * @param mStates
	 * 
	 * @return
	 */
	final static MultiState uniqueStates(HashMap<Task, MultiState> mStates) {
		MultiState megaState = new MultiState();
		for (MultiState ms : mStates.values()) {
			megaState.addAll(ms);
		}
		return megaState;
	}

	/**
	 * A "macro" method to add stats to the {@link RunStats} object if existent
	 * 
	 * @param mStates
	 */
	private final static void gatherStatsHTNStates(HashMap<Task, MultiState> mStates) {
		int htnStates = uniqueStates(mStates).size();
		if (stats != null) {
			stats.htnStates = htnStates;
		}
		logger.info("Number of states in the HTN: " + htnStates);
	}

}
