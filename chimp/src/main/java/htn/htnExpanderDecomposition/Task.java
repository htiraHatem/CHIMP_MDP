package htn.htnExpanderDecomposition;

import jason.asSemantics.Unifier;
import jason.asSyntax.ASSyntax;
import jason.asSyntax.Structure;
import jason.asSyntax.Term;

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

	public Task(String sTask) throws Exception {
		super(sTask);
	}

	
	public Task(edu.cmu.ita.htn.Task a) {
		super(a);
		this.apply(un);
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
	

	public static Task instantiateTask(Task t, Unifier un, HashMap<Task,Task> instances  ) {
		Task tInstance = new Task(t);
		t.instanceCount++;
		tInstance.isInstance = true;
		tInstance.apply(un);
		if(instances.containsKey(tInstance)) {
			Task tEx = instances.get(tInstance);
			tInstance.instanceCount = tEx.instanceCount++;
			t.instanceCount = tEx.instanceCount;
		} else {
			instances.put(tInstance, tInstance);
		}
		return tInstance;
//		return t.instantiateTask(un);
	}



	
}
