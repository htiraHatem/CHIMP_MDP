package htn.htnExpanderDecomposition;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Vector;
import java.util.logging.Logger;
import java.util.stream.Collectors;

import edu.cmu.ita.htn.HTNDomain;
import edu.cmu.ita.htn.HTNFactory;
import edu.cmu.ita.htn.LogicExpression;
import edu.cmu.ita.htn.LogicExpressionImpl;
import edu.cmu.ita.htn.Proposition;
import edu.cmu.ita.htn.State;
import edu.cmu.ita.htn.TaskNetwork;
import edu.cmu.ita.htn.LogicExpressionImpl.LogicalOp;
import edu.cmu.ita.htn.parser.ParseException;
import edu.cmu.ita.htn.parser.Token;
import examples.MDP.testSolver.TestVI;
import htn.EffectTemplate;
import htn.HTNPrecondition;
import htn.MDPTemplate;
import htn.PlanReportroryItem;
import hybridDomainParsing.ClassicHybridDomain;
import jason.asSemantics.Unifier;
import mdpSolver.HTNTaskNetwork;
import planner.CHIMP.CHIMPBuilder;
import resourceFluent.FluentResourceUsageScheduler;
import resourceFluent.FluentScheduler;

public class HTNChimpDomain extends HTNDomain {

	ArrayList<Method> htnMethods = new ArrayList<Method>();
	ArrayList<Task> htnActions = new ArrayList<htn.htnExpanderDecomposition.Task>();
	HashMap<htn.htnExpanderDecomposition.Task, htn.htnExpanderDecomposition.Task> htnInstances = new HashMap<htn.htnExpanderDecomposition.Task, htn.htnExpanderDecomposition.Task>();
	private final Vector<FluentResourceUsageScheduler> resourceSchedulers = 
			new Vector<FluentResourceUsageScheduler>();
	
	public HTNChimpDomain(List<Method> methods, List<Task> tasks) {
		super();
		this.htnMethods = new ArrayList<Method>(methods);
		this.htnActions = new ArrayList<Task>(tasks);
		this.htnInstances = new HashMap<htn.htnExpanderDecomposition.Task, htn.htnExpanderDecomposition.Task>();
	}

	public HTNChimpDomain() {
		super();
	}
	
	public HTNChimpDomain(CHIMPBuilder builder) {
		super();
		ClassicHybridDomain a = builder.getDomain();
		List<PlanReportroryItem> M = a.getMethods();
		List<PlanReportroryItem> O = a.getOperators();
		
		// get resources
		
		List<FluentResourceUsageScheduler> fluentSchedulers = a.getResourceSchedulers();
		resourceSchedulers.clear();
		for(FluentResourceUsageScheduler f : fluentSchedulers){
			resourceSchedulers.add(f);

		}

		// operators
		for (PlanReportroryItem i : O) {

			LogicExpression pre = null;
			State del = new State();
			if(i.getPreconditions().length<1)
				pre = Proposition.TRUE;
			else
			for (HTNPrecondition pr : i.getPreconditions()) {
				Proposition p;
				String fluent = convertLISPAtom(pr.getFluenttype(), Arrays.asList(pr.getArguments()));
				p =  HTNFactory.createProposition(fluent);// log_expr();
				
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
				Proposition p1=HTNFactory.createProposition(fluent);
				add.add(p1);
			}

			Operator op = null;double cost=1;
			if(i.GetMDPTemplate().getReward()!=null)
			 cost = i.GetMDPTemplate().getReward();

			String head;
			List<String> pars = Arrays.asList(i.getStringArgumentNames());
			head = convertLISPAtom(i.getName(), pars);
			add.addAll(del.negateAll());
			op = new Operator(HTNFactory.createOperator(head, pre, add, cost));
			this.addHtnAction(new Task( HTNFactory.createPrimitiveTask(op), i.getResourceUsageTemplate(), i.GetMDPTemplate()));
		}

		// HTNùethods
		for (PlanReportroryItem i : M) {
			String head;
			LogicExpression pre = null;
			HTNTaskNetwork tn = null;

			List<String> pars = Arrays.asList(i.getStringArgumentNames());
			head = convertLISPAtom(i.getName(), pars);
			Task t = new Task(HTNFactory.createTask(head));

			if(i.getPreconditions().length<1)
				pre = Proposition.TRUE;
			else
			for (HTNPrecondition pr : i.getPreconditions()) {
				Proposition pp;
				String fluent = convertLISPAtom(pr.getFluenttype(), Arrays.asList(pr.getArguments()));
				
				pp=HTNFactory.createProposition(fluent);
				pre = (pre == null) ? pp//new LogicExpressionImpl(p, LogicalOp.none)
						: new LogicExpressionImpl(pre, LogicalOp.and, pp);
//                    if (pre == null)
//                    	pre = Proposition.FALSE;

			}
			
			
			// get effects : subelements
			boolean ordered = true;
			List<Task> tl = new ArrayList<Task>();
			for (EffectTemplate eff : i.getEffects()) {

				List<String> effArg = Arrays.asList(eff.getInputArgs());
				String head1 = convertLISPAtom(eff.getName(), effArg);
				Task sub = new Task (HTNFactory.createTask(head1));	
				for(Task tsk : this.htnActions) {
					String  subTaskName =eff.getName().substring(1);;
					
					if(tsk.getName().equals(subTaskName))
						sub.setmDPTemplate(tsk.getmDPTemplate());
				}

				tl.add(sub);
			}
			tn = createTaskNetwork(tl, ordered);

			Method m = new Method(head, new htn.htnExpanderDecomposition.Task(t), pre, tn);
			this.addMethod(m);
		}

		this.htnInstances = new HashMap<Task, Task>();
	}

