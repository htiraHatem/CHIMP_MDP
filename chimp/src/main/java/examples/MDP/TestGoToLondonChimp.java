package examples.MDP;

import java.io.FileWriter;
import java.util.Map;
import java.util.logging.Logger;

import org.metacsp.framework.Variable;

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

public class TestGoToLondonChimp {

	private static final Logger logger = Logger.getLogger(TestGoToLondonChimp.class.getName());
	static final boolean PRINT_PLAN = true;

	public static void main(String[] args) throws Exception {
		String problemFile = "src/main/java/examples/MDP/gotolondon/problem.pdl";
	
		// original domain with reward and transition probability with initial construct rules
		//without resourceSolver 
		//String domainFile = "src/main/java/examples/MDP/gotolondon/domainOrigin.ddl";
		
		
		// resource solver with all the construct rules
		// if discounter = 1 favorise going through bank if less than 1 the shortest path
		//String domainFile = "src/main/java/examples/MDP/gotolondon/domain.ddl";

		

		//discounter=1
		//favorise shortest path! if money = 150 two option across bank and not 
		String domainFile = "src/main/java/examples/MDP/gotolondon/domain2.ddl";
		//and the shortest path when enough money is available (350) 
		//String domainFile = "src/main/java/examples/MDP/gotolondon/domain3.ddl";


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

		// convert to dot language
		String mdpGraph = "src/main/java/examples/MDP/gotolondon/gotolondonGraphVICHIMP0.dot";

		if (mdpGraph != null) {
			FileWriter writer = new FileWriter(mdpGraph);
			logger.info("Writing MDP Graph into " + mdpGraph);
			Dot2Graph.printMDPDot(writer, mdp, true, policy);
			writer.close();

		}
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
