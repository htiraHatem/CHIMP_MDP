package examples.MDP;

import java.util.Hashtable;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;

import aima.core.agent.Action;
import aima.core.probability.mdp.MarkovDecisionProcess;



public class HtnMdpFactory<HTNState, HTNAction extends Action> implements MarkovDecisionProcess<HTNState, HTNAction>{

	private Set<HTNState> states = null;
	private HTNState initialState = null;
	private examples.MDP.HTNAction2 actionsFunction = null;
	private HTNTransitionProbabilityFunction hTNTransitionProbabilityFunction = null;
	private HTNReward rewardFunction = null;
	
	
	public HtnMdpFactory(Set<HTNState> states2, HTNState initialState,
			HTNAction2 actions,
			HTNTransitionProbabilityFunction hTNTransitionProbabilityFunction,
			HTNReward rewardFunction) {
		this.states = states2;
		this.initialState = initialState;
		this.actionsFunction = actions;
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

	
	public Set<HTNAction2> getActions() {
		return actionsFunction.actions();
	}

	public LinkedHashMap<HtnMdpTransition<examples.MDP.HTNState, HTNAction2>, Double> transitionProbability(HTNState sDelta, HTNState s, HTNAction2 a) {
		return hTNTransitionProbabilityFunction.getTransitionProbabilityModel();

	}

	public double reward(examples.MDP.HTNState s) {
		return rewardFunction.getRewardFor(s);
	}

	@Override
	public double transitionProbability(HTNState sDelta, HTNState s, HTNAction a) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Set<HTNAction> actions(HTNState s) {
		return (Set<HTNAction>) actionsFunction.actions();

	}

	@Override
	public double reward(HTNState s) {
		// TODO Auto-generated method stub
		return 0;
	}
	

}
