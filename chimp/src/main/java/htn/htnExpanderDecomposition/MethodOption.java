package htn.htnExpanderDecomposition;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import edu.cmu.ita.htn.HTNDomain;
import edu.cmu.ita.htn.State;
import jason.asSemantics.Unifier;

/**

 * @author meneguzzi
 * @updated by Hatem
 */

class MethodOption{
	final Method m;
	final Unifier un;
	int hashCodeCache;
	
	public MethodOption(Method m2, Unifier un) {
		this.m = m2;
		this.un = un;
	}
	
	public final Method getMethod() {
		return m;
	}
	
	public final Unifier getUnifier() {
		return un;
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
