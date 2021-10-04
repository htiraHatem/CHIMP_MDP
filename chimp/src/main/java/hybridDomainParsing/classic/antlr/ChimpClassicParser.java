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
		RULE_if_reward_transition_mdp_def = 47, RULE_else_mdp_def = 48, RULE_resource_increase_def = 49, 
		RULE_resource_decrease_def = 50, RULE_resource_usage_def = 51, RULE_fluentresourceusage_def = 52, 
		RULE_fluent_def = 53, RULE_usage_def = 54, RULE_param_item = 55, RULE_value_restriction_def = 56, 
		RULE_notvalue_restriction_def = 57, RULE_typevalue_restriction_def = 58, 
		RULE_nottypevalue_restriction_def = 59, RULE_vardifferent_def = 60, RULE_constant_list = 61, 
		RULE_predicate = 62, RULE_predicate_args = 63, RULE_int_args = 64, RULE_var_or_int = 65, 
		RULE_double_or_int = 66, RULE_id = 67, RULE_var_or_const = 68;
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
			"if_transition_mdp_def", "if_reward_transition_mdp_def", "else_mdp_def", 
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
			setState(138);
			domain_name_def();
			setState(139);
			maxargs_def();
			setState(141);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__3) {
				{
				setState(140);
				maxintargs_def();
				}
			}

			setState(143);
			predicatesymbols_def();
			setState(147);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8))) != 0) || _la==T__76) {
				{
				{
				setState(144);
				domain_item();
				}
				}
				setState(149);
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
			setState(155);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__5:
				_localctx = new Domain_item_resourceContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(150);
				resource_def();
				}
				break;
			case T__76:
				_localctx = new Domain_item_fluentresourceusageContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(151);
				fluentresourceusage_def();
				}
				break;
			case T__6:
				_localctx = new Domain_item_statevariableContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(152);
				statevariable_def();
				}
				break;
			case T__8:
				_localctx = new Domain_item_operatorContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(153);
				operator_def();
				}
				break;
			case T__7:
				_localctx = new Domain_item_methodContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(154);
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
			setState(157);
			match(T__0);
			setState(158);
			match(NAME);
			setState(159);
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
			setState(161);
			match(T__2);
			setState(162);
			match(NUMBER);
			setState(163);
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
			setState(165);
			match(T__3);
			setState(166);
			match(NUMBER);
			setState(167);
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
			setState(169);
			match(T__4);
			setState(173);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NAME) {
				{
				{
				setState(170);
				predicate_symbol();
				}
				}
				setState(175);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(176);
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
			setState(178);
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
			setState(180);
			match(T__5);
			setState(181);
			match(NAME);
			setState(182);
			match(NUMBER);
			setState(183);
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
			setState(185);
			match(T__6);
			setState(186);
			statevariable_name();
			setState(187);
			match(NUMBER);
			setState(189); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(188);
				match(NAME);
				}
				}
				setState(191); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==NAME );
			setState(193);
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
			setState(195);
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
			setState(197);
			match(T__7);
			setState(199);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NUMBER) {
				{
				setState(198);
				match(NUMBER);
				}
			}

			setState(201);
			head();
			setState(205);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__11) | (1L << T__12) | (1L << T__15) | (1L << T__19) | (1L << T__29) | (1L << T__30) | (1L << T__31) | (1L << T__32) | (1L << T__33) | (1L << T__34))) != 0) || ((((_la - 76)) & ~0x3f) == 0 && ((1L << (_la - 76)) & ((1L << (T__75 - 76)) | (1L << (T__80 - 76)) | (1L << (T__81 - 76)) | (1L << (T__82 - 76)) | (1L << (T__83 - 76)) | (1L << (T__84 - 76)))) != 0)) {
				{
				{
				setState(202);
				method_element();
				}
				}
				setState(207);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(208);
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
			setState(210);
			match(T__8);
			setState(212);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NUMBER) {
				{
				setState(211);
				match(NUMBER);
				}
			}

			setState(214);
			head();
			setState(218);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__11) | (1L << T__13) | (1L << T__14) | (1L << T__16) | (1L << T__18) | (1L << T__19) | (1L << T__29) | (1L << T__30) | (1L << T__31) | (1L << T__32) | (1L << T__33) | (1L << T__34))) != 0) || ((((_la - 70)) & ~0x3f) == 0 && ((1L << (_la - 70)) & ((1L << (T__69 - 70)) | (1L << (T__70 - 70)) | (1L << (T__71 - 70)) | (1L << (T__72 - 70)) | (1L << (T__73 - 70)) | (1L << (T__74 - 70)) | (1L << (T__75 - 70)) | (1L << (T__80 - 70)) | (1L << (T__81 - 70)) | (1L << (T__82 - 70)) | (1L << (T__83 - 70)) | (1L << (T__84 - 70)))) != 0)) {
				{
				{
				setState(215);
				op_element();
				}
				}
				setState(220);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(221);
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
			setState(223);
			match(T__9);
			setState(224);
			predicate_symbol();
			setState(225);
			match(T__10);
			setState(226);
			predicate_args();
			setState(227);
			match(T__1);
			setState(229);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__10) {
				{
				setState(228);
				int_args_def();
				}
			}

			setState(231);
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
			setState(233);
			match(T__10);
			setState(234);
			int_args();
			setState(235);
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
			setState(248);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__11:
				_localctx = new Precondition_m_elementContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(237);
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
				setState(238);
				temporal_constraint_def();
				}
				break;
			case T__75:
				_localctx = new Resource_usage_m_elementContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(239);
				resource_usage_def();
				}
				break;
			case T__80:
				_localctx = new Value_restriction_m_elementContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(240);
				value_restriction_def();
				}
				break;
			case T__81:
				_localctx = new Notvalue_restriction_m_elementContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(241);
				notvalue_restriction_def();
				}
				break;
			case T__82:
				_localctx = new Typevalue_restriction_m_elementContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(242);
				typevalue_restriction_def();
				}
				break;
			case T__83:
				_localctx = new Nottypevalue_restriction_m_elementContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(243);
				nottypevalue_restriction_def();
				}
				break;
			case T__84:
				_localctx = new Vardifferent_m_elementContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(244);
				vardifferent_def();
				}
				break;
			case T__12:
				_localctx = new Subtask_def_m_elementContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(245);
				subtask_def();
				}
				break;
			case T__15:
				_localctx = new Ordering_def_m_elementContext(_localctx);
				enterOuterAlt(_localctx, 10);
				{
				setState(246);
				ordering_constraint_def();
				}
				break;
			case T__19:
				_localctx = new Integer_constraint_m_elementContext(_localctx);
				enterOuterAlt(_localctx, 11);
				{
				setState(247);
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
			setState(270);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				_localctx = new Precondition_op_elementContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(250);
				precondition_def();
				}
				break;
			case 2:
				_localctx = new Temporal_constraint_op_elementContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(251);
				temporal_constraint_def();
				}
				break;
			case 3:
				_localctx = new Positive_effect_def_op_elementContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(252);
				positive_effect_def();
				}
				break;
			case 4:
				_localctx = new Negative_effect_def_op_elementContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(253);
				negative_effect_def();
				}
				break;
			case 5:
				_localctx = new Resource_usage_op_elementContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(254);
				resource_usage_def();
				}
				break;
			case 6:
				_localctx = new Value_restriction_op_elementContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(255);
				value_restriction_def();
				}
				break;
			case 7:
				_localctx = new Notvalue_restriction_op_elementContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(256);
				notvalue_restriction_def();
				}
				break;
			case 8:
				_localctx = new Typevalue_restriction_op_elementContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(257);
				typevalue_restriction_def();
				}
				break;
			case 9:
				_localctx = new Nottypevalue_restriction_op_elementContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(258);
				nottypevalue_restriction_def();
				}
				break;
			case 10:
				_localctx = new Vardifferent_op_elementContext(_localctx);
				enterOuterAlt(_localctx, 10);
				{
				setState(259);
				vardifferent_def();
				}
				break;
			case 11:
				_localctx = new Integer_constraint_op_elementContext(_localctx);
				enterOuterAlt(_localctx, 11);
				{
				setState(260);
				integer_constraint_def();
				}
				break;
			case 12:
				_localctx = new Spatial_constraint_op_elementContext(_localctx);
				enterOuterAlt(_localctx, 12);
				{
				setState(261);
				spatial_constraint_def();
				}
				break;
			case 13:
				_localctx = new Delete_spatial_constraint_op_elementContext(_localctx);
				enterOuterAlt(_localctx, 13);
				{
				setState(262);
				delete_spatial_constraint_def();
				}
				break;
			case 14:
				_localctx = new Mdp_reward_op_elementContext(_localctx);
				enterOuterAlt(_localctx, 14);
				{
				setState(263);
				mdp_reward_def();
				}
				break;
			case 15:
				_localctx = new Mdp_transitionprobability_op_elementContext(_localctx);
				enterOuterAlt(_localctx, 15);
				{
				setState(264);
				mdp_transitionProbability_def();
				}
				break;
			case 16:
				_localctx = new If_mdp_op_elementContext(_localctx);
				enterOuterAlt(_localctx, 16);
				{
				setState(265);
				if_mdp_def();
				}
				break;
			case 17:
				_localctx = new Else_mdp_op_elementContext(_localctx);
				enterOuterAlt(_localctx, 17);
				{
				setState(266);
				else_mdp_def();
				}
				break;
			case 18:
				_localctx = new If_transition_mdp_op_elementContext(_localctx);
				enterOuterAlt(_localctx, 18);
				{
				setState(267);
				if_transition_mdp_def();
				}
				break;
			case 19:
				_localctx = new Resource_increase_op_elementContext(_localctx);
				enterOuterAlt(_localctx, 19);
				{
				setState(268);
				resource_increase_def();
				}
				break;
			case 20:
				_localctx = new Resource_decrease_op_elementContext(_localctx);
				enterOuterAlt(_localctx, 20);
				{
				setState(269);
				resource_decrease_def();
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
			setState(272);
			match(T__11);
			setState(273);
			id();
			setState(274);
			predicate();
			setState(275);
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
			setState(277);
			match(T__12);
			setState(278);
			id();
			setState(279);
			predicate();
			setState(280);
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
			setState(282);
			match(T__13);
			setState(283);
			id();
			setState(284);
			predicate();
			setState(285);
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
			setState(287);
			match(T__14);
			setState(288);
			id();
			setState(289);
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
			setState(291);
			match(T__15);
			setState(292);
			id();
			setState(293);
			id();
			setState(294);
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
			setState(298);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(296);
				spatial_constraint1_def();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(297);
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
			setState(300);
			match(T__16);
			setState(301);
			match(T__10);
			setState(302);
			binary_temporal_constraint_type();
			setState(303);
			match(T__17);
			setState(304);
			binary_temporal_constraint_type();
			setState(305);
			match(T__1);
			setState(306);
			match(T__10);
			setState(307);
			match(VAR_NAME);
			setState(308);
			match(T__17);
			setState(309);
			match(VAR_NAME);
			setState(310);
			match(T__1);
			setState(311);
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
			setState(313);
			match(T__16);
			setState(314);
			match(VAR_NAME);
			setState(315);
			integer_operator1();
			setState(316);
			match(VAR_NAME);
			setState(317);
			integer_operator2();
			setState(318);
			var_or_int();
			setState(319);
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
			setState(323);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(321);
				delete_spatial_constraint1_def();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(322);
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
			setState(325);
			match(T__18);
			setState(326);
			match(T__10);
			setState(327);
			unary_spatial_constraint_type();
			setState(328);
			match(T__1);
			setState(329);
			match(T__10);
			setState(330);
			match(VAR_NAME);
			setState(331);
			match(T__1);
			setState(332);
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
			setState(334);
			match(T__18);
			setState(335);
			match(T__10);
			setState(336);
			match(VAR_NAME);
			setState(337);
			match(T__17);
			setState(338);
			match(VAR_NAME);
			setState(339);
			match(T__1);
			setState(340);
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
			setState(344);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(342);
				integer_constraint1_def();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(343);
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
			setState(346);
			match(T__19);
			setState(347);
			match(VAR_NAME);
			setState(348);
			integer_operator1();
			setState(349);
			var_or_int();
			setState(350);
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
			setState(352);
			match(T__19);
			setState(353);
			match(VAR_NAME);
			setState(354);
			integer_operator1();
			setState(355);
			match(VAR_NAME);
			setState(356);
			integer_operator2();
			setState(357);
			var_or_int();
			setState(358);
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
			setState(360);
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
			setState(362);
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
			setState(366);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__29:
			case T__30:
			case T__31:
			case T__32:
			case T__33:
				enterOuterAlt(_localctx, 1);
				{
				setState(364);
				unary_temporal_constraint_def();
				}
				break;
			case T__34:
				enterOuterAlt(_localctx, 2);
				{
				setState(365);
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
			setState(368);
			unary_temporal_constraint_type();
			setState(369);
			bounds_list();
			setState(370);
			match(T__10);
			setState(371);
			id_or_task();
			setState(372);
			match(T__1);
			setState(373);
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
			setState(375);
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
			setState(377);
			match(T__34);
			setState(378);
			binary_temporal_constraint_type();
			setState(379);
			bounds_list();
			setState(380);
			match(T__10);
			setState(381);
			id_or_task();
			setState(382);
			match(T__17);
			setState(383);
			id_or_task();
			setState(384);
			match(T__1);
			setState(385);
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
			setState(387);
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
			setState(389);
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
			setState(394);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__65) {
				{
				{
				setState(391);
				bounds();
				}
				}
				setState(396);
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
			setState(397);
			match(T__65);
			setState(398);
			bound();
			setState(399);
			match(T__17);
			setState(400);
			bound();
			setState(401);
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
			setState(403);
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
			setState(407);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NAME:
				enterOuterAlt(_localctx, 1);
				{
				setState(405);
				id();
				}
				break;
			case T__68:
				enterOuterAlt(_localctx, 2);
				{
				setState(406);
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
			setState(409);
			match(T__69);
			setState(410);
			double_or_int();
			setState(411);
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
			setState(413);
			match(T__70);
			setState(414);
			double_or_int();
			setState(415);
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
			setState(420);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(417);
				if_reward_mdp_def();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(418);
				if_transition_mdp_def();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(419);
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
			setState(422);
			match(T__71);
			setState(423);
			value_restriction_def();
			setState(424);
			mdp_reward_def();
			setState(425);
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
			setState(427);
			match(T__71);
			setState(428);
			value_restriction_def();
			setState(429);
			mdp_transitionProbability_def();
			setState(430);
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
			setState(432);
			match(T__71);
			setState(433);
			value_restriction_def();
			setState(434);
			mdp_reward_def();
			setState(435);
			mdp_transitionProbability_def();
			setState(436);
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
		enterRule(_localctx, 96, RULE_else_mdp_def);
		try {
			setState(451);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(438);
				match(T__72);
				setState(439);
				mdp_reward_def();
				setState(440);
				match(T__1);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(442);
				match(T__72);
				setState(443);
				mdp_transitionProbability_def();
				setState(444);
				match(T__1);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(446);
				match(T__72);
				setState(447);
				mdp_reward_def();
				setState(448);
				mdp_transitionProbability_def();
				setState(449);
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
		enterRule(_localctx, 98, RULE_resource_increase_def);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(453);
			match(T__73);
			setState(454);
			match(NAME);
			setState(455);
			match(NUMBER);
			setState(456);
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
		enterRule(_localctx, 100, RULE_resource_decrease_def);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(458);
			match(T__74);
			setState(459);
			match(NAME);
			setState(460);
			match(NUMBER);
			setState(461);
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
		enterRule(_localctx, 102, RULE_resource_usage_def);
		int _la;
		try {
			setState(477);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(463);
				match(T__75);
				setState(464);
				match(NAME);
				setState(465);
				match(NUMBER);
				setState(466);
				match(T__1);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(467);
				match(T__75);
				setState(468);
				usage_def();
				setState(472);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__79) {
					{
					{
					setState(469);
					param_item();
					}
					}
					setState(474);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(475);
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
		enterRule(_localctx, 104, RULE_fluentresourceusage_def);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(479);
			match(T__76);
			setState(480);
			usage_def();
			setState(481);
			fluent_def();
			setState(485);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__79) {
				{
				{
				setState(482);
				param_item();
				}
				}
				setState(487);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(488);
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
		enterRule(_localctx, 106, RULE_fluent_def);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(490);
			match(T__77);
			setState(491);
			match(NAME);
			setState(492);
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
		enterRule(_localctx, 108, RULE_usage_def);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(494);
			match(T__78);
			setState(495);
			match(NAME);
			setState(496);
			match(NUMBER);
			setState(497);
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
		enterRule(_localctx, 110, RULE_param_item);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(499);
			match(T__79);
			setState(500);
			match(NUMBER);
			setState(501);
			match(NAME);
			setState(502);
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
		enterRule(_localctx, 112, RULE_value_restriction_def);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(504);
			match(T__80);
			setState(505);
			match(VAR_NAME);
			setState(506);
			constant_list();
			setState(507);
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
		enterRule(_localctx, 114, RULE_notvalue_restriction_def);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(509);
			match(T__81);
			setState(510);
			match(VAR_NAME);
			setState(511);
			constant_list();
			setState(512);
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
		enterRule(_localctx, 116, RULE_typevalue_restriction_def);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(514);
			match(T__82);
			setState(515);
			match(VAR_NAME);
			setState(516);
			constant_list();
			setState(517);
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
		enterRule(_localctx, 118, RULE_nottypevalue_restriction_def);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(519);
			match(T__83);
			setState(520);
			match(VAR_NAME);
			setState(521);
			constant_list();
			setState(522);
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
		enterRule(_localctx, 120, RULE_vardifferent_def);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(524);
			match(T__84);
			setState(525);
			match(VAR_NAME);
			setState(526);
			match(VAR_NAME);
			setState(527);
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
		enterRule(_localctx, 122, RULE_constant_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(530); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(529);
				match(NAME);
				}
				}
				setState(532); 
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
		enterRule(_localctx, 124, RULE_predicate);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(534);
			match(NAME);
			setState(535);
			match(T__10);
			setState(536);
			predicate_args();
			setState(537);
			match(T__1);
			setState(539);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__10) {
				{
				setState(538);
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
		enterRule(_localctx, 126, RULE_predicate_args);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(544);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==VAR_NAME || _la==NAME) {
				{
				{
				setState(541);
				var_or_const();
				}
				}
				setState(546);
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
		enterRule(_localctx, 128, RULE_int_args);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(550);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==VAR_NAME || _la==NUMBER) {
				{
				{
				setState(547);
				var_or_int();
				}
				}
				setState(552);
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
		enterRule(_localctx, 130, RULE_var_or_int);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(553);
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
		enterRule(_localctx, 132, RULE_double_or_int);
		int _la;
		try {
			setState(560);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DOUBLE:
				enterOuterAlt(_localctx, 1);
				{
				setState(555);
				match(DOUBLE);
				}
				break;
			case MINUS:
			case NUMBER:
				enterOuterAlt(_localctx, 2);
				{
				setState(557);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==MINUS) {
					{
					setState(556);
					match(MINUS);
					}
				}

				setState(559);
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
		enterRule(_localctx, 134, RULE_id);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(562);
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
		enterRule(_localctx, 136, RULE_var_or_const);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(564);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3^\u0239\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\3\2\3\2\3\2\5\2"+
		"\u0090\n\2\3\2\3\2\7\2\u0094\n\2\f\2\16\2\u0097\13\2\3\3\3\3\3\3\3\3\3"+
		"\3\5\3\u009e\n\3\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\7\3"+
		"\7\7\7\u00ae\n\7\f\7\16\7\u00b1\13\7\3\7\3\7\3\b\3\b\3\t\3\t\3\t\3\t\3"+
		"\t\3\n\3\n\3\n\3\n\6\n\u00c0\n\n\r\n\16\n\u00c1\3\n\3\n\3\13\3\13\3\f"+
		"\3\f\5\f\u00ca\n\f\3\f\3\f\7\f\u00ce\n\f\f\f\16\f\u00d1\13\f\3\f\3\f\3"+
		"\r\3\r\5\r\u00d7\n\r\3\r\3\r\7\r\u00db\n\r\f\r\16\r\u00de\13\r\3\r\3\r"+
		"\3\16\3\16\3\16\3\16\3\16\3\16\5\16\u00e8\n\16\3\16\3\16\3\17\3\17\3\17"+
		"\3\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\5\20\u00fb"+
		"\n\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21"+
		"\3\21\3\21\3\21\3\21\3\21\3\21\3\21\5\21\u0111\n\21\3\22\3\22\3\22\3\22"+
		"\3\22\3\23\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3\25\3\25\3\25"+
		"\3\25\3\26\3\26\3\26\3\26\3\26\3\27\3\27\5\27\u012d\n\27\3\30\3\30\3\30"+
		"\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\31\3\31\3\31\3\31"+
		"\3\31\3\31\3\31\3\31\3\32\3\32\5\32\u0146\n\32\3\33\3\33\3\33\3\33\3\33"+
		"\3\33\3\33\3\33\3\33\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\35\3\35"+
		"\5\35\u015b\n\35\3\36\3\36\3\36\3\36\3\36\3\36\3\37\3\37\3\37\3\37\3\37"+
		"\3\37\3\37\3\37\3 \3 \3!\3!\3\"\3\"\5\"\u0171\n\"\3#\3#\3#\3#\3#\3#\3"+
		"#\3$\3$\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3&\3&\3\'\3\'\3(\7(\u018b\n(\f("+
		"\16(\u018e\13(\3)\3)\3)\3)\3)\3)\3*\3*\3+\3+\5+\u019a\n+\3,\3,\3,\3,\3"+
		"-\3-\3-\3-\3.\3.\3.\5.\u01a7\n.\3/\3/\3/\3/\3/\3\60\3\60\3\60\3\60\3\60"+
		"\3\61\3\61\3\61\3\61\3\61\3\61\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62"+
		"\3\62\3\62\3\62\3\62\3\62\5\62\u01c6\n\62\3\63\3\63\3\63\3\63\3\63\3\64"+
		"\3\64\3\64\3\64\3\64\3\65\3\65\3\65\3\65\3\65\3\65\3\65\7\65\u01d9\n\65"+
		"\f\65\16\65\u01dc\13\65\3\65\3\65\5\65\u01e0\n\65\3\66\3\66\3\66\3\66"+
		"\7\66\u01e6\n\66\f\66\16\66\u01e9\13\66\3\66\3\66\3\67\3\67\3\67\3\67"+
		"\38\38\38\38\38\39\39\39\39\39\3:\3:\3:\3:\3:\3;\3;\3;\3;\3;\3<\3<\3<"+
		"\3<\3<\3=\3=\3=\3=\3=\3>\3>\3>\3>\3>\3?\6?\u0215\n?\r?\16?\u0216\3@\3"+
		"@\3@\3@\3@\5@\u021e\n@\3A\7A\u0221\nA\fA\16A\u0224\13A\3B\7B\u0227\nB"+
		"\fB\16B\u022a\13B\3C\3C\3D\3D\5D\u0230\nD\3D\5D\u0233\nD\3E\3E\3F\3F\3"+
		"F\2\2G\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<"+
		">@BDFHJLNPRTVXZ\\^`bdfhjlnprtvxz|~\u0080\u0082\u0084\u0086\u0088\u008a"+
		"\2\n\3\2\27\34\4\2\27\37ZZ\3\2 $\3\2&A\3\2BC\4\2FF^^\4\2XX^^\4\2XX[[\2"+
		"\u0230\2\u008c\3\2\2\2\4\u009d\3\2\2\2\6\u009f\3\2\2\2\b\u00a3\3\2\2\2"+
		"\n\u00a7\3\2\2\2\f\u00ab\3\2\2\2\16\u00b4\3\2\2\2\20\u00b6\3\2\2\2\22"+
		"\u00bb\3\2\2\2\24\u00c5\3\2\2\2\26\u00c7\3\2\2\2\30\u00d4\3\2\2\2\32\u00e1"+
		"\3\2\2\2\34\u00eb\3\2\2\2\36\u00fa\3\2\2\2 \u0110\3\2\2\2\"\u0112\3\2"+
		"\2\2$\u0117\3\2\2\2&\u011c\3\2\2\2(\u0121\3\2\2\2*\u0125\3\2\2\2,\u012c"+
		"\3\2\2\2.\u012e\3\2\2\2\60\u013b\3\2\2\2\62\u0145\3\2\2\2\64\u0147\3\2"+
		"\2\2\66\u0150\3\2\2\28\u015a\3\2\2\2:\u015c\3\2\2\2<\u0162\3\2\2\2>\u016a"+
		"\3\2\2\2@\u016c\3\2\2\2B\u0170\3\2\2\2D\u0172\3\2\2\2F\u0179\3\2\2\2H"+
		"\u017b\3\2\2\2J\u0185\3\2\2\2L\u0187\3\2\2\2N\u018c\3\2\2\2P\u018f\3\2"+
		"\2\2R\u0195\3\2\2\2T\u0199\3\2\2\2V\u019b\3\2\2\2X\u019f\3\2\2\2Z\u01a6"+
		"\3\2\2\2\\\u01a8\3\2\2\2^\u01ad\3\2\2\2`\u01b2\3\2\2\2b\u01c5\3\2\2\2"+
		"d\u01c7\3\2\2\2f\u01cc\3\2\2\2h\u01df\3\2\2\2j\u01e1\3\2\2\2l\u01ec\3"+
		"\2\2\2n\u01f0\3\2\2\2p\u01f5\3\2\2\2r\u01fa\3\2\2\2t\u01ff\3\2\2\2v\u0204"+
		"\3\2\2\2x\u0209\3\2\2\2z\u020e\3\2\2\2|\u0214\3\2\2\2~\u0218\3\2\2\2\u0080"+
		"\u0222\3\2\2\2\u0082\u0228\3\2\2\2\u0084\u022b\3\2\2\2\u0086\u0232\3\2"+
		"\2\2\u0088\u0234\3\2\2\2\u008a\u0236\3\2\2\2\u008c\u008d\5\6\4\2\u008d"+
		"\u008f\5\b\5\2\u008e\u0090\5\n\6\2\u008f\u008e\3\2\2\2\u008f\u0090\3\2"+
		"\2\2\u0090\u0091\3\2\2\2\u0091\u0095\5\f\7\2\u0092\u0094\5\4\3\2\u0093"+
		"\u0092\3\2\2\2\u0094\u0097\3\2\2\2\u0095\u0093\3\2\2\2\u0095\u0096\3\2"+
		"\2\2\u0096\3\3\2\2\2\u0097\u0095\3\2\2\2\u0098\u009e\5\20\t\2\u0099\u009e"+
		"\5j\66\2\u009a\u009e\5\22\n\2\u009b\u009e\5\30\r\2\u009c\u009e\5\26\f"+
		"\2\u009d\u0098\3\2\2\2\u009d\u0099\3\2\2\2\u009d\u009a\3\2\2\2\u009d\u009b"+
		"\3\2\2\2\u009d\u009c\3\2\2\2\u009e\5\3\2\2\2\u009f\u00a0\7\3\2\2\u00a0"+
		"\u00a1\7[\2\2\u00a1\u00a2\7\4\2\2\u00a2\7\3\2\2\2\u00a3\u00a4\7\5\2\2"+
		"\u00a4\u00a5\7^\2\2\u00a5\u00a6\7\4\2\2\u00a6\t\3\2\2\2\u00a7\u00a8\7"+
		"\6\2\2\u00a8\u00a9\7^\2\2\u00a9\u00aa\7\4\2\2\u00aa\13\3\2\2\2\u00ab\u00af"+
		"\7\7\2\2\u00ac\u00ae\5\16\b\2\u00ad\u00ac\3\2\2\2\u00ae\u00b1\3\2\2\2"+
		"\u00af\u00ad\3\2\2\2\u00af\u00b0\3\2\2\2\u00b0\u00b2\3\2\2\2\u00b1\u00af"+
		"\3\2\2\2\u00b2\u00b3\7\4\2\2\u00b3\r\3\2\2\2\u00b4\u00b5\7[\2\2\u00b5"+
		"\17\3\2\2\2\u00b6\u00b7\7\b\2\2\u00b7\u00b8\7[\2\2\u00b8\u00b9\7^\2\2"+
		"\u00b9\u00ba\7\4\2\2\u00ba\21\3\2\2\2\u00bb\u00bc\7\t\2\2\u00bc\u00bd"+
		"\5\24\13\2\u00bd\u00bf\7^\2\2\u00be\u00c0\7[\2\2\u00bf\u00be\3\2\2\2\u00c0"+
		"\u00c1\3\2\2\2\u00c1\u00bf\3\2\2\2\u00c1\u00c2\3\2\2\2\u00c2\u00c3\3\2"+
		"\2\2\u00c3\u00c4\7\4\2\2\u00c4\23\3\2\2\2\u00c5\u00c6\7[\2\2\u00c6\25"+
		"\3\2\2\2\u00c7\u00c9\7\n\2\2\u00c8\u00ca\7^\2\2\u00c9\u00c8\3\2\2\2\u00c9"+
		"\u00ca\3\2\2\2\u00ca\u00cb\3\2\2\2\u00cb\u00cf\5\32\16\2\u00cc\u00ce\5"+
		"\36\20\2\u00cd\u00cc\3\2\2\2\u00ce\u00d1\3\2\2\2\u00cf\u00cd\3\2\2\2\u00cf"+
		"\u00d0\3\2\2\2\u00d0\u00d2\3\2\2\2\u00d1\u00cf\3\2\2\2\u00d2\u00d3\7\4"+
		"\2\2\u00d3\27\3\2\2\2\u00d4\u00d6\7\13\2\2\u00d5\u00d7\7^\2\2\u00d6\u00d5"+
		"\3\2\2\2\u00d6\u00d7\3\2\2\2\u00d7\u00d8\3\2\2\2\u00d8\u00dc\5\32\16\2"+
		"\u00d9\u00db\5 \21\2\u00da\u00d9\3\2\2\2\u00db\u00de\3\2\2\2\u00dc\u00da"+
		"\3\2\2\2\u00dc\u00dd\3\2\2\2\u00dd\u00df\3\2\2\2\u00de\u00dc\3\2\2\2\u00df"+
		"\u00e0\7\4\2\2\u00e0\31\3\2\2\2\u00e1\u00e2\7\f\2\2\u00e2\u00e3\5\16\b"+
		"\2\u00e3\u00e4\7\r\2\2\u00e4\u00e5\5\u0080A\2\u00e5\u00e7\7\4\2\2\u00e6"+
		"\u00e8\5\34\17\2\u00e7\u00e6\3\2\2\2\u00e7\u00e8\3\2\2\2\u00e8\u00e9\3"+
		"\2\2\2\u00e9\u00ea\7\4\2\2\u00ea\33\3\2\2\2\u00eb\u00ec\7\r\2\2\u00ec"+
		"\u00ed\5\u0082B\2\u00ed\u00ee\7\4\2\2\u00ee\35\3\2\2\2\u00ef\u00fb\5\""+
		"\22\2\u00f0\u00fb\5B\"\2\u00f1\u00fb\5h\65\2\u00f2\u00fb\5r:\2\u00f3\u00fb"+
		"\5t;\2\u00f4\u00fb\5v<\2\u00f5\u00fb\5x=\2\u00f6\u00fb\5z>\2\u00f7\u00fb"+
		"\5$\23\2\u00f8\u00fb\5*\26\2\u00f9\u00fb\58\35\2\u00fa\u00ef\3\2\2\2\u00fa"+
		"\u00f0\3\2\2\2\u00fa\u00f1\3\2\2\2\u00fa\u00f2\3\2\2\2\u00fa\u00f3\3\2"+
		"\2\2\u00fa\u00f4\3\2\2\2\u00fa\u00f5\3\2\2\2\u00fa\u00f6\3\2\2\2\u00fa"+
		"\u00f7\3\2\2\2\u00fa\u00f8\3\2\2\2\u00fa\u00f9\3\2\2\2\u00fb\37\3\2\2"+
		"\2\u00fc\u0111\5\"\22\2\u00fd\u0111\5B\"\2\u00fe\u0111\5&\24\2\u00ff\u0111"+
		"\5(\25\2\u0100\u0111\5h\65\2\u0101\u0111\5r:\2\u0102\u0111\5t;\2\u0103"+
		"\u0111\5v<\2\u0104\u0111\5x=\2\u0105\u0111\5z>\2\u0106\u0111\58\35\2\u0107"+
		"\u0111\5,\27\2\u0108\u0111\5\62\32\2\u0109\u0111\5V,\2\u010a\u0111\5X"+
		"-\2\u010b\u0111\5Z.\2\u010c\u0111\5b\62\2\u010d\u0111\5^\60\2\u010e\u0111"+
		"\5d\63\2\u010f\u0111\5f\64\2\u0110\u00fc\3\2\2\2\u0110\u00fd\3\2\2\2\u0110"+
		"\u00fe\3\2\2\2\u0110\u00ff\3\2\2\2\u0110\u0100\3\2\2\2\u0110\u0101\3\2"+
		"\2\2\u0110\u0102\3\2\2\2\u0110\u0103\3\2\2\2\u0110\u0104\3\2\2\2\u0110"+
		"\u0105\3\2\2\2\u0110\u0106\3\2\2\2\u0110\u0107\3\2\2\2\u0110\u0108\3\2"+
		"\2\2\u0110\u0109\3\2\2\2\u0110\u010a\3\2\2\2\u0110\u010b\3\2\2\2\u0110"+
		"\u010c\3\2\2\2\u0110\u010d\3\2\2\2\u0110\u010e\3\2\2\2\u0110\u010f\3\2"+
		"\2\2\u0111!\3\2\2\2\u0112\u0113\7\16\2\2\u0113\u0114\5\u0088E\2\u0114"+
		"\u0115\5~@\2\u0115\u0116\7\4\2\2\u0116#\3\2\2\2\u0117\u0118\7\17\2\2\u0118"+
		"\u0119\5\u0088E\2\u0119\u011a\5~@\2\u011a\u011b\7\4\2\2\u011b%\3\2\2\2"+
		"\u011c\u011d\7\20\2\2\u011d\u011e\5\u0088E\2\u011e\u011f\5~@\2\u011f\u0120"+
		"\7\4\2\2\u0120\'\3\2\2\2\u0121\u0122\7\21\2\2\u0122\u0123\5\u0088E\2\u0123"+
		"\u0124\7\4\2\2\u0124)\3\2\2\2\u0125\u0126\7\22\2\2\u0126\u0127\5\u0088"+
		"E\2\u0127\u0128\5\u0088E\2\u0128\u0129\7\4\2\2\u0129+\3\2\2\2\u012a\u012d"+
		"\5.\30\2\u012b\u012d\5\60\31\2\u012c\u012a\3\2\2\2\u012c\u012b\3\2\2\2"+
		"\u012d-\3\2\2\2\u012e\u012f\7\23\2\2\u012f\u0130\7\r\2\2\u0130\u0131\5"+
		"J&\2\u0131\u0132\7\24\2\2\u0132\u0133\5J&\2\u0133\u0134\7\4\2\2\u0134"+
		"\u0135\7\r\2\2\u0135\u0136\7X\2\2\u0136\u0137\7\24\2\2\u0137\u0138\7X"+
		"\2\2\u0138\u0139\7\4\2\2\u0139\u013a\7\4\2\2\u013a/\3\2\2\2\u013b\u013c"+
		"\7\23\2\2\u013c\u013d\7X\2\2\u013d\u013e\5> \2\u013e\u013f\7X\2\2\u013f"+
		"\u0140\5@!\2\u0140\u0141\5\u0084C\2\u0141\u0142\7\4\2\2\u0142\61\3\2\2"+
		"\2\u0143\u0146\5\64\33\2\u0144\u0146\5\66\34\2\u0145\u0143\3\2\2\2\u0145"+
		"\u0144\3\2\2\2\u0146\63\3\2\2\2\u0147\u0148\7\25\2\2\u0148\u0149\7\r\2"+
		"\2\u0149\u014a\5L\'\2\u014a\u014b\7\4\2\2\u014b\u014c\7\r\2\2\u014c\u014d"+
		"\7X\2\2\u014d\u014e\7\4\2\2\u014e\u014f\7\4\2\2\u014f\65\3\2\2\2\u0150"+
		"\u0151\7\25\2\2\u0151\u0152\7\r\2\2\u0152\u0153\7X\2\2\u0153\u0154\7\24"+
		"\2\2\u0154\u0155\7X\2\2\u0155\u0156\7\4\2\2\u0156\u0157\7\4\2\2\u0157"+
		"\67\3\2\2\2\u0158\u015b\5:\36\2\u0159\u015b\5<\37\2\u015a\u0158\3\2\2"+
		"\2\u015a\u0159\3\2\2\2\u015b9\3\2\2\2\u015c\u015d\7\26\2\2\u015d\u015e"+
		"\7X\2\2\u015e\u015f\5> \2\u015f\u0160\5\u0084C\2\u0160\u0161\7\4\2\2\u0161"+
		";\3\2\2\2\u0162\u0163\7\26\2\2\u0163\u0164\7X\2\2\u0164\u0165\5> \2\u0165"+
		"\u0166\7X\2\2\u0166\u0167\5@!\2\u0167\u0168\5\u0084C\2\u0168\u0169\7\4"+
		"\2\2\u0169=\3\2\2\2\u016a\u016b\t\2\2\2\u016b?\3\2\2\2\u016c\u016d\t\3"+
		"\2\2\u016dA\3\2\2\2\u016e\u0171\5D#\2\u016f\u0171\5H%\2\u0170\u016e\3"+
		"\2\2\2\u0170\u016f\3\2\2\2\u0171C\3\2\2\2\u0172\u0173\5F$\2\u0173\u0174"+
		"\5N(\2\u0174\u0175\7\r\2\2\u0175\u0176\5T+\2\u0176\u0177\7\4\2\2\u0177"+
		"\u0178\7\4\2\2\u0178E\3\2\2\2\u0179\u017a\t\4\2\2\u017aG\3\2\2\2\u017b"+
		"\u017c\7%\2\2\u017c\u017d\5J&\2\u017d\u017e\5N(\2\u017e\u017f\7\r\2\2"+
		"\u017f\u0180\5T+\2\u0180\u0181\7\24\2\2\u0181\u0182\5T+\2\u0182\u0183"+
		"\7\4\2\2\u0183\u0184\7\4\2\2\u0184I\3\2\2\2\u0185\u0186\t\5\2\2\u0186"+
		"K\3\2\2\2\u0187\u0188\t\6\2\2\u0188M\3\2\2\2\u0189\u018b\5P)\2\u018a\u0189"+
		"\3\2\2\2\u018b\u018e\3\2\2\2\u018c\u018a\3\2\2\2\u018c\u018d\3\2\2\2\u018d"+
		"O\3\2\2\2\u018e\u018c\3\2\2\2\u018f\u0190\7D\2\2\u0190\u0191\5R*\2\u0191"+
		"\u0192\7\24\2\2\u0192\u0193\5R*\2\u0193\u0194\7E\2\2\u0194Q\3\2\2\2\u0195"+
		"\u0196\t\7\2\2\u0196S\3\2\2\2\u0197\u019a\5\u0088E\2\u0198\u019a\7G\2"+
		"\2\u0199\u0197\3\2\2\2\u0199\u0198\3\2\2\2\u019aU\3\2\2\2\u019b\u019c"+
		"\7H\2\2\u019c\u019d\5\u0086D\2\u019d\u019e\7\4\2\2\u019eW\3\2\2\2\u019f"+
		"\u01a0\7I\2\2\u01a0\u01a1\5\u0086D\2\u01a1\u01a2\7\4\2\2\u01a2Y\3\2\2"+
		"\2\u01a3\u01a7\5\\/\2\u01a4\u01a7\5^\60\2\u01a5\u01a7\5`\61\2\u01a6\u01a3"+
		"\3\2\2\2\u01a6\u01a4\3\2\2\2\u01a6\u01a5\3\2\2\2\u01a7[\3\2\2\2\u01a8"+
		"\u01a9\7J\2\2\u01a9\u01aa\5r:\2\u01aa\u01ab\5V,\2\u01ab\u01ac\7\4\2\2"+
		"\u01ac]\3\2\2\2\u01ad\u01ae\7J\2\2\u01ae\u01af\5r:\2\u01af\u01b0\5X-\2"+
		"\u01b0\u01b1\7\4\2\2\u01b1_\3\2\2\2\u01b2\u01b3\7J\2\2\u01b3\u01b4\5r"+
		":\2\u01b4\u01b5\5V,\2\u01b5\u01b6\5X-\2\u01b6\u01b7\7\4\2\2\u01b7a\3\2"+
		"\2\2\u01b8\u01b9\7K\2\2\u01b9\u01ba\5V,\2\u01ba\u01bb\7\4\2\2\u01bb\u01c6"+
		"\3\2\2\2\u01bc\u01bd\7K\2\2\u01bd\u01be\5X-\2\u01be\u01bf\7\4\2\2\u01bf"+
		"\u01c6\3\2\2\2\u01c0\u01c1\7K\2\2\u01c1\u01c2\5V,\2\u01c2\u01c3\5X-\2"+
		"\u01c3\u01c4\7\4\2\2\u01c4\u01c6\3\2\2\2\u01c5\u01b8\3\2\2\2\u01c5\u01bc"+
		"\3\2\2\2\u01c5\u01c0\3\2\2\2\u01c6c\3\2\2\2\u01c7\u01c8\7L\2\2\u01c8\u01c9"+
		"\7[\2\2\u01c9\u01ca\7^\2\2\u01ca\u01cb\7\4\2\2\u01cbe\3\2\2\2\u01cc\u01cd"+
		"\7M\2\2\u01cd\u01ce\7[\2\2\u01ce\u01cf\7^\2\2\u01cf\u01d0\7\4\2\2\u01d0"+
		"g\3\2\2\2\u01d1\u01d2\7N\2\2\u01d2\u01d3\7[\2\2\u01d3\u01d4\7^\2\2\u01d4"+
		"\u01e0\7\4\2\2\u01d5\u01d6\7N\2\2\u01d6\u01da\5n8\2\u01d7\u01d9\5p9\2"+
		"\u01d8\u01d7\3\2\2\2\u01d9\u01dc\3\2\2\2\u01da\u01d8\3\2\2\2\u01da\u01db"+
		"\3\2\2\2\u01db\u01dd\3\2\2\2\u01dc\u01da\3\2\2\2\u01dd\u01de\7\4\2\2\u01de"+
		"\u01e0\3\2\2\2\u01df\u01d1\3\2\2\2\u01df\u01d5\3\2\2\2\u01e0i\3\2\2\2"+
		"\u01e1\u01e2\7O\2\2\u01e2\u01e3\5n8\2\u01e3\u01e7\5l\67\2\u01e4\u01e6"+
		"\5p9\2\u01e5\u01e4\3\2\2\2\u01e6\u01e9\3\2\2\2\u01e7\u01e5\3\2\2\2\u01e7"+
		"\u01e8\3\2\2\2\u01e8\u01ea\3\2\2\2\u01e9\u01e7\3\2\2\2\u01ea\u01eb\7\4"+
		"\2\2\u01ebk\3\2\2\2\u01ec\u01ed\7P\2\2\u01ed\u01ee\7[\2\2\u01ee\u01ef"+
		"\7\4\2\2\u01efm\3\2\2\2\u01f0\u01f1\7Q\2\2\u01f1\u01f2\7[\2\2\u01f2\u01f3"+
		"\7^\2\2\u01f3\u01f4\7\4\2\2\u01f4o\3\2\2\2\u01f5\u01f6\7R\2\2\u01f6\u01f7"+
		"\7^\2\2\u01f7\u01f8\7[\2\2\u01f8\u01f9\7\4\2\2\u01f9q\3\2\2\2\u01fa\u01fb"+
		"\7S\2\2\u01fb\u01fc\7X\2\2\u01fc\u01fd\5|?\2\u01fd\u01fe\7\4\2\2\u01fe"+
		"s\3\2\2\2\u01ff\u0200\7T\2\2\u0200\u0201\7X\2\2\u0201\u0202\5|?\2\u0202"+
		"\u0203\7\4\2\2\u0203u\3\2\2\2\u0204\u0205\7U\2\2\u0205\u0206\7X\2\2\u0206"+
		"\u0207\5|?\2\u0207\u0208\7\4\2\2\u0208w\3\2\2\2\u0209\u020a\7V\2\2\u020a"+
		"\u020b\7X\2\2\u020b\u020c\5|?\2\u020c\u020d\7\4\2\2\u020dy\3\2\2\2\u020e"+
		"\u020f\7W\2\2\u020f\u0210\7X\2\2\u0210\u0211\7X\2\2\u0211\u0212\7\4\2"+
		"\2\u0212{\3\2\2\2\u0213\u0215\7[\2\2\u0214\u0213\3\2\2\2\u0215\u0216\3"+
		"\2\2\2\u0216\u0214\3\2\2\2\u0216\u0217\3\2\2\2\u0217}\3\2\2\2\u0218\u0219"+
		"\7[\2\2\u0219\u021a\7\r\2\2\u021a\u021b\5\u0080A\2\u021b\u021d\7\4\2\2"+
		"\u021c\u021e\5\34\17\2\u021d\u021c\3\2\2\2\u021d\u021e\3\2\2\2\u021e\177"+
		"\3\2\2\2\u021f\u0221\5\u008aF\2\u0220\u021f\3\2\2\2\u0221\u0224\3\2\2"+
		"\2\u0222\u0220\3\2\2\2\u0222\u0223\3\2\2\2\u0223\u0081\3\2\2\2\u0224\u0222"+
		"\3\2\2\2\u0225\u0227\5\u0084C\2\u0226\u0225\3\2\2\2\u0227\u022a\3\2\2"+
		"\2\u0228\u0226\3\2\2\2\u0228\u0229\3\2\2\2\u0229\u0083\3\2\2\2\u022a\u0228"+
		"\3\2\2\2\u022b\u022c\t\b\2\2\u022c\u0085\3\2\2\2\u022d\u0233\7Y\2\2\u022e"+
		"\u0230\7Z\2\2\u022f\u022e\3\2\2\2\u022f\u0230\3\2\2\2\u0230\u0231\3\2"+
		"\2\2\u0231\u0233\7^\2\2\u0232\u022d\3\2\2\2\u0232\u022f\3\2\2\2\u0233"+
		"\u0087\3\2\2\2\u0234\u0235\7[\2\2\u0235\u0089\3\2\2\2\u0236\u0237\t\t"+
		"\2\2\u0237\u008b\3\2\2\2\37\u008f\u0095\u009d\u00af\u00c1\u00c9\u00cf"+
		"\u00d6\u00dc\u00e7\u00fa\u0110\u012c\u0145\u015a\u0170\u018c\u0199\u01a6"+
		"\u01c5\u01da\u01df\u01e7\u0216\u021d\u0222\u0228\u022f\u0232";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}