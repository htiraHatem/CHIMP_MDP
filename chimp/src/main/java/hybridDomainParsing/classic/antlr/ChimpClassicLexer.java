package hybridDomainParsing.classic.antlr;

// Generated from ChimpClassic.g4 by ANTLR 4.9.1
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class ChimpClassicLexer extends Lexer {
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
		T__80=81, T__81=82, VAR_NAME=83, DOUBLE=84, MINUS=85, NAME=86, Comment=87, 
		WS=88, NUMBER=89;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
			"T__9", "T__10", "T__11", "T__12", "T__13", "T__14", "T__15", "T__16", 
			"T__17", "T__18", "T__19", "T__20", "T__21", "T__22", "T__23", "T__24", 
			"T__25", "T__26", "T__27", "T__28", "T__29", "T__30", "T__31", "T__32", 
			"T__33", "T__34", "T__35", "T__36", "T__37", "T__38", "T__39", "T__40", 
			"T__41", "T__42", "T__43", "T__44", "T__45", "T__46", "T__47", "T__48", 
			"T__49", "T__50", "T__51", "T__52", "T__53", "T__54", "T__55", "T__56", 
			"T__57", "T__58", "T__59", "T__60", "T__61", "T__62", "T__63", "T__64", 
			"T__65", "T__66", "T__67", "T__68", "T__69", "T__70", "T__71", "T__72", 
			"T__73", "T__74", "T__75", "T__76", "T__77", "T__78", "T__79", "T__80", 
			"T__81", "VAR_NAME", "DOUBLE", "MINUS", "NAME", "Comment", "WS", "NUMBER"
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
			"'(if'", "'(ResourceUsage'", "'(FluentResourceUsage'", "'(Fluent'", "'(Usage'", 
			"'(Param'", "'(Values'", "'(NotValues'", "'(Type'", "'(NotType'", "'(VarDifferent'", 
			null, null, "'-'"
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
			null, null, null, null, null, null, null, null, null, null, null, "VAR_NAME", 
			"DOUBLE", "MINUS", "NAME", "Comment", "WS", "NUMBER"
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


	public ChimpClassicLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "ChimpClassic.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2[\u045d\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\4J\tJ\4K\tK\4L\tL\4M\tM\4N\tN\4O\tO\4P\tP\4Q\tQ\4R\tR\4S\tS\4T\tT"+
		"\4U\tU\4V\tV\4W\tW\4X\tX\4Y\tY\4Z\tZ\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3"+
		"\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4"+
		"\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3"+
		"\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6"+
		"\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3"+
		"\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t"+
		"\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3"+
		"\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21\3"+
		"\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\23\3\23\3\24\3\24\3\24\3\24\3"+
		"\24\3\24\3\24\3\25\3\25\3\25\3\25\3\26\3\26\3\27\3\27\3\27\3\30\3\30\3"+
		"\31\3\31\3\32\3\32\3\32\3\33\3\33\3\33\3\34\3\34\3\35\3\35\3\36\3\36\3"+
		"\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3"+
		"\37\3\37\3\37\3\37\3\37\3\37\3\37\3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 "+
		"\3 \3 \3 \3 \3 \3 \3 \3 \3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!"+
		"\3!\3!\3!\3!\3!\3!\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\""+
		"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3"+
		"#\3#\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3%\3%\3%\3%\3%\3%\3%\3&\3&\3"+
		"&\3&\3&\3&\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3(\3(\3(\3(\3(\3(\3(\3"+
		"(\3(\3(\3(\3)\3)\3)\3)\3)\3)\3)\3)\3)\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3"+
		"+\3+\3+\3+\3+\3+\3+\3,\3,\3,\3,\3,\3,\3,\3-\3-\3-\3-\3-\3-\3-\3.\3.\3"+
		".\3.\3.\3.\3.\3.\3.\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3\60\3\60\3"+
		"\60\3\60\3\60\3\60\3\61\3\61\3\61\3\61\3\61\3\61\3\62\3\62\3\62\3\62\3"+
		"\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\63\3\63\3\63\3\63\3"+
		"\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\64\3\64\3\64\3\64\3\64\3"+
		"\64\3\64\3\64\3\64\3\64\3\64\3\64\3\64\3\64\3\64\3\64\3\64\3\64\3\64\3"+
		"\64\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3"+
		"\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3"+
		"\66\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3"+
		"\66\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3"+
		"\66\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3"+
		"\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3"+
		"\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67\38\38\38\38\38\38\38"+
		"\38\38\38\38\38\38\38\38\39\39\39\39\39\39\39\39\39\39\39\39\39\39\39"+
		"\39\39\39\39\39\39\39\39\39\39\39\39\39\39\39\39\39\39\3:\3:\3:\3:\3:"+
		"\3:\3:\3:\3:\3:\3:\3:\3:\3:\3:\3:\3:\3:\3:\3:\3:\3:\3:\3:\3:\3:\3:\3:"+
		"\3:\3:\3:\3:\3:\3:\3:\3:\3:\3:\3;\3;\3;\3;\3;\3;\3;\3;\3;\3;\3;\3;\3;"+
		"\3;\3;\3;\3;\3;\3;\3;\3;\3;\3;\3;\3;\3;\3;\3;\3;\3;\3;\3;\3;\3;\3;\3;"+
		"\3;\3;\3;\3;\3;\3<\3<\3<\3<\3<\3<\3<\3<\3<\3<\3<\3=\3=\3=\3=\3=\3=\3="+
		"\3=\3=\3=\3=\3=\3=\3=\3>\3>\3>\3>\3>\3>\3>\3>\3>\3>\3>\3>\3>\3>\3>\3>"+
		"\3>\3>\3?\3?\3?\3?\3?\3?\3?\3?\3?\3?\3?\3?\3?\3?\3?\3?\3?\3?\3?\3?\3?"+
		"\3@\3@\3@\3@\3@\3@\3@\3@\3@\3A\3A\3A\3B\3B\3B\3B\3B\3C\3C\3D\3D\3E\3E"+
		"\3E\3E\3F\3F\3F\3F\3F\3G\3G\3G\3G\3G\3G\3G\3G\3H\3H\3H\3H\3H\3H\3H\3H"+
		"\3H\3H\3H\3H\3H\3H\3H\3H\3I\3I\3I\3I\3J\3J\3J\3J\3J\3J\3J\3J\3J\3J\3J"+
		"\3J\3J\3J\3J\3K\3K\3K\3K\3K\3K\3K\3K\3K\3K\3K\3K\3K\3K\3K\3K\3K\3K\3K"+
		"\3K\3K\3L\3L\3L\3L\3L\3L\3L\3L\3M\3M\3M\3M\3M\3M\3M\3N\3N\3N\3N\3N\3N"+
		"\3N\3O\3O\3O\3O\3O\3O\3O\3O\3P\3P\3P\3P\3P\3P\3P\3P\3P\3P\3P\3Q\3Q\3Q"+
		"\3Q\3Q\3Q\3R\3R\3R\3R\3R\3R\3R\3R\3R\3S\3S\3S\3S\3S\3S\3S\3S\3S\3S\3S"+
		"\3S\3S\3S\3T\3T\3T\3U\5U\u0438\nU\3U\3U\3U\3U\3V\3V\3W\3W\7W\u0442\nW"+
		"\fW\16W\u0445\13W\3X\3X\7X\u0449\nX\fX\16X\u044c\13X\3X\3X\3Y\6Y\u0451"+
		"\nY\rY\16Y\u0452\3Y\3Y\3Z\3Z\7Z\u0459\nZ\fZ\16Z\u045c\13Z\2\2[\3\3\5\4"+
		"\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22"+
		"#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37= ?!A\"C"+
		"#E$G%I&K\'M(O)Q*S+U,W-Y.[/]\60_\61a\62c\63e\64g\65i\66k\67m8o9q:s;u<w"+
		"=y>{?}@\177A\u0081B\u0083C\u0085D\u0087E\u0089F\u008bG\u008dH\u008fI\u0091"+
		"J\u0093K\u0095L\u0097M\u0099N\u009bO\u009dP\u009fQ\u00a1R\u00a3S\u00a5"+
		"T\u00a7U\u00a9V\u00abW\u00adX\u00afY\u00b1Z\u00b3[\3\2\7\5\2##C\\c|\b"+
		"\2##//\62;C\\aac|\4\2\f\f\17\17\5\2\13\f\17\17\"\"\3\2\62;\2\u0461\2\3"+
		"\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2"+
		"\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31"+
		"\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2"+
		"\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2"+
		"\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2"+
		"\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2"+
		"I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3"+
		"\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2\2a\3\2\2"+
		"\2\2c\3\2\2\2\2e\3\2\2\2\2g\3\2\2\2\2i\3\2\2\2\2k\3\2\2\2\2m\3\2\2\2\2"+
		"o\3\2\2\2\2q\3\2\2\2\2s\3\2\2\2\2u\3\2\2\2\2w\3\2\2\2\2y\3\2\2\2\2{\3"+
		"\2\2\2\2}\3\2\2\2\2\177\3\2\2\2\2\u0081\3\2\2\2\2\u0083\3\2\2\2\2\u0085"+
		"\3\2\2\2\2\u0087\3\2\2\2\2\u0089\3\2\2\2\2\u008b\3\2\2\2\2\u008d\3\2\2"+
		"\2\2\u008f\3\2\2\2\2\u0091\3\2\2\2\2\u0093\3\2\2\2\2\u0095\3\2\2\2\2\u0097"+
		"\3\2\2\2\2\u0099\3\2\2\2\2\u009b\3\2\2\2\2\u009d\3\2\2\2\2\u009f\3\2\2"+
		"\2\2\u00a1\3\2\2\2\2\u00a3\3\2\2\2\2\u00a5\3\2\2\2\2\u00a7\3\2\2\2\2\u00a9"+
		"\3\2\2\2\2\u00ab\3\2\2\2\2\u00ad\3\2\2\2\2\u00af\3\2\2\2\2\u00b1\3\2\2"+
		"\2\2\u00b3\3\2\2\2\3\u00b5\3\2\2\2\5\u00c6\3\2\2\2\7\u00c8\3\2\2\2\t\u00d1"+
		"\3\2\2\2\13\u00e1\3\2\2\2\r\u00f3\3\2\2\2\17\u00fd\3\2\2\2\21\u010c\3"+
		"\2\2\2\23\u0115\3\2\2\2\25\u0120\3\2\2\2\27\u0126\3\2\2\2\31\u0128\3\2"+
		"\2\2\33\u012d\3\2\2\2\35\u0132\3\2\2\2\37\u0137\3\2\2\2!\u013c\3\2\2\2"+
		"#\u0146\3\2\2\2%\u014a\3\2\2\2\'\u014c\3\2\2\2)\u0153\3\2\2\2+\u0157\3"+
		"\2\2\2-\u0159\3\2\2\2/\u015c\3\2\2\2\61\u015e\3\2\2\2\63\u0160\3\2\2\2"+
		"\65\u0163\3\2\2\2\67\u0166\3\2\2\29\u0168\3\2\2\2;\u016a\3\2\2\2=\u016c"+
		"\3\2\2\2?\u0181\3\2\2\2A\u0195\3\2\2\2C\u01aa\3\2\2\2E\u01be\3\2\2\2G"+
		"\u01cd\3\2\2\2I\u01d9\3\2\2\2K\u01e0\3\2\2\2M\u01e6\3\2\2\2O\u01ef\3\2"+
		"\2\2Q\u01fa\3\2\2\2S\u0203\3\2\2\2U\u020d\3\2\2\2W\u0214\3\2\2\2Y\u021b"+
		"\3\2\2\2[\u0222\3\2\2\2]\u022b\3\2\2\2_\u0238\3\2\2\2a\u023e\3\2\2\2c"+
		"\u0244\3\2\2\2e\u0252\3\2\2\2g\u025f\3\2\2\2i\u0273\3\2\2\2k\u028e\3\2"+
		"\2\2m\u02b8\3\2\2\2o\u02d0\3\2\2\2q\u02df\3\2\2\2s\u0300\3\2\2\2u\u0326"+
		"\3\2\2\2w\u034f\3\2\2\2y\u035a\3\2\2\2{\u0368\3\2\2\2}\u037a\3\2\2\2\177"+
		"\u038f\3\2\2\2\u0081\u0398\3\2\2\2\u0083\u039b\3\2\2\2\u0085\u03a0\3\2"+
		"\2\2\u0087\u03a2\3\2\2\2\u0089\u03a4\3\2\2\2\u008b\u03a8\3\2\2\2\u008d"+
		"\u03ad\3\2\2\2\u008f\u03b5\3\2\2\2\u0091\u03c5\3\2\2\2\u0093\u03c9\3\2"+
		"\2\2\u0095\u03d8\3\2\2\2\u0097\u03ed\3\2\2\2\u0099\u03f5\3\2\2\2\u009b"+
		"\u03fc\3\2\2\2\u009d\u0403\3\2\2\2\u009f\u040b\3\2\2\2\u00a1\u0416\3\2"+
		"\2\2\u00a3\u041c\3\2\2\2\u00a5\u0425\3\2\2\2\u00a7\u0433\3\2\2\2\u00a9"+
		"\u0437\3\2\2\2\u00ab\u043d\3\2\2\2\u00ad\u043f\3\2\2\2\u00af\u0446\3\2"+
		"\2\2\u00b1\u0450\3\2\2\2\u00b3\u0456\3\2\2\2\u00b5\u00b6\7*\2\2\u00b6"+
		"\u00b7\7J\2\2\u00b7\u00b8\7{\2\2\u00b8\u00b9\7d\2\2\u00b9\u00ba\7t\2\2"+
		"\u00ba\u00bb\7k\2\2\u00bb\u00bc\7f\2\2\u00bc\u00bd\7J\2\2\u00bd\u00be"+
		"\7V\2\2\u00be\u00bf\7P\2\2\u00bf\u00c0\7F\2\2\u00c0\u00c1\7q\2\2\u00c1"+
		"\u00c2\7o\2\2\u00c2\u00c3\7c\2\2\u00c3\u00c4\7k\2\2\u00c4\u00c5\7p\2\2"+
		"\u00c5\4\3\2\2\2\u00c6\u00c7\7+\2\2\u00c7\6\3\2\2\2\u00c8\u00c9\7*\2\2"+
		"\u00c9\u00ca\7O\2\2\u00ca\u00cb\7c\2\2\u00cb\u00cc\7z\2\2\u00cc\u00cd"+
		"\7C\2\2\u00cd\u00ce\7t\2\2\u00ce\u00cf\7i\2\2\u00cf\u00d0\7u\2\2\u00d0"+
		"\b\3\2\2\2\u00d1\u00d2\7*\2\2\u00d2\u00d3\7O\2\2\u00d3\u00d4\7c\2\2\u00d4"+
		"\u00d5\7z\2\2\u00d5\u00d6\7K\2\2\u00d6\u00d7\7p\2\2\u00d7\u00d8\7v\2\2"+
		"\u00d8\u00d9\7g\2\2\u00d9\u00da\7i\2\2\u00da\u00db\7g\2\2\u00db\u00dc"+
		"\7t\2\2\u00dc\u00dd\7C\2\2\u00dd\u00de\7t\2\2\u00de\u00df\7i\2\2\u00df"+
		"\u00e0\7u\2\2\u00e0\n\3\2\2\2\u00e1\u00e2\7*\2\2\u00e2\u00e3\7R\2\2\u00e3"+
		"\u00e4\7t\2\2\u00e4\u00e5\7g\2\2\u00e5\u00e6\7f\2\2\u00e6\u00e7\7k\2\2"+
		"\u00e7\u00e8\7e\2\2\u00e8\u00e9\7c\2\2\u00e9\u00ea\7v\2\2\u00ea\u00eb"+
		"\7g\2\2\u00eb\u00ec\7U\2\2\u00ec\u00ed\7{\2\2\u00ed\u00ee\7o\2\2\u00ee"+
		"\u00ef\7d\2\2\u00ef\u00f0\7q\2\2\u00f0\u00f1\7n\2\2\u00f1\u00f2\7u\2\2"+
		"\u00f2\f\3\2\2\2\u00f3\u00f4\7*\2\2\u00f4\u00f5\7T\2\2\u00f5\u00f6\7g"+
		"\2\2\u00f6\u00f7\7u\2\2\u00f7\u00f8\7q\2\2\u00f8\u00f9\7w\2\2\u00f9\u00fa"+
		"\7t\2\2\u00fa\u00fb\7e\2\2\u00fb\u00fc\7g\2\2\u00fc\16\3\2\2\2\u00fd\u00fe"+
		"\7*\2\2\u00fe\u00ff\7U\2\2\u00ff\u0100\7v\2\2\u0100\u0101\7c\2\2\u0101"+
		"\u0102\7v\2\2\u0102\u0103\7g\2\2\u0103\u0104\7X\2\2\u0104\u0105\7c\2\2"+
		"\u0105\u0106\7t\2\2\u0106\u0107\7k\2\2\u0107\u0108\7c\2\2\u0108\u0109"+
		"\7d\2\2\u0109\u010a\7n\2\2\u010a\u010b\7g\2\2\u010b\20\3\2\2\2\u010c\u010d"+
		"\7*\2\2\u010d\u010e\7<\2\2\u010e\u010f\7o\2\2\u010f\u0110\7g\2\2\u0110"+
		"\u0111\7v\2\2\u0111\u0112\7j\2\2\u0112\u0113\7q\2\2\u0113\u0114\7f\2\2"+
		"\u0114\22\3\2\2\2\u0115\u0116\7*\2\2\u0116\u0117\7<\2\2\u0117\u0118\7"+
		"q\2\2\u0118\u0119\7r\2\2\u0119\u011a\7g\2\2\u011a\u011b\7t\2\2\u011b\u011c"+
		"\7c\2\2\u011c\u011d\7v\2\2\u011d\u011e\7q\2\2\u011e\u011f\7t\2\2\u011f"+
		"\24\3\2\2\2\u0120\u0121\7*\2\2\u0121\u0122\7J\2\2\u0122\u0123\7g\2\2\u0123"+
		"\u0124\7c\2\2\u0124\u0125\7f\2\2\u0125\26\3\2\2\2\u0126\u0127\7*\2\2\u0127"+
		"\30\3\2\2\2\u0128\u0129\7*\2\2\u0129\u012a\7R\2\2\u012a\u012b\7t\2\2\u012b"+
		"\u012c\7g\2\2\u012c\32\3\2\2\2\u012d\u012e\7*\2\2\u012e\u012f\7U\2\2\u012f"+
		"\u0130\7w\2\2\u0130\u0131\7d\2\2\u0131\34\3\2\2\2\u0132\u0133\7*\2\2\u0133"+
		"\u0134\7C\2\2\u0134\u0135\7f\2\2\u0135\u0136\7f\2\2\u0136\36\3\2\2\2\u0137"+
		"\u0138\7*\2\2\u0138\u0139\7F\2\2\u0139\u013a\7g\2\2\u013a\u013b\7n\2\2"+
		"\u013b \3\2\2\2\u013c\u013d\7*\2\2\u013d\u013e\7Q\2\2\u013e\u013f\7t\2"+
		"\2\u013f\u0140\7f\2\2\u0140\u0141\7g\2\2\u0141\u0142\7t\2\2\u0142\u0143"+
		"\7k\2\2\u0143\u0144\7p\2\2\u0144\u0145\7i\2\2\u0145\"\3\2\2\2\u0146\u0147"+
		"\7*\2\2\u0147\u0148\7U\2\2\u0148\u0149\7E\2\2\u0149$\3\2\2\2\u014a\u014b"+
		"\7.\2\2\u014b&\3\2\2\2\u014c\u014d\7*\2\2\u014d\u014e\7F\2\2\u014e\u014f"+
		"\7g\2\2\u014f\u0150\7n\2\2\u0150\u0151\7U\2\2\u0151\u0152\7E\2\2\u0152"+
		"(\3\2\2\2\u0153\u0154\7*\2\2\u0154\u0155\7K\2\2\u0155\u0156\7E\2\2\u0156"+
		"*\3\2\2\2\u0157\u0158\7?\2\2\u0158,\3\2\2\2\u0159\u015a\7#\2\2\u015a\u015b"+
		"\7?\2\2\u015b.\3\2\2\2\u015c\u015d\7@\2\2\u015d\60\3\2\2\2\u015e\u015f"+
		"\7>\2\2\u015f\62\3\2\2\2\u0160\u0161\7@\2\2\u0161\u0162\7?\2\2\u0162\64"+
		"\3\2\2\2\u0163\u0164\7>\2\2\u0164\u0165\7?\2\2\u0165\66\3\2\2\2\u0166"+
		"\u0167\7-\2\2\u01678\3\2\2\2\u0168\u0169\7,\2\2\u0169:\3\2\2\2\u016a\u016b"+
		"\7\61\2\2\u016b<\3\2\2\2\u016c\u016d\7*\2\2\u016d\u016e\7E\2\2\u016e\u016f"+
		"\7q\2\2\u016f\u0170\7p\2\2\u0170\u0171\7u\2\2\u0171\u0172\7v\2\2\u0172"+
		"\u0173\7t\2\2\u0173\u0174\7c\2\2\u0174\u0175\7k\2\2\u0175\u0176\7p\2\2"+
		"\u0176\u0177\7v\2\2\u0177\u0178\7\"\2\2\u0178\u0179\7F\2\2\u0179\u017a"+
		"\7w\2\2\u017a\u017b\7t\2\2\u017b\u017c\7c\2\2\u017c\u017d\7v\2\2\u017d"+
		"\u017e\7k\2\2\u017e\u017f\7q\2\2\u017f\u0180\7p\2\2\u0180>\3\2\2\2\u0181"+
		"\u0182\7*\2\2\u0182\u0183\7E\2\2\u0183\u0184\7q\2\2\u0184\u0185\7p\2\2"+
		"\u0185\u0186\7u\2\2\u0186\u0187\7v\2\2\u0187\u0188\7t\2\2\u0188\u0189"+
		"\7c\2\2\u0189\u018a\7k\2\2\u018a\u018b\7p\2\2\u018b\u018c\7v\2\2\u018c"+
		"\u018d\7\"\2\2\u018d\u018e\7T\2\2\u018e\u018f\7g\2\2\u018f\u0190\7n\2"+
		"\2\u0190\u0191\7g\2\2\u0191\u0192\7c\2\2\u0192\u0193\7u\2\2\u0193\u0194"+
		"\7g\2\2\u0194@\3\2\2\2\u0195\u0196\7*\2\2\u0196\u0197\7E\2\2\u0197\u0198"+
		"\7q\2\2\u0198\u0199\7p\2\2\u0199\u019a\7u\2\2\u019a\u019b\7v\2\2\u019b"+
		"\u019c\7t\2\2\u019c\u019d\7c\2\2\u019d\u019e\7k\2\2\u019e\u019f\7p\2\2"+
		"\u019f\u01a0\7v\2\2\u01a0\u01a1\7\"\2\2\u01a1\u01a2\7F\2\2\u01a2\u01a3"+
		"\7g\2\2\u01a3\u01a4\7c\2\2\u01a4\u01a5\7f\2\2\u01a5\u01a6\7n\2\2\u01a6"+
		"\u01a7\7k\2\2\u01a7\u01a8\7p\2\2\u01a8\u01a9\7g\2\2\u01a9B\3\2\2\2\u01aa"+
		"\u01ab\7*\2\2\u01ab\u01ac\7E\2\2\u01ac\u01ad\7q\2\2\u01ad\u01ae\7p\2\2"+
		"\u01ae\u01af\7u\2\2\u01af\u01b0\7v\2\2\u01b0\u01b1\7t\2\2\u01b1\u01b2"+
		"\7c\2\2\u01b2\u01b3\7k\2\2\u01b3\u01b4\7p\2\2\u01b4\u01b5\7v\2\2\u01b5"+
		"\u01b6\7\"\2\2\u01b6\u01b7\7H\2\2\u01b7\u01b8\7q\2\2\u01b8\u01b9\7t\2"+
		"\2\u01b9\u01ba\7g\2\2\u01ba\u01bb\7x\2\2\u01bb\u01bc\7g\2\2\u01bc\u01bd"+
		"\7t\2\2\u01bdD\3\2\2\2\u01be\u01bf\7*\2\2\u01bf\u01c0\7E\2\2\u01c0\u01c1"+
		"\7q\2\2\u01c1\u01c2\7p\2\2\u01c2\u01c3\7u\2\2\u01c3\u01c4\7v\2\2\u01c4"+
		"\u01c5\7t\2\2\u01c5\u01c6\7c\2\2\u01c6\u01c7\7k\2\2\u01c7\u01c8\7p\2\2"+
		"\u01c8\u01c9\7v\2\2\u01c9\u01ca\7\"\2\2\u01ca\u01cb\7C\2\2\u01cb\u01cc"+
		"\7v\2\2\u01ccF\3\2\2\2\u01cd\u01ce\7*\2\2\u01ce\u01cf\7E\2\2\u01cf\u01d0"+
		"\7q\2\2\u01d0\u01d1\7p\2\2\u01d1\u01d2\7u\2\2\u01d2\u01d3\7v\2\2\u01d3"+
		"\u01d4\7t\2\2\u01d4\u01d5\7c\2\2\u01d5\u01d6\7k\2\2\u01d6\u01d7\7p\2\2"+
		"\u01d7\u01d8\7v\2\2\u01d8H\3\2\2\2\u01d9\u01da\7D\2\2\u01da\u01db\7g\2"+
		"\2\u01db\u01dc\7h\2\2\u01dc\u01dd\7q\2\2\u01dd\u01de\7t\2\2\u01de\u01df"+
		"\7g\2\2\u01dfJ\3\2\2\2\u01e0\u01e1\7O\2\2\u01e1\u01e2\7g\2\2\u01e2\u01e3"+
		"\7g\2\2\u01e3\u01e4\7v\2\2\u01e4\u01e5\7u\2\2\u01e5L\3\2\2\2\u01e6\u01e7"+
		"\7Q\2\2\u01e7\u01e8\7x\2\2\u01e8\u01e9\7g\2\2\u01e9\u01ea\7t\2\2\u01ea"+
		"\u01eb\7n\2\2\u01eb\u01ec\7c\2\2\u01ec\u01ed\7r\2\2\u01ed\u01ee\7u\2\2"+
		"\u01eeN\3\2\2\2\u01ef\u01f0\7H\2\2\u01f0\u01f1\7k\2\2\u01f1\u01f2\7p\2"+
		"\2\u01f2\u01f3\7k\2\2\u01f3\u01f4\7u\2\2\u01f4\u01f5\7j\2\2\u01f5\u01f6"+
		"\7g\2\2\u01f6\u01f7\7f\2\2\u01f7\u01f8\7D\2\2\u01f8\u01f9\7{\2\2\u01f9"+
		"P\3\2\2\2\u01fa\u01fb\7E\2\2\u01fb\u01fc\7q\2\2\u01fc\u01fd\7p\2\2\u01fd"+
		"\u01fe\7v\2\2\u01fe\u01ff\7c\2\2\u01ff\u0200\7k\2\2\u0200\u0201\7p\2\2"+
		"\u0201\u0202\7u\2\2\u0202R\3\2\2\2\u0203\u0204\7U\2\2\u0204\u0205\7v\2"+
		"\2\u0205\u0206\7c\2\2\u0206\u0207\7t\2\2\u0207\u0208\7v\2\2\u0208\u0209"+
		"\7g\2\2\u0209\u020a\7f\2\2\u020a\u020b\7D\2\2\u020b\u020c\7{\2\2\u020c"+
		"T\3\2\2\2\u020d\u020e\7G\2\2\u020e\u020f\7s\2\2\u020f\u0210\7w\2\2\u0210"+
		"\u0211\7c\2\2\u0211\u0212\7n\2\2\u0212\u0213\7u\2\2\u0213V\3\2\2\2\u0214"+
		"\u0215\7U\2\2\u0215\u0216\7v\2\2\u0216\u0217\7c\2\2\u0217\u0218\7t\2\2"+
		"\u0218\u0219\7v\2\2\u0219\u021a\7u\2\2\u021aX\3\2\2\2\u021b\u021c\7F\2"+
		"\2\u021c\u021d\7w\2\2\u021d\u021e\7t\2\2\u021e\u021f\7k\2\2\u021f\u0220"+
		"\7p\2\2\u0220\u0221\7i\2\2\u0221Z\3\2\2\2\u0222\u0223\7H\2\2\u0223\u0224"+
		"\7k\2\2\u0224\u0225\7p\2\2\u0225\u0226\7k\2\2\u0226\u0227\7u\2\2\u0227"+
		"\u0228\7j\2\2\u0228\u0229\7g\2\2\u0229\u022a\7u\2\2\u022a\\\3\2\2\2\u022b"+
		"\u022c\7Q\2\2\u022c\u022d\7x\2\2\u022d\u022e\7g\2\2\u022e\u022f\7t\2\2"+
		"\u022f\u0230\7n\2\2\u0230\u0231\7c\2\2\u0231\u0232\7r\2\2\u0232\u0233"+
		"\7r\2\2\u0233\u0234\7g\2\2\u0234\u0235\7f\2\2\u0235\u0236\7D\2\2\u0236"+
		"\u0237\7{\2\2\u0237^\3\2\2\2\u0238\u0239\7C\2\2\u0239\u023a\7h\2\2\u023a"+
		"\u023b\7v\2\2\u023b\u023c\7g\2\2\u023c\u023d\7t\2\2\u023d`\3\2\2\2\u023e"+
		"\u023f\7O\2\2\u023f\u0240\7g\2\2\u0240\u0241\7v\2\2\u0241\u0242\7D\2\2"+
		"\u0242\u0243\7{\2\2\u0243b\3\2\2\2\u0244\u0245\7D\2\2\u0245\u0246\7g\2"+
		"\2\u0246\u0247\7h\2\2\u0247\u0248\7q\2\2\u0248\u0249\7t\2\2\u0249\u024a"+
		"\7g\2\2\u024a\u024b\7Q\2\2\u024b\u024c\7t\2\2\u024c\u024d\7O\2\2\u024d"+
		"\u024e\7g\2\2\u024e\u024f\7g\2\2\u024f\u0250\7v\2\2\u0250\u0251\7u\2\2"+
		"\u0251d\3\2\2\2\u0252\u0253\7O\2\2\u0253\u0254\7g\2\2\u0254\u0255\7v\2"+
		"\2\u0255\u0256\7D\2\2\u0256\u0257\7{\2\2\u0257\u0258\7Q\2\2\u0258\u0259"+
		"\7t\2\2\u0259\u025a\7C\2\2\u025a\u025b\7h\2\2\u025b\u025c\7v\2\2\u025c"+
		"\u025d\7g\2\2\u025d\u025e\7t\2\2\u025ef\3\2\2\2\u025f\u0260\7O\2\2\u0260"+
		"\u0261\7g\2\2\u0261\u0262\7v\2\2\u0262\u0263\7D\2\2\u0263\u0264\7{\2\2"+
		"\u0264\u0265\7Q\2\2\u0265\u0266\7t\2\2\u0266\u0267\7Q\2\2\u0267\u0268"+
		"\7x\2\2\u0268\u0269\7g\2\2\u0269\u026a\7t\2\2\u026a\u026b\7n\2\2\u026b"+
		"\u026c\7c\2\2\u026c\u026d\7r\2\2\u026d\u026e\7r\2\2\u026e\u026f\7g\2\2"+
		"\u026f\u0270\7f\2\2\u0270\u0271\7D\2\2\u0271\u0272\7{\2\2\u0272h\3\2\2"+
		"\2\u0273\u0274\7O\2\2\u0274\u0275\7g\2\2\u0275\u0276\7v\2\2\u0276\u0277"+
		"\7D\2\2\u0277\u0278\7{\2\2\u0278\u0279\7Q\2\2\u0279\u027a\7t\2\2\u027a"+
		"\u027b\7Q\2\2\u027b\u027c\7x\2\2\u027c\u027d\7g\2\2\u027d\u027e\7t\2\2"+
		"\u027e\u027f\7n\2\2\u027f\u0280\7c\2\2\u0280\u0281\7r\2\2\u0281\u0282"+
		"\7r\2\2\u0282\u0283\7g\2\2\u0283\u0284\7f\2\2\u0284\u0285\7D\2\2\u0285"+
		"\u0286\7{\2\2\u0286\u0287\7Q\2\2\u0287\u0288\7t\2\2\u0288\u0289\7C\2\2"+
		"\u0289\u028a\7h\2\2\u028a\u028b\7v\2\2\u028b\u028c\7g\2\2\u028c\u028d"+
		"\7t\2\2\u028dj\3\2\2\2\u028e\u028f\7O\2\2\u028f\u0290\7g\2\2\u0290\u0291"+
		"\7v\2\2\u0291\u0292\7D\2\2\u0292\u0293\7{\2\2\u0293\u0294\7Q\2\2\u0294"+
		"\u0295\7t\2\2\u0295\u0296\7Q\2\2\u0296\u0297\7x\2\2\u0297\u0298\7g\2\2"+
		"\u0298\u0299\7t\2\2\u0299\u029a\7n\2\2\u029a\u029b\7c\2\2\u029b\u029c"+
		"\7r\2\2\u029c\u029d\7r\2\2\u029d\u029e\7g\2\2\u029e\u029f\7f\2\2\u029f"+
		"\u02a0\7D\2\2\u02a0\u02a1\7{\2\2\u02a1\u02a2\7Q\2\2\u02a2\u02a3\7t\2\2"+
		"\u02a3\u02a4\7K\2\2\u02a4\u02a5\7u\2\2\u02a5\u02a6\7H\2\2\u02a6\u02a7"+
		"\7k\2\2\u02a7\u02a8\7p\2\2\u02a8\u02a9\7k\2\2\u02a9\u02aa\7u\2\2\u02aa"+
		"\u02ab\7j\2\2\u02ab\u02ac\7g\2\2\u02ac\u02ad\7f\2\2\u02ad\u02ae\7D\2\2"+
		"\u02ae\u02af\7{\2\2\u02af\u02b0\7Q\2\2\u02b0\u02b1\7t\2\2\u02b1\u02b2"+
		"\7F\2\2\u02b2\u02b3\7w\2\2\u02b3\u02b4\7t\2\2\u02b4\u02b5\7k\2\2\u02b5"+
		"\u02b6\7p\2\2\u02b6\u02b7\7i\2\2\u02b7l\3\2\2\2\u02b8\u02b9\7O\2\2\u02b9"+
		"\u02ba\7g\2\2\u02ba\u02bb\7g\2\2\u02bb\u02bc\7v\2\2\u02bc\u02bd\7u\2\2"+
		"\u02bd\u02be\7Q\2\2\u02be\u02bf\7t\2\2\u02bf\u02c0\7Q\2\2\u02c0\u02c1"+
		"\7x\2\2\u02c1\u02c2\7g\2\2\u02c2\u02c3\7t\2\2\u02c3\u02c4\7n\2\2\u02c4"+
		"\u02c5\7c\2\2\u02c5\u02c6\7r\2\2\u02c6\u02c7\7u\2\2\u02c7\u02c8\7Q\2\2"+
		"\u02c8\u02c9\7t\2\2\u02c9\u02ca\7D\2\2\u02ca\u02cb\7g\2\2\u02cb\u02cc"+
		"\7h\2\2\u02cc\u02cd\7q\2\2\u02cd\u02ce\7t\2\2\u02ce\u02cf\7g\2\2\u02cf"+
		"n\3\2\2\2\u02d0\u02d1\7F\2\2\u02d1\u02d2\7w\2\2\u02d2\u02d3\7t\2\2\u02d3"+
		"\u02d4\7k\2\2\u02d4\u02d5\7p\2\2\u02d5\u02d6\7i\2\2\u02d6\u02d7\7Q\2\2"+
		"\u02d7\u02d8\7t\2\2\u02d8\u02d9\7G\2\2\u02d9\u02da\7s\2\2\u02da\u02db"+
		"\7w\2\2\u02db\u02dc\7c\2\2\u02dc\u02dd\7n\2\2\u02dd\u02de\7u\2\2\u02de"+
		"p\3\2\2\2\u02df\u02e0\7F\2\2\u02e0\u02e1\7w\2\2\u02e1\u02e2\7t\2\2\u02e2"+
		"\u02e3\7k\2\2\u02e3\u02e4\7p\2\2\u02e4\u02e5\7i\2\2\u02e5\u02e6\7Q\2\2"+
		"\u02e6\u02e7\7t\2\2\u02e7\u02e8\7G\2\2\u02e8\u02e9\7s\2\2\u02e9\u02ea"+
		"\7w\2\2\u02ea\u02eb\7c\2\2\u02eb\u02ec\7n\2\2\u02ec\u02ed\7u\2\2\u02ed"+
		"\u02ee\7Q\2\2\u02ee\u02ef\7t\2\2\u02ef\u02f0\7U\2\2\u02f0\u02f1\7v\2\2"+
		"\u02f1\u02f2\7c\2\2\u02f2\u02f3\7t\2\2\u02f3\u02f4\7v\2\2\u02f4\u02f5"+
		"\7u\2\2\u02f5\u02f6\7Q\2\2\u02f6\u02f7\7t\2\2\u02f7\u02f8\7H\2\2\u02f8"+
		"\u02f9\7k\2\2\u02f9\u02fa\7p\2\2\u02fa\u02fb\7k\2\2\u02fb\u02fc\7u\2\2"+
		"\u02fc\u02fd\7j\2\2\u02fd\u02fe\7g\2\2\u02fe\u02ff\7u\2\2\u02ffr\3\2\2"+
		"\2\u0300\u0301\7O\2\2\u0301\u0302\7g\2\2\u0302\u0303\7g\2\2\u0303\u0304"+
		"\7v\2\2\u0304\u0305\7u\2\2\u0305\u0306\7Q\2\2\u0306\u0307\7t\2\2\u0307"+
		"\u0308\7Q\2\2\u0308\u0309\7x\2\2\u0309\u030a\7g\2\2\u030a\u030b\7t\2\2"+
		"\u030b\u030c\7n\2\2\u030c\u030d\7c\2\2\u030d\u030e\7r\2\2\u030e\u030f"+
		"\7u\2\2\u030f\u0310\7Q\2\2\u0310\u0311\7t\2\2\u0311\u0312\7H\2\2\u0312"+
		"\u0313\7k\2\2\u0313\u0314\7p\2\2\u0314\u0315\7k\2\2\u0315\u0316\7u\2\2"+
		"\u0316\u0317\7j\2\2\u0317\u0318\7g\2\2\u0318\u0319\7f\2\2\u0319\u031a"+
		"\7D\2\2\u031a\u031b\7{\2\2\u031b\u031c\7Q\2\2\u031c\u031d\7t\2\2\u031d"+
		"\u031e\7E\2\2\u031e\u031f\7q\2\2\u031f\u0320\7p\2\2\u0320\u0321\7v\2\2"+
		"\u0321\u0322\7c\2\2\u0322\u0323\7k\2\2\u0323\u0324\7p\2\2\u0324\u0325"+
		"\7u\2\2\u0325t\3\2\2\2\u0326\u0327\7E\2\2\u0327\u0328\7q\2\2\u0328\u0329"+
		"\7p\2\2\u0329\u032a\7v\2\2\u032a\u032b\7c\2\2\u032b\u032c\7k\2\2\u032c"+
		"\u032d\7p\2\2\u032d\u032e\7u\2\2\u032e\u032f\7Q\2\2\u032f\u0330\7t\2\2"+
		"\u0330\u0331\7U\2\2\u0331\u0332\7v\2\2\u0332\u0333\7c\2\2\u0333\u0334"+
		"\7t\2\2\u0334\u0335\7v\2\2\u0335\u0336\7g\2\2\u0336\u0337\7f\2\2\u0337"+
		"\u0338\7D\2\2\u0338\u0339\7{\2\2\u0339\u033a\7Q\2\2\u033a\u033b\7t\2\2"+
		"\u033b\u033c\7Q\2\2\u033c\u033d\7x\2\2\u033d\u033e\7g\2\2\u033e\u033f"+
		"\7t\2\2\u033f\u0340\7n\2\2\u0340\u0341\7c\2\2\u0341\u0342\7r\2\2\u0342"+
		"\u0343\7r\2\2\u0343\u0344\7g\2\2\u0344\u0345\7f\2\2\u0345\u0346\7D\2\2"+
		"\u0346\u0347\7{\2\2\u0347\u0348\7Q\2\2\u0348\u0349\7t\2\2\u0349\u034a"+
		"\7O\2\2\u034a\u034b\7g\2\2\u034b\u034c\7v\2\2\u034c\u034d\7D\2\2\u034d"+
		"\u034e\7{\2\2\u034ev\3\2\2\2\u034f\u0350\7G\2\2\u0350\u0351\7p\2\2\u0351"+
		"\u0352\7f\2\2\u0352\u0353\7u\2\2\u0353\u0354\7F\2\2\u0354\u0355\7w\2\2"+
		"\u0355\u0356\7t\2\2\u0356\u0357\7k\2\2\u0357\u0358\7p\2\2\u0358\u0359"+
		"\7i\2\2\u0359x\3\2\2\2\u035a\u035b\7G\2\2\u035b\u035c\7p\2\2\u035c\u035d"+
		"\7f\2\2\u035d\u035e\7u\2\2\u035e\u035f\7Q\2\2\u035f\u0360\7t\2\2\u0360"+
		"\u0361\7G\2\2\u0361\u0362\7p\2\2\u0362\u0363\7f\2\2\u0363\u0364\7g\2\2"+
		"\u0364\u0365\7f\2\2\u0365\u0366\7D\2\2\u0366\u0367\7{\2\2\u0367z\3\2\2"+
		"\2\u0368\u0369\7U\2\2\u0369\u036a\7v\2\2\u036a\u036b\7c\2\2\u036b\u036c"+
		"\7t\2\2\u036c\u036d\7v\2\2\u036d\u036e\7u\2\2\u036e\u036f\7Q\2\2\u036f"+
		"\u0370\7t\2\2\u0370\u0371\7U\2\2\u0371\u0372\7v\2\2\u0372\u0373\7c\2\2"+
		"\u0373\u0374\7t\2\2\u0374\u0375\7v\2\2\u0375\u0376\7g\2\2\u0376\u0377"+
		"\7f\2\2\u0377\u0378\7D\2\2\u0378\u0379\7{\2\2\u0379|\3\2\2\2\u037a\u037b"+
		"\7P\2\2\u037b\u037c\7q\2\2\u037c\u037d\7v\2\2\u037d\u037e\7D\2\2\u037e"+
		"\u037f\7g\2\2\u037f\u0380\7h\2\2\u0380\u0381\7q\2\2\u0381\u0382\7t\2\2"+
		"\u0382\u0383\7g\2\2\u0383\u0384\7C\2\2\u0384\u0385\7p\2\2\u0385\u0386"+
		"\7f\2\2\u0386\u0387\7P\2\2\u0387\u0388\7q\2\2\u0388\u0389\7v\2\2\u0389"+
		"\u038a\7C\2\2\u038a\u038b\7h\2\2\u038b\u038c\7v\2\2\u038c\u038d\7g\2\2"+
		"\u038d\u038e\7t\2\2\u038e~\3\2\2\2\u038f\u0390\7F\2\2\u0390\u0391\7w\2"+
		"\2\u0391\u0392\7t\2\2\u0392\u0393\7c\2\2\u0393\u0394\7v\2\2\u0394\u0395"+
		"\7k\2\2\u0395\u0396\7q\2\2\u0396\u0397\7p\2\2\u0397\u0080\3\2\2\2\u0398"+
		"\u0399\7C\2\2\u0399\u039a\7v\2\2\u039a\u0082\3\2\2\2\u039b\u039c\7U\2"+
		"\2\u039c\u039d\7k\2\2\u039d\u039e\7|\2\2\u039e\u039f\7g\2\2\u039f\u0084"+
		"\3\2\2\2\u03a0\u03a1\7]\2\2\u03a1\u0086\3\2\2\2\u03a2\u03a3\7_\2\2\u03a3"+
		"\u0088\3\2\2\2\u03a4\u03a5\7K\2\2\u03a5\u03a6\7P\2\2\u03a6\u03a7\7H\2"+
		"\2\u03a7\u008a\3\2\2\2\u03a8\u03a9\7v\2\2\u03a9\u03aa\7c\2\2\u03aa\u03ab"+
		"\7u\2\2\u03ab\u03ac\7m\2\2\u03ac\u008c\3\2\2\2\u03ad\u03ae\7*\2\2\u03ae"+
		"\u03af\7T\2\2\u03af\u03b0\7g\2\2\u03b0\u03b1\7y\2\2\u03b1\u03b2\7c\2\2"+
		"\u03b2\u03b3\7t\2\2\u03b3\u03b4\7f\2\2\u03b4\u008e\3\2\2\2\u03b5\u03b6"+
		"\7*\2\2\u03b6\u03b7\7V\2\2\u03b7\u03b8\7t\2\2\u03b8\u03b9\7c\2\2\u03b9"+
		"\u03ba\7p\2\2\u03ba\u03bb\7u\2\2\u03bb\u03bc\7k\2\2\u03bc\u03bd\7v\2\2"+
		"\u03bd\u03be\7k\2\2\u03be\u03bf\7q\2\2\u03bf\u03c0\7p\2\2\u03c0\u03c1"+
		"\7R\2\2\u03c1\u03c2\7t\2\2\u03c2\u03c3\7q\2\2\u03c3\u03c4\7d\2\2\u03c4"+
		"\u0090\3\2\2\2\u03c5\u03c6\7*\2\2\u03c6\u03c7\7k\2\2\u03c7\u03c8\7h\2"+
		"\2\u03c8\u0092\3\2\2\2\u03c9\u03ca\7*\2\2\u03ca\u03cb\7T\2\2\u03cb\u03cc"+
		"\7g\2\2\u03cc\u03cd\7u\2\2\u03cd\u03ce\7q\2\2\u03ce\u03cf\7w\2\2\u03cf"+
		"\u03d0\7t\2\2\u03d0\u03d1\7e\2\2\u03d1\u03d2\7g\2\2\u03d2\u03d3\7W\2\2"+
		"\u03d3\u03d4\7u\2\2\u03d4\u03d5\7c\2\2\u03d5\u03d6\7i\2\2\u03d6\u03d7"+
		"\7g\2\2\u03d7\u0094\3\2\2\2\u03d8\u03d9\7*\2\2\u03d9\u03da\7H\2\2\u03da"+
		"\u03db\7n\2\2\u03db\u03dc\7w\2\2\u03dc\u03dd\7g\2\2\u03dd\u03de\7p\2\2"+
		"\u03de\u03df\7v\2\2\u03df\u03e0\7T\2\2\u03e0\u03e1\7g\2\2\u03e1\u03e2"+
		"\7u\2\2\u03e2\u03e3\7q\2\2\u03e3\u03e4\7w\2\2\u03e4\u03e5\7t\2\2\u03e5"+
		"\u03e6\7e\2\2\u03e6\u03e7\7g\2\2\u03e7\u03e8\7W\2\2\u03e8\u03e9\7u\2\2"+
		"\u03e9\u03ea\7c\2\2\u03ea\u03eb\7i\2\2\u03eb\u03ec\7g\2\2\u03ec\u0096"+
		"\3\2\2\2\u03ed\u03ee\7*\2\2\u03ee\u03ef\7H\2\2\u03ef\u03f0\7n\2\2\u03f0"+
		"\u03f1\7w\2\2\u03f1\u03f2\7g\2\2\u03f2\u03f3\7p\2\2\u03f3\u03f4\7v\2\2"+
		"\u03f4\u0098\3\2\2\2\u03f5\u03f6\7*\2\2\u03f6\u03f7\7W\2\2\u03f7\u03f8"+
		"\7u\2\2\u03f8\u03f9\7c\2\2\u03f9\u03fa\7i\2\2\u03fa\u03fb\7g\2\2\u03fb"+
		"\u009a\3\2\2\2\u03fc\u03fd\7*\2\2\u03fd\u03fe\7R\2\2\u03fe\u03ff\7c\2"+
		"\2\u03ff\u0400\7t\2\2\u0400\u0401\7c\2\2\u0401\u0402\7o\2\2\u0402\u009c"+
		"\3\2\2\2\u0403\u0404\7*\2\2\u0404\u0405\7X\2\2\u0405\u0406\7c\2\2\u0406"+
		"\u0407\7n\2\2\u0407\u0408\7w\2\2\u0408\u0409\7g\2\2\u0409\u040a\7u\2\2"+
		"\u040a\u009e\3\2\2\2\u040b\u040c\7*\2\2\u040c\u040d\7P\2\2\u040d\u040e"+
		"\7q\2\2\u040e\u040f\7v\2\2\u040f\u0410\7X\2\2\u0410\u0411\7c\2\2\u0411"+
		"\u0412\7n\2\2\u0412\u0413\7w\2\2\u0413\u0414\7g\2\2\u0414\u0415\7u\2\2"+
		"\u0415\u00a0\3\2\2\2\u0416\u0417\7*\2\2\u0417\u0418\7V\2\2\u0418\u0419"+
		"\7{\2\2\u0419\u041a\7r\2\2\u041a\u041b\7g\2\2\u041b\u00a2\3\2\2\2\u041c"+
		"\u041d\7*\2\2\u041d\u041e\7P\2\2\u041e\u041f\7q\2\2\u041f\u0420\7v\2\2"+
		"\u0420\u0421\7V\2\2\u0421\u0422\7{\2\2\u0422\u0423\7r\2\2\u0423\u0424"+
		"\7g\2\2\u0424\u00a4\3\2\2\2\u0425\u0426\7*\2\2\u0426\u0427\7X\2\2\u0427"+
		"\u0428\7c\2\2\u0428\u0429\7t\2\2\u0429\u042a\7F\2\2\u042a\u042b\7k\2\2"+
		"\u042b\u042c\7h\2\2\u042c\u042d\7h\2\2\u042d\u042e\7g\2\2\u042e\u042f"+
		"\7t\2\2\u042f\u0430\7g\2\2\u0430\u0431\7p\2\2\u0431\u0432\7v\2\2\u0432"+
		"\u00a6\3\2\2\2\u0433\u0434\7A\2\2\u0434\u0435\5\u00adW\2\u0435\u00a8\3"+
		"\2\2\2\u0436\u0438\5\u00abV\2\u0437\u0436\3\2\2\2\u0437\u0438\3\2\2\2"+
		"\u0438\u0439\3\2\2\2\u0439\u043a\5\u00b3Z\2\u043a\u043b\7\60\2\2\u043b"+
		"\u043c\5\u00b3Z\2\u043c\u00aa\3\2\2\2\u043d\u043e\7/\2\2\u043e\u00ac\3"+
		"\2\2\2\u043f\u0443\t\2\2\2\u0440\u0442\t\3\2\2\u0441\u0440\3\2\2\2\u0442"+
		"\u0445\3\2\2\2\u0443\u0441\3\2\2\2\u0443\u0444\3\2\2\2\u0444\u00ae\3\2"+
		"\2\2\u0445\u0443\3\2\2\2\u0446\u044a\7%\2\2\u0447\u0449\n\4\2\2\u0448"+
		"\u0447\3\2\2\2\u0449\u044c\3\2\2\2\u044a\u0448\3\2\2\2\u044a\u044b\3\2"+
		"\2\2\u044b\u044d\3\2\2\2\u044c\u044a\3\2\2\2\u044d\u044e\bX\2\2\u044e"+
		"\u00b0\3\2\2\2\u044f\u0451\t\5\2\2\u0450\u044f\3\2\2\2\u0451\u0452\3\2"+
		"\2\2\u0452\u0450\3\2\2\2\u0452\u0453\3\2\2\2\u0453\u0454\3\2\2\2\u0454"+
		"\u0455\bY\2\2\u0455\u00b2\3\2\2\2\u0456\u045a\t\6\2\2\u0457\u0459\t\6"+
		"\2\2\u0458\u0457\3\2\2\2\u0459\u045c\3\2\2\2\u045a\u0458\3\2\2\2\u045a"+
		"\u045b\3\2\2\2\u045b\u00b4\3\2\2\2\u045c\u045a\3\2\2\2\b\2\u0437\u0443"+
		"\u044a\u0452\u045a\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}