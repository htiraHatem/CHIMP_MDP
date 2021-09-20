package examples.chimp;

import org.metacsp.framework.Variable;

import externalPathPlanning.LookUpTableDurationEstimator;
import htn.valOrderingHeuristics.UnifyFewestsubsEarliesttasksNewestbindingsValOH;
import hybridDomainParsing.DomainParsingException;
import planner.CHIMP;

public class TestGeckoDomain {
	

	public static void main(String[] args) {
		
		String problemFile = "problems/gecko/gecko1.pdl";
		String domainFile = "domains/gecko.ddl";
		
		CHIMP chimp;
        CHIMP.CHIMPBuilder builder;

        try {
            builder = new CHIMP.CHIMPBuilder(domainFile, problemFile)
                    .mbEstimator(new LookUpTableDurationEstimator())
                    .htnUnification(true);


        } catch (DomainParsingException e) {
            e.printStackTrace();
            return;
        }
        chimp = builder.build();
		
		System.out.println("Found plan? " + chimp.generatePlan());
		chimp.printStats(System.out);
		
        Variable[] planVector = chimp.extractActions();
        int c = 0;
        for (Variable act : planVector) {
            if (act.getComponent() != null)
                System.out.println(c++ + ".\t" + act);
        }
		
	}
	



}
