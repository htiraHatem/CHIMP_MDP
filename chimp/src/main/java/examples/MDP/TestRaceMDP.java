package examples.MDP;

import java.io.FileWriter;
import java.util.Map;
import java.util.Map.Entry;
import java.util.logging.Logger;

import fluentSolver.FluentNetworkSolver;
import htn.Stats;
import htn.Stats.TimerName;
import htn.htnExpanderDecomposition.HTNChimpDomain;
import htn.htnExpanderDecomposition.HTNChimpToMDP;
import hybridDomainParsing.DomainParsingException;
import mdpSolver.HTNAction;
import mdpSolver.HTNState;
import mdpSolver.HtnMdpFactory;
import planner.CHIMP;
import ui.Dot2Graph;

public class TestRaceMDP {

	private static final Logger logger = Logger.getLogger(TestRaceMDP.class.getName());
	static final boolean PRINT_PLAN = true;

	public static void main(String[] args) throws Exception {

		//String domainFile = "src/main/java/examples/MDP/RACE/domainRace.ddl";

		// robot at manArea
//		String problemFile = "src/main/java/examples/MDP/RACE/test_m_get_object_0.pdl";
//		String mdpGraph = "src/main/java/examples/MDP/RACE/test_m_get_object_0.dot";

		// robot at preManArea
//		String problemFile = "src/main/java/examples/MDP/RACE/test_m_get_object_1.pdl";
//		String mdpGraph = "src/main/java/examples/MDP/RACE/test_m_get_object_1.dot";

//--------------------------------------------------------------------------------------------------
		
		//no possibility of charging the Battery
//		String domainFile = "src/main/java/examples/MDP/RACE/domainRace2.ddl";

		// drive to table2 holding tray + A or B
//		String problemFile = "src/main/java/examples/MDP/RACE/test_m_drive_robot_1.pdl";
//		String mdpGraph = "src/main/java/examples/MDP/RACE/test_m_drive_robot_1.dot";
		
		// drive from northtable to table2 (hold cup)
//		String problemFile = "src/main/java/examples/MDP/RACE/test_m_moveTo1.pdl";
//		String mdpGraph = "src/main/java/examples/MDP/RACE/test_m_moveTo1.dot";
		
		// drive from south to table2 (hold appetizer)
//		String problemFile = "src/main/java/examples/MDP/RACE/test_m_moveTo2.pdl";
//		String mdpGraph = "src/main/java/examples/MDP/RACE/test_m_moveTo2.dot";

//--------------------------------------------------------------------------------------------------
		
		//possibility of charging the Battery  
		
		//resource = 200
//		String domainFile = "src/main/java/examples/MDP/RACE/domainRace3.ddl";

//		// drive to table2 enough resource(200) ==> shortest consistent path without charging
//		String problemFile = "src/main/java/examples/MDP/RACE/test_m_drive_robot_2.pdl";
//		String mdpGraph = "src/main/java/examples/MDP/RACE/test_m_drive_robot_2.dot";
		
//--------------------------------------------------------------------------------------------------

		// charge battery resource = 170
		String domainFile = "src/main/java/examples/MDP/RACE/domainRace4.ddl";

		// drive to table2 not enough resource(170) ! ==> charging_Battery
//		String problemFile = "src/main/java/examples/MDP/RACE/test_m_drive_robot_3.pdl";
//		String mdpGraph = "src/main/java/examples/MDP/RACE/test_m_drive_robot_3.dot";


		//--------------------------------------------------------------------------------------------------

		// test spatial Solver and spatial fluents : works !
		String problemFile = "src/main/java/examples/MDP/RACE/test_m_get_object_testSpatialFluent.pdl";
		String mdpGraph = "src/main/java/examples/MDP/RACE/test_m_get_object_testSpatialFluent.dot";

		CHIMP.CHIMPBuilder builder;

		try {
			builder = new CHIMP.CHIMPBuilder(domainFile, problemFile);
		} catch (DomainParsingException e) {
			e.printStackTrace();
			return;
		}
		CHIMP chimp = builder.build();
		FluentNetworkSolver fluentSolver = chimp.getFluentSolver();

		HTNChimpToMDP.stats = new Stats();
		HTNChimpToMDP.stats.startRuntime(TimerName.TOTAL);

		HTNChimpDomain HTNd = HTNChimpDomain.parseHTNChimpDomain(builder);
		HTNChimpToMDP converter = new HTNChimpToMDP();

		// expanding the HTN and convert it to mdp
		HtnMdpFactory<HTNState, HTNAction> mdp = converter.convertHTN(fluentSolver, builder, HTNd);

		// value iteration algo
		Map<HTNState, Double> policy = converter.PlanVI(mdp, 1);

		HTNChimpToMDP.stats.endRuntime(TimerName.TOTAL);

		HTNChimpToMDP.stats.computeStats(converter.fullyExpanded, HTNd, mdp, converter.expander);
		System.out.println(HTNChimpToMDP.stats.toString());

//		for (Entry<HTNState, Double> s : policy.entrySet()) {
//			System.out.println("**" + s.getKey() + "  :  " + s.getValue());
//		}

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
