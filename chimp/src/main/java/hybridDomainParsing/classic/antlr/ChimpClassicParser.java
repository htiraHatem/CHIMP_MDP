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
		T__80=81, VAR_NAME=82, DOUBLE=83, NAME=84, Comment=85, WS=86, NUMBER=87;
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
		RULE_bound = 40, RULE_id_or_task = 41, RULE_mdp_reward_def = 42, RULE_resource_usage_def = 43, 
		RULE_fluentresourceusage_def = 44, RULE_fluent_def = 45, RULE_usage_def = 46, 
		RULE_param_item = 47, RULE_value_restriction_def = 48, RULE_notvalue_restriction_def = 49, 
		RULE_typevalue_restriction_def = 50, RULE_nottypevalue_restriction_def = 51, 
		RULE_vardifferent_def = 52, RULE_constant_list = 53, RULE_predicate = 54, 
		RULE_predicate_args = 55, RULE_int_args = 56, RULE_var_or_int = 57, RULE_id = 58, 
		RULE_var_or_const = 59;
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
			"mdp_reward_def", "resource_usage_def", "fluentresourceusage_def", "fluent_def", 
			"usage_def", "param_item", "value_restriction_def", "notvalue_restriction_def", 
			"typevalue_restriction_def", "nottypevalue_restriction_def", "vardifferent_def", 
			"constant_list", "predicate", "predicate_args", "int_args", "var_or_int", 
			"id", "var_or_const"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'(HybridHTNDomain'", "')'", "'(MaxArgs'", "'(MaxIntegerArgs'", 
			"'(PredicateSymbols'", "'(Resource'", "'(StateVariable'", "'(:method'", 
			"'(:operator'", "'(Head'", "'('", "'(Pre'", "'(Sub'", "'(Add'", "'(Del'", 
			"'(Ordering'", "'(SC'", "','", "'(DelSC'", "'(IC'", "'='", "'!='", "'>'", 
			"'<'", "'>='", "'<='", "'+'", "'-'", "'*'", "'/'", "'(Constraint Duration'", 
			"'(Constraint Release'", "'(Constraint Deadline'", "'(Constraint Forever'", 
			"'(Constraint At'", "'(Constraint'", "'Before'", "'Meets'", "'Overlaps'", 
			"'FinishedBy'", "'Contains'", "'StartedBy'", "'Equals'", "'Starts'", 
			"'During'", "'Finishes'", "'OverlappedBy'", "'After'", "'MetBy'", "'BeforeOrMeets'", 
			"'MetByOrAfter'", "'MetByOrOverlappedBy'", "'MetByOrOverlappedByOrAfter'", 
			"'MetByOrOverlappedByOrIsFinishedByOrDuring'", "'MeetsOrOverlapsOrBefore'", 
			"'DuringOrEquals'", "'DuringOrEqualsOrStartsOrFinishes'", "'MeetsOrOverlapsOrFinishedByOrContains'", 
			"'ContainsOrStartedByOrOverlappedByOrMetBy'", "'EndsDuring'", "'EndsOrEndedBy'", 
			"'StartsOrStartedBy'", "'NotBeforeAndNotAfter'", "'Duration'", "'At'", 
			"'Size'", "'['", "']'", "'INF'", "'task'", "'(Reward'", "'(ResourceUsage'", 
			"'(FluentResourceUsage'", "'(Fluent'", "'(Usage'", "'(Param'", "'(Values'", 
			"'(NotValues'", "'(Type'", "'(NotType'", "'(VarDifferent'"
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
			null, null, null, null, null, null, null, null, null, null, "VAR_NAME", 
			"DOUBLE", "NAME", "Comment", "WS", "NUMBER"
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
			setState(120);
			domain_name_def();
			setState(121);
			maxargs_def();
			setState(123);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__3) {
				{
				setState(122);
				maxintargs_def();
				}
			}

			setState(125);
			predicatesymbols_def();
			setState(129);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8))) != 0) || _la==T__72) {
				{
				{
				setState(126);
				domain_item();
				}
				}
				setState(131);
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
			setState(137);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__5:
				_localctx = new Domain_item_resourceContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(132);
				resource_def();
				}
				break;
			case T__72:
				_localctx = new Domain_item_fluentresourceusageContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(133);
				fluentresourceusage_def();
				}
				break;
			case T__6:
				_localctx = new Domain_item_statevariableContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(134);
				statevariable_def();
				}
				break;
			case T__8:
				_localctx = new Domain_item_operatorContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(135);
				operator_def();
				}
				break;
			case T__7:
				_localctx = new Domain_item_methodContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(136);
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
			setState(139);
			match(T__0);
			setState(140);
			match(NAME);
			setState(141);
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
			setState(143);
			match(T__2);
			setState(144);
			match(NUMBER);
			setState(145);
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
			setState(147);
			match(T__3);
			setState(148);
			match(NUMBER);
			setState(149);
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
			setState(151);
			match(T__4);
			setState(155);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NAME) {
				{
				{
				setState(152);
				predicate_symbol();
				}
				}
				setState(157);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(158);
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
			setState(160);
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
			setState(162);
			match(T__5);
			setState(163);
			match(NAME);
			setState(164);
			match(NUMBER);
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
			setState(167);
			match(T__6);
			setState(168);
			statevariable_name();
			setState(169);
			match(NUMBER);
			setState(171); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(170);
				match(NAME);
				}
				}
				setState(173); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==NAME );
			setState(175);
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
			setState(177);
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
			setState(179);
			match(T__7);
			setState(181);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NUMBER) {
				{
				setState(180);
				match(NUMBER);
				}
			}

			setState(183);
			head();
			setState(187);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__11) | (1L << T__12) | (1L << T__15) | (1L << T__19) | (1L << T__30) | (1L << T__31) | (1L << T__32) | (1L << T__33) | (1L << T__34) | (1L << T__35))) != 0) || ((((_la - 72)) & ~0x3f) == 0 && ((1L << (_la - 72)) & ((1L << (T__71 - 72)) | (1L << (T__76 - 72)) | (1L << (T__77 - 72)) | (1L << (T__78 - 72)) | (1L << (T__79 - 72)) | (1L << (T__80 - 72)))) != 0)) {
				{
				{
				setState(184);
				method_element();
				}
				}
				setState(189);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(190);
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
			setState(192);
			match(T__8);
			setState(194);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NUMBER) {
				{
				setState(193);
				match(NUMBER);
				}
			}

			setState(196);
			head();
			setState(200);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__11) | (1L << T__13) | (1L << T__14) | (1L << T__16) | (1L << T__18) | (1L << T__19) | (1L << T__30) | (1L << T__31) | (1L << T__32) | (1L << T__33) | (1L << T__34) | (1L << T__35))) != 0) || ((((_la - 71)) & ~0x3f) == 0 && ((1L << (_la - 71)) & ((1L << (T__70 - 71)) | (1L << (T__71 - 71)) | (1L << (T__76 - 71)) | (1L << (T__77 - 71)) | (1L << (T__78 - 71)) | (1L << (T__79 - 71)) | (1L << (T__80 - 71)))) != 0)) {
				{
				{
				setState(197);
				op_element();
				}
				}
				setState(202);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(203);
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
			setState(205);
			match(T__9);
			setState(206);
			predicate_symbol();
			setState(207);
			match(T__10);
			setState(208);
			predicate_args();
			setState(209);
			match(T__1);
			setState(211);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__10) {
				{
				setState(210);
				int_args_def();
				}
			}

			setState(213);
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
			setState(215);
			match(T__10);
			setState(216);
			int_args();
			setState(217);
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
			setState(230);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__11:
				_localctx = new Precondition_m_elementContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(219);
				precondition_def();
				}
				break;
			case T__30:
			case T__31:
			case T__32:
			case T__33:
			case T__34:
			case T__35:
				_localctx = new Temporal_constraint_m_elementContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(220);
				temporal_constraint_def();
				}
				break;
			case T__71:
				_localctx = new Resource_usage_m_elementContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(221);
				resource_usage_def();
				}
				break;
			case T__76:
				_localctx = new Value_restriction_m_elementContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(222);
				value_restriction_def();
				}
				break;
			case T__77:
				_localctx = new Notvalue_restriction_m_elementContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(223);
				notvalue_restriction_def();
				}
				break;
			case T__78:
				_localctx = new Typevalue_restriction_m_elementContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(224);
				typevalue_restriction_def();
				}
				break;
			case T__79:
				_localctx = new Nottypevalue_restriction_m_elementContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(225);
				nottypevalue_restriction_def();
				}
				break;
			case T__80:
				_localctx = new Vardifferent_m_elementContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(226);
				vardifferent_def();
				}
				break;
			case T__12:
				_localctx = new Subtask_def_m_elementContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(227);
				subtask_def();
				}
				break;
			case T__15:
				_localctx = new Ordering_def_m_elementContext(_localctx);
				enterOuterAlt(_localctx, 10);
				{
				setState(228);
				ordering_constraint_def();
				}
				break;
			case T__19:
				_localctx = new Integer_constraint_m_elementContext(_localctx);
				enterOuterAlt(_localctx, 11);
				{
				setState(229);
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

	public final Op_elementContext op_element() throws RecognitionException {
		Op_elementContext _localctx = new Op_elementContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_op_element);
		try {
			setState(246);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__11:
				_localctx = new Precondition_op_elementContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(232);
				precondition_def();
				}
				break;
			case T__30:
			case T__31:
			case T__32:
			case T__33:
			case T__34:
			case T__35:
				_localctx = new Temporal_constraint_op_elementContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(233);
				temporal_constraint_def();
				}
				break;
			case T__13:
				_localctx = new Positive_effect_def_op_elementContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(234);
				positive_effect_def();
				}
				break;
			case T__14:
				_localctx = new Negative_effect_def_op_elementContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(235);
				negative_effect_def();
				}
				break;
			case T__71:
				_localctx = new Resource_usage_op_elementContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(236);
				resource_usage_def();
				}
				break;
			case T__76:
				_localctx = new Value_restriction_op_elementContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(237);
				value_restriction_def();
				}
				break;
			case T__77:
				_localctx = new Notvalue_restriction_op_elementContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(238);
				notvalue_restriction_def();
				}
				break;
			case T__78:
				_localctx = new Typevalue_restriction_op_elementContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(239);
				typevalue_restriction_def();
				}
				break;
			case T__79:
				_localctx = new Nottypevalue_restriction_op_elementContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(240);
				nottypevalue_restriction_def();
				}
				break;
			case T__80:
				_localctx = new Vardifferent_op_elementContext(_localctx);
				enterOuterAlt(_localctx, 10);
				{
				setState(241);
				vardifferent_def();
				}
				break;
			case T__19:
				_localctx = new Integer_constraint_op_elementContext(_localctx);
				enterOuterAlt(_localctx, 11);
				{
				setState(242);
				integer_constraint_def();
				}
				break;
			case T__16:
				_localctx = new Spatial_constraint_op_elementContext(_localctx);
				enterOuterAlt(_localctx, 12);
				{
				setState(243);
				spatial_constraint_def();
				}
				break;
			case T__18:
				_localctx = new Delete_spatial_constraint_op_elementContext(_localctx);
				enterOuterAlt(_localctx, 13);
				{
				setState(244);
				delete_spatial_constraint_def();
				}
				break;
			case T__70:
				_localctx = new Mdp_reward_op_elementContext(_localctx);
				enterOuterAlt(_localctx, 14);
				{
				setState(245);
				mdp_reward_def();
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
			setState(248);
			match(T__11);
			setState(249);
			id();
			setState(250);
			predicate();
			setState(251);
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
			setState(253);
			match(T__12);
			setState(254);
			id();
			setState(255);
			predicate();
			setState(256);
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
			setState(258);
			match(T__13);
			setState(259);
			id();
			setState(260);
			predicate();
			setState(261);
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
			setState(263);
			match(T__14);
			setState(264);
			id();
			setState(265);
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
			setState(267);
			match(T__15);
			setState(268);
			id();
			setState(269);
			id();
			setState(270);
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
			setState(274);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(272);
				spatial_constraint1_def();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(273);
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
			setState(276);
			match(T__16);
			setState(277);
			match(T__10);
			setState(278);
			binary_temporal_constraint_type();
			setState(279);
			match(T__17);
			setState(280);
			binary_temporal_constraint_type();
			setState(281);
			match(T__1);
			setState(282);
			match(T__10);
			setState(283);
			match(VAR_NAME);
			setState(284);
			match(T__17);
			setState(285);
			match(VAR_NAME);
			setState(286);
			match(T__1);
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
			setState(289);
			match(T__16);
			setState(290);
			match(VAR_NAME);
			setState(291);
			integer_operator1();
			setState(292);
			match(VAR_NAME);
			setState(293);
			integer_operator2();
			setState(294);
			var_or_int();
			setState(295);
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
			setState(299);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(297);
				delete_spatial_constraint1_def();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(298);
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
			setState(301);
			match(T__18);
			setState(302);
			match(T__10);
			setState(303);
			unary_spatial_constraint_type();
			setState(304);
			match(T__1);
			setState(305);
			match(T__10);
			setState(306);
			match(VAR_NAME);
			setState(307);
			match(T__1);
			setState(308);
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
			setState(310);
			match(T__18);
			setState(311);
			match(T__10);
			setState(312);
			match(VAR_NAME);
			setState(313);
			match(T__17);
			setState(314);
			match(VAR_NAME);
			setState(315);
			match(T__1);
			setState(316);
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
			setState(320);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(318);
				integer_constraint1_def();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(319);
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
			setState(322);
			match(T__19);
			setState(323);
			match(VAR_NAME);
			setState(324);
			integer_operator1();
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
			setState(328);
			match(T__19);
			setState(329);
			match(VAR_NAME);
			setState(330);
			integer_operator1();
			setState(331);
			match(VAR_NAME);
			setState(332);
			integer_operator2();
			setState(333);
			var_or_int();
			setState(334);
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
			setState(336);
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
			setState(338);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__20) | (1L << T__21) | (1L << T__22) | (1L << T__23) | (1L << T__24) | (1L << T__25) | (1L << T__26) | (1L << T__27) | (1L << T__28) | (1L << T__29))) != 0)) ) {
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
			setState(342);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__30:
			case T__31:
			case T__32:
			case T__33:
			case T__34:
				enterOuterAlt(_localctx, 1);
				{
				setState(340);
				unary_temporal_constraint_def();
				}
				break;
			case T__35:
				enterOuterAlt(_localctx, 2);
				{
				setState(341);
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
			setState(344);
			unary_temporal_constraint_type();
			setState(345);
			bounds_list();
			setState(346);
			match(T__10);
			setState(347);
			id_or_task();
			setState(348);
			match(T__1);
			setState(349);
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
			setState(351);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__30) | (1L << T__31) | (1L << T__32) | (1L << T__33) | (1L << T__34))) != 0)) ) {
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
			setState(353);
			match(T__35);
			setState(354);
			binary_temporal_constraint_type();
			setState(355);
			bounds_list();
			setState(356);
			match(T__10);
			setState(357);
			id_or_task();
			setState(358);
			match(T__17);
			setState(359);
			id_or_task();
			setState(360);
			match(T__1);
			setState(361);
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
			setState(363);
			_la = _input.LA(1);
			if ( !(((((_la - 37)) & ~0x3f) == 0 && ((1L << (_la - 37)) & ((1L << (T__36 - 37)) | (1L << (T__37 - 37)) | (1L << (T__38 - 37)) | (1L << (T__39 - 37)) | (1L << (T__40 - 37)) | (1L << (T__41 - 37)) | (1L << (T__42 - 37)) | (1L << (T__43 - 37)) | (1L << (T__44 - 37)) | (1L << (T__45 - 37)) | (1L << (T__46 - 37)) | (1L << (T__47 - 37)) | (1L << (T__48 - 37)) | (1L << (T__49 - 37)) | (1L << (T__50 - 37)) | (1L << (T__51 - 37)) | (1L << (T__52 - 37)) | (1L << (T__53 - 37)) | (1L << (T__54 - 37)) | (1L << (T__55 - 37)) | (1L << (T__56 - 37)) | (1L << (T__57 - 37)) | (1L << (T__58 - 37)) | (1L << (T__59 - 37)) | (1L << (T__60 - 37)) | (1L << (T__61 - 37)) | (1L << (T__62 - 37)) | (1L << (T__63 - 37)))) != 0)) ) {
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
			setState(365);
			_la = _input.LA(1);
			if ( !(_la==T__64 || _la==T__65) ) {
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
			setState(370);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__66) {
				{
				{
				setState(367);
				bounds();
				}
				}
				setState(372);
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
			setState(373);
			match(T__66);
			setState(374);
			bound();
			setState(375);
			match(T__17);
			setState(376);
			bound();
			setState(377);
			match(T__67);
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
			setState(379);
			_la = _input.LA(1);
			if ( !(_la==T__68 || _la==NUMBER) ) {
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
			setState(383);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NAME:
				enterOuterAlt(_localctx, 1);
				{
				setState(381);
				id();
				}
				break;
			case T__69:
				enterOuterAlt(_localctx, 2);
				{
				setState(382);
				match(T__69);
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
		public TerminalNode DOUBLE() { return getToken(ChimpClassicParser.DOUBLE, 0); }
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
			setState(385);
			match(T__70);
			setState(386);
			match(DOUBLE);
			setState(387);
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
		enterRule(_localctx, 86, RULE_resource_usage_def);
		int _la;
		try {
			setState(403);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(389);
				match(T__71);
				setState(390);
				match(NAME);
				setState(391);
				match(NUMBER);
				setState(392);
				match(T__1);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(393);
				match(T__71);
				setState(394);
				usage_def();
				setState(398);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__75) {
					{
					{
					setState(395);
					param_item();
					}
					}
					setState(400);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(401);
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
		enterRule(_localctx, 88, RULE_fluentresourceusage_def);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(405);
			match(T__72);
			setState(406);
			usage_def();
			setState(407);
			fluent_def();
			setState(411);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__75) {
				{
				{
				setState(408);
				param_item();
				}
				}
				setState(413);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(414);
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
		enterRule(_localctx, 90, RULE_fluent_def);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(416);
			match(T__73);
			setState(417);
			match(NAME);
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
		enterRule(_localctx, 92, RULE_usage_def);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(420);
			match(T__74);
			setState(421);
			match(NAME);
			setState(422);
			match(NUMBER);
			setState(423);
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
		enterRule(_localctx, 94, RULE_param_item);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(425);
			match(T__75);
			setState(426);
			match(NUMBER);
			setState(427);
			match(NAME);
			setState(428);
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
		enterRule(_localctx, 96, RULE_value_restriction_def);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(430);
			match(T__76);
			setState(431);
			match(VAR_NAME);
			setState(432);
			constant_list();
			setState(433);
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
		enterRule(_localctx, 98, RULE_notvalue_restriction_def);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(435);
			match(T__77);
			setState(436);
			match(VAR_NAME);
			setState(437);
			constant_list();
			setState(438);
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
		enterRule(_localctx, 100, RULE_typevalue_restriction_def);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(440);
			match(T__78);
			setState(441);
			match(VAR_NAME);
			setState(442);
			constant_list();
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
		enterRule(_localctx, 102, RULE_nottypevalue_restriction_def);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(445);
			match(T__79);
			setState(446);
			match(VAR_NAME);
			setState(447);
			constant_list();
			setState(448);
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
		enterRule(_localctx, 104, RULE_vardifferent_def);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(450);
			match(T__80);
			setState(451);
			match(VAR_NAME);
			setState(452);
			match(VAR_NAME);
			setState(453);
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
		enterRule(_localctx, 106, RULE_constant_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(456); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(455);
				match(NAME);
				}
				}
				setState(458); 
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
		enterRule(_localctx, 108, RULE_predicate);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(460);
			match(NAME);
			setState(461);
			match(T__10);
			setState(462);
			predicate_args();
			setState(463);
			match(T__1);
			setState(465);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__10) {
				{
				setState(464);
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
		enterRule(_localctx, 110, RULE_predicate_args);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(470);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==VAR_NAME || _la==NAME) {
				{
				{
				setState(467);
				var_or_const();
				}
				}
				setState(472);
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
		enterRule(_localctx, 112, RULE_int_args);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(476);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==VAR_NAME || _la==NUMBER) {
				{
				{
				setState(473);
				var_or_int();
				}
				}
				setState(478);
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
		enterRule(_localctx, 114, RULE_var_or_int);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(479);
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

	public static class IdContext extends ParserRuleContext {
		public TerminalNode NAME() { return getToken(ChimpClassicParser.NAME, 0); }
		public IdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_id; }
	}

	public final IdContext id() throws RecognitionException {
		IdContext _localctx = new IdContext(_ctx, getState());
		enterRule(_localctx, 116, RULE_id);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(481);
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
		enterRule(_localctx, 118, RULE_var_or_const);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(483);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3Y\u01e8\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\3\2\3\2\3\2\5\2~\n\2\3\2\3\2\7\2\u0082\n\2\f\2\16\2\u0085\13\2\3\3\3"+
		"\3\3\3\3\3\3\3\5\3\u008c\n\3\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\6\3\6\3"+
		"\6\3\6\3\7\3\7\7\7\u009c\n\7\f\7\16\7\u009f\13\7\3\7\3\7\3\b\3\b\3\t\3"+
		"\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\6\n\u00ae\n\n\r\n\16\n\u00af\3\n\3\n\3"+
		"\13\3\13\3\f\3\f\5\f\u00b8\n\f\3\f\3\f\7\f\u00bc\n\f\f\f\16\f\u00bf\13"+
		"\f\3\f\3\f\3\r\3\r\5\r\u00c5\n\r\3\r\3\r\7\r\u00c9\n\r\f\r\16\r\u00cc"+
		"\13\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\5\16\u00d6\n\16\3\16\3\16"+
		"\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20"+
		"\3\20\5\20\u00e9\n\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21"+
		"\3\21\3\21\3\21\3\21\5\21\u00f9\n\21\3\22\3\22\3\22\3\22\3\22\3\23\3\23"+
		"\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\26\3\26"+
		"\3\26\3\26\3\26\3\27\3\27\5\27\u0115\n\27\3\30\3\30\3\30\3\30\3\30\3\30"+
		"\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\31\3\31\3\31\3\31\3\31\3\31\3\31"+
		"\3\31\3\32\3\32\5\32\u012e\n\32\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33"+
		"\3\33\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\35\3\35\5\35\u0143\n\35"+
		"\3\36\3\36\3\36\3\36\3\36\3\36\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37"+
		"\3 \3 \3!\3!\3\"\3\"\5\"\u0159\n\"\3#\3#\3#\3#\3#\3#\3#\3$\3$\3%\3%\3"+
		"%\3%\3%\3%\3%\3%\3%\3%\3&\3&\3\'\3\'\3(\7(\u0173\n(\f(\16(\u0176\13(\3"+
		")\3)\3)\3)\3)\3)\3*\3*\3+\3+\5+\u0182\n+\3,\3,\3,\3,\3-\3-\3-\3-\3-\3"+
		"-\3-\7-\u018f\n-\f-\16-\u0192\13-\3-\3-\5-\u0196\n-\3.\3.\3.\3.\7.\u019c"+
		"\n.\f.\16.\u019f\13.\3.\3.\3/\3/\3/\3/\3\60\3\60\3\60\3\60\3\60\3\61\3"+
		"\61\3\61\3\61\3\61\3\62\3\62\3\62\3\62\3\62\3\63\3\63\3\63\3\63\3\63\3"+
		"\64\3\64\3\64\3\64\3\64\3\65\3\65\3\65\3\65\3\65\3\66\3\66\3\66\3\66\3"+
		"\66\3\67\6\67\u01cb\n\67\r\67\16\67\u01cc\38\38\38\38\38\58\u01d4\n8\3"+
		"9\79\u01d7\n9\f9\169\u01da\139\3:\7:\u01dd\n:\f:\16:\u01e0\13:\3;\3;\3"+
		"<\3<\3=\3=\3=\2\2>\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60"+
		"\62\64\668:<>@BDFHJLNPRTVXZ\\^`bdfhjlnprtvx\2\n\3\2\27\34\3\2\27 \3\2"+
		"!%\3\2\'B\3\2CD\4\2GGYY\4\2TTYY\4\2TTVV\2\u01dc\2z\3\2\2\2\4\u008b\3\2"+
		"\2\2\6\u008d\3\2\2\2\b\u0091\3\2\2\2\n\u0095\3\2\2\2\f\u0099\3\2\2\2\16"+
		"\u00a2\3\2\2\2\20\u00a4\3\2\2\2\22\u00a9\3\2\2\2\24\u00b3\3\2\2\2\26\u00b5"+
		"\3\2\2\2\30\u00c2\3\2\2\2\32\u00cf\3\2\2\2\34\u00d9\3\2\2\2\36\u00e8\3"+
		"\2\2\2 \u00f8\3\2\2\2\"\u00fa\3\2\2\2$\u00ff\3\2\2\2&\u0104\3\2\2\2(\u0109"+
		"\3\2\2\2*\u010d\3\2\2\2,\u0114\3\2\2\2.\u0116\3\2\2\2\60\u0123\3\2\2\2"+
		"\62\u012d\3\2\2\2\64\u012f\3\2\2\2\66\u0138\3\2\2\28\u0142\3\2\2\2:\u0144"+
		"\3\2\2\2<\u014a\3\2\2\2>\u0152\3\2\2\2@\u0154\3\2\2\2B\u0158\3\2\2\2D"+
		"\u015a\3\2\2\2F\u0161\3\2\2\2H\u0163\3\2\2\2J\u016d\3\2\2\2L\u016f\3\2"+
		"\2\2N\u0174\3\2\2\2P\u0177\3\2\2\2R\u017d\3\2\2\2T\u0181\3\2\2\2V\u0183"+
		"\3\2\2\2X\u0195\3\2\2\2Z\u0197\3\2\2\2\\\u01a2\3\2\2\2^\u01a6\3\2\2\2"+
		"`\u01ab\3\2\2\2b\u01b0\3\2\2\2d\u01b5\3\2\2\2f\u01ba\3\2\2\2h\u01bf\3"+
		"\2\2\2j\u01c4\3\2\2\2l\u01ca\3\2\2\2n\u01ce\3\2\2\2p\u01d8\3\2\2\2r\u01de"+
		"\3\2\2\2t\u01e1\3\2\2\2v\u01e3\3\2\2\2x\u01e5\3\2\2\2z{\5\6\4\2{}\5\b"+
		"\5\2|~\5\n\6\2}|\3\2\2\2}~\3\2\2\2~\177\3\2\2\2\177\u0083\5\f\7\2\u0080"+
		"\u0082\5\4\3\2\u0081\u0080\3\2\2\2\u0082\u0085\3\2\2\2\u0083\u0081\3\2"+
		"\2\2\u0083\u0084\3\2\2\2\u0084\3\3\2\2\2\u0085\u0083\3\2\2\2\u0086\u008c"+
		"\5\20\t\2\u0087\u008c\5Z.\2\u0088\u008c\5\22\n\2\u0089\u008c\5\30\r\2"+
		"\u008a\u008c\5\26\f\2\u008b\u0086\3\2\2\2\u008b\u0087\3\2\2\2\u008b\u0088"+
		"\3\2\2\2\u008b\u0089\3\2\2\2\u008b\u008a\3\2\2\2\u008c\5\3\2\2\2\u008d"+
		"\u008e\7\3\2\2\u008e\u008f\7V\2\2\u008f\u0090\7\4\2\2\u0090\7\3\2\2\2"+
		"\u0091\u0092\7\5\2\2\u0092\u0093\7Y\2\2\u0093\u0094\7\4\2\2\u0094\t\3"+
		"\2\2\2\u0095\u0096\7\6\2\2\u0096\u0097\7Y\2\2\u0097\u0098\7\4\2\2\u0098"+
		"\13\3\2\2\2\u0099\u009d\7\7\2\2\u009a\u009c\5\16\b\2\u009b\u009a\3\2\2"+
		"\2\u009c\u009f\3\2\2\2\u009d\u009b\3\2\2\2\u009d\u009e\3\2\2\2\u009e\u00a0"+
		"\3\2\2\2\u009f\u009d\3\2\2\2\u00a0\u00a1\7\4\2\2\u00a1\r\3\2\2\2\u00a2"+
		"\u00a3\7V\2\2\u00a3\17\3\2\2\2\u00a4\u00a5\7\b\2\2\u00a5\u00a6\7V\2\2"+
		"\u00a6\u00a7\7Y\2\2\u00a7\u00a8\7\4\2\2\u00a8\21\3\2\2\2\u00a9\u00aa\7"+
		"\t\2\2\u00aa\u00ab\5\24\13\2\u00ab\u00ad\7Y\2\2\u00ac\u00ae\7V\2\2\u00ad"+
		"\u00ac\3\2\2\2\u00ae\u00af\3\2\2\2\u00af\u00ad\3\2\2\2\u00af\u00b0\3\2"+
		"\2\2\u00b0\u00b1\3\2\2\2\u00b1\u00b2\7\4\2\2\u00b2\23\3\2\2\2\u00b3\u00b4"+
		"\7V\2\2\u00b4\25\3\2\2\2\u00b5\u00b7\7\n\2\2\u00b6\u00b8\7Y\2\2\u00b7"+
		"\u00b6\3\2\2\2\u00b7\u00b8\3\2\2\2\u00b8\u00b9\3\2\2\2\u00b9\u00bd\5\32"+
		"\16\2\u00ba\u00bc\5\36\20\2\u00bb\u00ba\3\2\2\2\u00bc\u00bf\3\2\2\2\u00bd"+
		"\u00bb\3\2\2\2\u00bd\u00be\3\2\2\2\u00be\u00c0\3\2\2\2\u00bf\u00bd\3\2"+
		"\2\2\u00c0\u00c1\7\4\2\2\u00c1\27\3\2\2\2\u00c2\u00c4\7\13\2\2\u00c3\u00c5"+
		"\7Y\2\2\u00c4\u00c3\3\2\2\2\u00c4\u00c5\3\2\2\2\u00c5\u00c6\3\2\2\2\u00c6"+
		"\u00ca\5\32\16\2\u00c7\u00c9\5 \21\2\u00c8\u00c7\3\2\2\2\u00c9\u00cc\3"+
		"\2\2\2\u00ca\u00c8\3\2\2\2\u00ca\u00cb\3\2\2\2\u00cb\u00cd\3\2\2\2\u00cc"+
		"\u00ca\3\2\2\2\u00cd\u00ce\7\4\2\2\u00ce\31\3\2\2\2\u00cf\u00d0\7\f\2"+
		"\2\u00d0\u00d1\5\16\b\2\u00d1\u00d2\7\r\2\2\u00d2\u00d3\5p9\2\u00d3\u00d5"+
		"\7\4\2\2\u00d4\u00d6\5\34\17\2\u00d5\u00d4\3\2\2\2\u00d5\u00d6\3\2\2\2"+
		"\u00d6\u00d7\3\2\2\2\u00d7\u00d8\7\4\2\2\u00d8\33\3\2\2\2\u00d9\u00da"+
		"\7\r\2\2\u00da\u00db\5r:\2\u00db\u00dc\7\4\2\2\u00dc\35\3\2\2\2\u00dd"+
		"\u00e9\5\"\22\2\u00de\u00e9\5B\"\2\u00df\u00e9\5X-\2\u00e0\u00e9\5b\62"+
		"\2\u00e1\u00e9\5d\63\2\u00e2\u00e9\5f\64\2\u00e3\u00e9\5h\65\2\u00e4\u00e9"+
		"\5j\66\2\u00e5\u00e9\5$\23\2\u00e6\u00e9\5*\26\2\u00e7\u00e9\58\35\2\u00e8"+
		"\u00dd\3\2\2\2\u00e8\u00de\3\2\2\2\u00e8\u00df\3\2\2\2\u00e8\u00e0\3\2"+
		"\2\2\u00e8\u00e1\3\2\2\2\u00e8\u00e2\3\2\2\2\u00e8\u00e3\3\2\2\2\u00e8"+
		"\u00e4\3\2\2\2\u00e8\u00e5\3\2\2\2\u00e8\u00e6\3\2\2\2\u00e8\u00e7\3\2"+
		"\2\2\u00e9\37\3\2\2\2\u00ea\u00f9\5\"\22\2\u00eb\u00f9\5B\"\2\u00ec\u00f9"+
		"\5&\24\2\u00ed\u00f9\5(\25\2\u00ee\u00f9\5X-\2\u00ef\u00f9\5b\62\2\u00f0"+
		"\u00f9\5d\63\2\u00f1\u00f9\5f\64\2\u00f2\u00f9\5h\65\2\u00f3\u00f9\5j"+
		"\66\2\u00f4\u00f9\58\35\2\u00f5\u00f9\5,\27\2\u00f6\u00f9\5\62\32\2\u00f7"+
		"\u00f9\5V,\2\u00f8\u00ea\3\2\2\2\u00f8\u00eb\3\2\2\2\u00f8\u00ec\3\2\2"+
		"\2\u00f8\u00ed\3\2\2\2\u00f8\u00ee\3\2\2\2\u00f8\u00ef\3\2\2\2\u00f8\u00f0"+
		"\3\2\2\2\u00f8\u00f1\3\2\2\2\u00f8\u00f2\3\2\2\2\u00f8\u00f3\3\2\2\2\u00f8"+
		"\u00f4\3\2\2\2\u00f8\u00f5\3\2\2\2\u00f8\u00f6\3\2\2\2\u00f8\u00f7\3\2"+
		"\2\2\u00f9!\3\2\2\2\u00fa\u00fb\7\16\2\2\u00fb\u00fc\5v<\2\u00fc\u00fd"+
		"\5n8\2\u00fd\u00fe\7\4\2\2\u00fe#\3\2\2\2\u00ff\u0100\7\17\2\2\u0100\u0101"+
		"\5v<\2\u0101\u0102\5n8\2\u0102\u0103\7\4\2\2\u0103%\3\2\2\2\u0104\u0105"+
		"\7\20\2\2\u0105\u0106\5v<\2\u0106\u0107\5n8\2\u0107\u0108\7\4\2\2\u0108"+
		"\'\3\2\2\2\u0109\u010a\7\21\2\2\u010a\u010b\5v<\2\u010b\u010c\7\4\2\2"+
		"\u010c)\3\2\2\2\u010d\u010e\7\22\2\2\u010e\u010f\5v<\2\u010f\u0110\5v"+
		"<\2\u0110\u0111\7\4\2\2\u0111+\3\2\2\2\u0112\u0115\5.\30\2\u0113\u0115"+
		"\5\60\31\2\u0114\u0112\3\2\2\2\u0114\u0113\3\2\2\2\u0115-\3\2\2\2\u0116"+
		"\u0117\7\23\2\2\u0117\u0118\7\r\2\2\u0118\u0119\5J&\2\u0119\u011a\7\24"+
		"\2\2\u011a\u011b\5J&\2\u011b\u011c\7\4\2\2\u011c\u011d\7\r\2\2\u011d\u011e"+
		"\7T\2\2\u011e\u011f\7\24\2\2\u011f\u0120\7T\2\2\u0120\u0121\7\4\2\2\u0121"+
		"\u0122\7\4\2\2\u0122/\3\2\2\2\u0123\u0124\7\23\2\2\u0124\u0125\7T\2\2"+
		"\u0125\u0126\5> \2\u0126\u0127\7T\2\2\u0127\u0128\5@!\2\u0128\u0129\5"+
		"t;\2\u0129\u012a\7\4\2\2\u012a\61\3\2\2\2\u012b\u012e\5\64\33\2\u012c"+
		"\u012e\5\66\34\2\u012d\u012b\3\2\2\2\u012d\u012c\3\2\2\2\u012e\63\3\2"+
		"\2\2\u012f\u0130\7\25\2\2\u0130\u0131\7\r\2\2\u0131\u0132\5L\'\2\u0132"+
		"\u0133\7\4\2\2\u0133\u0134\7\r\2\2\u0134\u0135\7T\2\2\u0135\u0136\7\4"+
		"\2\2\u0136\u0137\7\4\2\2\u0137\65\3\2\2\2\u0138\u0139\7\25\2\2\u0139\u013a"+
		"\7\r\2\2\u013a\u013b\7T\2\2\u013b\u013c\7\24\2\2\u013c\u013d\7T\2\2\u013d"+
		"\u013e\7\4\2\2\u013e\u013f\7\4\2\2\u013f\67\3\2\2\2\u0140\u0143\5:\36"+
		"\2\u0141\u0143\5<\37\2\u0142\u0140\3\2\2\2\u0142\u0141\3\2\2\2\u01439"+
		"\3\2\2\2\u0144\u0145\7\26\2\2\u0145\u0146\7T\2\2\u0146\u0147\5> \2\u0147"+
		"\u0148\5t;\2\u0148\u0149\7\4\2\2\u0149;\3\2\2\2\u014a\u014b\7\26\2\2\u014b"+
		"\u014c\7T\2\2\u014c\u014d\5> \2\u014d\u014e\7T\2\2\u014e\u014f\5@!\2\u014f"+
		"\u0150\5t;\2\u0150\u0151\7\4\2\2\u0151=\3\2\2\2\u0152\u0153\t\2\2\2\u0153"+
		"?\3\2\2\2\u0154\u0155\t\3\2\2\u0155A\3\2\2\2\u0156\u0159\5D#\2\u0157\u0159"+
		"\5H%\2\u0158\u0156\3\2\2\2\u0158\u0157\3\2\2\2\u0159C\3\2\2\2\u015a\u015b"+
		"\5F$\2\u015b\u015c\5N(\2\u015c\u015d\7\r\2\2\u015d\u015e\5T+\2\u015e\u015f"+
		"\7\4\2\2\u015f\u0160\7\4\2\2\u0160E\3\2\2\2\u0161\u0162\t\4\2\2\u0162"+
		"G\3\2\2\2\u0163\u0164\7&\2\2\u0164\u0165\5J&\2\u0165\u0166\5N(\2\u0166"+
		"\u0167\7\r\2\2\u0167\u0168\5T+\2\u0168\u0169\7\24\2\2\u0169\u016a\5T+"+
		"\2\u016a\u016b\7\4\2\2\u016b\u016c\7\4\2\2\u016cI\3\2\2\2\u016d\u016e"+
		"\t\5\2\2\u016eK\3\2\2\2\u016f\u0170\t\6\2\2\u0170M\3\2\2\2\u0171\u0173"+
		"\5P)\2\u0172\u0171\3\2\2\2\u0173\u0176\3\2\2\2\u0174\u0172\3\2\2\2\u0174"+
		"\u0175\3\2\2\2\u0175O\3\2\2\2\u0176\u0174\3\2\2\2\u0177\u0178\7E\2\2\u0178"+
		"\u0179\5R*\2\u0179\u017a\7\24\2\2\u017a\u017b\5R*\2\u017b\u017c\7F\2\2"+
		"\u017cQ\3\2\2\2\u017d\u017e\t\7\2\2\u017eS\3\2\2\2\u017f\u0182\5v<\2\u0180"+
		"\u0182\7H\2\2\u0181\u017f\3\2\2\2\u0181\u0180\3\2\2\2\u0182U\3\2\2\2\u0183"+
		"\u0184\7I\2\2\u0184\u0185\7U\2\2\u0185\u0186\7\4\2\2\u0186W\3\2\2\2\u0187"+
		"\u0188\7J\2\2\u0188\u0189\7V\2\2\u0189\u018a\7Y\2\2\u018a\u0196\7\4\2"+
		"\2\u018b\u018c\7J\2\2\u018c\u0190\5^\60\2\u018d\u018f\5`\61\2\u018e\u018d"+
		"\3\2\2\2\u018f\u0192\3\2\2\2\u0190\u018e\3\2\2\2\u0190\u0191\3\2\2\2\u0191"+
		"\u0193\3\2\2\2\u0192\u0190\3\2\2\2\u0193\u0194\7\4\2\2\u0194\u0196\3\2"+
		"\2\2\u0195\u0187\3\2\2\2\u0195\u018b\3\2\2\2\u0196Y\3\2\2\2\u0197\u0198"+
		"\7K\2\2\u0198\u0199\5^\60\2\u0199\u019d\5\\/\2\u019a\u019c\5`\61\2\u019b"+
		"\u019a\3\2\2\2\u019c\u019f\3\2\2\2\u019d\u019b\3\2\2\2\u019d\u019e\3\2"+
		"\2\2\u019e\u01a0\3\2\2\2\u019f\u019d\3\2\2\2\u01a0\u01a1\7\4\2\2\u01a1"+
		"[\3\2\2\2\u01a2\u01a3\7L\2\2\u01a3\u01a4\7V\2\2\u01a4\u01a5\7\4\2\2\u01a5"+
		"]\3\2\2\2\u01a6\u01a7\7M\2\2\u01a7\u01a8\7V\2\2\u01a8\u01a9\7Y\2\2\u01a9"+
		"\u01aa\7\4\2\2\u01aa_\3\2\2\2\u01ab\u01ac\7N\2\2\u01ac\u01ad\7Y\2\2\u01ad"+
		"\u01ae\7V\2\2\u01ae\u01af\7\4\2\2\u01afa\3\2\2\2\u01b0\u01b1\7O\2\2\u01b1"+
		"\u01b2\7T\2\2\u01b2\u01b3\5l\67\2\u01b3\u01b4\7\4\2\2\u01b4c\3\2\2\2\u01b5"+
		"\u01b6\7P\2\2\u01b6\u01b7\7T\2\2\u01b7\u01b8\5l\67\2\u01b8\u01b9\7\4\2"+
		"\2\u01b9e\3\2\2\2\u01ba\u01bb\7Q\2\2\u01bb\u01bc\7T\2\2\u01bc\u01bd\5"+
		"l\67\2\u01bd\u01be\7\4\2\2\u01beg\3\2\2\2\u01bf\u01c0\7R\2\2\u01c0\u01c1"+
		"\7T\2\2\u01c1\u01c2\5l\67\2\u01c2\u01c3\7\4\2\2\u01c3i\3\2\2\2\u01c4\u01c5"+
		"\7S\2\2\u01c5\u01c6\7T\2\2\u01c6\u01c7\7T\2\2\u01c7\u01c8\7\4\2\2\u01c8"+
		"k\3\2\2\2\u01c9\u01cb\7V\2\2\u01ca\u01c9\3\2\2\2\u01cb\u01cc\3\2\2\2\u01cc"+
		"\u01ca\3\2\2\2\u01cc\u01cd\3\2\2\2\u01cdm\3\2\2\2\u01ce\u01cf\7V\2\2\u01cf"+
		"\u01d0\7\r\2\2\u01d0\u01d1\5p9\2\u01d1\u01d3\7\4\2\2\u01d2\u01d4\5\34"+
		"\17\2\u01d3\u01d2\3\2\2\2\u01d3\u01d4\3\2\2\2\u01d4o\3\2\2\2\u01d5\u01d7"+
		"\5x=\2\u01d6\u01d5\3\2\2\2\u01d7\u01da\3\2\2\2\u01d8\u01d6\3\2\2\2\u01d8"+
		"\u01d9\3\2\2\2\u01d9q\3\2\2\2\u01da\u01d8\3\2\2\2\u01db\u01dd\5t;\2\u01dc"+
		"\u01db\3\2\2\2\u01dd\u01e0\3\2\2\2\u01de\u01dc\3\2\2\2\u01de\u01df\3\2"+
		"\2\2\u01dfs\3\2\2\2\u01e0\u01de\3\2\2\2\u01e1\u01e2\t\b\2\2\u01e2u\3\2"+
		"\2\2\u01e3\u01e4\7V\2\2\u01e4w\3\2\2\2\u01e5\u01e6\t\t\2\2\u01e6y\3\2"+
		"\2\2\33}\u0083\u008b\u009d\u00af\u00b7\u00bd\u00c4\u00ca\u00d5\u00e8\u00f8"+
		"\u0114\u012d\u0142\u0158\u0174\u0181\u0190\u0195\u019d\u01cc\u01d3\u01d8"+
		"\u01de";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}