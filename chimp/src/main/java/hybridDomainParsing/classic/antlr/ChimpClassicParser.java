package hybridDomainParsing.classic.antlr;

// Generated from ChimpClassic.g4 by ANTLR 4.9.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class ChimpClassicParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.9.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, T__29=30, T__30=31, 
		T__31=32, T__32=33, T__33=34, T__34=35, T__35=36, T__36=37, T__37=38, 
		T__38=39, T__39=40, T__40=41, T__41=42, T__42=43, T__43=44, T__44=45, 
		T__45=46, T__46=47, T__47=48, T__48=49, T__49=50, T__50=51, T__51=52, 
		T__52=53, T__53=54, T__54=55, T__55=56, T__56=57, T__57=58, T__58=59, 
		T__59=60, T__60=61, T__61=62, T__62=63, T__63=64, T__64=65, T__65=66, 
		T__66=67, T__67=68, T__68=69, T__69=70, T__70=71, T__71=72, T__72=73, 
		T__73=74, T__74=75, T__75=76, T__76=77, T__77=78, T__78=79, T__79=80, 
		T__80=81, T__81=82, T__82=83, T__83=84, T__84=85, VAR_NAME=86, DOUBLE=87, 
		MINUS=88, NAME=89, Comment=90, WS=91, NUMBER=92;
	public static final int
		RULE_domain = 0, RULE_domain_item = 1, RULE_domain_name_def = 2, RULE_maxargs_def = 3, 
		RULE_maxintargs_def = 4, RULE_predicatesymbols_def = 5, RULE_predicate_symbol = 6, 
		RULE_resource_def = 7, RULE_statevariable_def = 8, RULE_statevariable_name = 9, 
		RULE_method_def = 10, RULE_operator_def = 11, RULE_head = 12, RULE_int_args_def = 13, 
		RULE_method_element = 14, RULE_op_element = 15, RULE_precondition_def = 16, 
		RULE_subtask_def = 17, RULE_positive_effect_def = 18, RULE_negative_effect_def = 19, 
		RULE_ordering_constraint_def = 20, RULE_spatial_constraint_def = 21, RULE_spatial_constraint1_def = 22, 
		RULE_spatial_constraint2_def = 23, RULE_delete_spatial_constraint_def = 24, 
		RULE_delete_spatial_constraint1_def = 25, RULE_delete_spatial_constraint2_def = 26, 
		RULE_integer_constraint_def = 27, RULE_integer_constraint1_def = 28, RULE_integer_constraint2_def = 29, 
		RULE_integer_operator1 = 30, RULE_integer_operator2 = 31, RULE_temporal_constraint_def = 32, 
		RULE_unary_temporal_constraint_def = 33, RULE_unary_temporal_constraint_type = 34, 
		RULE_binary_temporal_constraint_def = 35, RULE_binary_temporal_constraint_type = 36, 
		RULE_unary_spatial_constraint_type = 37, RULE_bounds_list = 38, RULE_bounds = 39, 
		RULE_bound = 40, RULE_id_or_task = 41, RULE_mdp_reward_def = 42, RULE_mdp_transitionProbability_def = 43, 
		RULE_if_mdp_def = 44, RULE_if_reward_mdp_def = 45, RULE_if_transition_mdp_def = 46, 
		RULE_if_reward_transition_mdp_def = 47, RULE_if_resource_increase_decrease_def = 48, 
		RULE_if_resource_increase_def = 49, RULE_if_resource_decrease_def = 50, 
		RULE_else_mdp_def = 51, RULE_resource_increase_def = 52, RULE_resource_decrease_def = 53, 
		RULE_resource_usage_def = 54, RULE_fluentresourceusage_def = 55, RULE_fluent_def = 56, 
		RULE_usage_def = 57, RULE_param_item = 58, RULE_value_restriction_def = 59, 
		RULE_notvalue_restriction_def = 60, RULE_typevalue_restriction_def = 61, 
		RULE_nottypevalue_restriction_def = 62, RULE_vardifferent_def = 63, RULE_constant_list = 64, 
		RULE_predicate = 65, RULE_predicate_args = 66, RULE_int_args = 67, RULE_var_or_int = 68, 
		RULE_double_or_int = 69, RULE_id = 70, RULE_var_or_const = 71;
	private static String[] makeRuleNames() {
		return new String[] {
			"domain", "domain_item", "domain_name_def", "maxargs_def", "maxintargs_def", 
			"predicatesymbols_def", "predicate_symbol", "resource_def", "statevariable_def", 
			"statevariable_name", "method_def", "operator_def", "head", "int_args_def", 
			"method_element", "op_element", "precondition_def", "subtask_def", "positive_effect_def", 
			"negative_effect_def", "ordering_constraint_def", "spatial_constraint_def", 
			"spatial_constraint1_def", "spatial_constraint2_def", "delete_spatial_constraint_def", 
			"delete_spatial_constraint1_def", "delete_spatial_constraint2_def", "integer_constraint_def", 
			"integer_constraint1_def", "integer_constraint2_def", "integer_operator1", 
			"integer_operator2", "temporal_constraint_def", "unary_temporal_constraint_def", 
			"unary_temporal_constraint_type", "binary_temporal_constraint_def", "binary_temporal_constraint_type", 
			"unary_spatial_constraint_type", "bounds_list", "bounds", "bound", "id_or_task", 
			"mdp_reward_def", "mdp_transitionProbability_def", "if_mdp_def", "if_reward_mdp_def", 
			"if_transition_mdp_def", "if_reward_transition_mdp_def", "if_resource_increase_decrease_def", 
			"if_resource_increase_def", "if_resource_decrease_def", "else_mdp_def", 
			"resource_increase_def", "resource_decrease_def", "resource_usage_def", 
			"fluentresourceusage_def", "fluent_def", "usage_def", "param_item", "value_restriction_def", 
			"notvalue_restriction_def", "typevalue_restriction_def", "nottypevalue_restriction_def", 
			"vardifferent_def", "constant_list", "predicate", "predicate_args", "int_args", 
			"var_or_int", "double_or_int", "id", "var_or_const"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'(HybridHTNDomain'", "')'", "'(MaxArgs'", "'(MaxIntegerArgs'", 
			"'(PredicateSymbols'", "'(Resource'", "'(StateVariable'", "'(:method'", 
			"'(:operator'", "'(Head'", "'('", "'(Pre'", "'(Sub'", "'(Add'", "'(Del'", 
			"'(Ordering'", "'(SC'", "','", "'(DelSC'", "'(IC'", "'='", "'!='", "'>'", 
			"'<'", "'>='", "'<='", "'+'", "'*'", "'/'", "'(Constraint Duration'", 
			"'(Constraint Release'", "'(Constraint Deadline'", "'(Constraint Forever'", 
			"'(Constraint At'", "'(Constraint'", "'Before'", "'Meets'", "'Overlaps'", 
			"'FinishedBy'", "'Contains'", "'StartedBy'", "'Equals'", "'Starts'", 
			"'During'", "'Finishes'", "'OverlappedBy'", "'After'", "'MetBy'", "'BeforeOrMeets'", 
			"'MetByOrAfter'", "'MetByOrOverlappedBy'", "'MetByOrOverlappedByOrAfter'", 
			"'MetByOrOverlappedByOrIsFinishedByOrDuring'", "'MeetsOrOverlapsOrBefore'", 
			"'DuringOrEquals'", "'DuringOrEqualsOrStartsOrFinishes'", "'MeetsOrOverlapsOrFinishedByOrContains'", 
			"'ContainsOrStartedByOrOverlappedByOrMetBy'", "'EndsDuring'", "'EndsOrEndedBy'", 
			"'StartsOrStartedBy'", "'NotBeforeAndNotAfter'", "'Duration'", "'At'", 
			"'Size'", "'['", "']'", "'INF'", "'task'", "'(Reward'", "'(TransitionProb'", 
			"'(if'", "'(else'", "'(Increase'", "'(Decrease'", "'(ResourceUsage'", 
			"'(FluentResourceUsage'", "'(Fluent'", "'(Usage'", "'(Param'", "'(Values'", 
			"'(NotValues'", "'(Type'", "'(NotType'", "'(VarDifferent'", null, null, 
			"'-'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, "VAR_NAME", "DOUBLE", "MINUS", "NAME", "Comment", "WS", "NUMBER"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "ChimpClassic.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public ChimpClassicParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class DomainContext extends ParserRuleContext {
		public Domain_name_defContext domain_name_def() {
			return getRuleContext(Domain_name_defContext.class,0);
		}
		public Maxargs_defContext maxargs_def() {
			return getRuleContext(Maxargs_defContext.class,0);
		}
		public Predicatesymbols_defContext predicatesymbols_def() {
			return getRuleContext(Predicatesymbols_defContext.class,0);
		}
		public Maxintargs_defContext maxintargs_def() {
			return getRuleContext(Maxintargs_defContext.class,0);
		}
		public List<Domain_itemContext> domain_item() {
			return getRuleContexts(Domain_itemContext.class);
		}
		public Domain_itemContext domain_item(int i) {
			return getRuleContext(Domain_itemContext.class,i);
		}
		public DomainContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_domain; }
	}

	public final DomainContext domain() throws RecognitionException {
		DomainContext _localctx = new DomainContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_domain);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(144);
			domain_name_def();
			setState(145);
			maxargs_def();
			setState(147);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__3) {
				{
				setState(146);
				maxintargs_def();
				}
			}

			setState(149);
			predicatesymbols_def();
			setState(153);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8))) != 0) || _la==T__76) {
				{
				{
				setState(150);
				domain_item();
				}
				}
				setState(155);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Domain_itemContext extends ParserRuleContext {
		public Domain_itemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_domain_item; }
	 
		public Domain_itemContext() { }
		public void copyFrom(Domain_itemContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class Domain_item_operatorContext extends Domain_itemContext {
		public Operator_defContext operator_def() {
			return getRuleContext(Operator_defContext.class,0);
		}
		public Domain_item_operatorContext(Domain_itemContext ctx) { copyFrom(ctx); }
	}
	public static class Domain_item_statevariableContext extends Domain_itemContext {
		public Statevariable_defContext statevariable_def() {
			return getRuleContext(Statevariable_defContext.class,0);
		}
		public Domain_item_statevariableContext(Domain_itemContext ctx) { copyFrom(ctx); }
	}
	public static class Domain_item_resourceContext extends Domain_itemContext {
		public Resource_defContext resource_def() {
			return getRuleContext(Resource_defContext.class,0);
		}
		public Domain_item_resourceContext(Domain_itemContext ctx) { copyFrom(ctx); }
	}
	public static class Domain_item_fluentresourceusageContext extends Domain_itemContext {
		public Fluentresourceusage_defContext fluentresourceusage_def() {
			return getRuleContext(Fluentresourceusage_defContext.class,0);
		}
		public Domain_item_fluentresourceusageContext(Domain_itemContext ctx) { copyFrom(ctx); }
	}
	public static class Domain_item_methodContext extends Domain_itemContext {
		public Method_defContext method_def() {
			return getRuleContext(Method_defContext.class,0);
		}
		public Domain_item_methodContext(Domain_itemContext ctx) { copyFrom(ctx); }
	}

	public final Domain_itemContext domain_item() throws RecognitionException {
		Domain_itemContext _localctx = new Domain_itemContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_domain_item);
		try {
			setState(161);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__5:
				_localctx = new Domain_item_resourceContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(156);
				resource_def();
				}
				break;
			case T__76:
				_localctx = new Domain_item_fluentresourceusageContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(157);
				fluentresourceusage_def();
				}
				break;
			case T__6:
				_localctx = new Domain_item_statevariableContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(158);
				statevariable_def();
				}
				break;
			case T__8:
				_localctx = new Domain_item_operatorContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(159);
				operator_def();
				}
				break;
			case T__7:
				_localctx = new Domain_item_methodContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(160);
				method_def();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Domain_name_defContext extends ParserRuleContext {
		public TerminalNode NAME() { return getToken(ChimpClassicParser.NAME, 0); }
		public Domain_name_defContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_domain_name_def; }
	}

	public final Domain_name_defContext domain_name_def() throws RecognitionException {
		Domain_name_defContext _localctx = new Domain_name_defContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_domain_name_def);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(163);
			match(T__0);
			setState(164);
			match(NAME);
			setState(165);
			match(T__1);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Maxargs_defContext extends ParserRuleContext {
		public TerminalNode NUMBER() { return getToken(ChimpClassicParser.NUMBER, 0); }
		public Maxargs_defContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_maxargs_def; }
	}

	public final Maxargs_defContext maxargs_def() throws RecognitionException {
		Maxargs_defContext _localctx = new Maxargs_defContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_maxargs_def);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(167);
			match(T__2);
			setState(168);
			match(NUMBER);
			setState(169);
			match(T__1);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Maxintargs_defContext extends ParserRuleContext {
		public TerminalNode NUMBER() { return getToken(ChimpClassicParser.NUMBER, 0); }
		public Maxintargs_defContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_maxintargs_def; }
	}

	public final Maxintargs_defContext maxintargs_def() throws RecognitionException {
		Maxintargs_defContext _localctx = new Maxintargs_defContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_maxintargs_def);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(171);
			match(T__3);
			setState(172);
			match(NUMBER);
			setState(173);
			match(T__1);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Predicatesymbols_defContext extends ParserRuleContext {
		public List<Predicate_symbolContext> predicate_symbol() {
			return getRuleContexts(Predicate_symbolContext.class);
		}
		public Predicate_symbolContext predicate_symbol(int i) {
			return getRuleContext(Predicate_symbolContext.class,i);
		}
		public Predicatesymbols_defContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_predicatesymbols_def; }
	}

	public final Predicatesymbols_defContext predicatesymbols_def() throws RecognitionException {
		Predicatesymbols_defContext _localctx = new Predicatesymbols_defContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_predicatesymbols_def);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(175);
			match(T__4);
			setState(179);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NAME) {
				{
				{
				setState(176);
				predicate_symbol();
				}
				}
				setState(181);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(182);
			match(T__1);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Predicate_symbolContext extends ParserRuleContext {
		public TerminalNode NAME() { return getToken(ChimpClassicParser.NAME, 0); }
		public Predicate_symbolContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_predicate_symbol; }
	}

	public final Predicate_symbolContext predicate_symbol() throws RecognitionException {
		Predicate_symbolContext _localctx = new Predicate_symbolContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_predicate_symbol);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(184);
			match(NAME);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Resource_defContext extends ParserRuleContext {
		public TerminalNode NAME() { return getToken(ChimpClassicParser.NAME, 0); }
		public TerminalNode NUMBER() { return getToken(ChimpClassicParser.NUMBER, 0); }
		public Resource_defContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_resource_def; }
	}

	public final Resource_defContext resource_def() throws RecognitionException {
		Resource_defContext _localctx = new Resource_defContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_resource_def);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(186);
			match(T__5);
			setState(187);
			match(NAME);
			setState(188);
			match(NUMBER);
			setState(189);
			match(T__1);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Statevariable_defContext extends ParserRuleContext {
		public Statevariable_nameContext statevariable_name() {
			return getRuleContext(Statevariable_nameContext.class,0);
		}
		public TerminalNode NUMBER() { return getToken(ChimpClassicParser.NUMBER, 0); }
		public List<TerminalNode> NAME() { return getTokens(ChimpClassicParser.NAME); }
		public TerminalNode NAME(int i) {
			return getToken(ChimpClassicParser.NAME, i);
		}
		public Statevariable_defContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statevariable_def; }
	}

	public final Statevariable_defContext statevariable_def() throws RecognitionException {
		Statevariable_defContext _localctx = new Statevariable_defContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_statevariable_def);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(191);
			match(T__6);
			setState(192);
			statevariable_name();
			setState(193);
			match(NUMBER);
			setState(195); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(194);
				match(NAME);
				}
				}
				setState(197); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==NAME );
			setState(199);
			match(T__1);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Statevariable_nameContext extends ParserRuleContext {
		public TerminalNode NAME() { return getToken(ChimpClassicParser.NAME, 0); }
		public Statevariable_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statevariable_name; }
	}

	public final Statevariable_nameContext statevariable_name() throws RecognitionException {
		Statevariable_nameContext _localctx = new Statevariable_nameContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_statevariable_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(201);
			match(NAME);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Method_defContext extends ParserRuleContext {
		public HeadContext head() {
			return getRuleContext(HeadContext.class,0);
		}
		public TerminalNode NUMBER() { return getToken(ChimpClassicParser.NUMBER, 0); }
		public List<Method_elementContext> method_element() {
			return getRuleContexts(Method_elementContext.class);
		}
		public Method_elementContext method_element(int i) {
			return getRuleContext(Method_elementContext.class,i);
		}
		public Method_defContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_method_def; }
	}

	public final Method_defContext method_def() throws RecognitionException {
		Method_defContext _localctx = new Method_defContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_method_def);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(203);
			match(T__7);
			setState(205);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NUMBER) {
				{
				setState(204);
				match(NUMBER);
				}
			}

			setState(207);
			head();
			setState(211);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__11) | (1L << T__12) | (1L << T__15) | (1L << T__19) | (1L << T__29) | (1L << T__30) | (1L << T__31) | (1L << T__32) | (1L << T__33) | (1L << T__34))) != 0) || ((((_la - 76)) & ~0x3f) == 0 && ((1L << (_la - 76)) & ((1L << (T__75 - 76)) | (1L << (T__80 - 76)) | (1L << (T__81 - 76)) | (1L << (T__82 - 76)) | (1L << (T__83 - 76)) | (1L << (T__84 - 76)))) != 0)) {
				{
				{
				setState(208);
				method_element();
				}
				}
				setState(213);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(214);
			match(T__1);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Operator_defContext extends ParserRuleContext {
		public HeadContext head() {
			return getRuleContext(HeadContext.class,0);
		}
		public TerminalNode NUMBER() { return getToken(ChimpClassicParser.NUMBER, 0); }
		public List<Op_elementContext> op_element() {
			return getRuleContexts(Op_elementContext.class);
		}
		public Op_elementContext op_element(int i) {
			return getRuleContext(Op_elementContext.class,i);
		}
		public Operator_defContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operator_def; }
	}

	public final Operator_defContext operator_def() throws RecognitionException {
		Operator_defContext _localctx = new Operator_defContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_operator_def);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(216);
			match(T__8);
			setState(218);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NUMBER) {
				{
				setState(217);
				match(NUMBER);
				}
			}

			setState(220);
			head();
			setState(224);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__11) | (1L << T__13) | (1L << T__14) | (1L << T__16) | (1L << T__18) | (1L << T__19) | (1L << T__29) | (1L << T__30) | (1L << T__31) | (1L << T__32) | (1L << T__33) | (1L << T__34))) != 0) || ((((_la - 70)) & ~0x3f) == 0 && ((1L << (_la - 70)) & ((1L << (T__69 - 70)) | (1L << (T__70 - 70)) | (1L << (T__71 - 70)) | (1L << (T__72 - 70)) | (1L << (T__73 - 70)) | (1L << (T__74 - 70)) | (1L << (T__75 - 70)) | (1L << (T__80 - 70)) | (1L << (T__81 - 70)) | (1L << (T__82 - 70)) | (1L << (T__83 - 70)) | (1L << (T__84 - 70)))) != 0)) {
				{
				{
				setState(221);
				op_element();
				}
				}
				setState(226);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(227);
			match(T__1);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class HeadContext extends ParserRuleContext {
		public Predicate_symbolContext predicate_symbol() {
			return getRuleContext(Predicate_symbolContext.class,0);
		}
		public Predicate_argsContext predicate_args() {
			return getRuleContext(Predicate_argsContext.class,0);
		}
		public Int_args_defContext int_args_def() {
			return getRuleContext(Int_args_defContext.class,0);
		}
		public HeadContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_head; }
	}

	public final HeadContext head() throws RecognitionException {
		HeadContext _localctx = new HeadContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_head);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(229);
			match(T__9);
			setState(230);
			predicate_symbol();
			setState(231);
			match(T__10);
			setState(232);
			predicate_args();
			setState(233);
			match(T__1);
			setState(235);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__10) {
				{
				setState(234);
				int_args_def();
				}
			}

			setState(237);
			match(T__1);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Int_args_defContext extends ParserRuleContext {
		public Int_argsContext int_args() {
			return getRuleContext(Int_argsContext.class,0);
		}
		public Int_args_defContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_int_args_def; }
	}

	public final Int_args_defContext int_args_def() throws RecognitionException {
		Int_args_defContext _localctx = new Int_args_defContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_int_args_def);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(239);
			match(T__10);
			setState(240);
			int_args();
			setState(241);
			match(T__1);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Method_elementContext extends ParserRuleContext {
		public Method_elementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_method_element; }
	 
		public Method_elementContext() { }
		public void copyFrom(Method_elementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class Precondition_m_elementContext extends Method_elementContext {
		public Precondition_defContext precondition_def() {
			return getRuleContext(Precondition_defContext.class,0);
		}
		public Precondition_m_elementContext(Method_elementContext ctx) { copyFrom(ctx); }
	}
	public static class Nottypevalue_restriction_m_elementContext extends Method_elementContext {
		public Nottypevalue_restriction_defContext nottypevalue_restriction_def() {
			return getRuleContext(Nottypevalue_restriction_defContext.class,0);
		}
		public Nottypevalue_restriction_m_elementContext(Method_elementContext ctx) { copyFrom(ctx); }
	}
	public static class Temporal_constraint_m_elementContext extends Method_elementContext {
		public Temporal_constraint_defContext temporal_constraint_def() {
			return getRuleContext(Temporal_constraint_defContext.class,0);
		}
		public Temporal_constraint_m_elementContext(Method_elementContext ctx) { copyFrom(ctx); }
	}
	public static class Resource_usage_m_elementContext extends Method_elementContext {
		public Resource_usage_defContext resource_usage_def() {
			return getRuleContext(Resource_usage_defContext.class,0);
		}
		public Resource_usage_m_elementContext(Method_elementContext ctx) { copyFrom(ctx); }
	}
	public static class Vardifferent_m_elementContext extends Method_elementContext {
		public Vardifferent_defContext vardifferent_def() {
			return getRuleContext(Vardifferent_defContext.class,0);
		}
		public Vardifferent_m_elementContext(Method_elementContext ctx) { copyFrom(ctx); }
	}
	public static class Value_restriction_m_elementContext extends Method_elementContext {
		public Value_restriction_defContext value_restriction_def() {
			return getRuleContext(Value_restriction_defContext.class,0);
		}
		public Value_restriction_m_elementContext(Method_elementContext ctx) { copyFrom(ctx); }
	}
	public static class Subtask_def_m_elementContext extends Method_elementContext {
		public Subtask_defContext subtask_def() {
			return getRuleContext(Subtask_defContext.class,0);
		}
		public Subtask_def_m_elementContext(Method_elementContext ctx) { copyFrom(ctx); }
	}
	public static class Integer_constraint_m_elementContext extends Method_elementContext {
		public Integer_constraint_defContext integer_constraint_def() {
			return getRuleContext(Integer_constraint_defContext.class,0);
		}
		public Integer_constraint_m_elementContext(Method_elementContext ctx) { copyFrom(ctx); }
	}
	public static class Notvalue_restriction_m_elementContext extends Method_elementContext {
		public Notvalue_restriction_defContext notvalue_restriction_def() {
			return getRuleContext(Notvalue_restriction_defContext.class,0);
		}
		public Notvalue_restriction_m_elementContext(Method_elementContext ctx) { copyFrom(ctx); }
	}
	public static class Typevalue_restriction_m_elementContext extends Method_elementContext {
		public Typevalue_restriction_defContext typevalue_restriction_def() {
			return getRuleContext(Typevalue_restriction_defContext.class,0);
		}
		public Typevalue_restriction_m_elementContext(Method_elementContext ctx) { copyFrom(ctx); }
	}
	public static class Ordering_def_m_elementContext extends Method_elementContext {
		public Ordering_constraint_defContext ordering_constraint_def() {
			return getRuleContext(Ordering_constraint_defContext.class,0);
		}
		public Ordering_def_m_elementContext(Method_elementContext ctx) { copyFrom(ctx); }
	}

	public final Method_elementContext method_element() throws RecognitionException {
		Method_elementContext _localctx = new Method_elementContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_method_element);
		try {
			setState(254);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__11:
				_localctx = new Precondition_m_elementContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(243);
				precondition_def();
				}
				break;
			case T__29:
			case T__30:
			case T__31:
			case T__32:
			case T__33:
			case T__34:
				_localctx = new Temporal_constraint_m_elementContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(244);
				temporal_constraint_def();
				}
				break;
			case T__75:
				_localctx = new Resource_usage_m_elementContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(245);
				resource_usage_def();
				}
				break;
			case T__80:
				_localctx = new Value_restriction_m_elementContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(246);
				value_restriction_def();
				}
				break;
			case T__81:
				_localctx = new Notvalue_restriction_m_elementContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(247);
				notvalue_restriction_def();
				}
				break;
			case T__82:
				_localctx = new Typevalue_restriction_m_elementContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(248);
				typevalue_restriction_def();
				}
				break;
			case T__83:
				_localctx = new Nottypevalue_restriction_m_elementContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(249);
				nottypevalue_restriction_def();
				}
				break;
			case T__84:
				_localctx = new Vardifferent_m_elementContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(250);
				vardifferent_def();
				}
				break;
			case T__12:
				_localctx = new Subtask_def_m_elementContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(251);
				subtask_def();
				}
				break;
			case T__15:
				_localctx = new Ordering_def_m_elementContext(_localctx);
				enterOuterAlt(_localctx, 10);
				{
				setState(252);
				ordering_constraint_def();
				}
				break;
			case T__19:
				_localctx = new Integer_constraint_m_elementContext(_localctx);
				enterOuterAlt(_localctx, 11);
				{
				setState(253);
				integer_constraint_def();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Op_elementContext extends ParserRuleContext {
		public Op_elementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_op_element; }
	 
		public Op_elementContext() { }
		public void copyFrom(Op_elementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class If_mdp_op_elementContext extends Op_elementContext {
		public If_mdp_defContext if_mdp_def() {
			return getRuleContext(If_mdp_defContext.class,0);
		}
		public If_mdp_op_elementContext(Op_elementContext ctx) { copyFrom(ctx); }
	}
	public static class Resource_increase_op_elementContext extends Op_elementContext {
		public Resource_increase_defContext resource_increase_def() {
			return getRuleContext(Resource_increase_defContext.class,0);
		}
		public Resource_increase_op_elementContext(Op_elementContext ctx) { copyFrom(ctx); }
	}
	public static class Resource_usage_op_elementContext extends Op_elementContext {
		public Resource_usage_defContext resource_usage_def() {
			return getRuleContext(Resource_usage_defContext.class,0);
		}
		public Resource_usage_op_elementContext(Op_elementContext ctx) { copyFrom(ctx); }
	}
	public static class Precondition_op_elementContext extends Op_elementContext {
		public Precondition_defContext precondition_def() {
			return getRuleContext(Precondition_defContext.class,0);
		}
		public Precondition_op_elementContext(Op_elementContext ctx) { copyFrom(ctx); }
	}
	public static class Value_restriction_op_elementContext extends Op_elementContext {
		public Value_restriction_defContext value_restriction_def() {
			return getRuleContext(Value_restriction_defContext.class,0);
		}
		public Value_restriction_op_elementContext(Op_elementContext ctx) { copyFrom(ctx); }
	}
	public static class Delete_spatial_constraint_op_elementContext extends Op_elementContext {
		public Delete_spatial_constraint_defContext delete_spatial_constraint_def() {
			return getRuleContext(Delete_spatial_constraint_defContext.class,0);
		}
		public Delete_spatial_constraint_op_elementContext(Op_elementContext ctx) { copyFrom(ctx); }
	}
	public static class Integer_constraint_op_elementContext extends Op_elementContext {
		public Integer_constraint_defContext integer_constraint_def() {
			return getRuleContext(Integer_constraint_defContext.class,0);
		}
		public Integer_constraint_op_elementContext(Op_elementContext ctx) { copyFrom(ctx); }
	}
	public static class Negative_effect_def_op_elementContext extends Op_elementContext {
		public Negative_effect_defContext negative_effect_def() {
			return getRuleContext(Negative_effect_defContext.class,0);
		}
		public Negative_effect_def_op_elementContext(Op_elementContext ctx) { copyFrom(ctx); }
	}
	public static class Else_mdp_op_elementContext extends Op_elementContext {
		public Else_mdp_defContext else_mdp_def() {
			return getRuleContext(Else_mdp_defContext.class,0);
		}
		public Else_mdp_op_elementContext(Op_elementContext ctx) { copyFrom(ctx); }
	}
	public static class Temporal_constraint_op_elementContext extends Op_elementContext {
		public Temporal_constraint_defContext temporal_constraint_def() {
			return getRuleContext(Temporal_constraint_defContext.class,0);
		}
		public Temporal_constraint_op_elementContext(Op_elementContext ctx) { copyFrom(ctx); }
	}
	public static class Positive_effect_def_op_elementContext extends Op_elementContext {
		public Positive_effect_defContext positive_effect_def() {
			return getRuleContext(Positive_effect_defContext.class,0);
		}
		public Positive_effect_def_op_elementContext(Op_elementContext ctx) { copyFrom(ctx); }
	}
	public static class Notvalue_restriction_op_elementContext extends Op_elementContext {
		public Notvalue_restriction_defContext notvalue_restriction_def() {
			return getRuleContext(Notvalue_restriction_defContext.class,0);
		}
		public Notvalue_restriction_op_elementContext(Op_elementContext ctx) { copyFrom(ctx); }
	}
	public static class If_transition_mdp_op_elementContext extends Op_elementContext {
		public If_transition_mdp_defContext if_transition_mdp_def() {
			return getRuleContext(If_transition_mdp_defContext.class,0);
		}
		public If_transition_mdp_op_elementContext(Op_elementContext ctx) { copyFrom(ctx); }
	}
	public static class Resource_decrease_op_elementContext extends Op_elementContext {
		public Resource_decrease_defContext resource_decrease_def() {
			return getRuleContext(Resource_decrease_defContext.class,0);
		}
		public Resource_decrease_op_elementContext(Op_elementContext ctx) { copyFrom(ctx); }
	}
	public static class If_resource_increase_decrease_op_elementContext extends Op_elementContext {
		public If_resource_increase_decrease_defContext if_resource_increase_decrease_def() {
			return getRuleContext(If_resource_increase_decrease_defContext.class,0);
		}
		public If_resource_increase_decrease_op_elementContext(Op_elementContext ctx) { copyFrom(ctx); }
	}
	public static class Nottypevalue_restriction_op_elementContext extends Op_elementContext {
		public Nottypevalue_restriction_defContext nottypevalue_restriction_def() {
			return getRuleContext(Nottypevalue_restriction_defContext.class,0);
		}
		public Nottypevalue_restriction_op_elementContext(Op_elementContext ctx) { copyFrom(ctx); }
	}
	public static class Typevalue_restriction_op_elementContext extends Op_elementContext {
		public Typevalue_restriction_defContext typevalue_restriction_def() {
			return getRuleContext(Typevalue_restriction_defContext.class,0);
		}
		public Typevalue_restriction_op_elementContext(Op_elementContext ctx) { copyFrom(ctx); }
	}
	public static class Vardifferent_op_elementContext extends Op_elementContext {
		public Vardifferent_defContext vardifferent_def() {
			return getRuleContext(Vardifferent_defContext.class,0);
		}
		public Vardifferent_op_elementContext(Op_elementContext ctx) { copyFrom(ctx); }
	}
	public static class Mdp_reward_op_elementContext extends Op_elementContext {
		public Mdp_reward_defContext mdp_reward_def() {
			return getRuleContext(Mdp_reward_defContext.class,0);
		}
		public Mdp_reward_op_elementContext(Op_elementContext ctx) { copyFrom(ctx); }
	}
	public static class Spatial_constraint_op_elementContext extends Op_elementContext {
		public Spatial_constraint_defContext spatial_constraint_def() {
			return getRuleContext(Spatial_constraint_defContext.class,0);
		}
		public Spatial_constraint_op_elementContext(Op_elementContext ctx) { copyFrom(ctx); }
	}
	public static class Mdp_transitionprobability_op_elementContext extends Op_elementContext {
		public Mdp_transitionProbability_defContext mdp_transitionProbability_def() {
			return getRuleContext(Mdp_transitionProbability_defContext.class,0);
		}
		public Mdp_transitionprobability_op_elementContext(Op_elementContext ctx) { copyFrom(ctx); }
	}

	public final Op_elementContext op_element() throws RecognitionException {
		Op_elementContext _localctx = new Op_elementContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_op_element);
		try {
			setState(277);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				_localctx = new Precondition_op_elementContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(256);
				precondition_def();
				}
				break;
			case 2:
				_localctx = new Temporal_constraint_op_elementContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(257);
				temporal_constraint_def();
				}
				break;
			case 3:
				_localctx = new Positive_effect_def_op_elementContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(258);
				positive_effect_def();
				}
				break;
			case 4:
				_localctx = new Negative_effect_def_op_elementContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(259);
				negative_effect_def();
				}
				break;
			case 5:
				_localctx = new Resource_usage_op_elementContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(260);
				resource_usage_def();
				}
				break;
			case 6:
				_localctx = new Value_restriction_op_elementContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(261);
				value_restriction_def();
				}
				break;
			case 7:
				_localctx = new Notvalue_restriction_op_elementContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(262);
				notvalue_restriction_def();
				}
				break;
			case 8:
				_localctx = new Typevalue_restriction_op_elementContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(263);
				typevalue_restriction_def();
				}
				break;
			case 9:
				_localctx = new Nottypevalue_restriction_op_elementContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(264);
				nottypevalue_restriction_def();
				}
				break;
			case 10:
				_localctx = new Vardifferent_op_elementContext(_localctx);
				enterOuterAlt(_localctx, 10);
				{
				setState(265);
				vardifferent_def();
				}
				break;
			case 11:
				_localctx = new Integer_constraint_op_elementContext(_localctx);
				enterOuterAlt(_localctx, 11);
				{
				setState(266);
				integer_constraint_def();
				}
				break;
			case 12:
				_localctx = new Spatial_constraint_op_elementContext(_localctx);
				enterOuterAlt(_localctx, 12);
				{
				setState(267);
				spatial_constraint_def();
				}
				break;
			case 13:
				_localctx = new Delete_spatial_constraint_op_elementContext(_localctx);
				enterOuterAlt(_localctx, 13);
				{
				setState(268);
				delete_spatial_constraint_def();
				}
				break;
			case 14:
				_localctx = new Mdp_reward_op_elementContext(_localctx);
				enterOuterAlt(_localctx, 14);
				{
				setState(269);
				mdp_reward_def();
				}
				break;
			case 15:
				_localctx = new Mdp_transitionprobability_op_elementContext(_localctx);
				enterOuterAlt(_localctx, 15);
				{
				setState(270);
				mdp_transitionProbability_def();
				}
				break;
			case 16:
				_localctx = new If_mdp_op_elementContext(_localctx);
				enterOuterAlt(_localctx, 16);
				{
				setState(271);
				if_mdp_def();
				}
				break;
			case 17:
				_localctx = new Else_mdp_op_elementContext(_localctx);
				enterOuterAlt(_localctx, 17);
				{
				setState(272);
				else_mdp_def();
				}
				break;
			case 18:
				_localctx = new If_transition_mdp_op_elementContext(_localctx);
				enterOuterAlt(_localctx, 18);
				{
				setState(273);
				if_transition_mdp_def();
				}
				break;
			case 19:
				_localctx = new Resource_increase_op_elementContext(_localctx);
				enterOuterAlt(_localctx, 19);
				{
				setState(274);
				resource_increase_def();
				}
				break;
			case 20:
				_localctx = new Resource_decrease_op_elementContext(_localctx);
				enterOuterAlt(_localctx, 20);
				{
				setState(275);
				resource_decrease_def();
				}
				break;
			case 21:
				_localctx = new If_resource_increase_decrease_op_elementContext(_localctx);
				enterOuterAlt(_localctx, 21);
				{
				setState(276);
				if_resource_increase_decrease_def();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Precondition_defContext extends ParserRuleContext {
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public PredicateContext predicate() {
			return getRuleContext(PredicateContext.class,0);
		}
		public Precondition_defContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_precondition_def; }
	}

	public final Precondition_defContext precondition_def() throws RecognitionException {
		Precondition_defContext _localctx = new Precondition_defContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_precondition_def);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(279);
			match(T__11);
			setState(280);
			id();
			setState(281);
			predicate();
			setState(282);
			match(T__1);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Subtask_defContext extends ParserRuleContext {
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public PredicateContext predicate() {
			return getRuleContext(PredicateContext.class,0);
		}
		public Subtask_defContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_subtask_def; }
	}

	public final Subtask_defContext subtask_def() throws RecognitionException {
		Subtask_defContext _localctx = new Subtask_defContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_subtask_def);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(284);
			match(T__12);
			setState(285);
			id();
			setState(286);
			predicate();
			setState(287);
			match(T__1);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Positive_effect_defContext extends ParserRuleContext {
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public PredicateContext predicate() {
			return getRuleContext(PredicateContext.class,0);
		}
		public Positive_effect_defContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_positive_effect_def; }
	}

	public final Positive_effect_defContext positive_effect_def() throws RecognitionException {
		Positive_effect_defContext _localctx = new Positive_effect_defContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_positive_effect_def);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(289);
			match(T__13);
			setState(290);
			id();
			setState(291);
			predicate();
			setState(292);
			match(T__1);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Negative_effect_defContext extends ParserRuleContext {
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public Negative_effect_defContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_negative_effect_def; }
	}

	public final Negative_effect_defContext negative_effect_def() throws RecognitionException {
		Negative_effect_defContext _localctx = new Negative_effect_defContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_negative_effect_def);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(294);
			match(T__14);
			setState(295);
			id();
			setState(296);
			match(T__1);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Ordering_constraint_defContext extends ParserRuleContext {
		public List<IdContext> id() {
			return getRuleContexts(IdContext.class);
		}
		public IdContext id(int i) {
			return getRuleContext(IdContext.class,i);
		}
		public Ordering_constraint_defContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ordering_constraint_def; }
	}

	public final Ordering_constraint_defContext ordering_constraint_def() throws RecognitionException {
		Ordering_constraint_defContext _localctx = new Ordering_constraint_defContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_ordering_constraint_def);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(298);
			match(T__15);
			setState(299);
			id();
			setState(300);
			id();
			setState(301);
			match(T__1);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Spatial_constraint_defContext extends ParserRuleContext {
		public Spatial_constraint1_defContext spatial_constraint1_def() {
			return getRuleContext(Spatial_constraint1_defContext.class,0);
		}
		public Spatial_constraint2_defContext spatial_constraint2_def() {
			return getRuleContext(Spatial_constraint2_defContext.class,0);
		}
		public Spatial_constraint_defContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_spatial_constraint_def; }
	}

	public final Spatial_constraint_defContext spatial_constraint_def() throws RecognitionException {
		Spatial_constraint_defContext _localctx = new Spatial_constraint_defContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_spatial_constraint_def);
		try {
			setState(305);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(303);
				spatial_constraint1_def();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(304);
				spatial_constraint2_def();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Spatial_constraint1_defContext extends ParserRuleContext {
		public List<Binary_temporal_constraint_typeContext> binary_temporal_constraint_type() {
			return getRuleContexts(Binary_temporal_constraint_typeContext.class);
		}
		public Binary_temporal_constraint_typeContext binary_temporal_constraint_type(int i) {
			return getRuleContext(Binary_temporal_constraint_typeContext.class,i);
		}
		public List<TerminalNode> VAR_NAME() { return getTokens(ChimpClassicParser.VAR_NAME); }
		public TerminalNode VAR_NAME(int i) {
			return getToken(ChimpClassicParser.VAR_NAME, i);
		}
		public Spatial_constraint1_defContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_spatial_constraint1_def; }
	}

	public final Spatial_constraint1_defContext spatial_constraint1_def() throws RecognitionException {
		Spatial_constraint1_defContext _localctx = new Spatial_constraint1_defContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_spatial_constraint1_def);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(307);
			match(T__16);
			setState(308);
			match(T__10);
			setState(309);
			binary_temporal_constraint_type();
			setState(310);
			match(T__17);
			setState(311);
			binary_temporal_constraint_type();
			setState(312);
			match(T__1);
			setState(313);
			match(T__10);
			setState(314);
			match(VAR_NAME);
			setState(315);
			match(T__17);
			setState(316);
			match(VAR_NAME);
			setState(317);
			match(T__1);
			setState(318);
			match(T__1);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Spatial_constraint2_defContext extends ParserRuleContext {
		public List<TerminalNode> VAR_NAME() { return getTokens(ChimpClassicParser.VAR_NAME); }
		public TerminalNode VAR_NAME(int i) {
			return getToken(ChimpClassicParser.VAR_NAME, i);
		}
		public Integer_operator1Context integer_operator1() {
			return getRuleContext(Integer_operator1Context.class,0);
		}
		public Integer_operator2Context integer_operator2() {
			return getRuleContext(Integer_operator2Context.class,0);
		}
		public Var_or_intContext var_or_int() {
			return getRuleContext(Var_or_intContext.class,0);
		}
		public Spatial_constraint2_defContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_spatial_constraint2_def; }
	}

	public final Spatial_constraint2_defContext spatial_constraint2_def() throws RecognitionException {
		Spatial_constraint2_defContext _localctx = new Spatial_constraint2_defContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_spatial_constraint2_def);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(320);
			match(T__16);
			setState(321);
			match(VAR_NAME);
			setState(322);
			integer_operator1();
			setState(323);
			match(VAR_NAME);
			setState(324);
			integer_operator2();
			setState(325);
			var_or_int();
			setState(326);
			match(T__1);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Delete_spatial_constraint_defContext extends ParserRuleContext {
		public Delete_spatial_constraint1_defContext delete_spatial_constraint1_def() {
			return getRuleContext(Delete_spatial_constraint1_defContext.class,0);
		}
		public Delete_spatial_constraint2_defContext delete_spatial_constraint2_def() {
			return getRuleContext(Delete_spatial_constraint2_defContext.class,0);
		}
		public Delete_spatial_constraint_defContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_delete_spatial_constraint_def; }
	}

	public final Delete_spatial_constraint_defContext delete_spatial_constraint_def() throws RecognitionException {
		Delete_spatial_constraint_defContext _localctx = new Delete_spatial_constraint_defContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_delete_spatial_constraint_def);
		try {
			setState(330);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(328);
				delete_spatial_constraint1_def();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(329);
				delete_spatial_constraint2_def();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Delete_spatial_constraint1_defContext extends ParserRuleContext {
		public Unary_spatial_constraint_typeContext unary_spatial_constraint_type() {
			return getRuleContext(Unary_spatial_constraint_typeContext.class,0);
		}
		public TerminalNode VAR_NAME() { return getToken(ChimpClassicParser.VAR_NAME, 0); }
		public Delete_spatial_constraint1_defContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_delete_spatial_constraint1_def; }
	}

	public final Delete_spatial_constraint1_defContext delete_spatial_constraint1_def() throws RecognitionException {
		Delete_spatial_constraint1_defContext _localctx = new Delete_spatial_constraint1_defContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_delete_spatial_constraint1_def);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(332);
			match(T__18);
			setState(333);
			match(T__10);
			setState(334);
			unary_spatial_constraint_type();
			setState(335);
			match(T__1);
			setState(336);
			match(T__10);
			setState(337);
			match(VAR_NAME);
			setState(338);
			match(T__1);
			setState(339);
			match(T__1);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Delete_spatial_constraint2_defContext extends ParserRuleContext {
		public List<TerminalNode> VAR_NAME() { return getTokens(ChimpClassicParser.VAR_NAME); }
		public TerminalNode VAR_NAME(int i) {
			return getToken(ChimpClassicParser.VAR_NAME, i);
		}
		public Delete_spatial_constraint2_defContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_delete_spatial_constraint2_def; }
	}

	public final Delete_spatial_constraint2_defContext delete_spatial_constraint2_def() throws RecognitionException {
		Delete_spatial_constraint2_defContext _localctx = new Delete_spatial_constraint2_defContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_delete_spatial_constraint2_def);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(341);
			match(T__18);
			setState(342);
			match(T__10);
			setState(343);
			match(VAR_NAME);
			setState(344);
			match(T__17);
			setState(345);
			match(VAR_NAME);
			setState(346);
			match(T__1);
			setState(347);
			match(T__1);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Integer_constraint_defContext extends ParserRuleContext {
		public Integer_constraint1_defContext integer_constraint1_def() {
			return getRuleContext(Integer_constraint1_defContext.class,0);
		}
		public Integer_constraint2_defContext integer_constraint2_def() {
			return getRuleContext(Integer_constraint2_defContext.class,0);
		}
		public Integer_constraint_defContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_integer_constraint_def; }
	}

	public final Integer_constraint_defContext integer_constraint_def() throws RecognitionException {
		Integer_constraint_defContext _localctx = new Integer_constraint_defContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_integer_constraint_def);
		try {
			setState(351);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(349);
				integer_constraint1_def();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(350);
				integer_constraint2_def();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Integer_constraint1_defContext extends ParserRuleContext {
		public TerminalNode VAR_NAME() { return getToken(ChimpClassicParser.VAR_NAME, 0); }
		public Integer_operator1Context integer_operator1() {
			return getRuleContext(Integer_operator1Context.class,0);
		}
		public Var_or_intContext var_or_int() {
			return getRuleContext(Var_or_intContext.class,0);
		}
		public Integer_constraint1_defContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_integer_constraint1_def; }
	}

	public final Integer_constraint1_defContext integer_constraint1_def() throws RecognitionException {
		Integer_constraint1_defContext _localctx = new Integer_constraint1_defContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_integer_constraint1_def);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(353);
			match(T__19);
			setState(354);
			match(VAR_NAME);
			setState(355);
			integer_operator1();
			setState(356);
			var_or_int();
			setState(357);
			match(T__1);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Integer_constraint2_defContext extends ParserRuleContext {
		public List<TerminalNode> VAR_NAME() { return getTokens(ChimpClassicParser.VAR_NAME); }
		public TerminalNode VAR_NAME(int i) {
			return getToken(ChimpClassicParser.VAR_NAME, i);
		}
		public Integer_operator1Context integer_operator1() {
			return getRuleContext(Integer_operator1Context.class,0);
		}
		public Integer_operator2Context integer_operator2() {
			return getRuleContext(Integer_operator2Context.class,0);
		}
		public Var_or_intContext var_or_int() {
			return getRuleContext(Var_or_intContext.class,0);
		}
		public Integer_constraint2_defContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_integer_constraint2_def; }
	}

	public final Integer_constraint2_defContext integer_constraint2_def() throws RecognitionException {
		Integer_constraint2_defContext _localctx = new Integer_constraint2_defContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_integer_constraint2_def);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(359);
			match(T__19);
			setState(360);
			match(VAR_NAME);
			setState(361);
			integer_operator1();
			setState(362);
			match(VAR_NAME);
			setState(363);
			integer_operator2();
			setState(364);
			var_or_int();
			setState(365);
			match(T__1);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Integer_operator1Context extends ParserRuleContext {
		public Integer_operator1Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_integer_operator1; }
	}

	public final Integer_operator1Context integer_operator1() throws RecognitionException {
		Integer_operator1Context _localctx = new Integer_operator1Context(_ctx, getState());
		enterRule(_localctx, 60, RULE_integer_operator1);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(367);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__20) | (1L << T__21) | (1L << T__22) | (1L << T__23) | (1L << T__24) | (1L << T__25))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Integer_operator2Context extends ParserRuleContext {
		public TerminalNode MINUS() { return getToken(ChimpClassicParser.MINUS, 0); }
		public Integer_operator2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_integer_operator2; }
	}

	public final Integer_operator2Context integer_operator2() throws RecognitionException {
		Integer_operator2Context _localctx = new Integer_operator2Context(_ctx, getState());
		enterRule(_localctx, 62, RULE_integer_operator2);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(369);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__20) | (1L << T__21) | (1L << T__22) | (1L << T__23) | (1L << T__24) | (1L << T__25) | (1L << T__26) | (1L << T__27) | (1L << T__28))) != 0) || _la==MINUS) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Temporal_constraint_defContext extends ParserRuleContext {
		public Unary_temporal_constraint_defContext unary_temporal_constraint_def() {
			return getRuleContext(Unary_temporal_constraint_defContext.class,0);
		}
		public Binary_temporal_constraint_defContext binary_temporal_constraint_def() {
			return getRuleContext(Binary_temporal_constraint_defContext.class,0);
		}
		public Temporal_constraint_defContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_temporal_constraint_def; }
	}

	public final Temporal_constraint_defContext temporal_constraint_def() throws RecognitionException {
		Temporal_constraint_defContext _localctx = new Temporal_constraint_defContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_temporal_constraint_def);
		try {
			setState(373);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__29:
			case T__30:
			case T__31:
			case T__32:
			case T__33:
				enterOuterAlt(_localctx, 1);
				{
				setState(371);
				unary_temporal_constraint_def();
				}
				break;
			case T__34:
				enterOuterAlt(_localctx, 2);
				{
				setState(372);
				binary_temporal_constraint_def();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Unary_temporal_constraint_defContext extends ParserRuleContext {
		public Unary_temporal_constraint_typeContext unary_temporal_constraint_type() {
			return getRuleContext(Unary_temporal_constraint_typeContext.class,0);
		}
		public Bounds_listContext bounds_list() {
			return getRuleContext(Bounds_listContext.class,0);
		}
		public Id_or_taskContext id_or_task() {
			return getRuleContext(Id_or_taskContext.class,0);
		}
		public Unary_temporal_constraint_defContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unary_temporal_constraint_def; }
	}

	public final Unary_temporal_constraint_defContext unary_temporal_constraint_def() throws RecognitionException {
		Unary_temporal_constraint_defContext _localctx = new Unary_temporal_constraint_defContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_unary_temporal_constraint_def);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(375);
			unary_temporal_constraint_type();
			setState(376);
			bounds_list();
			setState(377);
			match(T__10);
			setState(378);
			id_or_task();
			setState(379);
			match(T__1);
			setState(380);
			match(T__1);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Unary_temporal_constraint_typeContext extends ParserRuleContext {
		public Unary_temporal_constraint_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unary_temporal_constraint_type; }
	}

	public final Unary_temporal_constraint_typeContext unary_temporal_constraint_type() throws RecognitionException {
		Unary_temporal_constraint_typeContext _localctx = new Unary_temporal_constraint_typeContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_unary_temporal_constraint_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(382);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__29) | (1L << T__30) | (1L << T__31) | (1L << T__32) | (1L << T__33))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Binary_temporal_constraint_defContext extends ParserRuleContext {
		public Binary_temporal_constraint_typeContext binary_temporal_constraint_type() {
			return getRuleContext(Binary_temporal_constraint_typeContext.class,0);
		}
		public Bounds_listContext bounds_list() {
			return getRuleContext(Bounds_listContext.class,0);
		}
		public List<Id_or_taskContext> id_or_task() {
			return getRuleContexts(Id_or_taskContext.class);
		}
		public Id_or_taskContext id_or_task(int i) {
			return getRuleContext(Id_or_taskContext.class,i);
		}
		public Binary_temporal_constraint_defContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_binary_temporal_constraint_def; }
	}

	public final Binary_temporal_constraint_defContext binary_temporal_constraint_def() throws RecognitionException {
		Binary_temporal_constraint_defContext _localctx = new Binary_temporal_constraint_defContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_binary_temporal_constraint_def);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(384);
			match(T__34);
			setState(385);
			binary_temporal_constraint_type();
			setState(386);
			bounds_list();
			setState(387);
			match(T__10);
			setState(388);
			id_or_task();
			setState(389);
			match(T__17);
			setState(390);
			id_or_task();
			setState(391);
			match(T__1);
			setState(392);
			match(T__1);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Binary_temporal_constraint_typeContext extends ParserRuleContext {
		public Binary_temporal_constraint_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_binary_temporal_constraint_type; }
	}

	public final Binary_temporal_constraint_typeContext binary_temporal_constraint_type() throws RecognitionException {
		Binary_temporal_constraint_typeContext _localctx = new Binary_temporal_constraint_typeContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_binary_temporal_constraint_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(394);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__35) | (1L << T__36) | (1L << T__37) | (1L << T__38) | (1L << T__39) | (1L << T__40) | (1L << T__41) | (1L << T__42) | (1L << T__43) | (1L << T__44) | (1L << T__45) | (1L << T__46) | (1L << T__47) | (1L << T__48) | (1L << T__49) | (1L << T__50) | (1L << T__51) | (1L << T__52) | (1L << T__53) | (1L << T__54) | (1L << T__55) | (1L << T__56) | (1L << T__57) | (1L << T__58) | (1L << T__59) | (1L << T__60) | (1L << T__61) | (1L << T__62))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Unary_spatial_constraint_typeContext extends ParserRuleContext {
		public Unary_spatial_constraint_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unary_spatial_constraint_type; }
	}

	public final Unary_spatial_constraint_typeContext unary_spatial_constraint_type() throws RecognitionException {
		Unary_spatial_constraint_typeContext _localctx = new Unary_spatial_constraint_typeContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_unary_spatial_constraint_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(396);
			_la = _input.LA(1);
			if ( !(_la==T__63 || _la==T__64) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Bounds_listContext extends ParserRuleContext {
		public List<BoundsContext> bounds() {
			return getRuleContexts(BoundsContext.class);
		}
		public BoundsContext bounds(int i) {
			return getRuleContext(BoundsContext.class,i);
		}
		public Bounds_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bounds_list; }
	}

	public final Bounds_listContext bounds_list() throws RecognitionException {
		Bounds_listContext _localctx = new Bounds_listContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_bounds_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(401);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__65) {
				{
				{
				setState(398);
				bounds();
				}
				}
				setState(403);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BoundsContext extends ParserRuleContext {
		public List<BoundContext> bound() {
			return getRuleContexts(BoundContext.class);
		}
		public BoundContext bound(int i) {
			return getRuleContext(BoundContext.class,i);
		}
		public BoundsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bounds; }
	}

	public final BoundsContext bounds() throws RecognitionException {
		BoundsContext _localctx = new BoundsContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_bounds);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(404);
			match(T__65);
			setState(405);
			bound();
			setState(406);
			match(T__17);
			setState(407);
			bound();
			setState(408);
			match(T__66);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BoundContext extends ParserRuleContext {
		public TerminalNode NUMBER() { return getToken(ChimpClassicParser.NUMBER, 0); }
		public BoundContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bound; }
	}

	public final BoundContext bound() throws RecognitionException {
		BoundContext _localctx = new BoundContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_bound);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(410);
			_la = _input.LA(1);
			if ( !(_la==T__67 || _la==NUMBER) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Id_or_taskContext extends ParserRuleContext {
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public Id_or_taskContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_id_or_task; }
	}

	public final Id_or_taskContext id_or_task() throws RecognitionException {
		Id_or_taskContext _localctx = new Id_or_taskContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_id_or_task);
		try {
			setState(414);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NAME:
				enterOuterAlt(_localctx, 1);
				{
				setState(412);
				id();
				}
				break;
			case T__68:
				enterOuterAlt(_localctx, 2);
				{
				setState(413);
				match(T__68);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Mdp_reward_defContext extends ParserRuleContext {
		public Double_or_intContext double_or_int() {
			return getRuleContext(Double_or_intContext.class,0);
		}
		public Mdp_reward_defContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mdp_reward_def; }
	}

	public final Mdp_reward_defContext mdp_reward_def() throws RecognitionException {
		Mdp_reward_defContext _localctx = new Mdp_reward_defContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_mdp_reward_def);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(416);
			match(T__69);
			setState(417);
			double_or_int();
			setState(418);
			match(T__1);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Mdp_transitionProbability_defContext extends ParserRuleContext {
		public Double_or_intContext double_or_int() {
			return getRuleContext(Double_or_intContext.class,0);
		}
		public Mdp_transitionProbability_defContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mdp_transitionProbability_def; }
	}

	public final Mdp_transitionProbability_defContext mdp_transitionProbability_def() throws RecognitionException {
		Mdp_transitionProbability_defContext _localctx = new Mdp_transitionProbability_defContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_mdp_transitionProbability_def);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(420);
			match(T__70);
			setState(421);
			double_or_int();
			setState(422);
			match(T__1);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class If_mdp_defContext extends ParserRuleContext {
		public If_reward_mdp_defContext if_reward_mdp_def() {
			return getRuleContext(If_reward_mdp_defContext.class,0);
		}
		public If_transition_mdp_defContext if_transition_mdp_def() {
			return getRuleContext(If_transition_mdp_defContext.class,0);
		}
		public If_reward_transition_mdp_defContext if_reward_transition_mdp_def() {
			return getRuleContext(If_reward_transition_mdp_defContext.class,0);
		}
		public If_mdp_defContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_if_mdp_def; }
	}

	public final If_mdp_defContext if_mdp_def() throws RecognitionException {
		If_mdp_defContext _localctx = new If_mdp_defContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_if_mdp_def);
		try {
			setState(427);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(424);
				if_reward_mdp_def();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(425);
				if_transition_mdp_def();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(426);
				if_reward_transition_mdp_def();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class If_reward_mdp_defContext extends ParserRuleContext {
		public Value_restriction_defContext value_restriction_def() {
			return getRuleContext(Value_restriction_defContext.class,0);
		}
		public Mdp_reward_defContext mdp_reward_def() {
			return getRuleContext(Mdp_reward_defContext.class,0);
		}
		public If_reward_mdp_defContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_if_reward_mdp_def; }
	}

	public final If_reward_mdp_defContext if_reward_mdp_def() throws RecognitionException {
		If_reward_mdp_defContext _localctx = new If_reward_mdp_defContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_if_reward_mdp_def);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(429);
			match(T__71);
			setState(430);
			value_restriction_def();
			setState(431);
			mdp_reward_def();
			setState(432);
			match(T__1);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class If_transition_mdp_defContext extends ParserRuleContext {
		public Value_restriction_defContext value_restriction_def() {
			return getRuleContext(Value_restriction_defContext.class,0);
		}
		public Mdp_transitionProbability_defContext mdp_transitionProbability_def() {
			return getRuleContext(Mdp_transitionProbability_defContext.class,0);
		}
		public If_transition_mdp_defContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_if_transition_mdp_def; }
	}

	public final If_transition_mdp_defContext if_transition_mdp_def() throws RecognitionException {
		If_transition_mdp_defContext _localctx = new If_transition_mdp_defContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_if_transition_mdp_def);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(434);
			match(T__71);
			setState(435);
			value_restriction_def();
			setState(436);
			mdp_transitionProbability_def();
			setState(437);
			match(T__1);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class If_reward_transition_mdp_defContext extends ParserRuleContext {
		public Value_restriction_defContext value_restriction_def() {
			return getRuleContext(Value_restriction_defContext.class,0);
		}
		public Mdp_reward_defContext mdp_reward_def() {
			return getRuleContext(Mdp_reward_defContext.class,0);
		}
		public Mdp_transitionProbability_defContext mdp_transitionProbability_def() {
			return getRuleContext(Mdp_transitionProbability_defContext.class,0);
		}
		public If_reward_transition_mdp_defContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_if_reward_transition_mdp_def; }
	}

	public final If_reward_transition_mdp_defContext if_reward_transition_mdp_def() throws RecognitionException {
		If_reward_transition_mdp_defContext _localctx = new If_reward_transition_mdp_defContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_if_reward_transition_mdp_def);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(439);
			match(T__71);
			setState(440);
			value_restriction_def();
			setState(441);
			mdp_reward_def();
			setState(442);
			mdp_transitionProbability_def();
			setState(443);
			match(T__1);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class If_resource_increase_decrease_defContext extends ParserRuleContext {
		public If_resource_increase_defContext if_resource_increase_def() {
			return getRuleContext(If_resource_increase_defContext.class,0);
		}
		public If_resource_decrease_defContext if_resource_decrease_def() {
			return getRuleContext(If_resource_decrease_defContext.class,0);
		}
		public If_resource_increase_decrease_defContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_if_resource_increase_decrease_def; }
	}

	public final If_resource_increase_decrease_defContext if_resource_increase_decrease_def() throws RecognitionException {
		If_resource_increase_decrease_defContext _localctx = new If_resource_increase_decrease_defContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_if_resource_increase_decrease_def);
		try {
			setState(447);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(445);
				if_resource_increase_def();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(446);
				if_resource_decrease_def();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class If_resource_increase_defContext extends ParserRuleContext {
		public Value_restriction_defContext value_restriction_def() {
			return getRuleContext(Value_restriction_defContext.class,0);
		}
		public Resource_increase_defContext resource_increase_def() {
			return getRuleContext(Resource_increase_defContext.class,0);
		}
		public If_resource_increase_defContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_if_resource_increase_def; }
	}

	public final If_resource_increase_defContext if_resource_increase_def() throws RecognitionException {
		If_resource_increase_defContext _localctx = new If_resource_increase_defContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_if_resource_increase_def);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(449);
			match(T__71);
			setState(450);
			value_restriction_def();
			setState(451);
			resource_increase_def();
			setState(452);
			match(T__1);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class If_resource_decrease_defContext extends ParserRuleContext {
		public Value_restriction_defContext value_restriction_def() {
			return getRuleContext(Value_restriction_defContext.class,0);
		}
		public Resource_decrease_defContext resource_decrease_def() {
			return getRuleContext(Resource_decrease_defContext.class,0);
		}
		public If_resource_decrease_defContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_if_resource_decrease_def; }
	}

	public final If_resource_decrease_defContext if_resource_decrease_def() throws RecognitionException {
		If_resource_decrease_defContext _localctx = new If_resource_decrease_defContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_if_resource_decrease_def);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(454);
			match(T__71);
			setState(455);
			value_restriction_def();
			setState(456);
			resource_decrease_def();
			setState(457);
			match(T__1);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Else_mdp_defContext extends ParserRuleContext {
		public Mdp_reward_defContext mdp_reward_def() {
			return getRuleContext(Mdp_reward_defContext.class,0);
		}
		public Mdp_transitionProbability_defContext mdp_transitionProbability_def() {
			return getRuleContext(Mdp_transitionProbability_defContext.class,0);
		}
		public Else_mdp_defContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_else_mdp_def; }
	}

	public final Else_mdp_defContext else_mdp_def() throws RecognitionException {
		Else_mdp_defContext _localctx = new Else_mdp_defContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_else_mdp_def);
		try {
			setState(472);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(459);
				match(T__72);
				setState(460);
				mdp_reward_def();
				setState(461);
				match(T__1);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(463);
				match(T__72);
				setState(464);
				mdp_transitionProbability_def();
				setState(465);
				match(T__1);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(467);
				match(T__72);
				setState(468);
				mdp_reward_def();
				setState(469);
				mdp_transitionProbability_def();
				setState(470);
				match(T__1);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Resource_increase_defContext extends ParserRuleContext {
		public TerminalNode NAME() { return getToken(ChimpClassicParser.NAME, 0); }
		public TerminalNode NUMBER() { return getToken(ChimpClassicParser.NUMBER, 0); }
		public Resource_increase_defContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_resource_increase_def; }
	}

	public final Resource_increase_defContext resource_increase_def() throws RecognitionException {
		Resource_increase_defContext _localctx = new Resource_increase_defContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_resource_increase_def);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(474);
			match(T__73);
			setState(475);
			match(NAME);
			setState(476);
			match(NUMBER);
			setState(477);
			match(T__1);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Resource_decrease_defContext extends ParserRuleContext {
		public TerminalNode NAME() { return getToken(ChimpClassicParser.NAME, 0); }
		public TerminalNode NUMBER() { return getToken(ChimpClassicParser.NUMBER, 0); }
		public Resource_decrease_defContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_resource_decrease_def; }
	}

	public final Resource_decrease_defContext resource_decrease_def() throws RecognitionException {
		Resource_decrease_defContext _localctx = new Resource_decrease_defContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_resource_decrease_def);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(479);
			match(T__74);
			setState(480);
			match(NAME);
			setState(481);
			match(NUMBER);
			setState(482);
			match(T__1);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Resource_usage_defContext extends ParserRuleContext {
		public TerminalNode NAME() { return getToken(ChimpClassicParser.NAME, 0); }
		public TerminalNode NUMBER() { return getToken(ChimpClassicParser.NUMBER, 0); }
		public Usage_defContext usage_def() {
			return getRuleContext(Usage_defContext.class,0);
		}
		public List<Param_itemContext> param_item() {
			return getRuleContexts(Param_itemContext.class);
		}
		public Param_itemContext param_item(int i) {
			return getRuleContext(Param_itemContext.class,i);
		}
		public Resource_usage_defContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_resource_usage_def; }
	}

	public final Resource_usage_defContext resource_usage_def() throws RecognitionException {
		Resource_usage_defContext _localctx = new Resource_usage_defContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_resource_usage_def);
		int _la;
		try {
			setState(498);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(484);
				match(T__75);
				setState(485);
				match(NAME);
				setState(486);
				match(NUMBER);
				setState(487);
				match(T__1);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(488);
				match(T__75);
				setState(489);
				usage_def();
				setState(493);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__79) {
					{
					{
					setState(490);
					param_item();
					}
					}
					setState(495);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(496);
				match(T__1);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Fluentresourceusage_defContext extends ParserRuleContext {
		public Usage_defContext usage_def() {
			return getRuleContext(Usage_defContext.class,0);
		}
		public Fluent_defContext fluent_def() {
			return getRuleContext(Fluent_defContext.class,0);
		}
		public List<Param_itemContext> param_item() {
			return getRuleContexts(Param_itemContext.class);
		}
		public Param_itemContext param_item(int i) {
			return getRuleContext(Param_itemContext.class,i);
		}
		public Fluentresourceusage_defContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fluentresourceusage_def; }
	}

	public final Fluentresourceusage_defContext fluentresourceusage_def() throws RecognitionException {
		Fluentresourceusage_defContext _localctx = new Fluentresourceusage_defContext(_ctx, getState());
		enterRule(_localctx, 110, RULE_fluentresourceusage_def);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(500);
			match(T__76);
			setState(501);
			usage_def();
			setState(502);
			fluent_def();
			setState(506);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__79) {
				{
				{
				setState(503);
				param_item();
				}
				}
				setState(508);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(509);
			match(T__1);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Fluent_defContext extends ParserRuleContext {
		public TerminalNode NAME() { return getToken(ChimpClassicParser.NAME, 0); }
		public Fluent_defContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fluent_def; }
	}

	public final Fluent_defContext fluent_def() throws RecognitionException {
		Fluent_defContext _localctx = new Fluent_defContext(_ctx, getState());
		enterRule(_localctx, 112, RULE_fluent_def);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(511);
			match(T__77);
			setState(512);
			match(NAME);
			setState(513);
			match(T__1);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Usage_defContext extends ParserRuleContext {
		public TerminalNode NAME() { return getToken(ChimpClassicParser.NAME, 0); }
		public TerminalNode NUMBER() { return getToken(ChimpClassicParser.NUMBER, 0); }
		public Usage_defContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_usage_def; }
	}

	public final Usage_defContext usage_def() throws RecognitionException {
		Usage_defContext _localctx = new Usage_defContext(_ctx, getState());
		enterRule(_localctx, 114, RULE_usage_def);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(515);
			match(T__78);
			setState(516);
			match(NAME);
			setState(517);
			match(NUMBER);
			setState(518);
			match(T__1);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Param_itemContext extends ParserRuleContext {
		public TerminalNode NUMBER() { return getToken(ChimpClassicParser.NUMBER, 0); }
		public TerminalNode NAME() { return getToken(ChimpClassicParser.NAME, 0); }
		public Param_itemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_param_item; }
	}

	public final Param_itemContext param_item() throws RecognitionException {
		Param_itemContext _localctx = new Param_itemContext(_ctx, getState());
		enterRule(_localctx, 116, RULE_param_item);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(520);
			match(T__79);
			setState(521);
			match(NUMBER);
			setState(522);
			match(NAME);
			setState(523);
			match(T__1);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Value_restriction_defContext extends ParserRuleContext {
		public TerminalNode VAR_NAME() { return getToken(ChimpClassicParser.VAR_NAME, 0); }
		public Constant_listContext constant_list() {
			return getRuleContext(Constant_listContext.class,0);
		}
		public Value_restriction_defContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_value_restriction_def; }
	}

	public final Value_restriction_defContext value_restriction_def() throws RecognitionException {
		Value_restriction_defContext _localctx = new Value_restriction_defContext(_ctx, getState());
		enterRule(_localctx, 118, RULE_value_restriction_def);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(525);
			match(T__80);
			setState(526);
			match(VAR_NAME);
			setState(527);
			constant_list();
			setState(528);
			match(T__1);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Notvalue_restriction_defContext extends ParserRuleContext {
		public TerminalNode VAR_NAME() { return getToken(ChimpClassicParser.VAR_NAME, 0); }
		public Constant_listContext constant_list() {
			return getRuleContext(Constant_listContext.class,0);
		}
		public Notvalue_restriction_defContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_notvalue_restriction_def; }
	}

	public final Notvalue_restriction_defContext notvalue_restriction_def() throws RecognitionException {
		Notvalue_restriction_defContext _localctx = new Notvalue_restriction_defContext(_ctx, getState());
		enterRule(_localctx, 120, RULE_notvalue_restriction_def);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(530);
			match(T__81);
			setState(531);
			match(VAR_NAME);
			setState(532);
			constant_list();
			setState(533);
			match(T__1);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Typevalue_restriction_defContext extends ParserRuleContext {
		public TerminalNode VAR_NAME() { return getToken(ChimpClassicParser.VAR_NAME, 0); }
		public Constant_listContext constant_list() {
			return getRuleContext(Constant_listContext.class,0);
		}
		public Typevalue_restriction_defContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typevalue_restriction_def; }
	}

	public final Typevalue_restriction_defContext typevalue_restriction_def() throws RecognitionException {
		Typevalue_restriction_defContext _localctx = new Typevalue_restriction_defContext(_ctx, getState());
		enterRule(_localctx, 122, RULE_typevalue_restriction_def);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(535);
			match(T__82);
			setState(536);
			match(VAR_NAME);
			setState(537);
			constant_list();
			setState(538);
			match(T__1);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Nottypevalue_restriction_defContext extends ParserRuleContext {
		public TerminalNode VAR_NAME() { return getToken(ChimpClassicParser.VAR_NAME, 0); }
		public Constant_listContext constant_list() {
			return getRuleContext(Constant_listContext.class,0);
		}
		public Nottypevalue_restriction_defContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nottypevalue_restriction_def; }
	}

	public final Nottypevalue_restriction_defContext nottypevalue_restriction_def() throws RecognitionException {
		Nottypevalue_restriction_defContext _localctx = new Nottypevalue_restriction_defContext(_ctx, getState());
		enterRule(_localctx, 124, RULE_nottypevalue_restriction_def);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(540);
			match(T__83);
			setState(541);
			match(VAR_NAME);
			setState(542);
			constant_list();
			setState(543);
			match(T__1);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Vardifferent_defContext extends ParserRuleContext {
		public List<TerminalNode> VAR_NAME() { return getTokens(ChimpClassicParser.VAR_NAME); }
		public TerminalNode VAR_NAME(int i) {
			return getToken(ChimpClassicParser.VAR_NAME, i);
		}
		public Vardifferent_defContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_vardifferent_def; }
	}

	public final Vardifferent_defContext vardifferent_def() throws RecognitionException {
		Vardifferent_defContext _localctx = new Vardifferent_defContext(_ctx, getState());
		enterRule(_localctx, 126, RULE_vardifferent_def);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(545);
			match(T__84);
			setState(546);
			match(VAR_NAME);
			setState(547);
			match(VAR_NAME);
			setState(548);
			match(T__1);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Constant_listContext extends ParserRuleContext {
		public List<TerminalNode> NAME() { return getTokens(ChimpClassicParser.NAME); }
		public TerminalNode NAME(int i) {
			return getToken(ChimpClassicParser.NAME, i);
		}
		public Constant_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constant_list; }
	}

	public final Constant_listContext constant_list() throws RecognitionException {
		Constant_listContext _localctx = new Constant_listContext(_ctx, getState());
		enterRule(_localctx, 128, RULE_constant_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(551); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(550);
				match(NAME);
				}
				}
				setState(553); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==NAME );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PredicateContext extends ParserRuleContext {
		public TerminalNode NAME() { return getToken(ChimpClassicParser.NAME, 0); }
		public Predicate_argsContext predicate_args() {
			return getRuleContext(Predicate_argsContext.class,0);
		}
		public Int_args_defContext int_args_def() {
			return getRuleContext(Int_args_defContext.class,0);
		}
		public PredicateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_predicate; }
	}

	public final PredicateContext predicate() throws RecognitionException {
		PredicateContext _localctx = new PredicateContext(_ctx, getState());
		enterRule(_localctx, 130, RULE_predicate);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(555);
			match(NAME);
			setState(556);
			match(T__10);
			setState(557);
			predicate_args();
			setState(558);
			match(T__1);
			setState(560);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__10) {
				{
				setState(559);
				int_args_def();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Predicate_argsContext extends ParserRuleContext {
		public List<Var_or_constContext> var_or_const() {
			return getRuleContexts(Var_or_constContext.class);
		}
		public Var_or_constContext var_or_const(int i) {
			return getRuleContext(Var_or_constContext.class,i);
		}
		public Predicate_argsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_predicate_args; }
	}

	public final Predicate_argsContext predicate_args() throws RecognitionException {
		Predicate_argsContext _localctx = new Predicate_argsContext(_ctx, getState());
		enterRule(_localctx, 132, RULE_predicate_args);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(565);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==VAR_NAME || _la==NAME) {
				{
				{
				setState(562);
				var_or_const();
				}
				}
				setState(567);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Int_argsContext extends ParserRuleContext {
		public List<Var_or_intContext> var_or_int() {
			return getRuleContexts(Var_or_intContext.class);
		}
		public Var_or_intContext var_or_int(int i) {
			return getRuleContext(Var_or_intContext.class,i);
		}
		public Int_argsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_int_args; }
	}

	public final Int_argsContext int_args() throws RecognitionException {
		Int_argsContext _localctx = new Int_argsContext(_ctx, getState());
		enterRule(_localctx, 134, RULE_int_args);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(571);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==VAR_NAME || _la==NUMBER) {
				{
				{
				setState(568);
				var_or_int();
				}
				}
				setState(573);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Var_or_intContext extends ParserRuleContext {
		public TerminalNode VAR_NAME() { return getToken(ChimpClassicParser.VAR_NAME, 0); }
		public TerminalNode NUMBER() { return getToken(ChimpClassicParser.NUMBER, 0); }
		public Var_or_intContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_var_or_int; }
	}

	public final Var_or_intContext var_or_int() throws RecognitionException {
		Var_or_intContext _localctx = new Var_or_intContext(_ctx, getState());
		enterRule(_localctx, 136, RULE_var_or_int);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(574);
			_la = _input.LA(1);
			if ( !(_la==VAR_NAME || _la==NUMBER) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Double_or_intContext extends ParserRuleContext {
		public TerminalNode DOUBLE() { return getToken(ChimpClassicParser.DOUBLE, 0); }
		public TerminalNode NUMBER() { return getToken(ChimpClassicParser.NUMBER, 0); }
		public TerminalNode MINUS() { return getToken(ChimpClassicParser.MINUS, 0); }
		public Double_or_intContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_double_or_int; }
	}

	public final Double_or_intContext double_or_int() throws RecognitionException {
		Double_or_intContext _localctx = new Double_or_intContext(_ctx, getState());
		enterRule(_localctx, 138, RULE_double_or_int);
		int _la;
		try {
			setState(581);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DOUBLE:
				enterOuterAlt(_localctx, 1);
				{
				setState(576);
				match(DOUBLE);
				}
				break;
			case MINUS:
			case NUMBER:
				enterOuterAlt(_localctx, 2);
				{
				setState(578);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==MINUS) {
					{
					setState(577);
					match(MINUS);
					}
				}

				setState(580);
				match(NUMBER);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IdContext extends ParserRuleContext {
		public TerminalNode NAME() { return getToken(ChimpClassicParser.NAME, 0); }
		public IdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_id; }
	}

	public final IdContext id() throws RecognitionException {
		IdContext _localctx = new IdContext(_ctx, getState());
		enterRule(_localctx, 140, RULE_id);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(583);
			match(NAME);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Var_or_constContext extends ParserRuleContext {
		public TerminalNode NAME() { return getToken(ChimpClassicParser.NAME, 0); }
		public TerminalNode VAR_NAME() { return getToken(ChimpClassicParser.VAR_NAME, 0); }
		public Var_or_constContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_var_or_const; }
	}

	public final Var_or_constContext var_or_const() throws RecognitionException {
		Var_or_constContext _localctx = new Var_or_constContext(_ctx, getState());
		enterRule(_localctx, 142, RULE_var_or_const);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(585);
			_la = _input.LA(1);
			if ( !(_la==VAR_NAME || _la==NAME) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3^\u024e\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\3\2\3\2\3\2\5\2\u0096\n\2\3\2\3\2\7\2\u009a\n\2\f\2\16\2\u009d\13"+
		"\2\3\3\3\3\3\3\3\3\3\3\5\3\u00a4\n\3\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3"+
		"\6\3\6\3\6\3\6\3\7\3\7\7\7\u00b4\n\7\f\7\16\7\u00b7\13\7\3\7\3\7\3\b\3"+
		"\b\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\6\n\u00c6\n\n\r\n\16\n\u00c7\3"+
		"\n\3\n\3\13\3\13\3\f\3\f\5\f\u00d0\n\f\3\f\3\f\7\f\u00d4\n\f\f\f\16\f"+
		"\u00d7\13\f\3\f\3\f\3\r\3\r\5\r\u00dd\n\r\3\r\3\r\7\r\u00e1\n\r\f\r\16"+
		"\r\u00e4\13\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\5\16\u00ee\n\16\3"+
		"\16\3\16\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3"+
		"\20\3\20\3\20\5\20\u0101\n\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21"+
		"\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\5\21"+
		"\u0118\n\21\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\24\3\24"+
		"\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3\26\3\27\3\27"+
		"\5\27\u0134\n\27\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30"+
		"\3\30\3\30\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\32\3\32\5\32\u014d"+
		"\n\32\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\34\3\34\3\34\3\34"+
		"\3\34\3\34\3\34\3\34\3\35\3\35\5\35\u0162\n\35\3\36\3\36\3\36\3\36\3\36"+
		"\3\36\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3 \3 \3!\3!\3\"\3\"\5\""+
		"\u0178\n\"\3#\3#\3#\3#\3#\3#\3#\3$\3$\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3"+
		"&\3&\3\'\3\'\3(\7(\u0192\n(\f(\16(\u0195\13(\3)\3)\3)\3)\3)\3)\3*\3*\3"+
		"+\3+\5+\u01a1\n+\3,\3,\3,\3,\3-\3-\3-\3-\3.\3.\3.\5.\u01ae\n.\3/\3/\3"+
		"/\3/\3/\3\60\3\60\3\60\3\60\3\60\3\61\3\61\3\61\3\61\3\61\3\61\3\62\3"+
		"\62\5\62\u01c2\n\62\3\63\3\63\3\63\3\63\3\63\3\64\3\64\3\64\3\64\3\64"+
		"\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65\5\65"+
		"\u01db\n\65\3\66\3\66\3\66\3\66\3\66\3\67\3\67\3\67\3\67\3\67\38\38\3"+
		"8\38\38\38\38\78\u01ee\n8\f8\168\u01f1\138\38\38\58\u01f5\n8\39\39\39"+
		"\39\79\u01fb\n9\f9\169\u01fe\139\39\39\3:\3:\3:\3:\3;\3;\3;\3;\3;\3<\3"+
		"<\3<\3<\3<\3=\3=\3=\3=\3=\3>\3>\3>\3>\3>\3?\3?\3?\3?\3?\3@\3@\3@\3@\3"+
		"@\3A\3A\3A\3A\3A\3B\6B\u022a\nB\rB\16B\u022b\3C\3C\3C\3C\3C\5C\u0233\n"+
		"C\3D\7D\u0236\nD\fD\16D\u0239\13D\3E\7E\u023c\nE\fE\16E\u023f\13E\3F\3"+
		"F\3G\3G\5G\u0245\nG\3G\5G\u0248\nG\3H\3H\3I\3I\3I\2\2J\2\4\6\b\n\f\16"+
		"\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJLNPRTVXZ\\^`bd"+
		"fhjlnprtvxz|~\u0080\u0082\u0084\u0086\u0088\u008a\u008c\u008e\u0090\2"+
		"\n\3\2\27\34\4\2\27\37ZZ\3\2 $\3\2&A\3\2BC\4\2FF^^\4\2XX^^\4\2XX[[\2\u0244"+
		"\2\u0092\3\2\2\2\4\u00a3\3\2\2\2\6\u00a5\3\2\2\2\b\u00a9\3\2\2\2\n\u00ad"+
		"\3\2\2\2\f\u00b1\3\2\2\2\16\u00ba\3\2\2\2\20\u00bc\3\2\2\2\22\u00c1\3"+
		"\2\2\2\24\u00cb\3\2\2\2\26\u00cd\3\2\2\2\30\u00da\3\2\2\2\32\u00e7\3\2"+
		"\2\2\34\u00f1\3\2\2\2\36\u0100\3\2\2\2 \u0117\3\2\2\2\"\u0119\3\2\2\2"+
		"$\u011e\3\2\2\2&\u0123\3\2\2\2(\u0128\3\2\2\2*\u012c\3\2\2\2,\u0133\3"+
		"\2\2\2.\u0135\3\2\2\2\60\u0142\3\2\2\2\62\u014c\3\2\2\2\64\u014e\3\2\2"+
		"\2\66\u0157\3\2\2\28\u0161\3\2\2\2:\u0163\3\2\2\2<\u0169\3\2\2\2>\u0171"+
		"\3\2\2\2@\u0173\3\2\2\2B\u0177\3\2\2\2D\u0179\3\2\2\2F\u0180\3\2\2\2H"+
		"\u0182\3\2\2\2J\u018c\3\2\2\2L\u018e\3\2\2\2N\u0193\3\2\2\2P\u0196\3\2"+
		"\2\2R\u019c\3\2\2\2T\u01a0\3\2\2\2V\u01a2\3\2\2\2X\u01a6\3\2\2\2Z\u01ad"+
		"\3\2\2\2\\\u01af\3\2\2\2^\u01b4\3\2\2\2`\u01b9\3\2\2\2b\u01c1\3\2\2\2"+
		"d\u01c3\3\2\2\2f\u01c8\3\2\2\2h\u01da\3\2\2\2j\u01dc\3\2\2\2l\u01e1\3"+
		"\2\2\2n\u01f4\3\2\2\2p\u01f6\3\2\2\2r\u0201\3\2\2\2t\u0205\3\2\2\2v\u020a"+
		"\3\2\2\2x\u020f\3\2\2\2z\u0214\3\2\2\2|\u0219\3\2\2\2~\u021e\3\2\2\2\u0080"+
		"\u0223\3\2\2\2\u0082\u0229\3\2\2\2\u0084\u022d\3\2\2\2\u0086\u0237\3\2"+
		"\2\2\u0088\u023d\3\2\2\2\u008a\u0240\3\2\2\2\u008c\u0247\3\2\2\2\u008e"+
		"\u0249\3\2\2\2\u0090\u024b\3\2\2\2\u0092\u0093\5\6\4\2\u0093\u0095\5\b"+
		"\5\2\u0094\u0096\5\n\6\2\u0095\u0094\3\2\2\2\u0095\u0096\3\2\2\2\u0096"+
		"\u0097\3\2\2\2\u0097\u009b\5\f\7\2\u0098\u009a\5\4\3\2\u0099\u0098\3\2"+
		"\2\2\u009a\u009d\3\2\2\2\u009b\u0099\3\2\2\2\u009b\u009c\3\2\2\2\u009c"+
		"\3\3\2\2\2\u009d\u009b\3\2\2\2\u009e\u00a4\5\20\t\2\u009f\u00a4\5p9\2"+
		"\u00a0\u00a4\5\22\n\2\u00a1\u00a4\5\30\r\2\u00a2\u00a4\5\26\f\2\u00a3"+
		"\u009e\3\2\2\2\u00a3\u009f\3\2\2\2\u00a3\u00a0\3\2\2\2\u00a3\u00a1\3\2"+
		"\2\2\u00a3\u00a2\3\2\2\2\u00a4\5\3\2\2\2\u00a5\u00a6\7\3\2\2\u00a6\u00a7"+
		"\7[\2\2\u00a7\u00a8\7\4\2\2\u00a8\7\3\2\2\2\u00a9\u00aa\7\5\2\2\u00aa"+
		"\u00ab\7^\2\2\u00ab\u00ac\7\4\2\2\u00ac\t\3\2\2\2\u00ad\u00ae\7\6\2\2"+
		"\u00ae\u00af\7^\2\2\u00af\u00b0\7\4\2\2\u00b0\13\3\2\2\2\u00b1\u00b5\7"+
		"\7\2\2\u00b2\u00b4\5\16\b\2\u00b3\u00b2\3\2\2\2\u00b4\u00b7\3\2\2\2\u00b5"+
		"\u00b3\3\2\2\2\u00b5\u00b6\3\2\2\2\u00b6\u00b8\3\2\2\2\u00b7\u00b5\3\2"+
		"\2\2\u00b8\u00b9\7\4\2\2\u00b9\r\3\2\2\2\u00ba\u00bb\7[\2\2\u00bb\17\3"+
		"\2\2\2\u00bc\u00bd\7\b\2\2\u00bd\u00be\7[\2\2\u00be\u00bf\7^\2\2\u00bf"+
		"\u00c0\7\4\2\2\u00c0\21\3\2\2\2\u00c1\u00c2\7\t\2\2\u00c2\u00c3\5\24\13"+
		"\2\u00c3\u00c5\7^\2\2\u00c4\u00c6\7[\2\2\u00c5\u00c4\3\2\2\2\u00c6\u00c7"+
		"\3\2\2\2\u00c7\u00c5\3\2\2\2\u00c7\u00c8\3\2\2\2\u00c8\u00c9\3\2\2\2\u00c9"+
		"\u00ca\7\4\2\2\u00ca\23\3\2\2\2\u00cb\u00cc\7[\2\2\u00cc\25\3\2\2\2\u00cd"+
		"\u00cf\7\n\2\2\u00ce\u00d0\7^\2\2\u00cf\u00ce\3\2\2\2\u00cf\u00d0\3\2"+
		"\2\2\u00d0\u00d1\3\2\2\2\u00d1\u00d5\5\32\16\2\u00d2\u00d4\5\36\20\2\u00d3"+
		"\u00d2\3\2\2\2\u00d4\u00d7\3\2\2\2\u00d5\u00d3\3\2\2\2\u00d5\u00d6\3\2"+
		"\2\2\u00d6\u00d8\3\2\2\2\u00d7\u00d5\3\2\2\2\u00d8\u00d9\7\4\2\2\u00d9"+
		"\27\3\2\2\2\u00da\u00dc\7\13\2\2\u00db\u00dd\7^\2\2\u00dc\u00db\3\2\2"+
		"\2\u00dc\u00dd\3\2\2\2\u00dd\u00de\3\2\2\2\u00de\u00e2\5\32\16\2\u00df"+
		"\u00e1\5 \21\2\u00e0\u00df\3\2\2\2\u00e1\u00e4\3\2\2\2\u00e2\u00e0\3\2"+
		"\2\2\u00e2\u00e3\3\2\2\2\u00e3\u00e5\3\2\2\2\u00e4\u00e2\3\2\2\2\u00e5"+
		"\u00e6\7\4\2\2\u00e6\31\3\2\2\2\u00e7\u00e8\7\f\2\2\u00e8\u00e9\5\16\b"+
		"\2\u00e9\u00ea\7\r\2\2\u00ea\u00eb\5\u0086D\2\u00eb\u00ed\7\4\2\2\u00ec"+
		"\u00ee\5\34\17\2\u00ed\u00ec\3\2\2\2\u00ed\u00ee\3\2\2\2\u00ee\u00ef\3"+
		"\2\2\2\u00ef\u00f0\7\4\2\2\u00f0\33\3\2\2\2\u00f1\u00f2\7\r\2\2\u00f2"+
		"\u00f3\5\u0088E\2\u00f3\u00f4\7\4\2\2\u00f4\35\3\2\2\2\u00f5\u0101\5\""+
		"\22\2\u00f6\u0101\5B\"\2\u00f7\u0101\5n8\2\u00f8\u0101\5x=\2\u00f9\u0101"+
		"\5z>\2\u00fa\u0101\5|?\2\u00fb\u0101\5~@\2\u00fc\u0101\5\u0080A\2\u00fd"+
		"\u0101\5$\23\2\u00fe\u0101\5*\26\2\u00ff\u0101\58\35\2\u0100\u00f5\3\2"+
		"\2\2\u0100\u00f6\3\2\2\2\u0100\u00f7\3\2\2\2\u0100\u00f8\3\2\2\2\u0100"+
		"\u00f9\3\2\2\2\u0100\u00fa\3\2\2\2\u0100\u00fb\3\2\2\2\u0100\u00fc\3\2"+
		"\2\2\u0100\u00fd\3\2\2\2\u0100\u00fe\3\2\2\2\u0100\u00ff\3\2\2\2\u0101"+
		"\37\3\2\2\2\u0102\u0118\5\"\22\2\u0103\u0118\5B\"\2\u0104\u0118\5&\24"+
		"\2\u0105\u0118\5(\25\2\u0106\u0118\5n8\2\u0107\u0118\5x=\2\u0108\u0118"+
		"\5z>\2\u0109\u0118\5|?\2\u010a\u0118\5~@\2\u010b\u0118\5\u0080A\2\u010c"+
		"\u0118\58\35\2\u010d\u0118\5,\27\2\u010e\u0118\5\62\32\2\u010f\u0118\5"+
		"V,\2\u0110\u0118\5X-\2\u0111\u0118\5Z.\2\u0112\u0118\5h\65\2\u0113\u0118"+
		"\5^\60\2\u0114\u0118\5j\66\2\u0115\u0118\5l\67\2\u0116\u0118\5b\62\2\u0117"+
		"\u0102\3\2\2\2\u0117\u0103\3\2\2\2\u0117\u0104\3\2\2\2\u0117\u0105\3\2"+
		"\2\2\u0117\u0106\3\2\2\2\u0117\u0107\3\2\2\2\u0117\u0108\3\2\2\2\u0117"+
		"\u0109\3\2\2\2\u0117\u010a\3\2\2\2\u0117\u010b\3\2\2\2\u0117\u010c\3\2"+
		"\2\2\u0117\u010d\3\2\2\2\u0117\u010e\3\2\2\2\u0117\u010f\3\2\2\2\u0117"+
		"\u0110\3\2\2\2\u0117\u0111\3\2\2\2\u0117\u0112\3\2\2\2\u0117\u0113\3\2"+
		"\2\2\u0117\u0114\3\2\2\2\u0117\u0115\3\2\2\2\u0117\u0116\3\2\2\2\u0118"+
		"!\3\2\2\2\u0119\u011a\7\16\2\2\u011a\u011b\5\u008eH\2\u011b\u011c\5\u0084"+
		"C\2\u011c\u011d\7\4\2\2\u011d#\3\2\2\2\u011e\u011f\7\17\2\2\u011f\u0120"+
		"\5\u008eH\2\u0120\u0121\5\u0084C\2\u0121\u0122\7\4\2\2\u0122%\3\2\2\2"+
		"\u0123\u0124\7\20\2\2\u0124\u0125\5\u008eH\2\u0125\u0126\5\u0084C\2\u0126"+
		"\u0127\7\4\2\2\u0127\'\3\2\2\2\u0128\u0129\7\21\2\2\u0129\u012a\5\u008e"+
		"H\2\u012a\u012b\7\4\2\2\u012b)\3\2\2\2\u012c\u012d\7\22\2\2\u012d\u012e"+
		"\5\u008eH\2\u012e\u012f\5\u008eH\2\u012f\u0130\7\4\2\2\u0130+\3\2\2\2"+
		"\u0131\u0134\5.\30\2\u0132\u0134\5\60\31\2\u0133\u0131\3\2\2\2\u0133\u0132"+
		"\3\2\2\2\u0134-\3\2\2\2\u0135\u0136\7\23\2\2\u0136\u0137\7\r\2\2\u0137"+
		"\u0138\5J&\2\u0138\u0139\7\24\2\2\u0139\u013a\5J&\2\u013a\u013b\7\4\2"+
		"\2\u013b\u013c\7\r\2\2\u013c\u013d\7X\2\2\u013d\u013e\7\24\2\2\u013e\u013f"+
		"\7X\2\2\u013f\u0140\7\4\2\2\u0140\u0141\7\4\2\2\u0141/\3\2\2\2\u0142\u0143"+
		"\7\23\2\2\u0143\u0144\7X\2\2\u0144\u0145\5> \2\u0145\u0146\7X\2\2\u0146"+
		"\u0147\5@!\2\u0147\u0148\5\u008aF\2\u0148\u0149\7\4\2\2\u0149\61\3\2\2"+
		"\2\u014a\u014d\5\64\33\2\u014b\u014d\5\66\34\2\u014c\u014a\3\2\2\2\u014c"+
		"\u014b\3\2\2\2\u014d\63\3\2\2\2\u014e\u014f\7\25\2\2\u014f\u0150\7\r\2"+
		"\2\u0150\u0151\5L\'\2\u0151\u0152\7\4\2\2\u0152\u0153\7\r\2\2\u0153\u0154"+
		"\7X\2\2\u0154\u0155\7\4\2\2\u0155\u0156\7\4\2\2\u0156\65\3\2\2\2\u0157"+
		"\u0158\7\25\2\2\u0158\u0159\7\r\2\2\u0159\u015a\7X\2\2\u015a\u015b\7\24"+
		"\2\2\u015b\u015c\7X\2\2\u015c\u015d\7\4\2\2\u015d\u015e\7\4\2\2\u015e"+
		"\67\3\2\2\2\u015f\u0162\5:\36\2\u0160\u0162\5<\37\2\u0161\u015f\3\2\2"+
		"\2\u0161\u0160\3\2\2\2\u01629\3\2\2\2\u0163\u0164\7\26\2\2\u0164\u0165"+
		"\7X\2\2\u0165\u0166\5> \2\u0166\u0167\5\u008aF\2\u0167\u0168\7\4\2\2\u0168"+
		";\3\2\2\2\u0169\u016a\7\26\2\2\u016a\u016b\7X\2\2\u016b\u016c\5> \2\u016c"+
		"\u016d\7X\2\2\u016d\u016e\5@!\2\u016e\u016f\5\u008aF\2\u016f\u0170\7\4"+
		"\2\2\u0170=\3\2\2\2\u0171\u0172\t\2\2\2\u0172?\3\2\2\2\u0173\u0174\t\3"+
		"\2\2\u0174A\3\2\2\2\u0175\u0178\5D#\2\u0176\u0178\5H%\2\u0177\u0175\3"+
		"\2\2\2\u0177\u0176\3\2\2\2\u0178C\3\2\2\2\u0179\u017a\5F$\2\u017a\u017b"+
		"\5N(\2\u017b\u017c\7\r\2\2\u017c\u017d\5T+\2\u017d\u017e\7\4\2\2\u017e"+
		"\u017f\7\4\2\2\u017fE\3\2\2\2\u0180\u0181\t\4\2\2\u0181G\3\2\2\2\u0182"+
		"\u0183\7%\2\2\u0183\u0184\5J&\2\u0184\u0185\5N(\2\u0185\u0186\7\r\2\2"+
		"\u0186\u0187\5T+\2\u0187\u0188\7\24\2\2\u0188\u0189\5T+\2\u0189\u018a"+
		"\7\4\2\2\u018a\u018b\7\4\2\2\u018bI\3\2\2\2\u018c\u018d\t\5\2\2\u018d"+
		"K\3\2\2\2\u018e\u018f\t\6\2\2\u018fM\3\2\2\2\u0190\u0192\5P)\2\u0191\u0190"+
		"\3\2\2\2\u0192\u0195\3\2\2\2\u0193\u0191\3\2\2\2\u0193\u0194\3\2\2\2\u0194"+
		"O\3\2\2\2\u0195\u0193\3\2\2\2\u0196\u0197\7D\2\2\u0197\u0198\5R*\2\u0198"+
		"\u0199\7\24\2\2\u0199\u019a\5R*\2\u019a\u019b\7E\2\2\u019bQ\3\2\2\2\u019c"+
		"\u019d\t\7\2\2\u019dS\3\2\2\2\u019e\u01a1\5\u008eH\2\u019f\u01a1\7G\2"+
		"\2\u01a0\u019e\3\2\2\2\u01a0\u019f\3\2\2\2\u01a1U\3\2\2\2\u01a2\u01a3"+
		"\7H\2\2\u01a3\u01a4\5\u008cG\2\u01a4\u01a5\7\4\2\2\u01a5W\3\2\2\2\u01a6"+
		"\u01a7\7I\2\2\u01a7\u01a8\5\u008cG\2\u01a8\u01a9\7\4\2\2\u01a9Y\3\2\2"+
		"\2\u01aa\u01ae\5\\/\2\u01ab\u01ae\5^\60\2\u01ac\u01ae\5`\61\2\u01ad\u01aa"+
		"\3\2\2\2\u01ad\u01ab\3\2\2\2\u01ad\u01ac\3\2\2\2\u01ae[\3\2\2\2\u01af"+
		"\u01b0\7J\2\2\u01b0\u01b1\5x=\2\u01b1\u01b2\5V,\2\u01b2\u01b3\7\4\2\2"+
		"\u01b3]\3\2\2\2\u01b4\u01b5\7J\2\2\u01b5\u01b6\5x=\2\u01b6\u01b7\5X-\2"+
		"\u01b7\u01b8\7\4\2\2\u01b8_\3\2\2\2\u01b9\u01ba\7J\2\2\u01ba\u01bb\5x"+
		"=\2\u01bb\u01bc\5V,\2\u01bc\u01bd\5X-\2\u01bd\u01be\7\4\2\2\u01bea\3\2"+
		"\2\2\u01bf\u01c2\5d\63\2\u01c0\u01c2\5f\64\2\u01c1\u01bf\3\2\2\2\u01c1"+
		"\u01c0\3\2\2\2\u01c2c\3\2\2\2\u01c3\u01c4\7J\2\2\u01c4\u01c5\5x=\2\u01c5"+
		"\u01c6\5j\66\2\u01c6\u01c7\7\4\2\2\u01c7e\3\2\2\2\u01c8\u01c9\7J\2\2\u01c9"+
		"\u01ca\5x=\2\u01ca\u01cb\5l\67\2\u01cb\u01cc\7\4\2\2\u01ccg\3\2\2\2\u01cd"+
		"\u01ce\7K\2\2\u01ce\u01cf\5V,\2\u01cf\u01d0\7\4\2\2\u01d0\u01db\3\2\2"+
		"\2\u01d1\u01d2\7K\2\2\u01d2\u01d3\5X-\2\u01d3\u01d4\7\4\2\2\u01d4\u01db"+
		"\3\2\2\2\u01d5\u01d6\7K\2\2\u01d6\u01d7\5V,\2\u01d7\u01d8\5X-\2\u01d8"+
		"\u01d9\7\4\2\2\u01d9\u01db\3\2\2\2\u01da\u01cd\3\2\2\2\u01da\u01d1\3\2"+
		"\2\2\u01da\u01d5\3\2\2\2\u01dbi\3\2\2\2\u01dc\u01dd\7L\2\2\u01dd\u01de"+
		"\7[\2\2\u01de\u01df\7^\2\2\u01df\u01e0\7\4\2\2\u01e0k\3\2\2\2\u01e1\u01e2"+
		"\7M\2\2\u01e2\u01e3\7[\2\2\u01e3\u01e4\7^\2\2\u01e4\u01e5\7\4\2\2\u01e5"+
		"m\3\2\2\2\u01e6\u01e7\7N\2\2\u01e7\u01e8\7[\2\2\u01e8\u01e9\7^\2\2\u01e9"+
		"\u01f5\7\4\2\2\u01ea\u01eb\7N\2\2\u01eb\u01ef\5t;\2\u01ec\u01ee\5v<\2"+
		"\u01ed\u01ec\3\2\2\2\u01ee\u01f1\3\2\2\2\u01ef\u01ed\3\2\2\2\u01ef\u01f0"+
		"\3\2\2\2\u01f0\u01f2\3\2\2\2\u01f1\u01ef\3\2\2\2\u01f2\u01f3\7\4\2\2\u01f3"+
		"\u01f5\3\2\2\2\u01f4\u01e6\3\2\2\2\u01f4\u01ea\3\2\2\2\u01f5o\3\2\2\2"+
		"\u01f6\u01f7\7O\2\2\u01f7\u01f8\5t;\2\u01f8\u01fc\5r:\2\u01f9\u01fb\5"+
		"v<\2\u01fa\u01f9\3\2\2\2\u01fb\u01fe\3\2\2\2\u01fc\u01fa\3\2\2\2\u01fc"+
		"\u01fd\3\2\2\2\u01fd\u01ff\3\2\2\2\u01fe\u01fc\3\2\2\2\u01ff\u0200\7\4"+
		"\2\2\u0200q\3\2\2\2\u0201\u0202\7P\2\2\u0202\u0203\7[\2\2\u0203\u0204"+
		"\7\4\2\2\u0204s\3\2\2\2\u0205\u0206\7Q\2\2\u0206\u0207\7[\2\2\u0207\u0208"+
		"\7^\2\2\u0208\u0209\7\4\2\2\u0209u\3\2\2\2\u020a\u020b\7R\2\2\u020b\u020c"+
		"\7^\2\2\u020c\u020d\7[\2\2\u020d\u020e\7\4\2\2\u020ew\3\2\2\2\u020f\u0210"+
		"\7S\2\2\u0210\u0211\7X\2\2\u0211\u0212\5\u0082B\2\u0212\u0213\7\4\2\2"+
		"\u0213y\3\2\2\2\u0214\u0215\7T\2\2\u0215\u0216\7X\2\2\u0216\u0217\5\u0082"+
		"B\2\u0217\u0218\7\4\2\2\u0218{\3\2\2\2\u0219\u021a\7U\2\2\u021a\u021b"+
		"\7X\2\2\u021b\u021c\5\u0082B\2\u021c\u021d\7\4\2\2\u021d}\3\2\2\2\u021e"+
		"\u021f\7V\2\2\u021f\u0220\7X\2\2\u0220\u0221\5\u0082B\2\u0221\u0222\7"+
		"\4\2\2\u0222\177\3\2\2\2\u0223\u0224\7W\2\2\u0224\u0225\7X\2\2\u0225\u0226"+
		"\7X\2\2\u0226\u0227\7\4\2\2\u0227\u0081\3\2\2\2\u0228\u022a\7[\2\2\u0229"+
		"\u0228\3\2\2\2\u022a\u022b\3\2\2\2\u022b\u0229\3\2\2\2\u022b\u022c\3\2"+
		"\2\2\u022c\u0083\3\2\2\2\u022d\u022e\7[\2\2\u022e\u022f\7\r\2\2\u022f"+
		"\u0230\5\u0086D\2\u0230\u0232\7\4\2\2\u0231\u0233\5\34\17\2\u0232\u0231"+
		"\3\2\2\2\u0232\u0233\3\2\2\2\u0233\u0085\3\2\2\2\u0234\u0236\5\u0090I"+
		"\2\u0235\u0234\3\2\2\2\u0236\u0239\3\2\2\2\u0237\u0235\3\2\2\2\u0237\u0238"+
		"\3\2\2\2\u0238\u0087\3\2\2\2\u0239\u0237\3\2\2\2\u023a\u023c\5\u008aF"+
		"\2\u023b\u023a\3\2\2\2\u023c\u023f\3\2\2\2\u023d\u023b\3\2\2\2\u023d\u023e"+
		"\3\2\2\2\u023e\u0089\3\2\2\2\u023f\u023d\3\2\2\2\u0240\u0241\t\b\2\2\u0241"+
		"\u008b\3\2\2\2\u0242\u0248\7Y\2\2\u0243\u0245\7Z\2\2\u0244\u0243\3\2\2"+
		"\2\u0244\u0245\3\2\2\2\u0245\u0246\3\2\2\2\u0246\u0248\7^\2\2\u0247\u0242"+
		"\3\2\2\2\u0247\u0244\3\2\2\2\u0248\u008d\3\2\2\2\u0249\u024a\7[\2\2\u024a"+
		"\u008f\3\2\2\2\u024b\u024c\t\t\2\2\u024c\u0091\3\2\2\2 \u0095\u009b\u00a3"+
		"\u00b5\u00c7\u00cf\u00d5\u00dc\u00e2\u00ed\u0100\u0117\u0133\u014c\u0161"+
		"\u0177\u0193\u01a0\u01ad\u01c1\u01da\u01ef\u01f4\u01fc\u022b\u0232\u0237"+
		"\u023d\u0244\u0247";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}