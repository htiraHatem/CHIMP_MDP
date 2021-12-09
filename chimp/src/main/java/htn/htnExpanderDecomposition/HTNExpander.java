package htn.htnExpanderDecomposition;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.logging.Logger;

import org.metacsp.framework.ConstraintSolver;
import org.metacsp.framework.Variable;
import org.metacsp.meta.TCSP.TCSPSolver;
import org.metacsp.multi.TCSP.DistanceConstraintSolver;
import org.metacsp.multi.TCSP.MultiTimePoint;
import org.metacsp.multi.spatial.rectangleAlgebra.UnaryRectangleConstraint;

import edu.cmu.ita.htn.Constraint;
import edu.cmu.ita.htn.HTNFactory;
import edu.cmu.ita.htn.MultiState;
import edu.cmu.ita.htn.Operator;
import edu.cmu.ita.htn.State;
import fluentSolver.FluentNetworkSolver;
import jason.asSemantics.Unifier;
import mdpSolver.HTNTaskNetwork;
import resourceFluent.FluentResourceUsageScheduler;
import resourceFluent.ResourceUsageTemplate;
import unify.CompoundSymbolicVariable;

public class HTNExpander {

	static final boolean PRINT_PLAN = true;
	private static final Logger logger = Logger.getLogger(HTNExpander.class.getName());

	/**
	 * A cache for the states after executing a primitive task, this one should be
	 * kept to the end of the algorithm.
	 */
	private final HashMap<Task, MultiState> resolvedTasks;
	/**
	 * A cache for mStateBefore, this one should be flushed constantly throughout
	 * execution
	 */
	private final HashMap<Task, MultiState> mStateBefore;
	private MultiState initialState;
	private static State S0;

	public State getS0() {
		return S0;
	}

	public HTNExpander() {
		resolvedTasks = new HashMap<Task, MultiState>();
		mStateBefore = new HashMap<Task, MultiState>();
	}

	public HTNTaskNetwork createFullyExpandedHTN(FluentNetworkSolver fluentSolver, HTNChimpDomain domain) throws Exception {
		S0 = new State();

		HTNTaskNetwork problem = new HTNTaskNetwork(fluentSolver);

		ConstraintSolver symbolicConstraintSolver = fluentSolver.getConstraintSolvers()[0];
		Variable[] sa = symbolicConstraintSolver.getVariables();
		Object task = symbolicConstraintSolver.getComponents().values().toArray()[0];

		ConstraintSolver spatialConstraintSolver = fluentSolver.getConstraintSolvers()[2];
		
		for (Variable i : sa) {
			if (!task.toString().contains(i.toString())) {
				Variable[] terms = ((CompoundSymbolicVariable) i).getInternalVariables();
				if (terms[2].toString().equalsIgnoreCase("n")) {
					S0.add(HTNFactory.createProposition(i.toString()));
				} else {
					ArrayList<String> args = new ArrayList();
					args.add(terms[1].toString());
					args.add(terms[2].toString());
					if(!terms[3].toString().equalsIgnoreCase("n")) args.add(terms[3].toString());
					String predicat =((CompoundSymbolicVariable) i).getPredicateName().toString();
					String fluent = HTNChimpDomain.convertLISPAtom(predicat,
							args);
					S0.add(HTNFactory.createProposition(fluent));

				}
			}
		}
		initialState = new MultiState(S0);
		HTNTaskNetwork fd = fullDecomposition(problem, domain);
		//get spatial knowledge

		if (spatialConstraintSolver.getConstraints().length > 0) {

			ArrayList<UnaryRectangleConstraint> u = new ArrayList<UnaryRectangleConstraint>();

			for (org.metacsp.framework.Constraint c : spatialConstraintSolver.getConstraints())
				if (c.isUnary() && ((UnaryRectangleConstraint) c).getType().name().equals("At"))
					u.add((UnaryRectangleConstraint) c);

			UnaryRectangleConstraint term1 = null;
			UnaryRectangleConstraint term2 = null;

			for (Task t : fd.getOrderedTasks1()) {
				// check if the the spatial variables exists or not
				String[] moveOp = { "move_base_blind", "moveTo","moveTo1" };
				if ((Arrays.asList(moveOp).contains(t.getName()))) {
//					System.out.println(t.getName());
//					System.out.println(t.getTerms());
					for (UnaryRectangleConstraint ucr : u) {

						if (t.getTermsArray()[0].toString().equalsIgnoreCase(ucr.getScope()[0].getComponent()))
							term1 = ucr;
						if (t.getTermsArray()[1].toString().equalsIgnoreCase(ucr.getScope()[0].getComponent()))
							term2 = ucr;

					}
//					System.out.println(term1.getEdgeLabel());
//					System.out.println(term2.getEdgeLabel());
					
					//get The center of rectangle of obj1
					long obj1X1 = term1.getBounds()[0].min;
					long obj1X2 = term1.getBounds()[1].max;
					long obj1XCenter = (obj1X1 + obj1X2)/2;
					
					long obj1Y1 = term1.getBounds()[2].min;
					long obj1Y2 = term1.getBounds()[3].max;
					long obj1YCenter = (obj1Y1 + obj1Y2)/2;
					
					
					//get The center of rectangle of obj1
					long obj2X1 = term2.getBounds()[0].min;
					long obj2X2 = term2.getBounds()[1].max;
					long obj2XCenter = (obj2X1 + obj2X2)/2;
					
					long obj2Y1 = term2.getBounds()[2].min;
					long obj2Y2 = term2.getBounds()[3].max;
					long obj2YCenter = (obj2Y1 + obj2Y2)/2;

					
					int dist = (int) Math.hypot(obj1XCenter-obj2XCenter, obj1YCenter-obj2YCenter);
					//System.out.println("distance between" + t.getTerms() + " = " + dist);

					//System.out.println(domain.getResourceSchedulers().get(0).getCapacity());
					
					Double nbr = ((double) dist/100);
					int rslt = (int) ((domain.getResourceSchedulers().get(0).getCapacity() *10 /100) * nbr);
					//System.out.println(rslt);
					
					//10 % reduced from global value every 100U distance
					// ********* assign the calculated distance

					List<ResourceUsageTemplate> lst =new ArrayList<ResourceUsageTemplate>();
					ResourceUsageTemplate a = new ResourceUsageTemplate("navigationCapacity", null,null, rslt);
					lst.add(a);
					t.setResourceUsageIndicators(lst);
					//System.out.println(t.getResourceUsageIndicators().get(0));


				}

			}

		}
		
		
		// get global resources value
		List<FluentResourceUsageScheduler> fluentSchedulers = domain.getResourceSchedulers();
			fd.setResourceSchedulers(fluentSchedulers);		
		return fd;
	}

