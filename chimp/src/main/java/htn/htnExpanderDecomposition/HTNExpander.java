package htn.htnExpanderDecomposition;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

import org.metacsp.framework.ConstraintNetwork;
import org.metacsp.framework.ConstraintSolver;
import org.metacsp.framework.ValueOrderingH;
import org.metacsp.framework.Variable;

import com.google.errorprone.annotations.Var;

import edu.cmu.ita.htn.Constraint;
import edu.cmu.ita.htn.HTNDomain;
import edu.cmu.ita.htn.MultiState;
import edu.cmu.ita.htn.Operator;
import edu.cmu.ita.htn.Proposition;
import edu.cmu.ita.htn.State;
import edu.cmu.ita.htn.TaskNetwork;
import fluentSolver.FluentNetworkSolver;
import htn.valOrderingHeuristics.UnifyDeepestWeightNewestbindingsValOH;
import hybridDomainParsing.DomainParsingException;
import jason.asSemantics.Unifier;
import mdpSolver.HTNTaskNetwork;
import planner.CHIMP;

public class HTNExpander {

    static final boolean PRINT_PLAN = true;
    
	/**
	 * A cache for the states after executing a primitive task, this one should be kept to the end of the algorithm.
	 */
	private final HashMap<Task, MultiState> resolvedTasks;
	/**
	 * A cache for mStateBefore, this one should be flushed constantly throughout execution
	 */
	private final HashMap<Task, MultiState> mStateBefore;
	private MultiState initialState;
    
	public HTNExpander() {
		resolvedTasks = new HashMap<Task, MultiState>();
		mStateBefore = new HashMap<Task, MultiState>();
	}
	
	public TaskNetwork createFullyExpandedHTN(State s0, HTNTaskNetwork problem, HTNDomain domain) {
		initialState = new MultiState(s0);
		return fullDecomposition(problem, domain);
	}
    
    
	private final TaskNetwork fullDecomposition(TaskNetwork problem, HTNDomain domain) {
		//At this point we have finished expanding the HTN
		if(problem.allTasksArePrimitive() && getUnresolvedTask((HTNTaskNetwork) problem) == null) {
			return problem;
		}
		Task t = getUnresolvedTask((HTNTaskNetwork) problem);
		//Remove this print just for debugging purposes
		//debugPrintHTN(t, problem);
		if(t.isPrimitive()) {
			System.out.print("*");
			List<Operator> ops = findOperatorsFor(t, problem, domain, t.getUn());
			if(ops.isEmpty()) {
				throw new RuntimeException("No operators found for task "+t);
			}
			Operator active = ops.get(0);//domain.findOperatorsFor(t, t.un).get(0);
			t.setOp(active); 
			if(active == null) {
				throw new RuntimeException("Tried to apply an invalid operator for task "+t);
			}
			
			//Here, we will have to compute the mState
			@SuppressWarnings("unused")
			MultiState possibleState = mState(t, problem);
			
			TaskNetwork nTn = fullDecomposition(problem, domain);
			if(nTn == null) {
				throw new RuntimeException("Could not continue to decompose network "+problem);
//				logger.warning("Could not continue to decompose network "+problem);
//				return null;
			} else {
				return nTn;
			}
			
		} else {
			System.out.print("|");
			Unifier un = new Unifier();
			
			Collection<MethodOption> active = findMethodsFor(t, problem, domain, un);
			if(active.isEmpty()) {
				throw new RuntimeException("No options found for task "+t+" in network "+problem);
//				logger.warning("No options found for task "+t+" in network "+problem);
//				return null;
			}
			HTNTaskNetwork network = deltaStar((HTNTaskNetwork) problem, t, active, false, domain);
			
			return fullDecomposition(network, domain);
		}
	}
    
