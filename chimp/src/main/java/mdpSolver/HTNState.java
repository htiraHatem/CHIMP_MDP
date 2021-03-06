package mdpSolver;

import java.util.LinkedList;
import java.util.List;

import aima.core.agent.State;
import edu.cmu.ita.htn.MultiState;
import edu.cmu.ita.htn.Task;

/**
 * @updated by Hatem
 */
public class HTNState implements Comparable<State> {
	protected boolean isFinal = true;
	
	protected int id;
	
	protected String label;
	
	protected HTNState previousState;
	protected HTNState nextState;
	protected Double reward;
	protected Boolean remainedResource = true;
	
	
	public Boolean getRemainedResource() {
		return remainedResource;
	}

	public void setRemainedResource(Boolean remainedResource) {
		this.remainedResource = remainedResource;
	}

	public Double getReward() {
		return reward;
	}

	public void setReward(Double reward) {
		this.reward = reward;
	}

	/**
	 * The fully expanded HTN {@link MultiState} that corresponds to this {@link HTNState}
	 */
	public MultiState htnState;
	
	/**
	 * The HTN {@link Task} that led to the creation of this {@link HTNState}. 
	 */
	protected Task task;
	
	public List<HTNState> overlapping;
	
	
	/**
	 * 
	 */
	public HTNState(int id, String label, MultiState htnState, Task task) {
		this.id = id;
		this.label = label;
		this.htnState = htnState;
		this.task = task;
		this.overlapping = new LinkedList<HTNState>();
	}

	public HTNState getPreviousState() {
		return previousState;
	}

	public void setPreviousState(HTNState previousState) {
		this.previousState = previousState;
	}

	public HTNState getNextState() {
		return nextState;
	}

	public void setNextState(HTNState nextState) {
		this.nextState = nextState;
	}

	/**
	 * @return the isFinal
	 */
	public final boolean isFinal() {
		return isFinal;
	}

	/**
	 * @param isFinal the isFinal to set
	 */
	public final void setFinal(boolean isFinal) {
		this.isFinal = isFinal;
	}

	/**
	 * @return the id
	 */
	public final int getId() {
		return id;
	}

	/**
	 * @return the htnState
	 */
	public final MultiState getHtnState() {
		return htnState;
	}

	/**
	 * @return the label
	 */
	public final String getLabel() {
		return label;
	}
	
	/**
	 * @return the task
	 */
	public final Task getTask() {
		return task;
	}
	
	/**
	 * 
	 * @return
	 */
	public final List<HTNState> getOverlapping() {
		return overlapping;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return id+":"+label;
	}

	/* (non-Javadoc)
	 * @see java.lang.Comparable#compareTo(java.lang.Object)
	 */
	public int compareTo(HTNState o) {
		int thisVal = id;
		int anotherVal = o.id;
		return (thisVal<anotherVal ? -1 : (thisVal==anotherVal ? 0 : 1));
	}

	/**
	 * @return
	 */
	public int modulo() {
		return overlapping.size();
	}

	@Override
	public int compareTo(State o) {
		// TODO Auto-generated method stub
		return 0;
	}

	public void displayID() {
		
		System.out.println( "S" + this.id);
	}

}
