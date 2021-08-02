package ui;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.io.Writer;
import java.text.DecimalFormat;
import java.util.List;

import aima.core.probability.mdp.MarkovDecisionProcess;
import examples.MDP.HTNAction;
import examples.MDP.HTNState;
import examples.MDP.HTNTransitionProbabilityFunction;
import examples.MDP.HtnMdpFactory;
import examples.MDP.HtnMdpTransition;
import guru.nidi.graphviz.attribute.Color;
import guru.nidi.graphviz.attribute.Style;
import guru.nidi.graphviz.engine.Format;
import guru.nidi.graphviz.engine.Graphviz;
import guru.nidi.graphviz.model.MutableGraph;
import guru.nidi.graphviz.parse.Parser;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author meneguzzi , 
 * @updated by Hatem
 */

public class Dot2Graph {

    private static final Logger logger = LoggerFactory.getLogger(Dot2Graph.class);

	public static void printMDPDot(Writer writer, HtnMdpFactory<HTNState, HTNAction> source, boolean printState) throws IOException {
		PrintWriter out = new PrintWriter(writer);
		DecimalFormat df = new DecimalFormat("0.00");
		
		out.println("digraph {");
		out.println(" size=\"8.5,11\";");
		
		if(printState) {
			for(HTNState s:source.getFinalstates()) {
				out.println("\""+s.getId()+"\" [label=\""+s.getLabel()+" r:"+source.reward(s)+"\"];");
			}
			for(HTNState s:source.getNonFinalStates()) {
				out.println("\""+s.getId()+"\" [label=\""+s.getLabel()+" r:"+source.reward(s)+"\"];");
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
						if(prob != 1) {
							out.print(":"+df.format(prob));
						}
						out.println("\" ];");
					}
				}
			}
		}
		out.println("}");
		
		out.flush();
//		String mdpGraph = "src/main/java/examples/MDP/gotolondon/ita-problemMDP.dot";
//
//
//		try (InputStream dot = Dot2Graph.class.getClassLoader().getResourceAsStream(mdpGraph)) {
//		    MutableGraph g = new Parser().read(dot);
//		    Graphviz.fromGraph(g).width(700).render(Format.PNG).toFile(new File("src/main/java/examples/MDP/gotolondon/ex4-1.png"));
//
//		    g.graphAttrs()
//		            .add(Color.WHITE.gradient(Color.rgb("888888")).background().angle(90))
//		            .nodeAttrs().add(Color.WHITE.fill())
//		            .nodes().forEach(node ->
//		            node.add(
//		                    Color.named(node.name().toString()),
//		                    Style.lineWidth(4), Style.FILLED));
//		    Graphviz.fromGraph(g).width(700).render(Format.PNG).toFile(new File("example/ex4-2.png"));
//		}
	}

}
