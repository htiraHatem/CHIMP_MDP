/**
 * 
 */
package examples.MDP;

import java.util.LinkedHashSet;
import java.util.Set;

import aima.core.agent.Action;

/**
 * @author Hatem
 *
 */

public class HTNAction implements Action {

	protected int id;

	protected String name;

	private Set<HTNAction> _actions;

	/**
	 * 
	 */

	public HTNAction(int id, String label) {
		this.id = id;
		this.name = label;
	}

	public HTNAction() {
		_actions = new LinkedHashSet<HTNAction>();
	}

	/**
	 * @return the id
	 */
	public final int getId() {
		return id;
	}

	/**
	 * @return the name
	 */
	public final String getName() {
		return name;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return id + ":" + name;
	}

	public Set<HTNAction> actions() {
		return _actions;
	}

	public final void SetAction(HTNAction a) {
		_actions.add(new HTNAction(a.getId(), a.getName()));
	}

	@Override
	public boolean isNoOp() {
		// TODO Auto-generated method stub
		return false;
	}

}
