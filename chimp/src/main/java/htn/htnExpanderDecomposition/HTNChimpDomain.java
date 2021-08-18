package htn.htnExpanderDecomposition;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import edu.cmu.ita.htn.HTNDomain;
import edu.cmu.ita.htn.Method;
import edu.cmu.ita.htn.Task;
import htn.PlanReportroryItem;
import hybridDomainParsing.ClassicHybridDomain;
import planner.CHIMP.CHIMPBuilder;

public class HTNChimpDomain extends HTNDomain{

	
	public HTNChimpDomain(List<Method> methods, List<Task> tasks) {
		super();
		this.methods = new ArrayList<Method>(methods);
		this.actions = new ArrayList<Task>(tasks);
		this.instances = new HashMap<Task,Task>();
	}
	
	public HTNChimpDomain(CHIMPBuilder builder) {
		super();
		ClassicHybridDomain a = builder.getDomain();
		List<PlanReportroryItem> M = a.getMethods();
		List<PlanReportroryItem> O = a.getOperators();
		//HTNùethods
		this.methods = new ArrayList<Method>(methods);
		//operators
		//this.actions = new ArrayList<Task>(tasks);
		this.instances = new HashMap<Task,Task>();
	}
	
}
