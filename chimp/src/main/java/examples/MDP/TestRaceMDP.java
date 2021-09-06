package examples.MDP;

import java.io.FileWriter;
import java.util.Map;
import java.util.Map.Entry;
import java.util.logging.Logger;

import org.metacsp.framework.ValueOrderingH;
import org.metacsp.framework.Variable;

import aima.core.probability.mdp.search.ValueIteration;
import fluentSolver.FluentNetworkSolver;
import htn.htnExpanderDecomposition.HTNChimpDomain;
import htn.htnExpanderDecomposition.HTNChimpToMDP;
import htn.htnExpanderDecomposition.HTNExpander;
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
		//String problemFile = "src/main/java/examples/MDP/RACE/test_m_drive_0.pdl";
		String problemFile = "src/main/java/examples/MDP/RACE/test_m_drive_crossLinked_0.pdl";

		String domainFile = "src/main/java/examples/MDP/RACE/domain.ddl";

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
//		HTNTaskNetwork fullyExpanded = expander.createFullyExpandedHTN(fluentSolver.getConstraintSolvers()[0],
//				tasknetwork, HTNd);
//
//		HtnMdpFactory<HTNState, HTNAction> mdp = HTNChimpToMDP.MDP(expander, fullyExpanded);
//
//		// value iteration
//		ValueIteration<HTNState, HTNAction> pi = new ValueIteration<HTNState, HTNAction>(1.0);
//		Map<HTNState, Double> policy = pi.valueIteration(mdp, 0.0001);
//
//		for (Entry<HTNState, Double> s : policy.entrySet()) {
//			System.out.println(s.getKey() + "  :  " + s.getValue());
//		}
//
//		// convert to dot language
//		String mdpGraph = "src/main/java/examples/MDP/RACE/RaceGraphVIDrive_0.dot";
//
//		if (mdpGraph != null) {
//			FileWriter writer = new FileWriter(mdpGraph);
//			logger.info("Writing MDP Graph into " + mdpGraph);
//			Dot2Graph.printMDPDot(writer, mdp, true, null);
//			writer.close();
//
//		}
		// generate a solution based on chimp Backtrack algorithm
		System.out.println("Found plan? " + chimp.generatePlan());

		if (PRINT_PLAN) {
			Variable[] planVector = chimp.extractActions();
			int c = 0;
			for (Variable act : planVector) {
				if (act.getComponent() != null)
					System.out.println(c++ + ".\t" + act);
			}
			chimp.printFullPlan();
		}

	}
}
