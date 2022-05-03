package htn;

import jason.asSyntax.Pred;
import jason.asSyntax.PredicateIndicator;
import jason.asSyntax.Term;
import mdpSolver.HTNAction;
import mdpSolver.HTNState;
import mdpSolver.HTNTaskNetwork;
import mdpSolver.HtnMdpFactory;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

import htn.htnExpanderDecomposition.HTNChimpDomain;
import htn.htnExpanderDecomposition.HTNExpander;
import htn.htnExpanderDecomposition.Method;
import htn.htnExpanderDecomposition.Operator;
import htn.htnExpanderDecomposition.Task;



/**
 * 
 * @author meneguzzi
 * @updated Hatem
 *
 */
public class Stats {
	public enum TimerName {
		EXPANDER  { public String toString() { return "HTN Expansion Time "; } },
		STATES    { public String toString() { return "MDP States Time    "; } },
		REWARD    { public String toString() { return "MDP Reward Time    "; } },
		TRANSITION{ public String toString() { return "MDP Transition/resource Time"; } },
		CONVERTER { public String toString() { return "HTN to MDP Time    "; } },
		SOLVER    { public String toString() { return "MDP Solver Time    "; } },
		TOTAL     { public String toString() { return "Total Runtime      "; } }
		}
	final Timer timers[] = new Timer[TimerName.values().length];
	long uniqueObjects;
	long uniquePreds;
	long herbrandBase;
	public long htnStates;
	long uniqueStates;
	long totalMethods;
	long totalOperators;
	long totalTasks;
	long maxBranching;
	
	/**
	 * 
	 */
	public Stats() {
		for(TimerName tm:TimerName.values()) {
			timers[tm.ordinal()] = new Timer(tm.toString());
		}
	}
	
	/**
	 * Starts counting the time for the specified {@link TimerName}. 
	 * @param tm
	 */
	public void startRuntime(TimerName tm) {
		timers[tm.ordinal()].start();
	}
	
	/**
	 * End counting the time for the specified {@link TimerName}
	 * @param tm
	 */
	public void endRuntime(TimerName tm) {
		timers[tm.ordinal()].end();
	}

	
	/**
	 * 
	 * @param problem
	 * @param domain
	 * @param fullyExpanded
	 * @param mdp
	 * @param expander 
	 */
	public void computeStats(HTNTaskNetwork problem, HTNChimpDomain domain,HtnMdpFactory<HTNState, HTNAction> mdp, HTNExpander expander) {
		uniqueStates = (mdp!=null)?(mdp.getFinalStates().size()+mdp.getNonFinalStates().size()):0;
		herbrandBase = calculateRawStateSpace(problem, domain, expander);
		totalMethods = domain.getMethods().size();
		totalOperators = domain.getActions().size();
		totalTasks = problem.getTasks1().size();
		maxBranching = calculateMaxBranching(domain);
	}
	
	private long calculateRawStateSpace(HTNTaskNetwork problem, HTNChimpDomain domain, HTNExpander expander) {
		HashSet<Term> objects = new HashSet<Term>();
		HashSet<PredicateIndicator> preds = new HashSet<PredicateIndicator>();
		
		for(Pred p:expander.getS0()) {
			objects.addAll(getNonVars(p.getTerms()));
			preds.add(p.getPredicateIndicator());
		}
		
		for(Task t:domain.getActions()) {
			edu.cmu.ita.htn.Operator op = t.getOp();
			for(Pred p:op.getPreconditions().getPropositions()) {
				objects.addAll(getNonVars(p.getTerms()));
				preds.add(p.getPredicateIndicator());
			}
			for(Pred p:op.getEffects()) {
				objects.addAll(getNonVars(p.getTerms()));
				preds.add(p.getPredicateIndicator());
			}
		}
		
		for(Method m:domain.getMethods()) {
			for(edu.cmu.ita.htn.Task task:m.getTaskNetwork()) {
				objects.addAll(getNonVars(task.getTerms()));
			}
		}
		
		preds.remove(Pred.LTrue.getPredicateIndicator());
		preds.remove(Pred.LFalse.getPredicateIndicator());
		
		uniqueObjects = objects.size();
		uniquePreds = preds.size();
		long stateSpace = 0;
		for(PredicateIndicator pi:preds) {
			int arity = pi.getArity();
			stateSpace += Math.pow(uniqueObjects, arity);
		}
		
		return stateSpace;
	}
	
	/**
	 * Filters variables out of a list of terms
	 * @param terms
	 * @return
	 */
	private final List<Term> getNonVars(List<Term> terms) {
		List<Term> res = new ArrayList<Term>();
		for(Term t:terms) {
			if(t.isGround()) {
				res.add(t);
			}
		}
		return res;
	}
	
	private long calculateMaxBranching(HTNChimpDomain domain) {
		long res = 0;
		for(Method m:domain.getMethods()) {
			int b = m.getTaskNetwork().getTaskSize();
			if(b > res) {
				res = b;
			}
		}
		return res;
	}
	
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(System.getProperty("line.separator"));
		sb.append("=============================="); sb.append(System.getProperty("line.separator"));

		sb.append("Unique Objects : "+uniqueObjects); sb.append(System.getProperty("line.separator"));
		sb.append("Unique Preds   : "+uniquePreds); sb.append(System.getProperty("line.separator"));
		sb.append("Unique States  : "+uniqueStates); sb.append(System.getProperty("line.separator"));
		sb.append("Herbrand Base  : "+herbrandBase); sb.append(System.getProperty("line.separator"));
		sb.append("HTN States     : "+htnStates); sb.append(System.getProperty("line.separator"));
		sb.append("Total Methods  : "+totalMethods); sb.append(System.getProperty("line.separator"));
		sb.append("Total Operators: "+totalOperators); sb.append(System.getProperty("line.separator"));
		sb.append("Total Tasks    : "+totalTasks); sb.append(System.getProperty("line.separator"));
		sb.append("Max Branching  : "+maxBranching); sb.append(System.getProperty("line.separator"));
		sb.append("Times"); sb.append(System.getProperty("line.separator"));
		for(Timer t:timers) {
			sb.append(t.toString()); sb.append(System.getProperty("line.separator"));
		}
		sb.append("=============================="); sb.append(System.getProperty("line.separator"));

		return sb.toString();
	}
	
	/**
	 * A timer utility
	 * @author meneguzzi
	 *
	 */
	public class Timer {
		long time;
		String name;
		
		public Timer(String name) {
			this.name = name;
		}
		
		void start() {
			time = System.currentTimeMillis();
		}
		
		void end() {
			time = System.currentTimeMillis() - time;
		}
		
		/* (non-Javadoc)
		 * @see java.lang.Object#toString()
		 */
		@Override
		public String toString() {
			StringBuilder sb = new StringBuilder(name!=null?name+": ":"");
			sb.append(time);
			return sb.toString();
		}
	}
}