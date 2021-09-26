package htn;

import java.util.ArrayList;
import java.util.List;

import hybridDomainParsing.classic.antlr.ChimpClassicReader.ValueRestriction;

public class MDPTemplate {

	private Double reward=null;
    private Double transitionProbability=null;
    private ValueRestriction valueRestriction=null;
    private List<MDPTemplate>  mdpTemplates= new ArrayList<MDPTemplate>();
    
    

    public MDPTemplate(Double reward, Double transitionProbability1) {
		this.reward = reward;
		transitionProbability = transitionProbability1;
	}
    
	public MDPTemplate(Double transitionProbability1) {
		transitionProbability = transitionProbability1;
	}

	public MDPTemplate() {
	}

	public MDPTemplate(ValueRestriction vR, Double reward) {
		valueRestriction = vR;
		this.reward = reward;
	}

	public List<MDPTemplate> getMdpTemplates() {
		return mdpTemplates;
	}

	public void setMdpTemplate(MDPTemplate mdpTemplates) {
		this.mdpTemplates.add(mdpTemplates);
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
