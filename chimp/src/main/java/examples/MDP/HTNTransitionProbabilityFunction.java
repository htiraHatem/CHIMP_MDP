package examples.MDP;

import java.util.Hashtable;
import java.util.List;

import aima.core.probability.mdp.TransitionProbabilityFunction;

public class HTNTransitionProbabilityFunction implements Comparable<TransitionProbabilityFunction<HTNState, HTNAction>>{

	private Hashtable<HtnMdpTransition<HTNState, HTNAction2>, Double> transitionToProbability ;
	private List<HTNState> terminalStates;

	public HTNTransitionProbabilityFunction(List<HTNState> terminalStates) {
		this.terminalStates = terminalStates;
		transitionToProbability =  new Hashtable<HtnMdpTransition<HTNState, HTNAction2>, Double>();


	}

	public void setTransitionProbability(HTNState initialState,
			HTNAction2 action, HTNState finalState, double probability) {
		if (!(initialState.isFinal())) {
			HtnMdpTransition<HTNState, HTNAction2> t = new HtnMdpTransition<HTNState, HTNAction2>(
					initialState, action, finalState);
			transitionToProbability.put(t, probability);
		}
	}

	public double getTransitionProbability(HTNState initialState,
			HTNAction action, HTNState finalState) {
		HtnMdpTransition<HTNState, HTNAction> key = new HtnMdpTransition<HTNState, HTNAction>(
				initialState, action, finalState);
		if (transitionToProbability.keySet().contains(key)) {
			return transitionToProbability.get(key);
		} else {
			return 0.0;
		}
	}

	public Hashtable<HtnMdpTransition<HTNState, HTNAction2>, Double> getTransitionProbabilityModel() {
		return transitionToProbability;
	}
	
	public void display() {
		//StringBuffer buf = new StringBuffer();
		for (HtnMdpTransition<HTNState, HTNAction2> transition : transitionToProbability
				.keySet()) {
			System.out.println( " \n" +transition.toString() + " -> "
					+ transitionToProbability.get(transition));
		}
		//return buf.toString();
	}

//	public Pair<HTNState, Double> getTransitionWithMaximumExpectedUtility(
//			STATE_TYPE s, MDPUtilityFunction<HTNState> uf) {
//
//		if ((isTerminal(s))) {
//			return new Pair<HTNState, Double>(null, 0.0);
//		}
//
//		List<MDPTransition<HTNState, ACTION_TYPE>> transitionsStartingWithS = getTransitionsStartingWith(s);
//		Hashtable<ACTION_TYPE, Double> actionsToUtilities = getExpectedUtilityForSelectedTransitions(
//				transitionsStartingWithS, uf);
//
//		return getActionWithMaximumUtility(actionsToUtilities);
//
//	}

//	public Pair<ACTION_TYPE, Double> getTransitionWithMaximumExpectedUtilityUsingPolicy(
//			MDPPolicy<HTNState, ACTION_TYPE> policy, STATE_TYPE s,
//			MDPUtilityFunction<STATE_TYPE> uf) {
//		if ((isTerminal(s))) {
//			return new Pair<ACTION_TYPE, Double>(null, 0.0);
//		}
//		List<MDPTransition<STATE_TYPE, ACTION_TYPE>> transitionsWithStartingStateSAndActionFromPolicy = getTransitionsWithStartingStateAndAction(
//				s, policy.getAction(s));
//		Hashtable<ACTION_TYPE, Double> actionsToUtilities = getExpectedUtilityForSelectedTransitions(
//				transitionsWithStartingStateSAndActionFromPolicy, uf);
//
//		return getActionWithMaximumUtility(actionsToUtilities);
//
//	}

	private boolean isTerminal(HTNState s) {
		return terminalStates.contains(s);
	}

//	private Pair<ACTION_TYPE, Double> getActionWithMaximumUtility(
//			Hashtable<ACTION_TYPE, Double> actionsToUtilities) {
//		Pair<ACTION_TYPE, Double> highest = new Pair<ACTION_TYPE, Double>(null,
//				Double.MIN_VALUE);
//		for (ACTION_TYPE key : actionsToUtilities.keySet()) {
//			Double value = actionsToUtilities.get(key);
//			if (value > highest.getSecond()) {
//				highest = new Pair<ACTION_TYPE, Double>(key, value);
//			}
//		}
//		return highest;
//	}

//	private Hashtable<ACTION_TYPE, Double> getExpectedUtilityForSelectedTransitions(
//
//	List<MDPTransition<STATE_TYPE, ACTION_TYPE>> transitions,
//			MDPUtilityFunction<STATE_TYPE> uf) {
//		Hashtable<ACTION_TYPE, Double> actionsToUtilities = new Hashtable<ACTION_TYPE, Double>();
//		for (MDPTransition<STATE_TYPE, ACTION_TYPE> triplet : transitions) {
//			STATE_TYPE s = triplet.getInitialState();
//			ACTION_TYPE action = triplet.getAction();
//			STATE_TYPE destinationState = triplet.getDestinationState();
//			double probabilityOfTransition = getTransitionProbability(s,
//					action, destinationState);
//			double expectedUtility = (probabilityOfTransition * uf
//					.getUtility(destinationState));
//			Double presentValue = actionsToUtilities.get(action);
//
//			if (presentValue == null) {
//				actionsToUtilities.put(action, expectedUtility);
//			} else {
//				actionsToUtilities.put(action, presentValue + expectedUtility);
//			}
//		}
//		return actionsToUtilities;
//	}

//	private List<MDPTransition<STATE_TYPE, ACTION_TYPE>> getTransitionsStartingWith(
//			STATE_TYPE s) {
//		List<MDPTransition<STATE_TYPE, ACTION_TYPE>> result = new ArrayList<MDPTransition<STATE_TYPE, ACTION_TYPE>>();
//		for (MDPTransition<STATE_TYPE, ACTION_TYPE> transition : transitionToProbability
//				.keySet()) {
//			if (transition.getInitialState().equals(s)) {
//				result.add(transition);
//			}
//		}
//		return result;
//	}

//	public List<MDPTransition<STATE_TYPE, ACTION_TYPE>> getTransitionsWithStartingStateAndAction(
//			STATE_TYPE s, ACTION_TYPE a) {
//		List<MDPTransition<STATE_TYPE, ACTION_TYPE>> result = new ArrayList<MDPTransition<STATE_TYPE, ACTION_TYPE>>();
//		for (MDPTransition<STATE_TYPE, ACTION_TYPE> transition : transitionToProbability
//				.keySet()) {
//			if ((transition.getInitialState().equals(s))
//					&& (transition.getAction().equals(a))) {
//				result.add(transition);
//			}
//		}
//		return result;
//	}
//
//	public ACTION_TYPE randomActionFor(STATE_TYPE s) {
//		List<MDPTransition<STATE_TYPE, ACTION_TYPE>> transitions = getTransitionsStartingWith(s);
//		MDPTransition<STATE_TYPE, ACTION_TYPE> randomTransition = Util
//				.selectRandomlyFromList(transitions);
//		return transitions.get(0).getAction();
//		// return randomTransition.getAction();
//	}

	@Override
	public int compareTo(TransitionProbabilityFunction<HTNState, HTNAction> o) {
		// TODO Auto-generated method stub
		return 0;
	}
}
