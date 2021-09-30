package mdpSolver;

import java.util.Hashtable;

import aima.core.agent.Action;
import aima.core.probability.mdp.RewardFunction;
import edu.cmu.ita.mdp.aima.MDPState;

/**
 * author by Hatem
 */
public class HTNReward implements Comparable<RewardFunction<HTNState>> {

	@Override
	public int compareTo(RewardFunction<HTNState> o) {
		return 0;
	}
	
	Hashtable<HTNState, Double> stateToReward;

	public HTNReward() {
		stateToReward = new Hashtable<HTNState, Double>();
	}

	public double getRewardFor(HTNState s) {
		return stateToReward.get(s);
	}

	public void setReward(HTNState sp, Double reward) {
		stateToReward.put(sp, reward);
	}
	
	public Boolean exists(HTNState sp) {
		return stateToReward.containsKey(sp);
	}

	@Override
	public String toString() {
		return stateToReward.toString();
	}

}
