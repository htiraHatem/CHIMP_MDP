package examples.MDP.testSolver;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.logging.Logger;

import aima.core.probability.mdp.Policy;
import aima.core.probability.mdp.impl.ModifiedPolicyEvaluation;
import aima.core.probability.mdp.search.PolicyIteration;
import aima.core.probability.mdp.search.ValueIteration;
import edu.cmu.ita.htn.HTNDomain;
import edu.cmu.ita.htn.HTNExpander;
import edu.cmu.ita.htn.HTNFactory;
import edu.cmu.ita.htn.MultiState;
import edu.cmu.ita.htn.Problem;
import edu.cmu.ita.htn.Task;
import edu.cmu.ita.htn.TaskNetwork;
import edu.cmu.ita.htn.parser.HTNParser;
import mdpSolver.HTNAction;
import mdpSolver.HTNNetworkToMDP;
import mdpSolver.HTNReward;
import mdpSolver.HTNState;
import mdpSolver.HTNTaskNetwork;
import mdpSolver.HTNTransitionProbabilityFunction;
import mdpSolver.HtnMdpFactory;
import ui.Dot2Graph;

public class TestVI {

	private static final Logger logger = Logger.getLogger(TestVI.class.getName());

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
			HTNAction actions = HTNNetworkToMDP.createMDPActions(fullyExpanded.getOrderedTasks());

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

			// create states
			Set<HTNState> states = HTNNetworkToMDP.createMDPStates(mStates, tasks);

			List<HTNState> finalStates = new ArrayList<HTNState>();

			// get transition function
			HTNTransitionProbabilityFunction transitionModel = HTNNetworkToMDP.createTransitionModel(actions, fullyExpanded, states,
					finalStates);

			// Display transitions
			transitionModel.display();
	

			// get or create reward function
			//HTNReward rewardFunction = createProportionalRewardFunction(states, fullyExpanded);
			HTNReward rewardFunction = HTNNetworkToMDP.createConstantRewardFunction(states, fullyExpanded);



			HtnMdpFactory<HTNState, HTNAction> mdp = new HtnMdpFactory<HTNState, HTNAction>(states,
					new ArrayList<>(states).get(0), actions, transitionModel, rewardFunction);

			System.out.println("finalStates: " + mdp.getFinalStates().size());
			System.out.println("nonFinalStates: " + mdp.getNonFinalStates().size());
			for (int i = 0; i < finalStates.size(); i++)
				System.out.println("state: " + finalStates.get(i) + " || reward : " + mdp.reward(finalStates.get(i)));

			
			
//			// Policy iteration
//			PolicyIteration<HTNState, HTNAction> pi = new PolicyIteration<HTNState, HTNAction>(
//					new ModifiedPolicyEvaluation<HTNState, HTNAction>(50, 1.0));
//
//
//			Policy<HTNState, HTNAction> policy = pi.policyIteration(mdp);
//			System.out.println();
//
//			for (HTNState s : states) {
//				System.out.println(s.getLabel() + "  policy  :  " + policy.action(s));
//			}
			
			//value iteration

			
			ValueIteration<HTNState, HTNAction> pi = new ValueIteration<HTNState, HTNAction>(1.0);


			Map<HTNState, Double> policy = pi.valueIteration(mdp, 0.0001);

			
			for (Entry<HTNState, Double> s : policy.entrySet()) {
				System.out.println( s.getKey() +"  :  " + s.getValue());
			}

			//convert to dot language
//			String mdpGraph = "src/main/java/examples/MDP/gotolondon/gotolondonGraphVI.dot";
//
//			if (mdpGraph != null ) {
//				FileWriter writer = new FileWriter(mdpGraph);
//				logger.info("Writing MDP Graph into " + mdpGraph);
//				Dot2Graph.printMDPDot(writer, mdp, true ,null );
//				writer.close();
//				
//			}

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	

}