	public void addMethod(Method m) {
		this.htnMethods.add(m);
	}
	
	public  HashMap<htn.htnExpanderDecomposition.Task, htn.htnExpanderDecomposition.Task> getInstances() {

		return this.htnInstances;
	}
	
//	public  HashMap<htn.htnExpanderDecomposition.Task, htn.htnExpanderDecomposition.Task> getInstances() {
//		HashMap<htn.htnExpanderDecomposition.Task, htn.htnExpanderDecomposition.Task> tasks = new HashMap<htn.htnExpanderDecomposition.Task, htn.htnExpanderDecomposition.Task>();
//		for(Task i : instances.values()) {
//			((List<Method>) tasks).addAll(new htn.htnExpanderDecomposition.Task(i));
//		}
//		return tasks;
//	}
	

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
	
	  private final HTNTaskNetwork createTaskNetwork(List< Task > tasks, boolean ordered) {
	        if(ordered) {
	                return new HTNTaskNetwork(tasks.toArray(new Task[0]));
	        } else {
	        	HTNTaskNetwork tn = new HTNTaskNetwork();
	                for(Task t:tasks) tn.addTask(t);
	                return tn;
	        }
	  }
	  
	private final static String convertLISPTerms(List<String> terms) {
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

	public final static String convertLISPTerm(String term) {
		if (term.startsWith("?")) {
			return "V" + term.substring(1);
		} else if (term.startsWith("!")) {
			return term.substring(1);
		} else {
			return term;
		}
	}
	
	

	public final static String convertLISPAtom(String head, List<String> terms) {
		return convertLISPTerm(head) + convertLISPTerms(terms);
	}

	public List<MethodOption> findMethodsFor1(Task task, State s, Unifier u) {
		List<MethodOption> options = new ArrayList<MethodOption>();

		Unifier newU = new Unifier();
		for (Method m : htnMethods) {
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
	
	public List<MethodOption> findMethodsFor1(Task task, Unifier un) {
		List<MethodOption> options = new ArrayList<MethodOption>();
		
		Unifier newUn = new Unifier();
		for(Method m:htnMethods) {
			newUn.compose(un);
			if(newUn.unifies(m.getTask(), task) ) {
				options.add(new MethodOption(m, newUn));
				newUn = new Unifier();
			} else {
				newUn.clear();
			}
		}
		
		return options;
	}
	
	/**
	 * Finds operators that match the supplied task
	 * @param task
	 * @param un
	 * @return
	 */
	public List<Operator> findOperatorsFor1(State s, Task task, Unifier un) {
		List<Operator> opers = new ArrayList<Operator>();
		for(Task tPrimitive:htnActions) {
			Iterator<Unifier> iu;
			
			if(un.unifies(task, tPrimitive) 
				&& 
				(iu = tPrimitive.op.getPreconditions().consequence(s, un)) !=null) {
				
				while(iu.hasNext()) {
					Unifier u=iu.next();
					assert(tPrimitive.op != null);
					Operator op = new Operator(tPrimitive.op);
					u.compose(un);
					op.apply(u);
					opers.add(op);
				}
			}
		}
		return opers;
	}
	public List<Operator> findOperatorsFor(Task task, Unifier un) {
		List<Operator> opers = new ArrayList<Operator>();
		for(Task tPrimitive:htnActions) {
			if(un.unifies(task, tPrimitive)) {
				assert(tPrimitive.op != null);
				Operator op = new Operator(tPrimitive.op);
				op.apply(un);
				opers.add(op);
			}
		}
		return opers;
	}

	
	public void postProcessPrimitiveTasks() throws Exception {
		for(Method m:htnMethods) {
			for(Task task:m.getTaskNetwork().getTasks1()) {
				Unifier un = new Unifier();
				//If a task has no possible substitutions, either the task is primitive 
				//(so we find an operator to associate to it), or the domain is poorly specified
				if(this.findMethodsFor1(task, un).isEmpty()) {
					un = new Unifier();
					List<Operator> opers = findOperatorsFor(task, un);
					if(opers.isEmpty()) {
						throw new Exception("Invalid domain: task "+task+" has no applicable methods and no associated operators");
					} else {
						if(opers.size() > 1) {
							//logger.warning("More than one operator is applicable to primitive task "+task+" "+opers);
						}
						task.op = opers.get(0);
					}
				}
			}
		}
	}

	public List<Task> getActions() {
		return htnActions;
	}
	
	public ArrayList<Method> getMethods() {
		return htnMethods;
	}
	public void addHtnAction(Task t) {
		this.htnActions.add(t);
	}
	
	public Vector<FluentResourceUsageScheduler> getResourceSchedulers() {
		return resourceSchedulers;
	}

}
