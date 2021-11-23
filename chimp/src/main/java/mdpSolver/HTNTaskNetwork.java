package mdpSolver;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

import org.metacsp.framework.ConstraintSolver;
import org.metacsp.framework.Variable;
import org.metacsp.multi.symbols.SymbolicVariable;

import edu.cmu.ita.htn.Constraint;
import edu.cmu.ita.htn.HTNFactory;
import edu.cmu.ita.htn.TaskNetwork;
import fluentSolver.FluentNetworkSolver;
import htn.htnExpanderDecomposition.HTNChimpDomain;
import htn.htnExpanderDecomposition.Task;
import resourceFluent.FluentResourceUsageScheduler;
import unify.CompoundSymbolicVariable;

/**
 * @author meneguzzi updated by Hatem
 *
 */
public class HTNTaskNetwork extends TaskNetwork {
	protected HashSet<Constraint> constraints;
	protected LinkedList<Task> orderedTasks;
	protected List<Task> tasks;
 	protected Vector<FluentResourceUsageScheduler> resourceSchedulers = 
			new Vector<FluentResourceUsageScheduler>();

	public void setResourceSchedulers(List<FluentResourceUsageScheduler> fluentSchedulers) {
		for (FluentResourceUsageScheduler f : fluentSchedulers) {
			resourceSchedulers.add(f);
		}
	}

	public HTNTaskNetwork() {
		super();
		this.constraints = new HashSet<Constraint>();
		this.tasks = new ArrayList<Task>();
		this.orderedTasks = new LinkedList<Task>();
	}

	public HTNTaskNetwork(FluentNetworkSolver network) throws Exception {
		this.constraints = new HashSet<Constraint>();

		ConstraintSolver problem = network.getConstraintSolvers()[0];
		Collection<Variable> bb = problem.getComponents().values().iterator().next();
		// SymbolicVariable[] tasks = (SymbolicVariable[])
		// problem.getComponents().values().toArray();
		this.orderedTasks = new LinkedList<Task>();
		this.tasks = new ArrayList<Task>();

		Iterator<Variable> it = bb.iterator();

		while (it.hasNext()) {
			Variable v = it.next();
			Variable[] terms = ((CompoundSymbolicVariable) v).getInternalVariables();

			edu.cmu.ita.htn.Task t;
			if (terms[2].toString().equalsIgnoreCase("n")) {
				t = HTNFactory.createTask(v.toString());
			} else {
				ArrayList<String> args = new ArrayList();
				args.add(terms[1].toString());
				args.add(terms[2].toString());
				if (!terms[3].toString().equalsIgnoreCase("n"))
					args.add(terms[3].toString());
				String predicat = ((CompoundSymbolicVariable) v).getPredicateName().toString();
				String fluent = HTNChimpDomain.convertLISPAtom(predicat, args);
				t = HTNFactory.createTask(fluent);

			}

			this.orderedTasks.add(new Task(t));
			this.tasks.add(new Task(t));

		}

//			this.tasks = new ArrayList<Task>();
//			while(it.hasNext()) {
//	        	Variable v= bb.iterator().next();
//				this.tasks.add( new Task(v.toString()));
//			}
	}

	/**
	 * Creates a task network that assumes the elements in it are in full order (and
	 * creates constraints to this effect)
	 * 
	 * @param tasks
	 */
	public HTNTaskNetwork(Task tasks[]) {
		this();
		this.addTasks(tasks);
		this.orderedTasks.addAll(this.tasks);
		for (int i = 0; i < tasks.length - 1; i++) {
			this.addBeforeConstraint(tasks[i], tasks[i + 1]);
		}
	}

	/**
	 * Helper method
	 * 
	 * @param tasks
	 */
	public void addTasks(Task... tasks) {
		for (Task t : tasks) {
			this.tasks.add(t);
		}
		this.orderedTasks.clear();
	}

	public HashSet<Constraint> getConstraints() {
		return this.constraints;
	}

	public LinkedList<Task> getOrderedTasks1() {
		if (orderedTasks.size() != tasks.size()) {
			topologicalSort();
		}
		return orderedTasks;
	}

	private HashSet<Constraint> backupC = new HashSet<Constraint>();
	private final List<Task> remaining = new ArrayList<Task>();

