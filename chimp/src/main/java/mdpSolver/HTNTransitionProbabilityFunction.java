package mdpSolver;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;

import aima.core.probability.mdp.TransitionProbabilityFunction;
import mdpSolver.HTNAction;
import mdpSolver.HTNState;
import mdpSolver.HtnMdpTransition;

public class HTNTransitionProbabilityFunction implements Comparable<TransitionProbabilityFunction<HTNState, HTNAction>>{

	private LinkedHashMap<HtnMdpTransition<HTNState, HTNAction>, Double> transitionToProbability ;
	private List<HTNState> terminalStates;

	public HTNTransitionProbabilityFunction(List<HTNState> terminalStates) {
		this.terminalStates = terminalStates;
		transitionToProbability =  new LinkedHashMap<HtnMdpTransition<HTNState, HTNAction>, Double>();


	}

	public void setTransitionProbability(HTNState initialState,
			HTNAction action, HTNState finalState, double probability) {
		if (!(initialState.isFinal())) {
			HtnMdpTransition<HTNState, HTNAction> t = new HtnMdpTransition<HTNState, HTNAction>(
					initialState, action, finalState);
			transitionToProbability.put(t, probability);
		}
	}

	public LinkedHashMap<HtnMdpTransition<HTNState, HTNAction>, Double> getTransitionProbabilityModel() {
		return transitionToProbability;
	}
	
	public void display() {
		for (HtnMdpTransition<HTNState, HTNAction> transition : transitionToProbability
				.keySet()) {
			System.out.println( " \n" +transition.toString() + " -> "
					+ transitionToProbability.get(transition));
		}
	}

	public Double getTransitionProbability(HTNState s, HTNAction a, HTNState sDelta) {
		HtnMdpTransition<HTNState, HTNAction> key = new HtnMdpTransition<HTNState, HTNAction>(
				s, a, sDelta);
		if (transitionToProbability.keySet().contains(key)) {
			return transitionToProbability.get(key);
		} else {
			return 0.0;
		}
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

	public List<HtnMdpTransition> getTransitionsWithStartingStateAndAction(
			HTNState s, HTNAction a) {
		List<HtnMdpTransition> result = new ArrayList<HtnMdpTransition>();
		for (HtnMdpTransition<HTNState, HTNAction> transition : transitionToProbability
				.keySet()) {
			if ((transition.getInitialState().equals(s))
					&& (transition.getAction().equals(a))) {
				result.add(transition);
			}
		}
		return result;
	}

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
