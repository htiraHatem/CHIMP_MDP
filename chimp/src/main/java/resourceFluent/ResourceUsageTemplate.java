package resourceFluent;

import java.util.ArrayList;
import java.util.List;

import htn.MDPTemplate;
import hybridDomainParsing.classic.antlr.ChimpClassicReader.ValueRestriction;


public class ResourceUsageTemplate {
	
	public enum ResourceMan {
		Decrease, Increase
	}

	/** The resource's name */
	private String resourceName;

	/** The type of the fluent */
	private String fluentType;
	
	/** The indices of the NameVariables that need to be testet. */
	private final int[] resourceRequirementPositions;
	
	/** The Strings the NameVariables should be grounded to. */
	private final String[] resourceRequirements;
	
	/**  The amount of capacity the resource uses */
	final int resourceUsageLevel;

	private final ResourceMan ResManip;

	/**
	 * Manipulate (increase / decrease) the resource if a control rule in a specific
	 * state is met
	 */
	private List<ResourceUsageTemplate> resourceManipulationTemplates = new ArrayList<ResourceUsageTemplate>();

	
	private ValueRestriction ValueRestriction;
	
	public ResourceUsageTemplate(String resourceName, int[] resourceRequirementPositions,
			String[] resourceRequirements, int resourceUsageLevel) {
		super();
		this.resourceName = resourceName;
		this.resourceRequirementPositions = resourceRequirementPositions;
		this.resourceRequirements = resourceRequirements;
		this.resourceUsageLevel = resourceUsageLevel;
		this.ResManip = null;
		this.resourceManipulationTemplates = new ArrayList<ResourceUsageTemplate>();
	}
	
	public ResourceUsageTemplate(String resourceName, String fluentType, int[] resourceRequirementPositions,
			String[] resourceRequirements, int resourceUsageLevel) {
		this(resourceName, resourceRequirementPositions, resourceRequirements, resourceUsageLevel);
		this.fluentType = fluentType;
	}

	public ResourceUsageTemplate(String resourceName2, int usageLevel, ResourceMan resManip2) {
		this.resourceName = resourceName2;
		this.resourceUsageLevel = usageLevel;
		this.ResManip = resManip2;
		this.resourceRequirementPositions = null;
		this.resourceRequirements = null;
		this.resourceManipulationTemplates = new ArrayList<ResourceUsageTemplate>();
	}

	public ResourceUsageTemplate(ValueRestriction vr, String resourceName2, int usageLevel, ResourceMan resManip2) {
		this.resourceName = resourceName2;
		this.resourceUsageLevel = usageLevel;
		this.ResManip = resManip2;
		this.resourceRequirementPositions = null;
		this.resourceRequirements = null;
		this.resourceManipulationTemplates = new ArrayList<ResourceUsageTemplate>();
		this.ValueRestriction=vr;
	}
	public ValueRestriction getValueRestriction() {
		return ValueRestriction;
	}

	public void setValueRestriction(ValueRestriction valueRestriction) {
		ValueRestriction = valueRestriction;
	}

	public ResourceUsageTemplate() {
		this.resourceName = null;
		this.resourceUsageLevel = 0;
		this.ResManip = null;
		this.resourceRequirementPositions = null;
		this.resourceRequirements = null;
		this.resourceManipulationTemplates = new ArrayList<ResourceUsageTemplate>();
	}

	public String getResourceName() {
		return resourceName;
	}
	
	public String getFluentType() {
		if (fluentType == null) {
			throw new IllegalStateException("FluentType is not set");
		}
		return fluentType;
	}
	
	public int[] getResourceRequirementPositions() {
		return resourceRequirementPositions;
	}

	public String[] getResourceRequirements() {
		return resourceRequirements;
	}

	public int getResourceUsageLevel() {
		return resourceUsageLevel;
	}
	
	public void setResourceManipulationTemplate(ResourceUsageTemplate resourceUsageTemplate) {
		this.resourceManipulationTemplates.add(resourceUsageTemplate);
	}
	
	public void setResourceManipulationTemplates(List<ResourceUsageTemplate> resourceUsageTemplates) {
		this.resourceManipulationTemplates = resourceUsageTemplates;
	}


	@Override
	public String toString() {
		StringBuilder ret = new StringBuilder();
		ret.append(resourceName);
		ret.append(" : ");
		ret.append(resourceUsageLevel);
		return ret.toString();
	}

	public List<ResourceUsageTemplate> getResourceManipulationTemplates() {
		return resourceManipulationTemplates;
	}

	public ResourceMan getResManip() {
		return ResManip;
	}
	
	public void setResourceName(String resourceName) {
		this.resourceName = resourceName;
	}
	
}
