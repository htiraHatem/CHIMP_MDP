package examples.MDP;

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
	private examples.MDP.HTNAction actionsFunction = null;
	private HTNTransitionProbabilityFunction hTNTransitionProbabilityFunction = null;
	private HTNReward rewardFunction = null;

	public HtnMdpFactory(Set<HTNState> states2, HTNState initialState, HTNAction actions,
			HTNTransitionProbabilityFunction hTNTransitionProbabilityFunction, HTNReward rewardFunction) {
		this.states = states2;
		this.initialState = initialState;
		this.actionsFunction = (examples.MDP.HTNAction) actions;
		this.hTNTransitionProbabilityFunction = hTNTransitionProbabilityFunction;
		this.rewardFunction = rewardFunction;
	}

	@Override
	public Set<HTNState> states() {
		return states;
	}

	@Override
	public HTNState getInitialState() {
		return initialState;
	}

	@Override
	public double transitionProbability(HTNState sDelta, HTNState s, HTNAction a) {

		return hTNTransitionProbabilityFunction.getTransitionProbability((examples.MDP.HTNState) s,
				(examples.MDP.HTNAction) a, (examples.MDP.HTNState) sDelta);

	}

	@SuppressWarnings("unchecked")
	@Override
	public Set<HTNAction> actions(HTNState s) {
		return (Set<HTNAction>) actionsFunction.actions();

	}

	@Override
	public double reward(HTNState s) {
		return rewardFunction.getRewardFor((examples.MDP.HTNState) s);
	}

}
