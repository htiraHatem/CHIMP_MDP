package htn.htnExpanderDecomposition;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.logging.Logger;
import java.util.stream.Collectors;

import edu.cmu.ita.htn.HTNDomain;
import edu.cmu.ita.htn.HTNFactory;
import edu.cmu.ita.htn.LogicExpression;
import edu.cmu.ita.htn.LogicExpressionImpl;
import edu.cmu.ita.htn.Method;
import edu.cmu.ita.htn.Operator;
import edu.cmu.ita.htn.Proposition;
import edu.cmu.ita.htn.State;
import edu.cmu.ita.htn.Task;
import edu.cmu.ita.htn.TaskNetwork;
import edu.cmu.ita.htn.LogicExpressionImpl.LogicalOp;
import edu.cmu.ita.htn.parser.ParseException;
import edu.cmu.ita.htn.parser.Token;
import examples.MDP.TestVI;
import htn.EffectTemplate;
import htn.HTNPrecondition;
import htn.PlanReportroryItem;
import hybridDomainParsing.ClassicHybridDomain;
import jason.asSemantics.Unifier;
import planner.CHIMP.CHIMPBuilder;

public class HTNChimpDomain extends HTNDomain {

	public HTNChimpDomain(List<Method> methods, List<Task> tasks) {
		super();
		this.methods = new ArrayList<Method>(methods);
		this.actions = new ArrayList<Task>(tasks);
		this.instances = new HashMap<Task, Task>();
	}

	public HTNChimpDomain() {
		super();
	}
	
	public HTNChimpDomain(CHIMPBuilder builder) {
		super();
		ClassicHybridDomain a = builder.getDomain();
		List<PlanReportroryItem> M = a.getMethods();
		List<PlanReportroryItem> O = a.getOperators();

		// operators
		for (PlanReportroryItem i : O) {

			LogicExpression pre = null;
			State del = new State();

			for (HTNPrecondition pr : i.getPreconditions()) {
				Proposition p;
				String fluent = convertLISPAtom(pr.getFluenttype(), Arrays.asList(pr.getArguments()));
				p = new Proposition(fluent);// log_expr();
				
				pre = (pre == null) ? p
						: new LogicExpressionImpl(pre, LogicalOp.and, p);
                    if (pre == null)
                    	pre = Proposition.FALSE;

				// add negative effects
				if (pr.isNegativeEffect())
					del.add(p);
			}

			State add = new State();
			for (EffectTemplate eff : i.getEffects()) {
				String fluent = convertLISPAtom(eff.getName(), Arrays.asList(eff.getInputArgs()));
				Proposition p = new Proposition(fluent);
				add.add(p);
			}

			// cost TODO to update
			Operator op = null;
			String sCost = null;
			double cost = 0;

			String head;
			List<String> pars = Arrays.asList(i.getStringArgumentNames());
			head = convertLISPAtom(i.getName(), pars);
			add.addAll(del.negateAll());
			op = HTNFactory.createOperator(head, pre, add, cost);
			this.addAction(HTNFactory.createPrimitiveTask(op));
		}

		// HTNùethods
		for (PlanReportroryItem i : M) {
			String head;
			LogicExpression pre = null;
			TaskNetwork tn = null;

			List<String> pars = Arrays.asList(i.getStringArgumentNames());
			head = convertLISPAtom(i.getName(), pars);
			Task t = HTNFactory.createTask(head);

			for (HTNPrecondition pr : i.getPreconditions()) {
				Proposition p;
				String fluent = convertLISPAtom(pr.getFluenttype(), Arrays.asList(pr.getArguments()));
				p = new Proposition(fluent);// log_expr();
				pre = (pre == null) ? p//new LogicExpressionImpl(p, LogicalOp.none)
						: new LogicExpressionImpl(pre, LogicalOp.and, p);
//                    if (pre == null)
//                    	pre = Proposition.FALSE;

			}
			
			
			// get effects : subelements
			boolean ordered = true;
			List<Task> tl = new ArrayList<Task>();
			for (EffectTemplate eff : i.getEffects()) {

				List<String> effArg = Arrays.asList(eff.getInputArgs());
				String head1 = convertLISPAtom(eff.getName(), effArg);

				// TODO createPrimitiveTask not all normal tasks
				Task sub = HTNFactory.createTask(head1);

				tl.add(sub);
			}
			tn = createTaskNetwork(tl, ordered);

			Method m = new Method(head, t, pre, tn);
			this.addMethod(m);
		}

		this.instances = new HashMap<Task, Task>();
	}


	public static HTNChimpDomain parseHTNChimpDomain(CHIMPBuilder builder) throws ParseException {
		HTNChimpDomain domain = new HTNChimpDomain();

	    domain = new  HTNChimpDomain(builder);
	    try {
	                domain.postProcessPrimitiveTasks();
	        } catch(Exception e) {
	          throw new ParseException(e.getMessage());
	        }
	    return domain;
	  }
	
	  private final TaskNetwork createTaskNetwork(List< Task > tasks, boolean ordered) {
	        if(ordered) {
	                return new TaskNetwork(tasks.toArray(new Task[0]));
	        } else {
	                TaskNetwork tn = new TaskNetwork();
	                for(Task t:tasks) tn.addTask(t);
	                return tn;
	        }
	  }
	  
	private final String convertLISPTerms(List<String> terms) {
		if (terms == null || terms.isEmpty()) {
			return "";
		}
		StringBuffer sb = new StringBuffer("(");
		terms = terms.stream().filter(w -> w != "n").collect(Collectors.toList());
		for (Iterator<String> i = terms.iterator(); i.hasNext();) { // Still need to convert variables
			sb.append(convertLISPTerm(i.next()));
			sb.append((i.hasNext() ? "," : ""));

		}
		sb.append(")");
		return sb.toString();
	}

	private final String convertLISPTerm(String term) {
		if (term.startsWith("?")) {
			return "V" + term.substring(1);
		} else if (term.startsWith("!")) {
			return term.substring(1);
		} else {
			return term;
		}
	}

	private final String convertLISPAtom(String head, List<String> terms) {
		return convertLISPTerm(head) + convertLISPTerms(terms);
	}

	public List<MethodOption> findMethodsFor1(Task task, State s, Unifier u) {
		List<MethodOption> options = new ArrayList<MethodOption>();

		Unifier newU = new Unifier();
		for (Method m : methods) {
			newU.compose(u);
			Iterator<Unifier> iu;
			if (newU.unifies(m.getTask(), task) && (iu = m.getPossibleUnifiers(s, newU)) != null) {
				while (iu.hasNext()) {
					MethodOption option = new MethodOption(m, iu.next());
					// we only add methods that do not already exist
					if (!options.contains(option)) {
						options.add(option);
					}
				}
				newU = new Unifier();
			} else {
				newU.clear();
			}
		}

		return options;
	}
}
