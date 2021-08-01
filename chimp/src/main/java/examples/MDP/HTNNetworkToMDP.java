package examples.MDP;


import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.logging.Logger;
import java.util.stream.Collectors;

import com.google.common.collect.Sets;

import aima.core.agent.Action;
import aima.core.environment.cellworld.Cell;
import aima.core.environment.cellworld.CellWorldAction;
import aima.core.probability.example.MDPFactory;
import aima.core.probability.mdp.MarkovDecisionProcess;
import aima.core.probability.mdp.Policy;
import aima.core.probability.mdp.TransitionProbabilityFunction;
import aima.core.probability.mdp.impl.MDP;
import aima.core.probability.mdp.impl.ModifiedPolicyEvaluation;
import aima.core.probability.mdp.search.PolicyIteration;
import aima.core.util.Util;
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

public class HTNNetworkToMDP {

	private static final Logger logger = Logger.getLogger(HTNNetworkToMDP.class.getName());

	/**
	 * Creates {@link MDPState}s like in Algorithm 3 from the IJCAI paper.
	 * @param mStates
	 * @param tasks
	 * @return
	 */
	public final static Set<HTNState> createMDPStates(HashMap<Task, MultiState> mStates, List<Task> tasks) {
		logger.info("Creating MDP states");
		
		HTNState states[] = new HTNState[tasks.size()];
		
		for(int i=0; i<tasks.size(); i++) {
			Task ti = tasks.get(i);
			MultiState m = new MultiState(mStates.get(ti),false);
			MultiState si = new MultiState(m, false);
			
			for(int j=0; j<i; j++) {
				Task tj = tasks.get(j);
				si.removeAll(mStates.get(tj));
			}
			states[i] = new HTNState(i, si.toString(), si, ti);
			
			for(int j=0; j<i; j++) {
				Task tj = tasks.get(j);
				if(states[i].htnState.intersects(mStates.get(tj))) {
					states[i].overlapping.add(states[j]);
				}
				states[i].htnState.removeAll(mStates.get(tj));
			}
			//We add s itself to the overlapping list to make it easier to calculate things in #createTransitionTables
			if(!si.isEmpty()) {
				states[i].getOverlapping().add(states[i]);
			}
		}

		return  new LinkedHashSet<HTNState>(Arrays.asList(states));
	}
	
	private final static int getBaseReward(MultiState state) {
		return 1;
	}
	
	private final static HTNReward createRewardFunction(Set<HTNState> states, TaskNetwork fullyExpanded) {
		HTNReward rewardFunction = new HTNReward() {};
		for(HTNState sp:states) {
			double reward = getBaseReward(sp.htnState);
			Task t0 = fullyExpanded.getFirstTask();
			double kappa = fullyExpanded.maxpath(t0, sp.getTask());
			//Here, the paper states that the reward is for (t0.getActionName(), sp.s) 
			reward = kappa*reward;
			rewardFunction.setReward(sp, reward);;
		}
		return rewardFunction;
	}
	

	private final static HTNAction2 createMDPActions(List<Task> tasks) {
		HashSet<String> uniqueActions = new HashSet<String>();
		HTNAction2 actions = new HTNAction2();
		int id=0;
		for(Task t:tasks) {
			String actionName = t.getActionName();
			if(!uniqueActions.contains(actionName)) {
				HTNAction2 a  =new HTNAction2(id++, actionName);
				actions.SetAction(a);
			}
		}
		return actions;
	}
	
