package htn.htnExpanderDecomposition;

import edu.cmu.ita.htn.LogicExpression;
import edu.cmu.ita.htn.State;
import jason.asSemantics.Unifier;
import jason.asSyntax.Literal;


public class Operator extends edu.cmu.ita.htn.Operator{

	public Operator(Literal lit, LogicExpression preconds, State effects) {
		super(lit, preconds, effects);
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
