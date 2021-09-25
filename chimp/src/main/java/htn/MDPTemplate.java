package htn;

public class MDPTemplate {

	private Double reward=null;
    private Double transitionProbability=null;
    

    public MDPTemplate(Double reward, Double transitionProbability1) {
		this.reward = reward;
		transitionProbability = transitionProbability1;
	}
    
	public MDPTemplate(Double transitionProbability1) {
		transitionProbability = transitionProbability1;
	}

	public MDPTemplate() {
	}

	public Double getReward() {
		return reward;
	}
	public void setReward(Double reward) {
		this.reward = reward;
	}
	public Double getTransitionProbability() {
		return transitionProbability;
	}
	public void setTransitionProbability(Double transitionProbability1) {
		transitionProbability = transitionProbability1;
	}





}
