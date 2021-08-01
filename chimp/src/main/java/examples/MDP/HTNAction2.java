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


public class HTNAction2 implements Action{
	
	
	protected int id;
	
	protected String name;
	
	private  Set<HTNAction2> _actions ;
	
	/**
	 * 
	 */

	
	public HTNAction2(int id, String label) {
		this.id = id;
		this.name = label;		
	}


	public HTNAction2() {
		_actions = new  LinkedHashSet<HTNAction2>();
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

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return id+":"+name;
	}

	public  Set<HTNAction2> actions() {
		return _actions;
	}
	
	public final void SetAction(HTNAction2 a) {		
		 _actions.add(new HTNAction2(a.getId(), a.getName()));
	}
//	/* (non-Javadoc)
//	 * @see java.lang.Comparable#compareTo(java.lang.Object)
//	 */
//	@Override
//	public int compareTo(Action o) {
////		int thisVal = id;
////		int anotherVal = 00; // todo update
////		return (thisVal<anotherVal ? -1 : (thisVal==anotherVal ? 0 : 1));
//		return 0;
//	}




@Override
public boolean isNoOp() {
	// TODO Auto-generated method stub
	return false;
}

}