	private final HTNTaskNetwork fullDecomposition(HTNTaskNetwork ChimpProblem, HTNChimpDomain domain) {
		// At this point we have finished expanding the HTN
		if (ChimpProblem.allTasksArePrimitive() && getUnresolvedTask(ChimpProblem) == null) {
			return ChimpProblem;
		}
		Task t = getUnresolvedTask(ChimpProblem);
		
		// Remove this print just for debugging purposes
		// debugPrintHTN(t, problem);
		if (t.isPrimitive()) {
			System.out.print("*");
			System.out.println(t.toString());
		
			List<Operator> ops = findOperatorsFor(t, ChimpProblem, domain, t.getUn());
			if (ops.isEmpty()) {
				throw new RuntimeException("No operators found for task " + t);
			}
			Operator active = ops.get(0);// domain.findOperatorsFor(t, t.un).get(0);
			t.setOp(active);
			if (active == null) {
				throw new RuntimeException("Tried to apply an invalid operator for task " + t);
			}

			// Here, we will have to compute the mState
			@SuppressWarnings("unused")
			MultiState possibleState = mState(t, ChimpProblem);

			HTNTaskNetwork nTn = fullDecomposition(ChimpProblem, domain);
			if (nTn == null) {
				throw new RuntimeException("Could not continue to decompose network " + ChimpProblem);
//				logger.warning("Could not continue to decompose network "+problem);
//				return null;
			} else {
				return nTn;
			}

		} else {
			System.out.print("|");
			System.out.println(t.toString());

			Unifier un = new Unifier();

			Collection<MethodOption> active = findMethodsFor(t, ChimpProblem, domain, un);

			if (active.isEmpty()) {
				//throw new RuntimeException("No options found for task " + t + " in network  " + problem);
				 logger.warning("No options found for task " + t + " in network " +
				 ChimpProblem);
				// return null;
			}
			HTNTaskNetwork network = deltaStar(ChimpProblem, t, active, false, domain);

			return fullDecomposition(network, domain);
		}
	}