	public static void main(String[] args) throws Exception {
		
		 String problemFile = "domains/mobipick/simple_navigation/problem.pdl";
	        String domainFile = "domains/mobipick/simple_navigation/domain.ddl";

//	        String problemFile = "problems/test_m_serve_coffee_problem_1.pdl";
//	        String domainFile = "domains/ordered_domain.ddl";

	        ValueOrderingH valOH = new UnifyDeepestWeightNewestbindingsValOH();

	        CHIMP.CHIMPBuilder builder;

	        try {
	            builder = new CHIMP.CHIMPBuilder(domainFile, problemFile)
	                    .valHeuristic(valOH)
	                    .htnUnification(true);

	        } catch (DomainParsingException e) {
	            e.printStackTrace();
	            return;
	        }
	        CHIMP chimp = builder.build();
	        FluentNetworkSolver fluentSolver = chimp.getFluentSolver();
	        // get S0 state
	        ConstraintSolver problem = fluentSolver.getConstraintSolvers()[0];
	        
	        State S0_ = new State();
	        ConstraintNetwork dd = problem.getConstraintNetwork();
	        
	        Variable[] sa =problem.getVariables();
	        Object task = problem.getComponents().values().toArray()[0];
	        
	        for( Variable i : sa) {
		        if(!task.toString().contains(i.toString()))
	        	S0_.add(new Proposition (i.toString()));
	        }
	        //----------

	        ConstraintNetwork graph = fluentSolver.getConstraintNetwork();
	        
	       
	        HTNTaskNetwork tasknetwork = new HTNTaskNetwork(fluentSolver);
	        HTNChimpDomain HTNd = new HTNChimpDomain(builder) ;
	        
	        HTNExpander expander = new HTNExpander();
//			TaskNetwork fullyExpanded = expander.createFullyExpandedHTN(
//					S0_, tasknetwork, HTNd);


	        System.out.println("Found plan? " + chimp.generatePlan());
            Variable[] planVector = chimp.extractActions();

//	        chimp.printStats(System.out);

//	        if (PRINT_PLAN) {
//	            Variable[] planVector = chimp.extractActions();
//	            int c = 0;
//	            for (Variable act : planVector) {
//	                if (act.getComponent() != null)
//	                    System.out.println(c++ + ".\t" + act);
//	            }
//	            chimp.printFullPlan();
//	        }

	}
	

	/**
	 * Returns all applicable operators for {@link Task} <code>t</code>
	 * @param t
	 * @param network
	 * @param domain
	 * @param u
	 * @return
	 */
	private final List<Operator> findOperatorsFor(Task t, TaskNetwork network, HTNDomain domain, Unifier u) {
		assert(t.isPrimitive());
		List<Operator> options = new ArrayList<Operator>();
		MultiState ms = mStateBefore(t,network);
		
		for(State s:ms) {
			options.addAll(domain.findOperatorsFor(s, t, u));
		}
		
		return options;
	}
	
	/**
	 * 
	 * @param t
	 * @param network
	 * @param domain
	 * @param u
	 * @return
	 */
	private final Collection<MethodOption> findMethodsFor(Task t, TaskNetwork network, HTNDomain domain, Unifier u) {
		List<MethodOption> options = new ArrayList<MethodOption>();
		MultiState ms = mStateBefore(t,network);
		for(State s:ms) {
			for(MethodOption o: ((MethodOption) domain).findMethodsFor1(t, s, u)) {
				//We need to check that the same option has not been generated from a previous state
				if(!options.contains(o)) {
					options.add(o);
				}
			}
			//options.addAll(opt);
		}
		//---
//		List<MethodOption> options = domain.findMethodsFor(t, u);
		return options;
	}
	
	/**
	 * Expands the HTN using all possible applicable methods
	 * @param problem
	 * @param task
	 * @param methods
	 * @param domain 
	 */
	protected void expandWithAllMethodsInPlace(TaskNetwork problem, Task task, List<MethodOption> methods, HTNDomain domain) {
		deltaStar((HTNTaskNetwork) problem,task,methods,true, domain);
	}
	
	/**
	 * 
	 * @param network
	 * @param task
	 * @param options
	 * @param domain 
	 * @return
	 */
	protected HTNTaskNetwork expandWithAllMethods(HTNTaskNetwork network, Task task, List<MethodOption> options, HTNDomain domain) {
		return deltaStar(network, task, options, false, domain);
	}
	
	/**
	 * 
	 * @param network
	 * @param task
	 * @param options
	 * @param inPlace
	 * @param domain 
	 * @return
	 */
	private final HTNTaskNetwork deltaStar(HTNTaskNetwork network, Task task, Collection<MethodOption> options, boolean inPlace, HTNDomain domain) {
		assert(network.hasTask(task));
		
		if(!inPlace) {
			network = (HTNTaskNetwork) new TaskNetwork(network);
		}
		
		List<Constraint> constraintsAfter = network.findConstraintsWithTaskAfter(task);
		List<Constraint> constraintsBefore = network.findConstraintsWithTaskBefore(task);
		network.removeTask(task);
		//--- Added with mStateBefore
		mStateBefore.remove(task);
		//---
		
		for(MethodOption mo:options) {
			assert(mo.m.getTask().equals(task));
			//logger.info("Expanding task '"+task+"' with method '"+mo.m+"'");
			HTNTaskNetwork subst = (HTNTaskNetwork) mo.getMethod().getInstantiatedTaskNetwork(domain, mo.un);
			
			for(Task t:subst.getTasks1()) {
				network.addTask(t);
			}
			
			for(Constraint c:constraintsBefore) {
				network.addBeforeConstraint(subst.getLastTask(), c.getTask2());
			}
			
			for(Constraint c:constraintsAfter) {
				//We only add a precedence constraint to tasks whose possible states (pState(s0, c.task1, network)) support this method
				if(mState((Task) c.getTask1(),network).supports(mo.getMethod().getPrecond(), mo.getUnifier())) {
					network.addBeforeConstraint(c.getTask1(), subst.getFirstTask());
				}
			}
			network.addConstraints(subst.getConstraints());
		}
		
		return network;
	}
	
