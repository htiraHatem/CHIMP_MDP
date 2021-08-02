package examples.MDP;

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
	private examples.MDP.HTNAction actionsFunction = null;
	private HTNTransitionProbabilityFunction hTNTransitionProbabilityFunction = null;
	
	private HTNReward rewardFunction = null;
	public List<HTNState> finalstates = new ArrayList<HTNState>();
	public List<HTNState> nonFinalStates = new ArrayList<HTNState>();

	public HtnMdpFactory(Set<HTNState> states2, HTNState initialState, HTNAction actions,
			HTNTransitionProbabilityFunction hTNTransitionProbabilityFunction, HTNReward rewardFunction) {
		this.states = states2;
		this.initialState = initialState;
		this.actionsFunction = (examples.MDP.HTNAction) actions;
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

	@Override
	public double transitionProbability(HTNState sDelta, HTNState s, HTNAction a) {

		return hTNTransitionProbabilityFunction.getTransitionProbability((examples.MDP.HTNState) s,
				(examples.MDP.HTNAction) a, (examples.MDP.HTNState) sDelta);

	}

	@SuppressWarnings("unchecked")
	@Override
	public Set<HTNAction> actions(HTNState s) {
		return (Set<HTNAction>) actionsFunction.actions(); // right!
	}

	@Override
	public double reward(HTNState s) {
		return rewardFunction.getRewardFor((examples.MDP.HTNState) s);
	}
	
	public void setFinalstates() {
		for (HTNState s : states) {
			if (((examples.MDP.HTNState) s).isFinal()) {
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