	/**
	 * Returns all applicable operators for {@link Task} <code>t</code>
	 * 
	 * @param t
	 * @param network
	 * @param domain
	 * @param u
	 * @return
	 */
	private final List<Operator> findOperatorsFor(Task t, HTNTaskNetwork network, HTNChimpDomain domain, Unifier u) {
		assert (t.isPrimitive());
		List<Operator> options = new ArrayList<Operator>();
		MultiState ms = mStateBefore(t, network);
		for (State s : ms) {

			options.addAll(domain.findOperatorsFor1(s, t, u));
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
	private final Collection<MethodOption> findMethodsFor(Task t, HTNTaskNetwork network, HTNChimpDomain domain,
			Unifier u) {
		List<MethodOption> options = new ArrayList<MethodOption>();
		MultiState ms = mStateBefore(t, (HTNTaskNetwork) network);
		for (State s : ms) {
			for (MethodOption o : domain.findMethodsFor1(t, s, u)) {
				// We need to check that the same option has not been generated from a previous
				// state
				if (!options.contains(o)) {
					options.add(o);
				}
			}
			// options.addAll(opt);
		}
		// ---
//		List<MethodOption> options = domain.findMethodsFor(t, u);
		return options;
	}

	/**
	 * Expands the HTN using all possible applicable methods
	 * 
	 * @param problem
	 * @param task
	 * @param methods
	 * @param domain
	 */
	protected void expandWithAllMethodsInPlace(HTNTaskNetwork problem, Task task, List<MethodOption> methods,
			HTNChimpDomain domain) {
		deltaStar(problem, task, methods, true, domain);
	}

	/**
	 * 
	 * @param network
	 * @param task
	 * @param options
	 * @param domain
	 * @return
	 */
	protected HTNTaskNetwork expandWithAllMethods(HTNTaskNetwork network, Task task, List<MethodOption> options,
			HTNChimpDomain domain) {
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
	private final HTNTaskNetwork deltaStar(HTNTaskNetwork network, Task task, Collection<MethodOption> options,
			boolean inPlace, HTNChimpDomain domain) {
		assert (network.hasTask(task));

//		if (!inPlace) {
//			network = new HTNTaskNetwork(network);
//		}
		List<Constraint> constraintsAfter = network.findConstraintsWithTaskAfter(task);
		List<Constraint> constraintsBefore = network.findConstraintsWithTaskBefore(task);
		network.removeTask(task);

		// --- Added with mStateBefore
		mStateBefore.remove(task);
		// ---

		for (MethodOption mo : options) {
			assert (mo.m.getTask().equals(task));
			// logger.info("Expanding task '"+task+"' with method '"+mo.m+"'");
			HTNTaskNetwork substChimp = mo.getMethod().getInstantiatedTaskNetwork( domain, mo.un);

			// HTNTaskNetwork substChimp = new HTNTaskNetwork(subst);
			for (Task t : substChimp.getTasks1()) {
				network.addTask(t);
			}

			for (Constraint c : constraintsBefore) {
				network.addBeforeConstraint(substChimp.getLastTask(), c.getTask2());
			}

			for (Constraint c : constraintsAfter) {
				// We only add a precedence constraint to tasks whose possible states
				// (pState(s0, c.task1, network)) support this method
				if (mState((Task) c.getTask1(), network).supports(mo.getMethod().getPreconds(), mo.getUnifier())) {
					network.addBeforeConstraint(c.getTask1(), substChimp.getFirstTask());
				}
			}
			network.addConstraints1(substChimp.getConstraints());
		}

		return network;
	}

	/**
	 * Returns the possible states at the specified task in the fully expanded HTN.
	 * 
	 * @param task
	 * @return
	 */
	public HashMap<Task, MultiState> getMStates() {
		return resolvedTasks;
	}

	/**
	 * Returns whether or not <code>task</code> is Resolved, a resolved state has
	 * had its mState calculated.
	 * 
	 * @param t
	 * @return
	 */
	private boolean isResolved(Task task) {
		return resolvedTasks.containsKey(new Task(task));
	}

	/**
	 * Returns the next unresolved task in the network, an unresolved task has no
	 * possible state attached to it.
	 * 
	 * @param network
	 * @return
	 */
	private final Task getUnresolvedTask(HTNTaskNetwork network) {
		LinkedList<Task> tasks = network.getOrderedTasks1();
		for (Task t : tasks) {
			if (!isResolved(t)) {
				return t;
			}
		}
		return null;
	}

	/**
	 * Returns the possible state at task
	 * 
	 * @param task
	 * @return
	 */
	private final MultiState possibleState(Task task) {
		assert (task.isPrimitive());
		assert (isResolved(task));
		return resolvedTasks.get(task);
	}

	/**
	 * Returns all possible states at {@link Task} <code>t</code>, these possible
	 * states are the states <b>after</b> <code>t</code> has been fully executed,
	 * and thus should not be used in calculating the applicability of
	 * <code>t</code> in terms of its method preconditions.
	 * 
	 * @param s0
	 * @param t
	 * @param h
	 * @return
	 */
	private final MultiState mState(Task t, HTNTaskNetwork h) {
		MultiState msRes = null;
//		assert(t.isPrimitive());
		// If we have already calculated the preceding state, no need to do it again
		if (isResolved(t)) {
			msRes = possibleState(t);
		} else {
			// If this is one of the first possible tasks in the network, the preceding
			// state can only be the initial state
			if (h.isUnpreceded(t)) {
				msRes = initialState.applyOperator(t.getOp(), t.getUn());
			} else {
				List<Constraint> prec = h.findConstraintsWithTaskAfter(t);
				assert (!prec.isEmpty()); // This list should be empty given the previous condition
				msRes = new MultiState();
				for (Constraint c : prec) {
					// It seems in some situations just querying the possibleState directly won't
					// work
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
	 * 
	 * @return
	 */
	MultiState getInitialState() {
		return initialState;
	}

	/**
	 * Returns the possible state immediately <b>before</b> {@link Task}
	 * <code>t</code>, this method relies on the correct left to right decomposition
	 * of tasks.
	 * 
	 * @param t
	 * @param network
	 * @return
	 */
	private final MultiState mStateBefore(Task t, HTNTaskNetwork network) {
		MultiState msRes = null;
		if (mStateBefore.containsKey(t)) {
			msRes = mStateBefore.get(msRes);
		} else {
			// If this is one of the first possible tasks in the network, the preceding
			// state can only be the initial state
			if (network.isUnpreceded(t)) {
				msRes = initialState;
			} else {
				List<Constraint> prec = network.findConstraintsWithTaskAfter(t);
				assert (!prec.isEmpty()); // This list should be empty given the previous condition
				msRes = new MultiState();
				for (Constraint c : prec) {
					Task t1 = (Task) c.getTask1();
					MultiState prev = mState(t1, network);
					msRes.addAll(prev);
				}
				mStateBefore.put(t, msRes);
			}
		}
//		logger.info("mState before "+t+" is "+msRes);
		return msRes;
	}

//	public static void main(String[] args) throws Exception {
//
//		String problemFile = "src/main/java/examples/MDP/gotolondon/problemChimp.pdl";
//		String domainFile = "src/main/java/examples/MDP/gotolondon/domainChimp.ddl";
//
////	        String problemFile = "problems/test_m_serve_coffee_problem_1.pdl";
////	        String domainFile = "domains/ordered_domain.ddl";
//
//		ValueOrderingH valOH = new UnifyDeepestWeightNewestbindingsValOH();
//		CHIMP.CHIMPBuilder builder;
//
//		try {
//			builder = new CHIMP.CHIMPBuilder(domainFile, problemFile).valHeuristic(valOH).htnUnification(true);
//		} catch (DomainParsingException e) {
//			e.printStackTrace();
//			return;
//		}
//		CHIMP chimp = builder.build();
//		FluentNetworkSolver fluentSolver = chimp.getFluentSolver();
//
//		// expanding the HTN
//		HTNTaskNetwork tasknetwork = new HTNTaskNetwork(fluentSolver);
//		HTNChimpDomain HTNd = HTNChimpDomain.parseHTNChimpDomain(builder);
//		HTNExpander expander = new HTNExpander();
//		HTNTaskNetwork fullyExpanded = expander.createFullyExpandedHTN(fluentSolver.getConstraintSolvers()[0],
//				tasknetwork, HTNd);
//
//		HtnMdpFactory<HTNState, HTNAction> mdp = HTNChimpToMDP.MDP(expander, fullyExpanded);
//
//		// value iteration
//		ValueIteration<HTNState, HTNAction> pi = new ValueIteration<HTNState, HTNAction>(1.0);
//		Map<HTNState, Double> policy = pi.valueIteration(mdp, 0.0001);
//
//		for (Entry<HTNState, Double> s : policy.entrySet()) {
//			System.out.println(s.getKey() + "  :  " + s.getValue());
//		}
//
//		// convert to dot language
//		String mdpGraph = "src/main/java/examples/MDP/gotolondon/gotolondonGraphVICHIMP.dot";
//
//		if (mdpGraph != null) {
//			FileWriter writer = new FileWriter(mdpGraph);
//			logger.info("Writing MDP Graph into " + mdpGraph);
//			Dot2Graph.printMDPDot(writer, mdp, true, null);
//			writer.close();
//
//		}
//
//	}
}
