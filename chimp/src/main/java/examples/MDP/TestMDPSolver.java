package examples.MDP;

import java.util.Map;

import aima.core.environment.cellworld.Cell;
import aima.core.environment.cellworld.CellWorld;
import aima.core.environment.cellworld.CellWorldAction;
import aima.core.environment.cellworld.CellWorldFactory;
import aima.core.probability.example.MDPFactory;
import aima.core.probability.mdp.MarkovDecisionProcess;
import aima.core.probability.mdp.Policy;
import aima.core.probability.mdp.RewardFunction;
import aima.core.probability.mdp.impl.MDP;
import aima.core.probability.mdp.impl.ModifiedPolicyEvaluation;
import aima.core.probability.mdp.search.PolicyIteration;
import aima.core.probability.mdp.search.ValueIteration;

public class TestMDPSolver {
	
	public static RewardFunction<Cell<Double>> createRewardFunctionForFigure17_1() {
		RewardFunction<Cell<Double>> rf = new RewardFunction<Cell<Double>>() {
			@Override
			public double reward(Cell<Double> s) {
				return s.getContent();
			}
		};
		return rf;
	}
	//https://cs.calvin.edu/courses/cs/344/kvlinden/resources/AIMA-3rd-edition.pdf
	// figure 17.3
	
	public static void valueIterationDemo(CellWorld<Double> cw) {

		System.out.println("DEMO: Value Iteration");
		System.out.println("=====================");
		System.out.println("Figure 17.3");
		System.out.println("-----------");
		
		
		//

		// initial state
		Cell<Double> IState = cw.getCellAt(1, 1);
		
		
		//MarkovDecisionProcess<Cell<Double>, CellWorldAction> mdp = MDPFactory
		//		.createMDPForFigure17_3(cw);
		
	    MarkovDecisionProcess<Cell<Double>, CellWorldAction> mdp =
		new MDP<Cell<Double>, CellWorldAction>(cw.getCells(),
				IState, MDPFactory.createActionsFunctionForFigure17_1(cw),
				MDPFactory.createTransitionProbabilityFunctionForFigure17_1(cw),
				createRewardFunctionForFigure17_1());
		
		ValueIteration<Cell<Double>, CellWorldAction> vi = new ValueIteration<Cell<Double>, CellWorldAction>(
				1.0);

		Map<Cell<Double>, Double> U = vi.valueIteration(mdp, 0.0001);

		System.out.println("(1,1) = " + U.get(cw.getCellAt(1, 1)));
		System.out.println("(1,2) = " + U.get(cw.getCellAt(1, 2)));
		System.out.println("(1,3) = " + U.get(cw.getCellAt(1, 3)));

		System.out.println("(2,1) = " + U.get(cw.getCellAt(2, 1)));
		System.out.println("(2,3) = " + U.get(cw.getCellAt(2, 3)));

		System.out.println("(3,1) = " + U.get(cw.getCellAt(3, 1)));
		System.out.println("(3,2) = " + U.get(cw.getCellAt(3, 2)));
		System.out.println("(3,3) = " + U.get(cw.getCellAt(3, 3)));

		System.out.println("(4,1) = " + U.get(cw.getCellAt(4, 1)));
		System.out.println("(4,2) = " + U.get(cw.getCellAt(4, 2)));
		System.out.println("(4,3) = " + U.get(cw.getCellAt(4, 3)));

		System.out.println("=========================");
	}
	
	public static void policyIterationDemo(CellWorld<Double> cw) {

		System.out.println("DEMO: Policy Iteration");
		System.out.println("======================");
		System.out.println("Figure 17.3");
		System.out.println("-----------");

		MarkovDecisionProcess<Cell<Double>, CellWorldAction> mdp = MDPFactory
				.createMDPForFigure17_3(cw);
		PolicyIteration<Cell<Double>, CellWorldAction> pi = new PolicyIteration<Cell<Double>, CellWorldAction>(
				new ModifiedPolicyEvaluation<Cell<Double>, CellWorldAction>(50,
						1.0));

		Policy<Cell<Double>, CellWorldAction> policy = pi.policyIteration(mdp);

		System.out.println("(1,1) = " + policy.action(cw.getCellAt(1, 1)));
		System.out.println("(1,2) = " + policy.action(cw.getCellAt(1, 2)));
		System.out.println("(1,3) = " + policy.action(cw.getCellAt(1, 3)));

		System.out.println("(2,1) = " + policy.action(cw.getCellAt(2, 1)));
		System.out.println("(2,3) = " + policy.action(cw.getCellAt(2, 3)));

		System.out.println("(3,1) = " + policy.action(cw.getCellAt(3, 1)));
		System.out.println("(3,2) = " + policy.action(cw.getCellAt(3, 2)));
		System.out.println("(3,3) = " + policy.action(cw.getCellAt(3, 3)));

		System.out.println("(4,1) = " + policy.action(cw.getCellAt(4, 1)));
		System.out.println("(4,2) = " + policy.action(cw.getCellAt(4, 2)));
		System.out.println("(4,3) = " + policy.action(cw.getCellAt(4, 3)));

		System.out.println("=========================");
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//CellWorld<Double> cw = new CellWorld<Double>(4, 3, -0.02);

		//the shortest route to the +1, high risk , travel cost = -0.04
		//CellWorld<Double> cw = CellWorldFactory.createCellWorldForFig17_1();
		//CellWorld<Double> cw = new CellWorld<Double>(4, 3, -0.04);
		
		//R = 1 : agent will avoid the both exists : (never terminate.. not always)
		CellWorld<Double> cw = new CellWorld<Double>(4, 3, 5.0);
		
		// the agent heads straight for the nearest exit
		//CellWorld<Double> cw = new CellWorld<Double>(4, 3, -1.6484);
		
		//wall
		cw.removeCell(2, 2);
		//cw.removeCell(3, 2);

		//Terminal states
		cw.getCellAt(4, 3).setContent(5.0);
		cw.getCellAt(4, 2).setContent(-1.0);
		
		//valueIterationDemo(cw);
		policyIterationDemo(cw);
	}

}
