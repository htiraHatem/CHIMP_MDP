package mdpSolver;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.logging.Logger;

import aima.core.probability.mdp.Policy;
import aima.core.probability.mdp.impl.ModifiedPolicyEvaluation;
import aima.core.probability.mdp.search.PolicyIteration;
import aima.core.probability.mdp.search.ValueIteration;
import edu.cmu.ita.htn.Constraint;
import edu.cmu.ita.htn.HTNDomain;
import edu.cmu.ita.htn.HTNExpander;
import edu.cmu.ita.htn.HTNFactory;
import edu.cmu.ita.htn.MultiState;
import edu.cmu.ita.htn.Problem;
import edu.cmu.ita.htn.Task;
import edu.cmu.ita.htn.TaskNetwork;
import edu.cmu.ita.htn.parser.HTNParser;
import edu.cmu.ita.mdp.TransitionMatrix;
import edu.cmu.ita.mdp.aima.MDPState;
import ui.Dot2Graph;

/**
 * @author meneguzzi , 
 * @updated by Hatem
 */
public class HTNNetworkToMDP {

	private static final Logger logger = Logger.getLogger(HTNNetworkToMDP.class.getName());

	/**
	 * Creates {@link MDPState}s like in Algorithm 3 from the IJCAI paper.
	 * 
	 * @param mStates
	 * @param tasks
	 * @return
	 */
	public final static Set<HTNState> createMDPStates(HashMap<Task, MultiState> mStates, List<Task> tasks) {
		logger.info("Creating MDP states");

		HTNState states[] = new HTNState[tasks.size()];

		for (int i = 0; i < tasks.size(); i++) {
			Task ti = tasks.get(i);
			MultiState m = new MultiState(mStates.get(ti), false);
			MultiState si = new MultiState(m, false);

			for (int j = 0; j < i; j++) {
				Task tj = tasks.get(j);
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

	private final static int getBaseReward(MultiState state) {
		return 1;
	}

	
	// a reward	is proportional to distance to the goal
	//length to the goal task
	public final static HTNReward createProportionalRewardFunction(Set<HTNState> states, TaskNetwork fullyExpanded) {
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
	
	// a reward	is constant everywhere except the goal
	public final static HTNReward createConstantRewardFunction(Set<HTNState> states, TaskNetwork fullyExpanded) {
		HTNReward rewardFunction = new HTNReward() {
		};
		for (HTNState sp : states) {
			double reward = getBaseReward(sp.htnState);

			if(!sp.isFinal)
			rewardFunction.setReward(sp, reward * -0.04);
			else
			rewardFunction.setReward(sp, reward * 1);
		}
		return rewardFunction;
	}

	public final static HTNAction createMDPActions(List<Task> tasks) {
		HashSet<String> uniqueActions = new HashSet<String>();
		HTNAction actions = new HTNAction();
		int id = 0;
		for (Task t : tasks) {
			String actionName = t.getActionName();
			if (!uniqueActions.contains(actionName)) {
				HTNAction a = new HTNAction(id++, actionName);
				actions.SetAction(a);
			}
		}
		return actions;
	}

	public final static HTNTransitionProbabilityFunction createTransitionModel(HTNAction actions,
			TaskNetwork fullyExpanded, Set<HTNState> states, List<HTNState> finalStates) {
		logger.info("Creating Transition Model for MDP");

		HTNTransitionProbabilityFunction transitionModel = new HTNTransitionProbabilityFunction(finalStates);
		HashMap<Task, HTNState> stateTable = new HashMap<Task, HTNState>();
		for (HTNState s : states) {
			stateTable.put(s.getTask(), s);
		}

		for (HTNAction action : actions.actions()) {
			TransitionMatrix matrix = new TransitionMatrix(states.size());
			for (Constraint c : new HTNTaskNetwork(fullyExpanded).getConstraints()) {
				if (c.getTask2().getActionName().equals(action.getName())) {
					HTNState i = stateTable.get(c.getTask1());
					HTNState j = stateTable.get(c.getTask2());

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
						transitionModel.setTransitionProbability(si, action, sj, prob);
						
						// update transition to test
						HTNState s1 = lstate.get(1);//getCare
						HTNState s2 = lstate.get(2);//at airport
						HTNState s3 = lstate.get(6);//at Harbor
						
						if(si.equals(s1) && sj.equals(s2))
							transitionModel.setTransitionProbability(si, action, sj, 0.1);

						if(si.equals(s1) && sj.equals(s3))
							transitionModel.setTransitionProbability(si, action, sj, 0.9);
						
					}
				}
			}
		}
		return transitionModel;
	}

	public static void main(String[] args) throws FileNotFoundException {

		HTNTaskNetwork HTNfullyExpanded;
		String domainFile = null, problemFile = null;
		domainFile = "src/main/java/examples/MDP/gotolondon/gotolondon";
		problemFile = "src/main/java/examples/MDP/gotolondon/problem";
		HTNParser parser = new HTNParser();
		FileReader reader = new FileReader(domainFile);
		try {
			HTNDomain domain = parser.parseDomain(reader);
			double discountFactor = 1.0;
			reader = new FileReader(problemFile);
			Problem problem = parser.parseProblem(reader);

			HTNExpander expander = new HTNExpander();
			TaskNetwork fullyExpanded = expander.createFullyExpandedHTN(problem.getS0(), problem.getTn(), domain);

			// get methodes
			HashMap<Task, MultiState> mStates = expander.getMStates();

			// Get actions
			HTNAction actions = createMDPActions(fullyExpanded.getOrderedTasks());

			// We insert s0 here as a task so the full expansion will have constraints s0 <<
			// topLevelDerivations
			Task t0 = HTNFactory.createTask("s0");
			mStates.put(t0, new MultiState(problem.getS0()));
			Collection<Task> unprec = fullyExpanded.getUnpreceededTasks();
			fullyExpanded.addTask(t0);
			for (Task t : unprec) {
				fullyExpanded.addBeforeConstraint(t0, t);
			}

			List<Task> tasks = new ArrayList<Task>(fullyExpanded.getOrderedTasks());

			Set<HTNAction> a = actions.actions();
			// create states
			Set<HTNState> states = createMDPStates(mStates, tasks);

			List<HTNState> finalStates = new ArrayList<HTNState>();

			// get transition function
			HTNTransitionProbabilityFunction transitionModel = createTransitionModel(actions, fullyExpanded, states,
					finalStates);

			// Display transitions
			transitionModel.display();

			System.out.println("==========Actions: ");

//		for(HTNAction2 act :actions.actions())
//			System.out.println("Actions transition: " + 	    transitionModel.getTransitionProbability1(new ArrayList<>(states).get(0), act, new ArrayList<>(states).get(1)));

	

			// get or create reward function
			//HTNReward rewardFunction = createProportionalRewardFunction(states, fullyExpanded);
			HTNReward rewardFunction = createConstantRewardFunction(states, fullyExpanded);

			
//			System.out.println("==========NonfinalStates: ");
//			for (int i = 0; i < nonFinalStates.size(); i++)
//				System.out.println("state: " + nonFinalStates.get(i) + " || reward : "
//						+ rewardFunction.getRewardFor(nonFinalStates.get(i)));
//
//			System.out.println("==========finalStates: ");

			HtnMdpFactory<HTNState, HTNAction> mdp = new HtnMdpFactory<HTNState, HTNAction>(states,
					new ArrayList<>(states).get(0), actions, transitionModel, rewardFunction);

			System.out.println("finalStates: " + mdp.getFinalstates().size());
			System.out.println("nonFinalStates: " + mdp.getNonFinalStates().size());
			for (int i = 0; i < finalStates.size(); i++)
				System.out.println("state: " + finalStates.get(i) + " || reward : " + mdp.reward(finalStates.get(i)));

			
			
			// Policy iteration
			PolicyIteration<HTNState, HTNAction> pi = new PolicyIteration<HTNState, HTNAction>(
					new ModifiedPolicyEvaluation<HTNState, HTNAction>(50, 1.0));


			Policy<HTNState, HTNAction> policy = pi.policyIteration(mdp);
			System.out.println();

			for (HTNState s : states) {
				System.out.println(s.label + "  policy  :  " + policy.action(s));
			}
			
			//value iteration

			
//			ValueIteration<HTNState, HTNAction> pi = new ValueIteration<HTNState, HTNAction>(1.0);
//
//
//			Map<HTNState, Double> policy = pi.valueIteration(mdp, 0.0001);
//
//			
//			for (Entry<HTNState, Double> s : policy.entrySet()) {
//				System.out.println( s.getKey() +"  :  " + s.getValue());
//			}

			//convert to dot language
			String mdpGraph = "src/main/java/examples/MDP/gotolondon/gotolondonGraph.dot";

			if (mdpGraph != null ) {
				FileWriter writer = new FileWriter(mdpGraph);
				logger.info("Writing MDP Graph into " + mdpGraph);
				Dot2Graph.printMDPDot(writer, mdp, true ,null );
				writer.close();
				
			}

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
