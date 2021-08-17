package mdpSolver;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;

import edu.cmu.ita.htn.Constraint;
import edu.cmu.ita.htn.TaskNetwork;
import htn.htnExpanderDecomposition.Task;


	/**
	 * @author meneguzzi
	 * updated by Hatem
	 *
	 */
	public class HTNTaskNetwork extends TaskNetwork {
		protected HashSet<Constraint> constraints;
		protected LinkedList<Task> orderedTasks;
		protected List<Task> tasks;

		
		HTNTaskNetwork (TaskNetwork network){
			super(network);
			this.constraints = new HashSet<Constraint>(super.constraints);
			this.orderedTasks = new LinkedList<Task>();
			for( edu.cmu.ita.htn.Task a :super.getOrderedTasks()) {
				orderedTasks.add( (Task) a);
			}
			this.tasks = new ArrayList<Task>();
			for( edu.cmu.ita.htn.Task a :super.tasks) {
				tasks.add( (Task) a);
			}
			

		}
		public HashSet<Constraint> getConstraints() {
			return super.constraints;
		}
		
		public LinkedList<Task> getOrderedTasks1(){
			return orderedTasks;
		}
		
		public List<Task> getTasks1(){
			return tasks;
		}
	}
