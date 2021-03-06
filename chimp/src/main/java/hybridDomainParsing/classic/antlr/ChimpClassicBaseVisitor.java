// Generated from /home/sebastian/code/chimp/src/main/antlr/ChimpClassic.g4 by ANTLR 4.8
package hybridDomainParsing.classic.antlr;
import org.antlr.v4.runtime.tree.AbstractParseTreeVisitor;

import htn.MDPTemplate;
import htn.SpatialConstraintTemplate;
import hybridDomainParsing.classic.antlr.ChimpClassicParser.Delete_spatial_constraint1_defContext;
import hybridDomainParsing.classic.antlr.ChimpClassicParser.Delete_spatial_constraint2_defContext;
import hybridDomainParsing.classic.antlr.ChimpClassicParser.Delete_spatial_constraint_op_elementContext;
import hybridDomainParsing.classic.antlr.ChimpClassicParser.Else_mdp_op_elementContext;
import hybridDomainParsing.classic.antlr.ChimpClassicParser.If_mdp_defContext;
import hybridDomainParsing.classic.antlr.ChimpClassicParser.If_mdp_op_elementContext;
import hybridDomainParsing.classic.antlr.ChimpClassicParser.If_resource_increase_decrease_op_elementContext;
import hybridDomainParsing.classic.antlr.ChimpClassicParser.If_reward_increase_decrease_op_elementContext;
import hybridDomainParsing.classic.antlr.ChimpClassicParser.If_transition_mdp_defContext;
import hybridDomainParsing.classic.antlr.ChimpClassicParser.If_transition_mdp_op_elementContext;
import hybridDomainParsing.classic.antlr.ChimpClassicParser.Mdp_reward_defContext;
import hybridDomainParsing.classic.antlr.ChimpClassicParser.Mdp_reward_increase_decrease_defContext;
import hybridDomainParsing.classic.antlr.ChimpClassicParser.Mdp_reward_increase_decrease_op_elementContext;
import hybridDomainParsing.classic.antlr.ChimpClassicParser.Mdp_reward_op_elementContext;
import hybridDomainParsing.classic.antlr.ChimpClassicParser.Mdp_transitionprobability_op_elementContext;
import hybridDomainParsing.classic.antlr.ChimpClassicParser.Resource_decrease_op_elementContext;
import hybridDomainParsing.classic.antlr.ChimpClassicParser.Resource_increase_op_elementContext;
import hybridDomainParsing.classic.antlr.ChimpClassicParser.Spatial_constraint1_defContext;
import hybridDomainParsing.classic.antlr.ChimpClassicParser.Spatial_constraint2_defContext;
import hybridDomainParsing.classic.antlr.ChimpClassicParser.Spatial_constraint_defContext;
import hybridDomainParsing.classic.antlr.ChimpClassicParser.Spatial_constraint_op_elementContext;

