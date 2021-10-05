package htn;

import java.util.ArrayList;
import java.util.List;

import hybridDomainParsing.classic.antlr.ChimpClassicReader.ValueRestriction;
import resourceFluent.ResourceUsageTemplate.ResourceMan;

public class MDPTemplate {
	
	public enum RewardMan {
		Decrease, Increase
	}


	private Double reward=null;
    private Double transitionProbability=null;
    private ValueRestriction valueRestriction=null;
    private List<MDPTemplate>  mdpTemplates= new ArrayList<MDPTemplate>();
	private RewardMan RManip=null;

    

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
		setValueRestriction(vR);
		this.reward = reward;
	}
	
	public MDPTemplate(Double level, RewardMan resManip) {
		this.reward = level;
		this.RManip = resManip;
	}

	public MDPTemplate SetTransitionRestriction(ValueRestriction vR, Double transitionProbability) {
		setValueRestriction(vR);
		this.transitionProbability = transitionProbability;
		return this;
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

	public ValueRestriction getValueRestriction() {
		return valueRestriction;
	}

	public void setValueRestriction(ValueRestriction valueRestriction) {
		this.valueRestriction = valueRestriction;
	}

	public RewardMan getRManip() {
		return RManip;
	}





}
