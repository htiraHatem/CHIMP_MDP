package examples.MDP;

import java.util.Map;

import aima.core.environment.cellworld.Cell;
import aima.core.environment.cellworld.CellWorld;
import aima.core.environment.cellworld.CellWorldAction;
import aima.core.probability.example.MDPFactory;
import aima.core.probability.mdp.MarkovDecisionProcess;
import aima.core.probability.mdp.Policy;
import aima.core.probability.mdp.impl.ModifiedPolicyEvaluation;
import aima.core.probability.mdp.search.PolicyIteration;
import aima.core.probability.mdp.search.ValueIteration;
import aima.core.environment.cellworld.CellWorldFactory;

public class TestMDPSolver {
	
	//https://cs.calvin.edu/courses/cs/344/kvlinden/resources/AIMA-3rd-edition.pdf
	// figure 17.3
	
	public static void valueIterationDemo() {

		System.out.println("DEMO: Value Iteration");
		System.out.println("=====================");
		System.out.println("Figure 17.3");
		System.out.println("-----------");
		

		CellWorld<Double> cw = CellWorldFactory.createCellWorldForFig17_1();
		
		MarkovDecisionProcess<Cell<Double>, CellWorldAction> mdp = MDPFactory
				.createMDPForFigure17_3(cw);
		
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

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		valueIterationDemo();
	}

}
