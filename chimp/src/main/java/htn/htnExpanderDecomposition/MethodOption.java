package htn.htnExpanderDecomposition;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import edu.cmu.ita.htn.HTNDomain;
import edu.cmu.ita.htn.Method;
import edu.cmu.ita.htn.State;
import edu.cmu.ita.htn.Task;
import jason.asSemantics.Unifier;

class MethodOption  extends HTNDomain {
	final Method m;
	final Unifier un;
	int hashCodeCache;
	
	public MethodOption(Method m, Unifier un) {
		this.m = m;
		this.un = un;
	}
	
	public final Method getMethod() {
		return m;
	}
	
	public final Unifier getUnifier() {
		return un;
	}
	
	public List<MethodOption> findMethodsFor1(Task task, State s, Unifier u) {
		List<MethodOption> options = new ArrayList<MethodOption>();
		
		Unifier newU = new Unifier();
		for(Method m:methods) {
			newU.compose(u);
			Iterator<Unifier> iu;
			if(newU.unifies(m.getTask(), task) && (iu = m.getPossibleUnifiers(s, newU)) != null) {
				while(iu.hasNext()) {
					MethodOption option = new MethodOption(m, iu.next());
					//we only add methods that do not already exist
					if(!options.contains(option)) {
						options.add(option);
					}
				}
				newU = new Unifier();
			} else {
				newU.clear();
			}
		}
		
		return options;
	}
	
	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof MethodOption) {
			MethodOption mo = (MethodOption) obj;
			return (m.equals(mo.m) && un.equals(mo.un));
		} else {
			return false;
		}
	}
	
	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		if(hashCodeCache==0) {
			hashCodeCache = (m.hashCode() >> 3)+(un.hashCode() << 3);
		}
		return hashCodeCache;
	}
	
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "<"+m+","+un+">";
	}
}
