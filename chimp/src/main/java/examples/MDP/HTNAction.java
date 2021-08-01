/**
 * 
 */
package examples.MDP;


import java.util.LinkedHashSet;
import java.util.Set;

import aima.core.agent.Action;
import aima.core.environment.cellworld.CellWorldAction;
 
/**
 * @author Hatem
 *
 */
public class HTNAction implements Action {


	private  Set<HTNAction2> _actions;


	public HTNAction() {
		_actions = new LinkedHashSet<HTNAction2>();
	}

	/**
	 * 
	 * @return a set of the actual actions.
	 */
	public  final Set<HTNAction2> actions() {
		return _actions;
	}
	
	public final void SetAction(HTNAction2 a) {		
		 _actions.add(new HTNAction2(a.getId(), a.getName()));
	}

	@Override
	public boolean isNoOp() {
		// TODO Auto-generated method stub
		return false;
	}

}
