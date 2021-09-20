package htn.htnExpanderDecomposition;

import java.util.ArrayList;
import java.util.List;

import edu.cmu.ita.htn.LogicExpression;
import edu.cmu.ita.htn.State;
import jason.asSemantics.Unifier;
import jason.asSyntax.Literal;
import resourceFluent.ResourceUsageTemplate;


public class Operator extends edu.cmu.ita.htn.Operator{

	/**
	 * 
	 */
	private static final long serialVersionUID = 4826854902690186748L;

	public Operator(Literal lit, LogicExpression preconds, State effects) {
		super(lit, preconds, effects);
	}
	
	public Operator(edu.cmu.ita.htn.Operator op) {
		super(op);
	}
	

	public final boolean apply1(Unifier u) {
		if(super.apply(u)) {
			boolean applied = false;
			applied = preconds.apply(u);
			//if(!effects.isGround()) {
				applied |= effects.apply(u);
			//}
			return applied;
		} else {
			return false;
		}
	}
}
