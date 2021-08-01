package examples.MDP;

import java.util.Hashtable;

import aima.core.agent.Action;
import aima.core.probability.mdp.RewardFunction;
import edu.cmu.ita.mdp.aima.MDPState;

public class HTNReward implements Comparable<RewardFunction<HTNState>> {

	@Override
	public int compareTo(RewardFunction<HTNState> o) {
		// TODO Auto-generated method stub
		return 0;
	}
	
	Hashtable<HTNState, Double> stateToReward;

	public HTNReward() {
		stateToReward = new Hashtable<HTNState, Double>();
	}

	public double getRewardFor(HTNState htnState) {
		return stateToReward.get(htnState);
	}

	public void setReward(HTNState sp, Double reward) {
		stateToReward.put(sp, reward);
	}

	@Override
	public String toString() {
		return stateToReward.toString();
	}

}
