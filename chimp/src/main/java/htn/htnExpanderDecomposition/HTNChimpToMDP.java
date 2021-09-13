package htn.htnExpanderDecomposition;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.logging.Logger;

import edu.cmu.ita.htn.Constraint;
import edu.cmu.ita.htn.HTNFactory;
import edu.cmu.ita.htn.MultiState;
import edu.cmu.ita.mdp.TransitionMatrix;
import mdpSolver.HTNAction;
import mdpSolver.HTNReward;
import mdpSolver.HTNState;
import mdpSolver.HTNTaskNetwork;
import mdpSolver.HTNTransitionProbabilityFunction;
import mdpSolver.HtnMdpFactory;

/**
 * @author meneguzzi , 
 * @updated by Hatem
 */
public class HTNChimpToMDP {

	private static final Logger logger = Logger.getLogger(HTNChimpToMDP.class.getName());

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
		for (HTNState s : states) {
			stateTable.put((Task) s.getTask(), s);
		}

		for (HTNAction action : actions.actions()) {
			TransitionMatrix matrix = new TransitionMatrix(states.size());
			for (Constraint c : fullyExpanded.getConstraints()) {
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
						transitionModel.setTransitionProbability(si, action, sj, 1);
						
						if(si.getId()==2) 
							transitionModel.setTransitionProbability(si, action, sj, 0.5);
						
						if((si.getId()==6) && (sj.getId() == 7) )
							transitionModel.setTransitionProbability(si, action, sj, 0.3);
						
						if((si.getId()==6) && (sj.getId() == 8) )
							transitionModel.setTransitionProbability(si, action, sj, 0.7);
						
						if((si.getId()==13) && (sj.getId() == 14) )
							transitionModel.setTransitionProbability(si, action, sj, 0.3);
						
						if((si.getId()==13) && (sj.getId() == 15) )
							transitionModel.setTransitionProbability(si, action, sj, 0.7);

						
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

	// a reward	is constant everywhere except the goal
	public final static HTNReward createConstantRewardFunction(Set<HTNState> states, HTNTaskNetwork fullyExpanded) {
		HTNReward rewardFunction = new HTNReward() {
		};
		for (HTNState sp : states) {
			double reward = getBaseReward(sp.htnState);

			if(!sp.isFinal())
			rewardFunction.setReward(sp, reward * -0.04);
			else
			rewardFunction.setReward(sp, reward * 1);
		}
		return rewardFunction;
	}
	
	// a reward	is proportional to distance to the goal
	//length to the goal task
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
	
	// a reward	is favorise the shortest path via northTable
	public final static HTNReward createScenario1RewardFunction(Set<HTNState> states, HTNTaskNetwork fullyExpanded) {
		HTNReward rewardFunction = new HTNReward() {
		};
		for (HTNState sp : states) {
			double reward = getBaseReward(sp.htnState);

			if(!sp.isFinal()) {
				if (sp.getId() ==3)
					rewardFunction.setReward(sp, reward * -0.03);
				else
					rewardFunction.setReward(sp, reward * -0.04);
			}
			else {
				if (sp.getId() ==7)
					rewardFunction.setReward(sp, reward * 2);
				else
					rewardFunction.setReward(sp, reward * 1);		
			}
		}
		return rewardFunction;
	}
	
	// a reward	is favorise the longest/safer path via northTable
	public final static HTNReward createScenario2RewardFunction(Set<HTNState> states, HTNTaskNetwork fullyExpanded) {
		HTNReward rewardFunction = new HTNReward() {
		};
		for (HTNState sp : states) {
			double reward = getBaseReward(sp.htnState);

			if(!sp.isFinal()) {
				if (sp.getId() ==3)
					rewardFunction.setReward(sp, reward * -0.03);
				else
					rewardFunction.setReward(sp, reward * -0.04);
			}
			else {
				if (sp.getId() ==9)
					rewardFunction.setReward(sp, reward * 1.1);
				else
					rewardFunction.setReward(sp, reward * 1);		
			}
		}
		return rewardFunction;
	}
	
	// a reward	is favorise the longest/safer path via southTable
		public final static HTNReward createScenario3RewardFunction(Set<HTNState> states, HTNTaskNetwork fullyExpanded) {
			HTNReward rewardFunction = new HTNReward() {
			};
			for (HTNState sp : states) {
				double reward = getBaseReward(sp.htnState);

				if(!sp.isFinal()) {
					if (sp.getId() ==10)
						rewardFunction.setReward(sp, reward * -0.03);
					else
						rewardFunction.setReward(sp, reward * -0.04);
				}
				else {
					if (sp.getId() ==16)
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
	
	public final static HtnMdpFactory<HTNState, HTNAction> MDP(HTNExpander expander, HTNTaskNetwork fullyExpanded) throws Exception {
		//
		// get methodes
		HashMap<Task, MultiState> mStates = expander.getMStates();
		
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
		Set<HTNState> states = HTNChimpToMDP.createMDPStates(mStates, tasks);

		List<HTNState> finalStates = new ArrayList<HTNState>();

		// get transition function
		HTNTransitionProbabilityFunction transitionModel = HTNChimpToMDP.createTransitionModel(actions, fullyExpanded, states,
				finalStates);

		// Display transitions
		//transitionModel.display();
		
		
		// get or create reward function
		//HTNReward rewardFunction = createProportionalRewardFunction(states, fullyExpanded);
		HTNReward rewardFunction = HTNChimpToMDP.createConstantRewardFunction(states, fullyExpanded);
		
		// a reward	is favorise the shortest path via northTable
		//HTNReward rewardFunction = HTNChimpToMDP.createScenario1RewardFunction(states, fullyExpanded);
		
		// a reward	is favorise the longest/safer path via northTable
		//HTNReward rewardFunction = HTNChimpToMDP.createScenario2RewardFunction(states, fullyExpanded);

		// a reward	is favorise the longest/safer path via northTable
		//HTNReward rewardFunction = HTNChimpToMDP.createScenario3RewardFunction(states, fullyExpanded);
		

		return new HtnMdpFactory<HTNState, HTNAction>(states,
				new ArrayList<>(states).get(0), actions, transitionModel, rewardFunction);
	}

}
