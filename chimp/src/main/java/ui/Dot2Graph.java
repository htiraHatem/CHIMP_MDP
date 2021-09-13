package ui;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.Writer;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.LinkedList;
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

	public static void printMDPDot(Writer writer, HtnMdpFactory<HTNState, HTNAction> source, boolean printState,
			Map<HTNState, Double> policy) throws IOException {
		PrintWriter out = new PrintWriter(writer);
		DecimalFormat df = new DecimalFormat("0.00");

		out.println("digraph {");
		out.println("  node [color=\"#40b9e5\" ]\r\n" + " size=\"60,17\";");

		if (printState) {
			for (HTNState s : source.getFinalstates()) {
				ArrayList<String> OhneStatic = new ArrayList<String>();
				Object[] a = s.getHtnState().iterator().next().toArray();
				for (Object i : a) {
					if ((!i.toString().contains("crossLinked")) && (!i.toString().contains("connected")))
						OhneStatic.add(i.toString());
				}

				// out.print("\""+s.getId()+"\" [label=\""+OhneStatic+" (r:"+source.reward(s) +
				// " )");
				out.print("\"" + s.getId() + "\" [label=\" S" + s.getId() + "   : (r:" + source.reward(s) + " )");
				if (policy != null)
					out.print(", Utility : " + policy.get(s));
				out.println(" \" shape=doubleoctagon];");
			}
			for (HTNState s : source.getNonFinalStates()) {
				ArrayList<String> OhneStatic = new ArrayList<String>();
				Object[] a = s.getHtnState().iterator().next().toArray();
				for (Object i : a) {
					if ((!i.toString().contains("crossLinked")) && (!i.toString().contains("connected")))
						OhneStatic.add(i.toString());
				}
				// easy to understand
				out.print("\"" + s.getId() + "\" [label=\" S" + s.getId() + "   : (reward:" + source.reward(s) + " )");
				// more details !!
				// out.print("\""+s.getId()+"\" [label=\""+s.getLabel()()+"
				// (reward:"+source.reward(s)+ " )");
				if (policy != null)
					out.print(", Utility : " + policy.get(s));

				out.println(" \"];");
			}
		}

		for (HTNState is : source.getNonFinalStates()) {
			for (HTNAction a : source.actions(is)) {
				List<HtnMdpTransition> transition = source.gethTNTransitionProbabilityFunction()
						.getTransitionsWithStartingStateAndAction(is, a);
				for (HtnMdpTransition<HTNState, HTNAction> tr : transition) {
					HTNState ds = tr.getDestinationState();

					out.print("\"" + is.getId() + "\"");
					out.print(" -> ");
					out.print("\"" + ds.getId() + "\"");
					if (is != ds) {
						ds.setPreviousState(is);
						out.print(" [ label=\"" + a.getName());
						double prob = source.gethTNTransitionProbabilityFunction().getTransitionProbability(is, a, ds);
						// if(prob != 1) {
						out.print(" (ProbTrans : " + df.format(prob) + ")");
						// }

						out.println("\"");
						if (ds == getOptState(source, policy, is)) {
							is.setNextState(ds);
							out.print(", arrowhead = diamond , color=green");
							out.print("];");
						} else {
							out.print(",style=dotted, arrowhead=tee");
							out.print("];");
						}
					}
				}
			}
		}
		out.println("}");

		out.flush();

		List<HTNState> possibleTrajectory = printOptimalTrajectoryDot(source, policy);
		for (HTNState s : possibleTrajectory)
			s.displayID();
	}

	public static HTNState getOptState(HtnMdpFactory<HTNState, HTNAction> source, Map<HTNState, Double> policy,
			HTNState state) {
		Double U = (double) -10;
		HTNState optS = null;
		for (HTNAction act : source.actions(state)) {
			List<HtnMdpTransition> transition = source.gethTNTransitionProbabilityFunction()
					.getTransitionsWithStartingStateAndAction(state, act);

			for (HtnMdpTransition<HTNState, HTNAction> tr : transition) {
				HTNState ds = tr.getDestinationState();
				if (policy.get(ds) > U) {
					U = policy.get(ds);
					optS = ds;
				}

			}
		}
		return optS;
	}

	// to generate the optimal trajectory : only sequence of actions
	public static List<HTNState> printOptimalTrajectoryDot(HtnMdpFactory<HTNState, HTNAction> source,
			Map<HTNState, Double> policy) {
		List<HTNState> optTraj = new LinkedList<>();
		for (HTNState is : source.getNonFinalStates()) {
//			System.out.println("S" + is.getId());
//			if(is.getPreviousState() != null)
//			System.out.println("previous S" + is.getPreviousState().getId());
//			System.out.println("next S" + is.getNextState().getId());

			if (is == source.getInitialState())
				optTraj.add(is);
			else if (is.getPreviousState() == optTraj.get(optTraj.size() - 1)
					&& (is.getNextState() == getOptState(source, policy, is))) {
				optTraj.add(is);
				if (is.getNextState().isFinal())
					optTraj.add(is.getNextState());
			}

		}
		return optTraj;
	}
}
