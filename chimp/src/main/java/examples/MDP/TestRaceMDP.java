package examples.MDP;

import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;
import java.util.logging.Logger;

import org.metacsp.framework.ValueOrderingH;
import org.metacsp.framework.Variable;

import aima.core.probability.mdp.Policy;
import aima.core.probability.mdp.impl.ModifiedPolicyEvaluation;
import aima.core.probability.mdp.search.PolicyIteration;
import aima.core.probability.mdp.search.ValueIteration;
import fluentSolver.FluentNetworkSolver;
import htn.htnExpanderDecomposition.HTNChimpDomain;
import htn.htnExpanderDecomposition.HTNChimpToMDP;
import htn.htnExpanderDecomposition.HTNExpander;
import htn.htnExpanderDecomposition.Task;
import htn.valOrderingHeuristics.UnifyDeepestWeightNewestbindingsValOH;
import hybridDomainParsing.DomainParsingException;
import mdpSolver.HTNAction;
import mdpSolver.HTNState;
import mdpSolver.HTNTaskNetwork;
import mdpSolver.HtnMdpFactory;
import planner.CHIMP;
import ui.Dot2Graph;

public class TestRaceMDP {

	private static final Logger logger = Logger.getLogger(TestRaceMDP.class.getName());
	static final boolean PRINT_PLAN = true;

	public static void main(String[] args) throws Exception {

//		String domainFile = "src/main/java/examples/MDP/RACE/domainRace.ddl";

		// robot at manArea
//		String problemFile = "src/main/java/examples/MDP/RACE/test_m_get_object_0.pdl";
//		String mdpGraph = "src/main/java/examples/MDP/RACE/test_m_get_object_0.dot";

		// robot at preManArea
//		String problemFile = "src/main/java/examples/MDP/RACE/test_m_get_object_1.pdl";
//		String mdpGraph = "src/main/java/examples/MDP/RACE/test_m_get_object_1.dot";
			
		String domainFile = "src/main/java/examples/MDP/RACE/domainRace2.ddl";
		
		// drive to table2 holding tray + A or B
		String problemFile = "src/main/java/examples/MDP/RACE/test_m_drive_robot_1.pdl";
		String mdpGraph = "src/main/java/examples/MDP/RACE/test_m_drive_robot_1.dot";


		// test spatial Solver and spatial fluents : works !
//		String problemFile = "src/main/java/examples/MDP/RACE/test_m_get_object_testSpatialFluent.pdl";
//		String mdpGraph = "src/main/java/examples/MDP/RACE/test_spatialFluent.dot";

		ValueOrderingH valOH = new UnifyDeepestWeightNewestbindingsValOH();
		CHIMP.CHIMPBuilder builder;

		try {
			builder = new CHIMP.CHIMPBuilder(domainFile, problemFile).valHeuristic(valOH).htnUnification(true);
		} catch (DomainParsingException e) {
			e.printStackTrace();
			return;
		}
		CHIMP chimp = builder.build();
		FluentNetworkSolver fluentSolver = chimp.getFluentSolver();

		// expanding the HTN
		HTNTaskNetwork tasknetwork = new HTNTaskNetwork(fluentSolver);
		HTNChimpDomain HTNd = HTNChimpDomain.parseHTNChimpDomain(builder);
		HTNExpander expander = new HTNExpander();
		HTNTaskNetwork fullyExpanded = expander.createFullyExpandedHTN(fluentSolver.getConstraintSolvers()[0],
				tasknetwork, HTNd);

		HtnMdpFactory<HTNState, HTNAction> mdp = HTNChimpToMDP.MDP(expander, fullyExpanded);

		// value iteration
		// TODO update gamme value and test it
		ValueIteration<HTNState, HTNAction> pi = new ValueIteration<HTNState, HTNAction>(1);
		Map<HTNState, Double> policy = pi.valueIteration(mdp, 0.0001);

		for (Entry<HTNState, Double> s : policy.entrySet()) {
			System.out.println("**" + s.getKey() + "  :  " + s.getValue());
		}

		// test PI

//		PolicyIteration<HTNState, HTNAction> pi = new PolicyIteration<HTNState, HTNAction>(
//				new ModifiedPolicyEvaluation<HTNState, HTNAction>(50, 1.0));
//
//		Policy<HTNState, HTNAction> policy = pi.policyIteration(mdp);
//		
//		for (HTNState s : mdp.states()) {
//			System.out.println("S"+s.getId() + "  policy  :  " + policy.action(s));
//		}

		// convert to dot language
		if (mdpGraph != null) {
			FileWriter writer = new FileWriter(mdpGraph);
			logger.info("Writing MDP Graph into " + mdpGraph);
			Dot2Graph.printMDPDot(writer, mdp, true, policy);
			writer.close();

		}

//		// generate a solution based on chimp Backtrack algorithm

//		System.out.println("Found plan? " + chimp.generatePlan());
//
//		if (PRINT_PLAN) {
//			Variable[] planVector = chimp.extractActions();
//			int c = 0;
//			for (Variable act : planVector) {
//				if (act.getComponent() != null)
//					System.out.println(c++ + ".\t" + act);
//			}
//			chimp.printFullPlan();
//		}

	}
}