/**
 * This class provides an empty implementation of {@link ChimpClassicVisitor},
 * which can be extended to create a visitor which only needs to handle a subset
 * of the available methods.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public class ChimpClassicBaseVisitor<T> extends AbstractParseTreeVisitor<T> implements ChimpClassicVisitor<T> {
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public T visitDomain(ChimpClassicParser.DomainContext ctx) { return visitChildren(ctx); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public T visitDomain_item_resource(ChimpClassicParser.Domain_item_resourceContext ctx) { return visitChildren(ctx); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public T visitDomain_item_fluentresourceusage(ChimpClassicParser.Domain_item_fluentresourceusageContext ctx) { return visitChildren(ctx); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public T visitDomain_item_statevariable(ChimpClassicParser.Domain_item_statevariableContext ctx) { return visitChildren(ctx); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public T visitDomain_item_operator(ChimpClassicParser.Domain_item_operatorContext ctx) { return visitChildren(ctx); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public T visitDomain_item_method(ChimpClassicParser.Domain_item_methodContext ctx) { return visitChildren(ctx); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public T visitDomain_name_def(ChimpClassicParser.Domain_name_defContext ctx) { return visitChildren(ctx); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public T visitMaxargs_def(ChimpClassicParser.Maxargs_defContext ctx) { return visitChildren(ctx); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public T visitMaxintargs_def(ChimpClassicParser.Maxintargs_defContext ctx) { return visitChildren(ctx); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public T visitPredicatesymbols_def(ChimpClassicParser.Predicatesymbols_defContext ctx) { return visitChildren(ctx); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public T visitPredicate_symbol(ChimpClassicParser.Predicate_symbolContext ctx) { return visitChildren(ctx); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public T visitResource_def(ChimpClassicParser.Resource_defContext ctx) { return visitChildren(ctx); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public T visitStatevariable_def(ChimpClassicParser.Statevariable_defContext ctx) { return visitChildren(ctx); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public T visitStatevariable_name(ChimpClassicParser.Statevariable_nameContext ctx) { return visitChildren(ctx); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public T visitMethod_def(ChimpClassicParser.Method_defContext ctx) { return visitChildren(ctx); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public T visitOperator_def(ChimpClassicParser.Operator_defContext ctx) { return visitChildren(ctx); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public T visitHead(ChimpClassicParser.HeadContext ctx) { return visitChildren(ctx); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public T visitInt_args_def(ChimpClassicParser.Int_args_defContext ctx) { return visitChildren(ctx); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public T visitPrecondition_m_element(ChimpClassicParser.Precondition_m_elementContext ctx) { return visitChildren(ctx); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public T visitTemporal_constraint_m_element(ChimpClassicParser.Temporal_constraint_m_elementContext ctx) { return visitChildren(ctx); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public T visitResource_usage_m_element(ChimpClassicParser.Resource_usage_m_elementContext ctx) { return visitChildren(ctx); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public T visitValue_restriction_m_element(ChimpClassicParser.Value_restriction_m_elementContext ctx) { return visitChildren(ctx); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public T visitNotvalue_restriction_m_element(ChimpClassicParser.Notvalue_restriction_m_elementContext ctx) { return visitChildren(ctx); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public T visitTypevalue_restriction_m_element(ChimpClassicParser.Typevalue_restriction_m_elementContext ctx) { return visitChildren(ctx); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public T visitNottypevalue_restriction_m_element(ChimpClassicParser.Nottypevalue_restriction_m_elementContext ctx) { return visitChildren(ctx); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public T visitVardifferent_m_element(ChimpClassicParser.Vardifferent_m_elementContext ctx) { return visitChildren(ctx); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public T visitSubtask_def_m_element(ChimpClassicParser.Subtask_def_m_elementContext ctx) { return visitChildren(ctx); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public T visitOrdering_def_m_element(ChimpClassicParser.Ordering_def_m_elementContext ctx) { return visitChildren(ctx); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public T visitInteger_constraint_m_element(ChimpClassicParser.Integer_constraint_m_elementContext ctx) { return visitChildren(ctx); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public T visitPrecondition_op_element(ChimpClassicParser.Precondition_op_elementContext ctx) { return visitChildren(ctx); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public T visitTemporal_constraint_op_element(ChimpClassicParser.Temporal_constraint_op_elementContext ctx) { return visitChildren(ctx); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public T visitPositive_effect_def_op_element(ChimpClassicParser.Positive_effect_def_op_elementContext ctx) { return visitChildren(ctx); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public T visitNegative_effect_def_op_element(ChimpClassicParser.Negative_effect_def_op_elementContext ctx) { return visitChildren(ctx); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public T visitResource_usage_op_element(ChimpClassicParser.Resource_usage_op_elementContext ctx) { return visitChildren(ctx); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public T visitValue_restriction_op_element(ChimpClassicParser.Value_restriction_op_elementContext ctx) { return visitChildren(ctx); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public T visitNotvalue_restriction_op_element(ChimpClassicParser.Notvalue_restriction_op_elementContext ctx) { return visitChildren(ctx); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public T visitTypevalue_restriction_op_element(ChimpClassicParser.Typevalue_restriction_op_elementContext ctx) { return visitChildren(ctx); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public T visitNottypevalue_restriction_op_element(ChimpClassicParser.Nottypevalue_restriction_op_elementContext ctx) { return visitChildren(ctx); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public T visitVardifferent_op_element(ChimpClassicParser.Vardifferent_op_elementContext ctx) { return visitChildren(ctx); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public T visitInteger_constraint_op_element(ChimpClassicParser.Integer_constraint_op_elementContext ctx) { return visitChildren(ctx); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public T visitPrecondition_def(ChimpClassicParser.Precondition_defContext ctx) { return visitChildren(ctx); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public T visitSubtask_def(ChimpClassicParser.Subtask_defContext ctx) { return visitChildren(ctx); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public T visitPositive_effect_def(ChimpClassicParser.Positive_effect_defContext ctx) { return visitChildren(ctx); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public T visitNegative_effect_def(ChimpClassicParser.Negative_effect_defContext ctx) { return visitChildren(ctx); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public T visitOrdering_constraint_def(ChimpClassicParser.Ordering_constraint_defContext ctx) { return visitChildren(ctx); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public T visitInteger_constraint_def(ChimpClassicParser.Integer_constraint_defContext ctx) { return visitChildren(ctx); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public T visitInteger_constraint1_def(ChimpClassicParser.Integer_constraint1_defContext ctx) { return visitChildren(ctx); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public T visitInteger_constraint2_def(ChimpClassicParser.Integer_constraint2_defContext ctx) { return visitChildren(ctx); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public T visitInteger_operator1(ChimpClassicParser.Integer_operator1Context ctx) { return visitChildren(ctx); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public T visitInteger_operator2(ChimpClassicParser.Integer_operator2Context ctx) { return visitChildren(ctx); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public T visitTemporal_constraint_def(ChimpClassicParser.Temporal_constraint_defContext ctx) { return visitChildren(ctx); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public T visitUnary_temporal_constraint_def(ChimpClassicParser.Unary_temporal_constraint_defContext ctx) { return visitChildren(ctx); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public T visitUnary_temporal_constraint_type(ChimpClassicParser.Unary_temporal_constraint_typeContext ctx) { return visitChildren(ctx); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public T visitBinary_temporal_constraint_def(ChimpClassicParser.Binary_temporal_constraint_defContext ctx) { return visitChildren(ctx); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public T visitBinary_temporal_constraint_type(ChimpClassicParser.Binary_temporal_constraint_typeContext ctx) { return visitChildren(ctx); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public T visitBounds_list(ChimpClassicParser.Bounds_listContext ctx) { return visitChildren(ctx); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public T visitBounds(ChimpClassicParser.BoundsContext ctx) { return visitChildren(ctx); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public T visitBound(ChimpClassicParser.BoundContext ctx) { return visitChildren(ctx); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public T visitId_or_task(ChimpClassicParser.Id_or_taskContext ctx) { return visitChildren(ctx); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public T visitResource_usage_def(ChimpClassicParser.Resource_usage_defContext ctx) { return visitChildren(ctx); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public T visitFluentresourceusage_def(ChimpClassicParser.Fluentresourceusage_defContext ctx) { return visitChildren(ctx); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public T visitFluent_def(ChimpClassicParser.Fluent_defContext ctx) { return visitChildren(ctx); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public T visitUsage_def(ChimpClassicParser.Usage_defContext ctx) { return visitChildren(ctx); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public T visitParam_item(ChimpClassicParser.Param_itemContext ctx) { return visitChildren(ctx); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public T visitValue_restriction_def(ChimpClassicParser.Value_restriction_defContext ctx) { return visitChildren(ctx); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public T visitNotvalue_restriction_def(ChimpClassicParser.Notvalue_restriction_defContext ctx) { return visitChildren(ctx); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public T visitTypevalue_restriction_def(ChimpClassicParser.Typevalue_restriction_defContext ctx) { return visitChildren(ctx); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public T visitNottypevalue_restriction_def(ChimpClassicParser.Nottypevalue_restriction_defContext ctx) { return visitChildren(ctx); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public T visitVardifferent_def(ChimpClassicParser.Vardifferent_defContext ctx) { return visitChildren(ctx); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public T visitConstant_list(ChimpClassicParser.Constant_listContext ctx) { return visitChildren(ctx); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public T visitPredicate(ChimpClassicParser.PredicateContext ctx) { return visitChildren(ctx); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public T visitPredicate_args(ChimpClassicParser.Predicate_argsContext ctx) { return visitChildren(ctx); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public T visitInt_args(ChimpClassicParser.Int_argsContext ctx) { return visitChildren(ctx); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public T visitVar_or_int(ChimpClassicParser.Var_or_intContext ctx) { return visitChildren(ctx); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public T visitId(ChimpClassicParser.IdContext ctx) { return visitChildren(ctx); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public T visitVar_or_const(ChimpClassicParser.Var_or_constContext ctx) { return visitChildren(ctx); }

	@Override
	public T visitSpatial_constraint_def(ChimpClassicParser.Spatial_constraint_defContext ctx) {
		return visitChildren(ctx);
	}

	@Override
	public T visitSpatial_constraint_op_element(ChimpClassicParser.Spatial_constraint_op_elementContext ctx) {
		return visitChildren(ctx);
	}

	@Override
	public T visitSpatial_constraint1_op_element(Spatial_constraint1_defContext ctx) {
		return visitChildren(ctx);
	}

	@Override
	public T visitSpatial_constraint2_op_element(Spatial_constraint2_defContext ctx) {
		return visitChildren(ctx);
	}
	@Override
	public Object visitDeleteSpatial_constraint_op_element(Delete_spatial_constraint_op_elementContext ctx) {
		return visitChildren(ctx);
	}
	
	@Override
	public Object visitDeleteSpatial_constraint2_op_element(
			Delete_spatial_constraint2_defContext ctx) {
		return visitChildren(ctx);
	}
	
	@Override
	public Object visitDeleteSpatial_constraint1_op_element(
			Delete_spatial_constraint1_defContext ctx) {
		return visitChildren(ctx);
	}

	@Override
	public Double visitMDP_reward_op_element(Mdp_reward_op_elementContext ctx) {
		return (Double) visitChildren(ctx);
	}
	
	@Override
	public Double visitMDP_transitionprobability_op_element(Mdp_transitionprobability_op_elementContext ctx) {
		return (Double) visitChildren(ctx);
	}
	
	@Override
	public MDPTemplate visitMDP_if_op_element(If_mdp_op_elementContext ctx) {
		return (MDPTemplate) visitChildren(ctx);
	}
	@Override
	public MDPTemplate visitMDP_else_op_element(Else_mdp_op_elementContext ctx) {
		return (MDPTemplate) visitChildren(ctx);
	}
	@Override
	public MDPTemplate visitMDP_if_transition_op_element(If_transition_mdp_op_elementContext ctx) {
		return (MDPTemplate) visitChildren(ctx);
	}
	@Override
	public T visitResource_increase_op_element(Resource_increase_op_elementContext d) {
		return (T) visitChildren(d);
	}
	@Override
	public T visitResource_decrease_op_element(Resource_decrease_op_elementContext d) {
		return (T) visitChildren(d);
	}
	@Override
	public T visitIf_Resource_increase_decrease_op_element(If_resource_increase_decrease_op_elementContext d) {
		return (T) visitChildren(d);
	}
	@Override
	public T visitIf_mdp_reward_increase_decrease_op_element(If_reward_increase_decrease_op_elementContext d) {
		return (T) visitChildren(d);
	}
	@Override
	public MDPTemplate visitMdp_reward_increase_decrease_op_element(
			Mdp_reward_increase_decrease_op_elementContext ctx) {
		return (MDPTemplate) visitChildren(ctx);

	}

}