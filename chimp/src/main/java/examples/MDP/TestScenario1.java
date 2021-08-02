package examples.MDP;

import aima.core.agent.Action;
import aima.core.agent.State;
import aima.core.environment.cellworld.Cell;
import aima.core.environment.cellworld.CellWorld;
import aima.core.environment.cellworld.CellWorldAction;
import aima.core.probability.example.MDPFactory;
import aima.core.probability.mdp.MarkovDecisionProcess;
import aima.core.probability.mdp.Policy;
import aima.core.probability.mdp.impl.ModifiedPolicyEvaluation;
import aima.core.probability.mdp.search.PolicyIteration;

public class TestScenario1 {

	public static void main(String[] args) {

		// nearst exit
		// CellWorld<Double> cw = new CellWorld<Double>(4, 3, -1.6484);

		// avoid the exit
		CellWorld<Double> cw = new CellWorld<Double>(4, 3, 5.0);

		// wall
		cw.removeCell(2, 2);
		cw.removeCell(3, 2);

		// cw.getCellAt(3, 3).setContent(-0.02);

		// Terminal states
		cw.getCellAt(4, 2).setContent(1.0);
		cw.getCellAt(1, 3).setContent(-1.0);
		// cw.getCellAt(4, 2).setContent(-1.0);

		MarkovDecisionProcess<Cell<Double>, CellWorldAction> mdp = MDPFactory.createMDPForFigure17_3(cw);

		for (Cell<Double> s : mdp.states()) {
			System.out.println("state : " + s.toString());
			for (Action a : mdp.actions(s)) {
				System.out.println("action : " + a.toString());

			}
		}

		for (CellWorldAction a : CellWorldAction.actions())
			System.out.println("transitionProbability 1,1 -->" + a.name() + "--> 1,2 = "
					+ mdp.transitionProbability(cw.getCellAt(1, 2), cw.getCellAt(1, 1), a));

		System.out.println("===================== ");

		for (CellWorldAction a : CellWorldAction.actions())
			System.out.println("transitionProbability 1,3 -->" + a.name() + "--> 1,2 = "
					+ mdp.transitionProbability(cw.getCellAt(1, 2), cw.getCellAt(1, 3), a));

//		System.out.println("transitionProbability 1,1 -->up--> 1,2 = "
//				+ mdp.transitionProbability(cw.getCellAt(1, 2), cw.getCellAt(1, 1), CellWorldAction.Down));

		// ------------------------------

		PolicyIteration<Cell<Double>, CellWorldAction> pi = new PolicyIteration<Cell<Double>, CellWorldAction>(
				new ModifiedPolicyEvaluation<Cell<Double>, CellWorldAction>(50, 1.0));

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

}
