package mdpSolver;

import aima.core.util.datastructure.Triplet;

/**
 * @author Ravi Mohan
 * 
 * @updated by Hatem
 */
public class HtnMdpTransition<HTNState, HTNAction> {
	private Triplet<HTNState, HTNAction, HTNState> triplet;

	public HtnMdpTransition(HTNState initial, HTNAction action,
			HTNState destination) {
		this.triplet = new Triplet<HTNState, HTNAction, HTNState>(
				initial, action, destination);
	}

	public HTNState getInitialState() {
		return triplet.getFirst();
	}

	public HTNAction getAction() {
		return triplet.getSecond();
	}

	public HTNState getDestinationState() {
		return triplet.getThird();
	}

	@Override
	public boolean equals(Object o) {
		if (o == this) {
			return true;
		}
		if (!(o instanceof HtnMdpTransition)) {
			return false;
		}
		HtnMdpTransition<HTNState, HTNAction> other = (HtnMdpTransition<HTNState, HTNAction>) (o);// weird
		// typing
		// issue
		// work
		// out
		// later
		return triplet.equals(other.triplet);
	}

	@Override
	public int hashCode() {
		return triplet.hashCode();
	}

	@Override
	public String toString() {
		return triplet.toString();
	}

}