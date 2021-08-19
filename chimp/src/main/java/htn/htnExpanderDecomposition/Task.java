package htn.htnExpanderDecomposition;

import jason.asSemantics.Unifier;
import jason.asSyntax.ASSyntax;
import jason.asSyntax.Structure;
import jason.asSyntax.Term;

import java.util.Comparator;
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
	
}