	private final static HTNTransitionProbabilityFunction createTransitionModel(HTNAction2 actions, TaskNetwork fullyExpanded, Set<HTNState> states, List<HTNState> finalStates) {
		logger.info("Creating Transition Model for MDP");
		

		HTNTransitionProbabilityFunction transitionModel = new HTNTransitionProbabilityFunction(finalStates);
		HashMap<Task, HTNState> stateTable = new HashMap<Task, HTNState>();
		for(HTNState s:states) {
			stateTable.put(s.getTask(), s);
		}
		
		for(HTNAction2 action:actions.actions()) {
			TransitionMatrix matrix = new TransitionMatrix(states.size());	
			for(Constraint c :  new HTNTaskNetwork(fullyExpanded).getConstraints()) {
				if(c.getTask2().getActionName().equals(action.getName())) {
					HTNState i = stateTable.get(c.getTask1());
					HTNState j = stateTable.get(c.getTask2());
					
					if(i== null) throw new RuntimeException("Tried to create a transition for a non-existent state: "+c.getTask1());
					if(j== null) throw new RuntimeException("Tried to create a transition for a non-existent state: "+c.getTask2());
					//If i is the origin of any transition, then it cannot be final
					i.setFinal(false);
					
//					double s = matrix.get(i, j);
//					matrix.set(i, j, s+1);
					for(HTNState si:i.overlapping) {
						for(HTNState sj:j.overlapping) {
							int sid = si.getId();
							int sjd = sj.getId();
							double s = matrix.get(sid, sjd);
							matrix.set(sid, sjd, s+(1/j.modulo()));
						}
					}
				}
			}
			matrix.normalizeToOne(0,0);
			List<HTNState> lstate = new ArrayList<>(states);

			
			for(int i=0; i<states.size(); i++) {
				for(int j=0; j<states.size(); j++) {
					double prob = matrix.get(i, j);
					if(prob != 0) {
						HTNState si = lstate.get(i);
						HTNState sj = lstate.get(j);
					   transitionModel.setTransitionProbability(si, action, sj, prob);
					   System.out.print(transitionModel.getTransitionProbabilityModel().size());
					   //(si, action, sj, prob);
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
		TaskNetwork fullyExpanded =  expander.createFullyExpandedHTN(problem.getS0(), problem.getTn(), domain);
	
		
		//get methodes
		HashMap<Task,MultiState> mStates = expander.getMStates();
		
		//Get actions
		HTNAction2 actions = createMDPActions(fullyExpanded.getOrderedTasks());
		
		//We insert s0 here as a task so the full expansion will have constraints s0 << topLevelDerivations
		Task t0 = HTNFactory.createTask("s0");
		mStates.put(t0,new MultiState(problem.getS0()));
		Collection<Task> unprec = fullyExpanded.getUnpreceededTasks();
		fullyExpanded.addTask(t0);
		for(Task t:unprec) {
			fullyExpanded.addBeforeConstraint(t0, t);
		}
		
		List<Task> tasks = new ArrayList<Task>(fullyExpanded.getOrderedTasks());
		
		
		Set<HTNAction2> a =actions.actions();
		//create states
		Set<HTNState> states = createMDPStates(mStates, tasks);
				
		//get final not final states
		List<HTNState> nonFinalStates = new ArrayList<HTNState>();
		List<HTNState> finalStates = new ArrayList<HTNState>();
		
		//get transition function
	    HTNTransitionProbabilityFunction transitionModel = createTransitionModel(actions,fullyExpanded , states, finalStates);
		
		//Display transitions
		transitionModel.display();
	
		
		System.out.println("==========Actions: ");

		for(HTNAction2 act :actions.actions())
			System.out.println("Actions: " + act.toString());

		
		for(HTNState s:states) {
			System.out.println("isFinal: " + s.isFinal());

			if(s.isFinal()) {
				finalStates.add(s);
			} else {
				nonFinalStates.add(s);
			}
		}
		
		System.out.println("finalStates: " + finalStates.size());
		System.out.println("nonFinalStates: " + nonFinalStates.size());
		
	
		//get or create reward function
		HTNReward rewardFunction = createRewardFunction(states, fullyExpanded);
		
		System.out.println("==========NonfinalStates: ");
		for(int i=0;i<nonFinalStates.size();i++)
			System.out.println("state: " + nonFinalStates.get(i)+" || reward : " +  rewardFunction.getRewardFor(nonFinalStates.get(i)));
		
		

		

		System.out.println("==========finalStates: ");

		for(int i=0;i<finalStates.size();i++)
			System.out.println("state: " + finalStates.get(i) +" || reward : " +  rewardFunction.getRewardFor(finalStates.get(i)));
		

		MarkovDecisionProcess<HTNState, HTNAction> mdp = new HtnMdpFactory<HTNState, HTNAction> (states, new ArrayList<>(states).get(0), actions, transitionModel, rewardFunction);
		
		
		PolicyIteration<HTNState, HTNAction> pi = new PolicyIteration<HTNState, HTNAction>(
				new ModifiedPolicyEvaluation<HTNState, HTNAction>(300, 
						1.0));
		
//		System.out.print(
//				mdp.actions(new ArrayList<>(states).get(0)));

		
		Policy<HTNState, HTNAction> policy = pi.policyIteration(mdp);
		System.out.println();
		
		for(HTNState s:states) {
			System.out.println( s.label + "  policy  :  " + policy.action(s));
			
		}
//		System.out.println( new ArrayList<>(states).get(0).toString());
//		
//		System.out.println("(1,1) = " + policy.action(new ArrayList<>(states).get(0)));
	} catch (FileNotFoundException e) {
		e.printStackTrace();
	} catch (Exception e) {
		e.printStackTrace();
	}
	}

	public static <S, A extends Action> Map<S, A> initialPolicyVector(
			MarkovDecisionProcess<S, A> mdp) {
		Map<S, A> pi = new LinkedHashMap<S, A>();
		List<A> actions = new ArrayList<A>();
		for (S s : mdp.states()) {
			actions.clear();
			actions.addAll(mdp.actions(s));
			// Handle terminal states (i.e. no actions).
			if (actions.size() > 0) {
				pi.put(s, Util.selectRandomlyFromList(actions));
			}
		}
		return pi;
	}
}

