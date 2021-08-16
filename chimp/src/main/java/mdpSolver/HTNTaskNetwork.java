package mdpSolver;

import edu.cmu.ita.htn.Constraint;
import edu.cmu.ita.htn.Task;
import edu.cmu.ita.htn.TaskNetwork;

import java.util.ArrayList;
	import java.util.Collection;
	import java.util.Comparator;
	import java.util.HashSet;
	import java.util.Iterator;
	import java.util.LinkedList;
	import java.util.List;
	import java.util.TreeSet;

	/**
	 * @author meneguzzi
	 * updated by Hatem
	 *
	 */
	public class HTNTaskNetwork extends TaskNetwork {
		protected HashSet<Constraint> constraints;

		
		HTNTaskNetwork (TaskNetwork network){
			super(network);
			this.constraints = new HashSet<Constraint>(super.constraints);

		}
		HashSet<Constraint> getConstraints() {
			return super.constraints;
		}
	}
