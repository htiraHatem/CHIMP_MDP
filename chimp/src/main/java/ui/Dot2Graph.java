package ui;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.Writer;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import edu.cmu.ita.htn.MultiState;
import edu.cmu.ita.htn.Proposition;
import edu.cmu.ita.htn.State;
import mdpSolver.HTNAction;
import mdpSolver.HTNState;
import mdpSolver.HtnMdpFactory;
import mdpSolver.HtnMdpTransition;

/**
 * @author meneguzzi , 
 * @updated by Hatem
 */

public class Dot2Graph {

	public static void printMDPDot(Writer writer, HtnMdpFactory<HTNState, HTNAction> source, boolean printState, Map<HTNState, Double> policy) throws IOException {
		PrintWriter out = new PrintWriter(writer);
		DecimalFormat df = new DecimalFormat("0.00");
		
		out.println("digraph {");
		out.println(" size=\"60,17\";");

		if(printState) {
			for(HTNState s:source.getFinalstates()) {
				ArrayList<String> OhneStatic = new ArrayList<String>() ;
				Object[] a =s.getHtnState().iterator().next().toArray();
				for(Object i:a) {
					if((!i.toString().contains("crossLinked")) )//&& (!i.toString().contains("on") ))
					OhneStatic.add(i.toString());
				}

				out.print("\""+s.getId()+"\" [label=\""+OhneStatic+" (r:"+source.reward(s) + " )");
				if(policy != null)
					out.print( ", Utility : "+policy.get(s));
				out.println(" \"];");
			}
			for(HTNState s:source.getNonFinalStates()) {
				ArrayList<String> OhneStatic = new ArrayList<String>() ;
				Object[] a =s.getHtnState().iterator().next().toArray();
				for(Object i:a) {
					if((!i.toString().contains("crossLinked"))) //&& (!i.toString().contains("on") ))
					OhneStatic.add(i.toString());
				}
				out.print("\""+s.getId()+"\" [label=\""+OhneStatic+" (reward:"+source.reward(s)+ " )");
				if(policy != null)
					out.print( ", Utility : "+policy.get(s));
				out.println(" \"];");
			}
		}
		
		for(HTNState is:source.getNonFinalStates()) {
			for(HTNAction a:source.actions(is)) {
				List<HtnMdpTransition> transition = source.gethTNTransitionProbabilityFunction().getTransitionsWithStartingStateAndAction(is, a);
				for(HtnMdpTransition<HTNState, HTNAction> tr:transition) {
					HTNState ds = tr.getDestinationState();
					out.print("\""+is.getId()+"\"");
					out.print(" -> ");
					out.print("\""+ds.getId()+"\"");
					if(is!=ds) {
						out.print(" [ label=\""+a.getName());
						double prob = source.gethTNTransitionProbabilityFunction().getTransitionProbability(is, a, ds);
						//if(prob != 1) {
						out.print(" (ProbTrans : "+df.format(prob) + ")");
						//}
						out.println("\" ];");
					}
				}
			}
		}
		out.println("}");
		
		out.flush();
		
	}

}
