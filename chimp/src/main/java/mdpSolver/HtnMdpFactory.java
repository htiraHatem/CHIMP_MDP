package mdpSolver;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import aima.core.agent.Action;
import aima.core.probability.mdp.MarkovDecisionProcess;

/**
 * @author Hatem
 *
 */

@SuppressWarnings("hiding")
public class HtnMdpFactory<HTNState, HTNAction extends Action> implements MarkovDecisionProcess<HTNState, HTNAction> {

	private Set<HTNState> states = null;
	private HTNState initialState = null;
	private mdpSolver.HTNAction actionsFunction = null;
	private HTNTransitionProbabilityFunction hTNTransitionProbabilityFunction = null;
	
	private HTNReward rewardFunction = null;
	public List<HTNState> finalstates = new ArrayList<HTNState>();
	public List<HTNState> nonFinalStates = new ArrayList<HTNState>();

	public HtnMdpFactory(Set<HTNState> states2, HTNState initialState, HTNAction actions,
			HTNTransitionProbabilityFunction hTNTransitionProbabilityFunction, HTNReward rewardFunction) {
		this.states = states2;
		this.initialState = initialState;
		this.actionsFunction = (mdpSolver.HTNAction) actions;
		this.hTNTransitionProbabilityFunction = hTNTransitionProbabilityFunction;
		this.rewardFunction = rewardFunction;
		setFinalstates();
	}

	@Override
	public Set<HTNState> states() {
		return states;
	}

	@Override
	public HTNState getInitialState() {
		return initialState;
	}

	// from s -- a : action --> to Sdelta
	@Override
	public double transitionProbability(HTNState sDelta, HTNState s, HTNAction a) {
		return hTNTransitionProbabilityFunction.getTransitionProbability((mdpSolver.HTNState) s,
				(mdpSolver.HTNAction) a, (mdpSolver.HTNState) sDelta);
	}

	@SuppressWarnings("unchecked")
	@Override
	public Set<HTNAction> actions(HTNState s) {
		return (Set<HTNAction>) actionsFunction.actions(); // right!
	}

	@Override
	public double reward(HTNState s) {
		return rewardFunction.getRewardFor((mdpSolver.HTNState) s);
	}
	
	public void setFinalstates() {
		for (HTNState s : states) {
			if (((mdpSolver.HTNState) s).isFinal()) {
				finalstates.add(s);
			} else {
				nonFinalStates.add(s);
			}
		}
	}

	public List<HTNState> getFinalstates() {
		return finalstates;
	}

	public List<HTNState> getNonFinalStates() {
		return nonFinalStates;
	}

	public HTNTransitionProbabilityFunction gethTNTransitionProbabilityFunction() {
		return hTNTransitionProbabilityFunction;
	}

	

}