	/**
	 * Uses a topological sorting algorithm to impose total order in the tasks of
	 * this network.
	 * 
	 * @param task1
	 * @param task2
	 * @return
	 */
	private final List<Task> topologicalSort() {
		this.remaining.addAll(tasks);

		this.backupC.clear();

		backupC.addAll(constraints);

		while (!remaining.isEmpty()) {
			Task t = findZeroDegreeTask(remaining);
			assert (t != null);
			if (t == null) {
				throw new RuntimeException("Trying to sort a cyclic graph " + backupC + " \n ");// +HTNDotConverter.printHTNDot(backupC));
			}
			orderedTasks.offerFirst(t);
			remaining.remove(t);
			this.removeConstraintsAbout(t);
//				this.removeConstraints(findConstraintsWithTaskAfter(t));
//				this.removeConstraints(findConstraintsWithTaskBefore(t));
		}
		this.getConstraints().addAll(backupC);

		return orderedTasks;

	}

	private final Task findZeroDegreeTask(Collection<Task> tasks) {
		for (Task t : tasks) {
			if (findConstraintsWithTaskBefore(t).size() == 0) {
				return t;
			}
		}
		return null;
	}

	public List<Task> getTasks1() {
		return tasks;
	}

	/**
	 * Adds a new task to this network.
	 * 
	 * @param t
	 */
	public void addTask(Task t) {
		this.tasks.add(t);
		this.orderedTasks.clear();
	}

	/**
	 * Removes the specified task from the network as well as any constraints
	 * referring to this task.
	 * 
	 * @param task
	 * @return
	 */

	public boolean removeTask(Task task) {
		Task t = new Task(task);
		if (tasks.remove(t)) {
			t = Task.instantiateTask(t);
			removeConstraintsAbout(t);
			return true;
		} else {
			return false;
		}
	}

	private final void removeConstraintsAbout(Task task) {
		for (Iterator<Constraint> i = this.getConstraints().iterator(); i.hasNext();) {
			Constraint c = i.next();
			if (c.getTask1().equals(task) || c.getTask2().equals(task)) {
				i.remove();
			}
		}
	}

	public boolean removeConstraint(Constraint c) {
		return getConstraints().remove(c);
	}

	/**
	 * Helper method
	 * 
	 * @param consts
	 */

	public void addConstraints1(Collection<Constraint> consts) {
		for (Constraint c : consts) {
			this.getConstraints().add(c);
		}
		this.orderedTasks.clear();
	}

	public final List<Constraint> findConstraintsWithTaskAfter(Task t) {
		List<Constraint> relConsts = new ArrayList<Constraint>();
		for (Constraint c : getConstraints()) {
			if (c.getTask2().equals(t)) {
				relConsts.add(c);
			}
		}
		return relConsts;
	}

	public final List<Constraint> findConstraintsWithTaskBefore(Task t) {
		List<Constraint> relConsts = new ArrayList<Constraint>();
		for (Constraint c : getConstraints()) {
			if (c.getTask1().equals(t)) {
				relConsts.add(c);
			}
		}
		return relConsts;
	}

	public boolean allTasksArePrimitive() {
		for (Task t : tasks) {
			if (!t.isPrimitive()) {
				return false;
			}
		}

		return true;
	}

	public Task getFirstTask() {
		return getOrderedTasks1().getFirst();
	}

	/**
	 * Returns the last task in this network
	 * 
	 * @return
	 */
	public Task getLastTask() {
		return getOrderedTasks1().getLast();
	}

	public boolean isUnpreceded(Task t) {
		return !hasPreceding(t);
	}

	/**
	 * Returns whether or not the task has any preceding tasks. A task that has no
	 * preceding tasks is one of the first in the network.
	 * 
	 * @param t
	 * @return
	 */
	private final boolean hasPreceding(Task t) {
		for (Constraint c : getConstraints()) {
			if (c.getTask2().equals(t)) {
				return true;
			}
		}
		return false;
	}

	/**
	 * Returns a list with all tasks that have no preceding tasks. We should use
	 * this to determine when to use the initial state. This and the previous method
	 * would be better off if placed in an iterator (to avoid repetition of code) A
	 * preliminary implementation is in {@link UnprecededTasksIterator}, test that
	 * iterator before replacing this method.
	 * 
	 * @return
	 */
	public Collection<Task> getUnpreceededTasks1() {
		Collection<Task> res = new LinkedList<Task>();
		for (Task t : tasks) {
			if (!hasPreceding(t)) {
				res.add(t);
			}
		}
		return res;
	}

	public Vector<FluentResourceUsageScheduler> getResourceSchedulers() {
		return resourceSchedulers;
	}
	
}
