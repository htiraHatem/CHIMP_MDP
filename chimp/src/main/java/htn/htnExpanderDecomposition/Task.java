package htn.htnExpanderDecomposition;

import jason.asSemantics.Unifier;
import jason.asSyntax.ASSyntax;
import jason.asSyntax.Structure;
import jason.asSyntax.Term;
import resourceFluent.ResourceUsageTemplate;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;

import aima.core.agent.State;
import edu.cmu.ita.htn.Operator;

/**
 * @Updated by Hatem
 *
 */
public class Task extends edu.cmu.ita.htn.Task {

	private static final long serialVersionUID = 1L;

	protected List<ResourceUsageTemplate> resourceUsageIndicators = new ArrayList<ResourceUsageTemplate>();
	protected Double reward;

	public Task(String sTask) throws Exception {
		super(sTask);
	}

	public Task(edu.cmu.ita.htn.Task a) {
		super(a);
	}

	public Task(Task a, boolean instance) {
		super(a);
		setInstance(instance);
	}

	public Task(edu.cmu.ita.htn.Task createPrimitiveTask, List<ResourceUsageTemplate> resourceUsageTemplate, Double reward) {
		super(createPrimitiveTask);
		this.resourceUsageIndicators = resourceUsageTemplate;
		this.reward = reward;
	}

	public Unifier getUn() {
		return un;
	}

	public void setUn(Unifier un) {
		this.un = un;
	}

	public Operator getOp() {
		return op;
	}

	public void setOp(Operator op) {
		this.op = op;
	}

	public static Task instantiateTask(Task t, Unifier un, HashMap<Task, Task> instances) {
		Task tInstance = new Task(t);
		t.instanceCount++;
		tInstance.setInstance(true);
		tInstance.apply(un);
		if (instances.containsKey(tInstance)) {
			Task tEx = instances.get(tInstance);
			tInstance.instanceCount = tEx.instanceCount++;
			t.instanceCount = tEx.instanceCount;
		} else {
			instances.put(tInstance, tInstance);
		}
		return tInstance;
//		return t.instantiateTask(un);
	}

	public static Task instantiateTask(Task t) {
		Task tInstance = new Task(t);
		tInstance.setInstance(true);
		return tInstance;
//		return t.instantiateTask(un);
	}

	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		} else if (obj == null) {
			return false;
		}
		if (obj instanceof Task) {
			Task t1 = (Task) obj;
			if (this.isInstance() && t1.isInstance()) {
				// XXX Hack to make multiple instances work
				// return super.equals(t1) && this.instanceCount == t1.instanceCount;
				return this.toString().equals(t1.toString());
			}
			return super.equals(t1);
		} else {
			return false;
		}
	}

}
