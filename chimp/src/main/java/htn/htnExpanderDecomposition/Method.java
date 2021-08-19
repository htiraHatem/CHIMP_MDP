/**
 * Created on Sep 27, 2010 for project ita-htn2mdp by meneguzzi
 */
package htn.htnExpanderDecomposition;

import jason.asSemantics.Unifier;

import java.util.HashMap;
import java.util.Iterator;

import edu.cmu.ita.htn.Constraint;
import edu.cmu.ita.htn.HTNDomain;
import edu.cmu.ita.htn.LogicExpression;
import edu.cmu.ita.htn.State;
import edu.cmu.ita.htn.TaskNetwork;
import htn.HTNMethod;

/**
 * @author meneguzzi
 * @updated by Hatem
 */
public class Method {
	protected String name;
	
	protected Task task;
	protected LogicExpression precond;
	protected TaskNetwork taskNetwork;
	
	/**
	 * 
	 */
	public Method(String name, Task task, TaskNetwork taskNetwork) {
		this(name,task,null,taskNetwork);
	}
	
	
//	public Method(HTNMethod hTNmethod) {
//		hTNmethod.getName();
//		// add getter to plan repositeroyt....
//		//hTNmethod.get();
//		
//		
//		//this(name,task,null,taskNetwork);
//	}
	
	/**
	 * 
	 */
	public Method(String name, Task task, LogicExpression precond, TaskNetwork taskNetwork) {
		this.name = name;
		this.task = task;
		this.precond = precond;
		this.taskNetwork = taskNetwork;
	}
	
	/**
	 * @return the name
	 */
	public final String getName() {
		return name;
	}
	
	/**
	 * @return the task
	 */
	public final Task getTask() {
		return task;
	}
	/**
	 * @return the precond
	 */
	public final LogicExpression getPreconds() {
		return precond;
	}
	/**
	 * @return the taskNetwork
	 */
	public final TaskNetwork getTaskNetwork() {
		return taskNetwork;
	}
	
	/**
	 * Creates a temporary {@link TaskNetwork} storing instances of the tasks 
	 * contained in the {@link TaskNetwork} in this method.
	 * @param domain TODO
	 * @return
	 * TODO Fix this for when the same task is executed multiple times
	 */
	protected TaskNetwork getInstantiatedTaskNetwork(HTNDomain domain, Unifier un) {
		TaskNetwork tnInstance = new TaskNetwork();
		
		HashMap<Task, Task> instMap = new HashMap<Task, Task>();
//		Task instMap[] = new Task[this.taskNetwork.tasks.size()];
		                          
		
		for(edu.cmu.ita.htn.Task t:taskNetwork.getTasks()) {
//		for(int i=0; i<taskNetwork.tasks.size(); i++) {
//			Task t = taskNetwork.tasks.get(i);
			Task tInstance = (Task) domain.instantiateTask(t, un);
			instMap.put((Task) t, tInstance);
//			instMap[i] = tInstance;
			tnInstance.addTask(tInstance);
		}
		
		
		for(Constraint c:taskNetwork.getConstraints()) {
			Constraint cInstance = new Constraint(instMap.get(c.getTask1()), instMap.get(c.getTask2()));
//			int i1 = taskNetwork.tasks.indexOf(c.task1);
//			int i2 = taskNetwork.tasks.indexOf(c.task2);
//			Constraint cInstance = new Constraint(instMap[i1], instMap[i2]);
			tnInstance.addConstraints(cInstance);
		}
		
		return tnInstance;
	}
	
	/**
	 * Returns whether or not this method is applicable to {@link State} <code>s</code>.
	 * XXX Review this
	 * @param s
	 * @param u
	 * @return
	 */
	public final boolean applicable(State s, Unifier u) {
		Iterator<Unifier> iu = precond.consequence(s, u);
		
		return iu!= null && iu.hasNext();
//		if(precond.isGround()) {
//			return s.supports(precond);
//		} else {
//			State sInst = new State(precond);
//			sInst.apply(u);
//			return s.supports(sInst);
//		}
	}
	
	/**
	 * Returns all possible unifiers in which {@link State} <code>s</code>
	 * can support this method.
	 * @param s
	 * @param u
	 * @return
	 */
	public final Iterator<Unifier> getPossibleUnifiers(State s, Unifier u) {
		return precond.consequence(s, u);
	}
	
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "<"+name+","+precond+","+task+","+taskNetwork.getOrderedTasks()+">";
	}
}
