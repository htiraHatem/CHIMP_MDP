package mdpSolver;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

import org.metacsp.framework.ConstraintSolver;
import org.metacsp.framework.Variable;
import org.metacsp.multi.symbols.SymbolicVariable;

import edu.cmu.ita.htn.Constraint;
import edu.cmu.ita.htn.HTNFactory;
import edu.cmu.ita.htn.TaskNetwork;
import fluentSolver.FluentNetworkSolver;
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

		
		HTNTaskNetwork (TaskNetwork network) throws Exception{
			super(network);
			this.constraints = new HashSet<Constraint>(super.getConstraints());
			this.orderedTasks = new LinkedList<Task>();
			for( edu.cmu.ita.htn.Task a :super.getOrderedTasks()) {
				Task t =  new Task(a);
				orderedTasks.add(t);
			}
			this.tasks = new ArrayList<Task>();
			for( edu.cmu.ita.htn.Task a :super.tasks) {
				tasks.add( new Task(a));
			}
		}
		
		public HTNTaskNetwork (FluentNetworkSolver network) throws Exception{
			//to update
			this.constraints = new HashSet<Constraint>();
			
	        ConstraintSolver problem = network.getConstraintSolvers()[0];
	        Collection<Variable> bb = problem.getComponents().values().iterator().next();
	        //SymbolicVariable[] tasks =  (SymbolicVariable[]) problem.getComponents().values().toArray();
			this.orderedTasks = new LinkedList<Task>();
			this.tasks = new ArrayList<Task>();
			
			Iterator<Variable> it = bb.iterator();

			while( it.hasNext()) {
	        	Variable v= it.next();
				this.orderedTasks.add(new Task(v.toString()));
				this.tasks.add( new Task(v.toString()));

			}
			
//			this.tasks = new ArrayList<Task>();
//			while(it.hasNext()) {
//	        	Variable v= bb.iterator().next();
//				this.tasks.add( new Task(v.toString()));
//			}
		}
		
		
		public HashSet<Constraint> getConstraints() {
			return super.getConstraints();
		}
		
		public LinkedList<Task> getOrderedTasks1(){
			return orderedTasks;
		}
		
		public List<Task> getTasks1(){
			return tasks;
		}
	}