	/**
	 * Returns the possible states at the specified task in the fully expanded HTN.
	 * @param task
	 * @return
	 */
	public HashMap<Task,MultiState> getMStates() {
		return resolvedTasks;
	}
	
	/**
	 * Returns whether or not <code>task</code> is Resolved, a resolved state has had its mState calculated.
	 * @param t
	 * @return
	 */
	private boolean isResolved(Task task) {
		return resolvedTasks.containsKey(task);
	}
	
	/**
	 * Returns the next unresolved task in the network, an unresolved task has no possible state attached to it.
	 * @param network
	 * @return
	 */
	private final Task getUnresolvedTask(HTNTaskNetwork network) {
		LinkedList<Task> tasks = network.getOrderedTasks1();
		for(Task t:tasks) {
			if(!isResolved(t)) {
				return t;
			}
		}
		return null;
	}
	
	/**
	 * Returns the possible state at task
	 * @param task
	 * @return
	 */
	private final MultiState possibleState(Task task) {
		assert(task.isPrimitive());
		assert(isResolved(task));
		return resolvedTasks.get(task);
	}
	
	/**
	 * Returns all possible states at {@link Task} <code>t</code>, these possible states are the states
	 * <b>after</b> <code>t</code> has been fully executed, and thus should not be used in calculating
	 * the applicability of <code>t</code> in terms of its method preconditions.
	 * @param s0
	 * @param t
	 * @param h
	 * @return
	 */
	private final MultiState mState(Task t, TaskNetwork h) {
		MultiState msRes = null;
//		assert(t.isPrimitive());
		//If we have already calculated the preceding state, no need to do it again
		if(isResolved(t)) {
			msRes = possibleState(t);
		} else {
			//If this is one of the first possible tasks in the network, the preceding state can only be the initial state
			if(h.isUnpreceded(t)) {
				msRes = initialState.applyOperator(t.getOp(), t.getUn());
			} else {
				List<Constraint> prec = h.findConstraintsWithTaskAfter(t);
				assert(!prec.isEmpty()); // This list should be empty given the previous condition
				msRes = new MultiState();
				for(Constraint c: prec) {
					//It seems in some situations just querying the possibleState directly won't work
//					MultiState prev = possibleState(c.task1);
					MultiState prev = mState((Task) c.getTask1(), h);
					msRes.addAll(prev.applyOperator(t.getOp(), t.getUn()));
				}
			}
			resolvedTasks.put(t, msRes);
		}
//		logger.info("mState for "+t+" is "+msRes);
		return msRes;
	}
	
	/**
	 * A helper method for the converter to create an initial state.
	 * @return
	 */
	MultiState getInitialState() {
		return initialState;
	}
	
	/**
	 * Returns the possible state immediately <b>before</b> {@link Task} <code>t</code>, this method relies on the
	 * correct left to right decomposition of tasks.
	 * @param t
	 * @param h
	 * @return
	 */
	private final MultiState mStateBefore(Task t, TaskNetwork h) {
		MultiState msRes = null;
		if(mStateBefore.containsKey(t)) {
			msRes = mStateBefore.get(msRes);
		} else {
			//If this is one of the first possible tasks in the network, the preceding state can only be the initial state
			if(h.isUnpreceded(t)) {
				msRes = initialState;
			} else {
				List<Constraint> prec = h.findConstraintsWithTaskAfter(t);
				assert(!prec.isEmpty()); // This list should be empty given the previous condition
				msRes = new MultiState();
				for(Constraint c: prec) {
					MultiState prev = mState((Task) c.getTask1(), h);
					msRes.addAll(prev);
				}
				mStateBefore.put(t, msRes);
			}
		}
//		logger.info("mState before "+t+" is "+msRes);
		return msRes;
	}
	
	
}
