// Generated from ConnectorParser.g4 by ANTLR 4.5.3
package com.datamountaineer.connector.config.antlr4;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class ConnectorParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.5.3", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		INSERT=1, UPSERT=2, INTO=3, SELECT=4, FROM=5, IGNORE=6, AS=7, AUTOCREATE=8, 
		AUTOEVOLVE=9, CLUSTERBY=10, BUCKETS=11, BATCH=12, CAPITALIZE=13, PARTITIONBY=14, 
		DISTRIBUTEBY=15, TIMESTAMP=16, STOREDAS=17, SYS_TIME=18, WITHGROUP=19, 
		WITHOFFSET=20, PK=21, SAMPLE=22, EVERY=23, WITHFORMAT=24, FORMAT=25, EQUAL=26, 
		INT=27, ASTERISK=28, COMMA=29, DOT=30, LEFT_PARAN=31, RIGHT_PARAN=32, 
		ID=33, TOPICNAME=34, NEWLINE=35, WS=36;
	public static final int
		RULE_stat = 0, RULE_into = 1, RULE_pk = 2, RULE_insert_into = 3, RULE_upsert_into = 4, 
		RULE_upsert_pk_into = 5, RULE_sql_action = 6, RULE_schema_name = 7, RULE_insert_from_clause = 8, 
		RULE_select_clause = 9, RULE_select_clause_basic = 10, RULE_topic_name = 11, 
		RULE_table_name = 12, RULE_column_name = 13, RULE_column_name_alias = 14, 
		RULE_column_list = 15, RULE_from_clause = 16, RULE_ignored_name = 17, 
		RULE_ignore_clause = 18, RULE_pk_name = 19, RULE_primary_key_list = 20, 
		RULE_autocreate = 21, RULE_autoevolve = 22, RULE_batch_size = 23, RULE_batching = 24, 
		RULE_capitalize = 25, RULE_partition_name = 26, RULE_partition_list = 27, 
		RULE_partitionby = 28, RULE_distribute_name = 29, RULE_distribute_list = 30, 
		RULE_distributeby = 31, RULE_timestamp_clause = 32, RULE_timestamp_value = 33, 
		RULE_storedas_name = 34, RULE_storedas_value = 35, RULE_buckets_number = 36, 
		RULE_clusterby_name = 37, RULE_clusterby_list = 38, RULE_clusterby = 39, 
		RULE_with_consumer_group = 40, RULE_with_consumer_group_value = 41, RULE_offset_partition_inner = 42, 
		RULE_offset_partition = 43, RULE_partition_offset_list = 44, RULE_with_offset_list = 45, 
		RULE_sample_clause = 46, RULE_sample_value = 47, RULE_sample_period = 48, 
		RULE_with_format_clause = 49, RULE_with_format = 50;
	public static final String[] ruleNames = {
		"stat", "into", "pk", "insert_into", "upsert_into", "upsert_pk_into", 
		"sql_action", "schema_name", "insert_from_clause", "select_clause", "select_clause_basic", 
		"topic_name", "table_name", "column_name", "column_name_alias", "column_list", 
		"from_clause", "ignored_name", "ignore_clause", "pk_name", "primary_key_list", 
		"autocreate", "autoevolve", "batch_size", "batching", "capitalize", "partition_name", 
		"partition_list", "partitionby", "distribute_name", "distribute_list", 
		"distributeby", "timestamp_clause", "timestamp_value", "storedas_name", 
		"storedas_value", "buckets_number", "clusterby_name", "clusterby_list", 
		"clusterby", "with_consumer_group", "with_consumer_group_value", "offset_partition_inner", 
		"offset_partition", "partition_offset_list", "with_offset_list", "sample_clause", 
		"sample_value", "sample_period", "with_format_clause", "with_format"
	};

	private static final String[] _LITERAL_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, "'='", null, "'*'", "','", "'.'", "'('", "')'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "INSERT", "UPSERT", "INTO", "SELECT", "FROM", "IGNORE", "AS", "AUTOCREATE", 
		"AUTOEVOLVE", "CLUSTERBY", "BUCKETS", "BATCH", "CAPITALIZE", "PARTITIONBY", 
		"DISTRIBUTEBY", "TIMESTAMP", "STOREDAS", "SYS_TIME", "WITHGROUP", "WITHOFFSET", 
		"PK", "SAMPLE", "EVERY", "WITHFORMAT", "FORMAT", "EQUAL", "INT", "ASTERISK", 
		"COMMA", "DOT", "LEFT_PARAN", "RIGHT_PARAN", "ID", "TOPICNAME", "NEWLINE", 
		"WS"
	};
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
	public String getGrammarFileName() { return "ConnectorParser.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public ConnectorParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class StatContext extends ParserRuleContext {
		public Insert_from_clauseContext insert_from_clause() {
			return getRuleContext(Insert_from_clauseContext.class,0);
		}
		public Select_clauseContext select_clause() {
			return getRuleContext(Select_clauseContext.class,0);
		}
		public StatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stat; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ConnectorParserListener ) ((ConnectorParserListener)listener).enterStat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ConnectorParserListener ) ((ConnectorParserListener)listener).exitStat(this);
		}
	}

	public final StatContext stat() throws RecognitionException {
		StatContext _localctx = new StatContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_stat);
		try {
			setState(104);
			switch (_input.LA(1)) {
			case INSERT:
			case UPSERT:
				enterOuterAlt(_localctx, 1);
				{
				setState(102);
				insert_from_clause();
				}
				break;
			case SELECT:
				enterOuterAlt(_localctx, 2);
				{
				setState(103);
				select_clause();
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

	public static class IntoContext extends ParserRuleContext {
		public TerminalNode INTO() { return getToken(ConnectorParser.INTO, 0); }
		public IntoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_into; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ConnectorParserListener ) ((ConnectorParserListener)listener).enterInto(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ConnectorParserListener ) ((ConnectorParserListener)listener).exitInto(this);
		}
	}

	public final IntoContext into() throws RecognitionException {
		IntoContext _localctx = new IntoContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_into);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(106);
			match(INTO);
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

	public static class PkContext extends ParserRuleContext {
		public TerminalNode PK() { return getToken(ConnectorParser.PK, 0); }
		public PkContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pk; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ConnectorParserListener ) ((ConnectorParserListener)listener).enterPk(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ConnectorParserListener ) ((ConnectorParserListener)listener).exitPk(this);
		}
	}

	public final PkContext pk() throws RecognitionException {
		PkContext _localctx = new PkContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_pk);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(108);
			match(PK);
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

	public static class Insert_intoContext extends ParserRuleContext {
		public TerminalNode INSERT() { return getToken(ConnectorParser.INSERT, 0); }
		public IntoContext into() {
			return getRuleContext(IntoContext.class,0);
		}
		public Insert_intoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_insert_into; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ConnectorParserListener ) ((ConnectorParserListener)listener).enterInsert_into(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ConnectorParserListener ) ((ConnectorParserListener)listener).exitInsert_into(this);
		}
	}

	public final Insert_intoContext insert_into() throws RecognitionException {
		Insert_intoContext _localctx = new Insert_intoContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_insert_into);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(110);
			match(INSERT);
			setState(111);
			into();
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

	public static class Upsert_intoContext extends ParserRuleContext {
		public TerminalNode UPSERT() { return getToken(ConnectorParser.UPSERT, 0); }
		public IntoContext into() {
			return getRuleContext(IntoContext.class,0);
		}
		public Upsert_intoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_upsert_into; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ConnectorParserListener ) ((ConnectorParserListener)listener).enterUpsert_into(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ConnectorParserListener ) ((ConnectorParserListener)listener).exitUpsert_into(this);
		}
	}

	public final Upsert_intoContext upsert_into() throws RecognitionException {
		Upsert_intoContext _localctx = new Upsert_intoContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_upsert_into);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(113);
			match(UPSERT);
			setState(114);
			into();
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

	public static class Upsert_pk_intoContext extends ParserRuleContext {
		public TerminalNode UPSERT() { return getToken(ConnectorParser.UPSERT, 0); }
		public PkContext pk() {
			return getRuleContext(PkContext.class,0);
		}
		public TerminalNode ID() { return getToken(ConnectorParser.ID, 0); }
		public IntoContext into() {
			return getRuleContext(IntoContext.class,0);
		}
		public Upsert_pk_intoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_upsert_pk_into; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ConnectorParserListener ) ((ConnectorParserListener)listener).enterUpsert_pk_into(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ConnectorParserListener ) ((ConnectorParserListener)listener).exitUpsert_pk_into(this);
		}
	}

	public final Upsert_pk_intoContext upsert_pk_into() throws RecognitionException {
		Upsert_pk_intoContext _localctx = new Upsert_pk_intoContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_upsert_pk_into);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(116);
			match(UPSERT);
			setState(117);
			pk();
			setState(118);
			match(ID);
			setState(119);
			into();
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

	public static class Sql_actionContext extends ParserRuleContext {
		public Insert_intoContext insert_into() {
			return getRuleContext(Insert_intoContext.class,0);
		}
		public Upsert_intoContext upsert_into() {
			return getRuleContext(Upsert_intoContext.class,0);
		}
		public Upsert_pk_intoContext upsert_pk_into() {
			return getRuleContext(Upsert_pk_intoContext.class,0);
		}
		public Sql_actionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sql_action; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ConnectorParserListener ) ((ConnectorParserListener)listener).enterSql_action(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ConnectorParserListener ) ((ConnectorParserListener)listener).exitSql_action(this);
		}
	}

	public final Sql_actionContext sql_action() throws RecognitionException {
		Sql_actionContext _localctx = new Sql_actionContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_sql_action);
		try {
			setState(124);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(121);
				insert_into();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(122);
				upsert_into();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(123);
				upsert_pk_into();
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

	public static class Schema_nameContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(ConnectorParser.ID, 0); }
		public Schema_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_schema_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ConnectorParserListener ) ((ConnectorParserListener)listener).enterSchema_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ConnectorParserListener ) ((ConnectorParserListener)listener).exitSchema_name(this);
		}
	}

	public final Schema_nameContext schema_name() throws RecognitionException {
		Schema_nameContext _localctx = new Schema_nameContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_schema_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(126);
			match(ID);
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

	public static class Insert_from_clauseContext extends ParserRuleContext {
		public Sql_actionContext sql_action() {
			return getRuleContext(Sql_actionContext.class,0);
		}
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public Select_clause_basicContext select_clause_basic() {
			return getRuleContext(Select_clause_basicContext.class,0);
		}
		public AutocreateContext autocreate() {
			return getRuleContext(AutocreateContext.class,0);
		}
		public TerminalNode PK() { return getToken(ConnectorParser.PK, 0); }
		public Primary_key_listContext primary_key_list() {
			return getRuleContext(Primary_key_listContext.class,0);
		}
		public AutoevolveContext autoevolve() {
			return getRuleContext(AutoevolveContext.class,0);
		}
		public BatchingContext batching() {
			return getRuleContext(BatchingContext.class,0);
		}
		public CapitalizeContext capitalize() {
			return getRuleContext(CapitalizeContext.class,0);
		}
		public PartitionbyContext partitionby() {
			return getRuleContext(PartitionbyContext.class,0);
		}
		public DistributebyContext distributeby() {
			return getRuleContext(DistributebyContext.class,0);
		}
		public ClusterbyContext clusterby() {
			return getRuleContext(ClusterbyContext.class,0);
		}
		public Timestamp_clauseContext timestamp_clause() {
			return getRuleContext(Timestamp_clauseContext.class,0);
		}
		public Storedas_nameContext storedas_name() {
			return getRuleContext(Storedas_nameContext.class,0);
		}
		public Insert_from_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_insert_from_clause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ConnectorParserListener ) ((ConnectorParserListener)listener).enterInsert_from_clause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ConnectorParserListener ) ((ConnectorParserListener)listener).exitInsert_from_clause(this);
		}
	}

	public final Insert_from_clauseContext insert_from_clause() throws RecognitionException {
		Insert_from_clauseContext _localctx = new Insert_from_clauseContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_insert_from_clause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(128);
			sql_action();
			setState(129);
			table_name();
			setState(130);
			select_clause_basic();
			setState(132);
			_la = _input.LA(1);
			if (_la==AUTOCREATE) {
				{
				setState(131);
				autocreate();
				}
			}

			setState(136);
			_la = _input.LA(1);
			if (_la==PK) {
				{
				setState(134);
				match(PK);
				setState(135);
				primary_key_list();
				}
			}

			setState(139);
			_la = _input.LA(1);
			if (_la==AUTOEVOLVE) {
				{
				setState(138);
				autoevolve();
				}
			}

			setState(142);
			_la = _input.LA(1);
			if (_la==BATCH) {
				{
				setState(141);
				batching();
				}
			}

			setState(145);
			_la = _input.LA(1);
			if (_la==CAPITALIZE) {
				{
				setState(144);
				capitalize();
				}
			}

			setState(148);
			_la = _input.LA(1);
			if (_la==PARTITIONBY) {
				{
				setState(147);
				partitionby();
				}
			}

			setState(151);
			_la = _input.LA(1);
			if (_la==DISTRIBUTEBY) {
				{
				setState(150);
				distributeby();
				}
			}

			setState(154);
			_la = _input.LA(1);
			if (_la==CLUSTERBY) {
				{
				setState(153);
				clusterby();
				}
			}

			setState(157);
			_la = _input.LA(1);
			if (_la==TIMESTAMP) {
				{
				setState(156);
				timestamp_clause();
				}
			}

			setState(160);
			_la = _input.LA(1);
			if (_la==STOREDAS) {
				{
				setState(159);
				storedas_name();
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

	public static class Select_clauseContext extends ParserRuleContext {
		public Select_clause_basicContext select_clause_basic() {
			return getRuleContext(Select_clause_basicContext.class,0);
		}
		public With_format_clauseContext with_format_clause() {
			return getRuleContext(With_format_clauseContext.class,0);
		}
		public With_consumer_groupContext with_consumer_group() {
			return getRuleContext(With_consumer_groupContext.class,0);
		}
		public With_offset_listContext with_offset_list() {
			return getRuleContext(With_offset_listContext.class,0);
		}
		public Sample_clauseContext sample_clause() {
			return getRuleContext(Sample_clauseContext.class,0);
		}
		public Select_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_select_clause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ConnectorParserListener ) ((ConnectorParserListener)listener).enterSelect_clause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ConnectorParserListener ) ((ConnectorParserListener)listener).exitSelect_clause(this);
		}
	}

	public final Select_clauseContext select_clause() throws RecognitionException {
		Select_clauseContext _localctx = new Select_clauseContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_select_clause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(162);
			select_clause_basic();
			setState(163);
			with_format_clause();
			setState(165);
			_la = _input.LA(1);
			if (_la==WITHGROUP) {
				{
				setState(164);
				with_consumer_group();
				}
			}

			setState(168);
			_la = _input.LA(1);
			if (_la==WITHOFFSET) {
				{
				setState(167);
				with_offset_list();
				}
			}

			setState(171);
			_la = _input.LA(1);
			if (_la==SAMPLE) {
				{
				setState(170);
				sample_clause();
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

	public static class Select_clause_basicContext extends ParserRuleContext {
		public TerminalNode SELECT() { return getToken(ConnectorParser.SELECT, 0); }
		public Column_listContext column_list() {
			return getRuleContext(Column_listContext.class,0);
		}
		public TerminalNode FROM() { return getToken(ConnectorParser.FROM, 0); }
		public Topic_nameContext topic_name() {
			return getRuleContext(Topic_nameContext.class,0);
		}
		public TerminalNode IGNORE() { return getToken(ConnectorParser.IGNORE, 0); }
		public Ignore_clauseContext ignore_clause() {
			return getRuleContext(Ignore_clauseContext.class,0);
		}
		public Select_clause_basicContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_select_clause_basic; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ConnectorParserListener ) ((ConnectorParserListener)listener).enterSelect_clause_basic(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ConnectorParserListener ) ((ConnectorParserListener)listener).exitSelect_clause_basic(this);
		}
	}

	public final Select_clause_basicContext select_clause_basic() throws RecognitionException {
		Select_clause_basicContext _localctx = new Select_clause_basicContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_select_clause_basic);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(173);
			match(SELECT);
			setState(174);
			column_list();
			setState(175);
			match(FROM);
			setState(176);
			topic_name();
			setState(179);
			_la = _input.LA(1);
			if (_la==IGNORE) {
				{
				setState(177);
				match(IGNORE);
				setState(178);
				ignore_clause();
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

	public static class Topic_nameContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(ConnectorParser.ID, 0); }
		public TerminalNode TOPICNAME() { return getToken(ConnectorParser.TOPICNAME, 0); }
		public Topic_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_topic_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ConnectorParserListener ) ((ConnectorParserListener)listener).enterTopic_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ConnectorParserListener ) ((ConnectorParserListener)listener).exitTopic_name(this);
		}
	}

	public final Topic_nameContext topic_name() throws RecognitionException {
		Topic_nameContext _localctx = new Topic_nameContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_topic_name);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(181);
			_la = _input.LA(1);
			if ( !(_la==ID || _la==TOPICNAME) ) {
			_errHandler.recoverInline(this);
			} else {
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

	public static class Table_nameContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(ConnectorParser.ID, 0); }
		public TerminalNode TOPICNAME() { return getToken(ConnectorParser.TOPICNAME, 0); }
		public Table_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_table_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ConnectorParserListener ) ((ConnectorParserListener)listener).enterTable_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ConnectorParserListener ) ((ConnectorParserListener)listener).exitTable_name(this);
		}
	}

	public final Table_nameContext table_name() throws RecognitionException {
		Table_nameContext _localctx = new Table_nameContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_table_name);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(183);
			_la = _input.LA(1);
			if ( !(_la==ID || _la==TOPICNAME) ) {
			_errHandler.recoverInline(this);
			} else {
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

	public static class Column_nameContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(ConnectorParser.ID, 0); }
		public TerminalNode AS() { return getToken(ConnectorParser.AS, 0); }
		public Column_name_aliasContext column_name_alias() {
			return getRuleContext(Column_name_aliasContext.class,0);
		}
		public TerminalNode ASTERISK() { return getToken(ConnectorParser.ASTERISK, 0); }
		public Column_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_column_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ConnectorParserListener ) ((ConnectorParserListener)listener).enterColumn_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ConnectorParserListener ) ((ConnectorParserListener)listener).exitColumn_name(this);
		}
	}

	public final Column_nameContext column_name() throws RecognitionException {
		Column_nameContext _localctx = new Column_nameContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_column_name);
		int _la;
		try {
			setState(191);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(185);
				match(ID);
				setState(188);
				_la = _input.LA(1);
				if (_la==AS) {
					{
					setState(186);
					match(AS);
					setState(187);
					column_name_alias();
					}
				}

				}
				break;
			case ASTERISK:
				enterOuterAlt(_localctx, 2);
				{
				setState(190);
				match(ASTERISK);
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

	public static class Column_name_aliasContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(ConnectorParser.ID, 0); }
		public Column_name_aliasContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_column_name_alias; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ConnectorParserListener ) ((ConnectorParserListener)listener).enterColumn_name_alias(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ConnectorParserListener ) ((ConnectorParserListener)listener).exitColumn_name_alias(this);
		}
	}

	public final Column_name_aliasContext column_name_alias() throws RecognitionException {
		Column_name_aliasContext _localctx = new Column_name_aliasContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_column_name_alias);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(193);
			match(ID);
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

	public static class Column_listContext extends ParserRuleContext {
		public List<Column_nameContext> column_name() {
			return getRuleContexts(Column_nameContext.class);
		}
		public Column_nameContext column_name(int i) {
			return getRuleContext(Column_nameContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(ConnectorParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(ConnectorParser.COMMA, i);
		}
		public Column_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_column_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ConnectorParserListener ) ((ConnectorParserListener)listener).enterColumn_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ConnectorParserListener ) ((ConnectorParserListener)listener).exitColumn_list(this);
		}
	}

	public final Column_listContext column_list() throws RecognitionException {
		Column_listContext _localctx = new Column_listContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_column_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(195);
			column_name();
			setState(200);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(196);
				match(COMMA);
				setState(197);
				column_name();
				}
				}
				setState(202);
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

	public static class From_clauseContext extends ParserRuleContext {
		public TerminalNode FROM() { return getToken(ConnectorParser.FROM, 0); }
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public From_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_from_clause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ConnectorParserListener ) ((ConnectorParserListener)listener).enterFrom_clause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ConnectorParserListener ) ((ConnectorParserListener)listener).exitFrom_clause(this);
		}
	}

	public final From_clauseContext from_clause() throws RecognitionException {
		From_clauseContext _localctx = new From_clauseContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_from_clause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(203);
			match(FROM);
			setState(204);
			table_name();
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

	public static class Ignored_nameContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(ConnectorParser.ID, 0); }
		public Ignored_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ignored_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ConnectorParserListener ) ((ConnectorParserListener)listener).enterIgnored_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ConnectorParserListener ) ((ConnectorParserListener)listener).exitIgnored_name(this);
		}
	}

	public final Ignored_nameContext ignored_name() throws RecognitionException {
		Ignored_nameContext _localctx = new Ignored_nameContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_ignored_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(206);
			match(ID);
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

	public static class Ignore_clauseContext extends ParserRuleContext {
		public List<Ignored_nameContext> ignored_name() {
			return getRuleContexts(Ignored_nameContext.class);
		}
		public Ignored_nameContext ignored_name(int i) {
			return getRuleContext(Ignored_nameContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(ConnectorParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(ConnectorParser.COMMA, i);
		}
		public Ignore_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ignore_clause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ConnectorParserListener ) ((ConnectorParserListener)listener).enterIgnore_clause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ConnectorParserListener ) ((ConnectorParserListener)listener).exitIgnore_clause(this);
		}
	}

	public final Ignore_clauseContext ignore_clause() throws RecognitionException {
		Ignore_clauseContext _localctx = new Ignore_clauseContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_ignore_clause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(208);
			ignored_name();
			setState(213);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(209);
				match(COMMA);
				setState(210);
				ignored_name();
				}
				}
				setState(215);
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

	public static class Pk_nameContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(ConnectorParser.ID, 0); }
		public Pk_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pk_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ConnectorParserListener ) ((ConnectorParserListener)listener).enterPk_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ConnectorParserListener ) ((ConnectorParserListener)listener).exitPk_name(this);
		}
	}

	public final Pk_nameContext pk_name() throws RecognitionException {
		Pk_nameContext _localctx = new Pk_nameContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_pk_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(216);
			match(ID);
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

	public static class Primary_key_listContext extends ParserRuleContext {
		public List<Pk_nameContext> pk_name() {
			return getRuleContexts(Pk_nameContext.class);
		}
		public Pk_nameContext pk_name(int i) {
			return getRuleContext(Pk_nameContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(ConnectorParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(ConnectorParser.COMMA, i);
		}
		public Primary_key_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primary_key_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ConnectorParserListener ) ((ConnectorParserListener)listener).enterPrimary_key_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ConnectorParserListener ) ((ConnectorParserListener)listener).exitPrimary_key_list(this);
		}
	}

	public final Primary_key_listContext primary_key_list() throws RecognitionException {
		Primary_key_listContext _localctx = new Primary_key_listContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_primary_key_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(218);
			pk_name();
			setState(223);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(219);
				match(COMMA);
				setState(220);
				pk_name();
				}
				}
				setState(225);
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

	public static class AutocreateContext extends ParserRuleContext {
		public TerminalNode AUTOCREATE() { return getToken(ConnectorParser.AUTOCREATE, 0); }
		public AutocreateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_autocreate; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ConnectorParserListener ) ((ConnectorParserListener)listener).enterAutocreate(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ConnectorParserListener ) ((ConnectorParserListener)listener).exitAutocreate(this);
		}
	}

	public final AutocreateContext autocreate() throws RecognitionException {
		AutocreateContext _localctx = new AutocreateContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_autocreate);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(226);
			match(AUTOCREATE);
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

	public static class AutoevolveContext extends ParserRuleContext {
		public TerminalNode AUTOEVOLVE() { return getToken(ConnectorParser.AUTOEVOLVE, 0); }
		public AutoevolveContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_autoevolve; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ConnectorParserListener ) ((ConnectorParserListener)listener).enterAutoevolve(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ConnectorParserListener ) ((ConnectorParserListener)listener).exitAutoevolve(this);
		}
	}

	public final AutoevolveContext autoevolve() throws RecognitionException {
		AutoevolveContext _localctx = new AutoevolveContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_autoevolve);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(228);
			match(AUTOEVOLVE);
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

	public static class Batch_sizeContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(ConnectorParser.INT, 0); }
		public Batch_sizeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_batch_size; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ConnectorParserListener ) ((ConnectorParserListener)listener).enterBatch_size(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ConnectorParserListener ) ((ConnectorParserListener)listener).exitBatch_size(this);
		}
	}

	public final Batch_sizeContext batch_size() throws RecognitionException {
		Batch_sizeContext _localctx = new Batch_sizeContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_batch_size);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(230);
			match(INT);
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

	public static class BatchingContext extends ParserRuleContext {
		public TerminalNode BATCH() { return getToken(ConnectorParser.BATCH, 0); }
		public TerminalNode EQUAL() { return getToken(ConnectorParser.EQUAL, 0); }
		public Batch_sizeContext batch_size() {
			return getRuleContext(Batch_sizeContext.class,0);
		}
		public BatchingContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_batching; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ConnectorParserListener ) ((ConnectorParserListener)listener).enterBatching(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ConnectorParserListener ) ((ConnectorParserListener)listener).exitBatching(this);
		}
	}

	public final BatchingContext batching() throws RecognitionException {
		BatchingContext _localctx = new BatchingContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_batching);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(232);
			match(BATCH);
			setState(233);
			match(EQUAL);
			setState(234);
			batch_size();
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

	public static class CapitalizeContext extends ParserRuleContext {
		public TerminalNode CAPITALIZE() { return getToken(ConnectorParser.CAPITALIZE, 0); }
		public CapitalizeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_capitalize; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ConnectorParserListener ) ((ConnectorParserListener)listener).enterCapitalize(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ConnectorParserListener ) ((ConnectorParserListener)listener).exitCapitalize(this);
		}
	}

	public final CapitalizeContext capitalize() throws RecognitionException {
		CapitalizeContext _localctx = new CapitalizeContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_capitalize);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(236);
			match(CAPITALIZE);
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

	public static class Partition_nameContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(ConnectorParser.ID, 0); }
		public Partition_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_partition_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ConnectorParserListener ) ((ConnectorParserListener)listener).enterPartition_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ConnectorParserListener ) ((ConnectorParserListener)listener).exitPartition_name(this);
		}
	}

	public final Partition_nameContext partition_name() throws RecognitionException {
		Partition_nameContext _localctx = new Partition_nameContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_partition_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(238);
			match(ID);
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

	public static class Partition_listContext extends ParserRuleContext {
		public List<Partition_nameContext> partition_name() {
			return getRuleContexts(Partition_nameContext.class);
		}
		public Partition_nameContext partition_name(int i) {
			return getRuleContext(Partition_nameContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(ConnectorParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(ConnectorParser.COMMA, i);
		}
		public Partition_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_partition_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ConnectorParserListener ) ((ConnectorParserListener)listener).enterPartition_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ConnectorParserListener ) ((ConnectorParserListener)listener).exitPartition_list(this);
		}
	}

	public final Partition_listContext partition_list() throws RecognitionException {
		Partition_listContext _localctx = new Partition_listContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_partition_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(240);
			partition_name();
			setState(245);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(241);
				match(COMMA);
				setState(242);
				partition_name();
				}
				}
				setState(247);
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

	public static class PartitionbyContext extends ParserRuleContext {
		public TerminalNode PARTITIONBY() { return getToken(ConnectorParser.PARTITIONBY, 0); }
		public Partition_listContext partition_list() {
			return getRuleContext(Partition_listContext.class,0);
		}
		public PartitionbyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_partitionby; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ConnectorParserListener ) ((ConnectorParserListener)listener).enterPartitionby(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ConnectorParserListener ) ((ConnectorParserListener)listener).exitPartitionby(this);
		}
	}

	public final PartitionbyContext partitionby() throws RecognitionException {
		PartitionbyContext _localctx = new PartitionbyContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_partitionby);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(248);
			match(PARTITIONBY);
			setState(249);
			partition_list();
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

	public static class Distribute_nameContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(ConnectorParser.ID, 0); }
		public Distribute_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_distribute_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ConnectorParserListener ) ((ConnectorParserListener)listener).enterDistribute_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ConnectorParserListener ) ((ConnectorParserListener)listener).exitDistribute_name(this);
		}
	}

	public final Distribute_nameContext distribute_name() throws RecognitionException {
		Distribute_nameContext _localctx = new Distribute_nameContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_distribute_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(251);
			match(ID);
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

	public static class Distribute_listContext extends ParserRuleContext {
		public List<Distribute_nameContext> distribute_name() {
			return getRuleContexts(Distribute_nameContext.class);
		}
		public Distribute_nameContext distribute_name(int i) {
			return getRuleContext(Distribute_nameContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(ConnectorParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(ConnectorParser.COMMA, i);
		}
		public Distribute_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_distribute_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ConnectorParserListener ) ((ConnectorParserListener)listener).enterDistribute_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ConnectorParserListener ) ((ConnectorParserListener)listener).exitDistribute_list(this);
		}
	}

	public final Distribute_listContext distribute_list() throws RecognitionException {
		Distribute_listContext _localctx = new Distribute_listContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_distribute_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(253);
			distribute_name();
			setState(258);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(254);
				match(COMMA);
				setState(255);
				distribute_name();
				}
				}
				setState(260);
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

	public static class DistributebyContext extends ParserRuleContext {
		public TerminalNode DISTRIBUTEBY() { return getToken(ConnectorParser.DISTRIBUTEBY, 0); }
		public Distribute_listContext distribute_list() {
			return getRuleContext(Distribute_listContext.class,0);
		}
		public TerminalNode INTO() { return getToken(ConnectorParser.INTO, 0); }
		public Buckets_numberContext buckets_number() {
			return getRuleContext(Buckets_numberContext.class,0);
		}
		public TerminalNode BUCKETS() { return getToken(ConnectorParser.BUCKETS, 0); }
		public DistributebyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_distributeby; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ConnectorParserListener ) ((ConnectorParserListener)listener).enterDistributeby(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ConnectorParserListener ) ((ConnectorParserListener)listener).exitDistributeby(this);
		}
	}

	public final DistributebyContext distributeby() throws RecognitionException {
		DistributebyContext _localctx = new DistributebyContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_distributeby);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(261);
			match(DISTRIBUTEBY);
			setState(262);
			distribute_list();
			setState(263);
			match(INTO);
			setState(264);
			buckets_number();
			setState(265);
			match(BUCKETS);
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

	public static class Timestamp_clauseContext extends ParserRuleContext {
		public TerminalNode TIMESTAMP() { return getToken(ConnectorParser.TIMESTAMP, 0); }
		public Timestamp_valueContext timestamp_value() {
			return getRuleContext(Timestamp_valueContext.class,0);
		}
		public Timestamp_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_timestamp_clause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ConnectorParserListener ) ((ConnectorParserListener)listener).enterTimestamp_clause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ConnectorParserListener ) ((ConnectorParserListener)listener).exitTimestamp_clause(this);
		}
	}

	public final Timestamp_clauseContext timestamp_clause() throws RecognitionException {
		Timestamp_clauseContext _localctx = new Timestamp_clauseContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_timestamp_clause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(267);
			match(TIMESTAMP);
			setState(268);
			timestamp_value();
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

	public static class Timestamp_valueContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(ConnectorParser.ID, 0); }
		public TerminalNode SYS_TIME() { return getToken(ConnectorParser.SYS_TIME, 0); }
		public Timestamp_valueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_timestamp_value; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ConnectorParserListener ) ((ConnectorParserListener)listener).enterTimestamp_value(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ConnectorParserListener ) ((ConnectorParserListener)listener).exitTimestamp_value(this);
		}
	}

	public final Timestamp_valueContext timestamp_value() throws RecognitionException {
		Timestamp_valueContext _localctx = new Timestamp_valueContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_timestamp_value);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(270);
			_la = _input.LA(1);
			if ( !(_la==SYS_TIME || _la==ID) ) {
			_errHandler.recoverInline(this);
			} else {
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

	public static class Storedas_nameContext extends ParserRuleContext {
		public TerminalNode STOREDAS() { return getToken(ConnectorParser.STOREDAS, 0); }
		public Storedas_valueContext storedas_value() {
			return getRuleContext(Storedas_valueContext.class,0);
		}
		public Storedas_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_storedas_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ConnectorParserListener ) ((ConnectorParserListener)listener).enterStoredas_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ConnectorParserListener ) ((ConnectorParserListener)listener).exitStoredas_name(this);
		}
	}

	public final Storedas_nameContext storedas_name() throws RecognitionException {
		Storedas_nameContext _localctx = new Storedas_nameContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_storedas_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(272);
			match(STOREDAS);
			setState(273);
			storedas_value();
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

	public static class Storedas_valueContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(ConnectorParser.ID, 0); }
		public Storedas_valueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_storedas_value; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ConnectorParserListener ) ((ConnectorParserListener)listener).enterStoredas_value(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ConnectorParserListener ) ((ConnectorParserListener)listener).exitStoredas_value(this);
		}
	}

	public final Storedas_valueContext storedas_value() throws RecognitionException {
		Storedas_valueContext _localctx = new Storedas_valueContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_storedas_value);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(275);
			match(ID);
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

	public static class Buckets_numberContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(ConnectorParser.INT, 0); }
		public Buckets_numberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_buckets_number; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ConnectorParserListener ) ((ConnectorParserListener)listener).enterBuckets_number(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ConnectorParserListener ) ((ConnectorParserListener)listener).exitBuckets_number(this);
		}
	}

	public final Buckets_numberContext buckets_number() throws RecognitionException {
		Buckets_numberContext _localctx = new Buckets_numberContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_buckets_number);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(277);
			match(INT);
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

	public static class Clusterby_nameContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(ConnectorParser.ID, 0); }
		public Clusterby_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_clusterby_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ConnectorParserListener ) ((ConnectorParserListener)listener).enterClusterby_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ConnectorParserListener ) ((ConnectorParserListener)listener).exitClusterby_name(this);
		}
	}

	public final Clusterby_nameContext clusterby_name() throws RecognitionException {
		Clusterby_nameContext _localctx = new Clusterby_nameContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_clusterby_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(279);
			match(ID);
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

	public static class Clusterby_listContext extends ParserRuleContext {
		public List<Clusterby_nameContext> clusterby_name() {
			return getRuleContexts(Clusterby_nameContext.class);
		}
		public Clusterby_nameContext clusterby_name(int i) {
			return getRuleContext(Clusterby_nameContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(ConnectorParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(ConnectorParser.COMMA, i);
		}
		public Clusterby_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_clusterby_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ConnectorParserListener ) ((ConnectorParserListener)listener).enterClusterby_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ConnectorParserListener ) ((ConnectorParserListener)listener).exitClusterby_list(this);
		}
	}

	public final Clusterby_listContext clusterby_list() throws RecognitionException {
		Clusterby_listContext _localctx = new Clusterby_listContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_clusterby_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(281);
			clusterby_name();
			setState(286);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(282);
				match(COMMA);
				setState(283);
				clusterby_name();
				}
				}
				setState(288);
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

	public static class ClusterbyContext extends ParserRuleContext {
		public TerminalNode CLUSTERBY() { return getToken(ConnectorParser.CLUSTERBY, 0); }
		public Clusterby_listContext clusterby_list() {
			return getRuleContext(Clusterby_listContext.class,0);
		}
		public TerminalNode INTO() { return getToken(ConnectorParser.INTO, 0); }
		public Buckets_numberContext buckets_number() {
			return getRuleContext(Buckets_numberContext.class,0);
		}
		public TerminalNode BUCKETS() { return getToken(ConnectorParser.BUCKETS, 0); }
		public ClusterbyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_clusterby; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ConnectorParserListener ) ((ConnectorParserListener)listener).enterClusterby(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ConnectorParserListener ) ((ConnectorParserListener)listener).exitClusterby(this);
		}
	}

	public final ClusterbyContext clusterby() throws RecognitionException {
		ClusterbyContext _localctx = new ClusterbyContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_clusterby);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(289);
			match(CLUSTERBY);
			setState(290);
			clusterby_list();
			setState(291);
			match(INTO);
			setState(292);
			buckets_number();
			setState(293);
			match(BUCKETS);
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

	public static class With_consumer_groupContext extends ParserRuleContext {
		public TerminalNode WITHGROUP() { return getToken(ConnectorParser.WITHGROUP, 0); }
		public With_consumer_group_valueContext with_consumer_group_value() {
			return getRuleContext(With_consumer_group_valueContext.class,0);
		}
		public With_consumer_groupContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_with_consumer_group; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ConnectorParserListener ) ((ConnectorParserListener)listener).enterWith_consumer_group(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ConnectorParserListener ) ((ConnectorParserListener)listener).exitWith_consumer_group(this);
		}
	}

	public final With_consumer_groupContext with_consumer_group() throws RecognitionException {
		With_consumer_groupContext _localctx = new With_consumer_groupContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_with_consumer_group);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(295);
			match(WITHGROUP);
			setState(296);
			with_consumer_group_value();
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

	public static class With_consumer_group_valueContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(ConnectorParser.INT, 0); }
		public TerminalNode ID() { return getToken(ConnectorParser.ID, 0); }
		public TerminalNode TOPICNAME() { return getToken(ConnectorParser.TOPICNAME, 0); }
		public With_consumer_group_valueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_with_consumer_group_value; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ConnectorParserListener ) ((ConnectorParserListener)listener).enterWith_consumer_group_value(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ConnectorParserListener ) ((ConnectorParserListener)listener).exitWith_consumer_group_value(this);
		}
	}

	public final With_consumer_group_valueContext with_consumer_group_value() throws RecognitionException {
		With_consumer_group_valueContext _localctx = new With_consumer_group_valueContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_with_consumer_group_value);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(298);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT) | (1L << ID) | (1L << TOPICNAME))) != 0)) ) {
			_errHandler.recoverInline(this);
			} else {
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

	public static class Offset_partition_innerContext extends ParserRuleContext {
		public List<TerminalNode> INT() { return getTokens(ConnectorParser.INT); }
		public TerminalNode INT(int i) {
			return getToken(ConnectorParser.INT, i);
		}
		public TerminalNode COMMA() { return getToken(ConnectorParser.COMMA, 0); }
		public Offset_partition_innerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_offset_partition_inner; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ConnectorParserListener ) ((ConnectorParserListener)listener).enterOffset_partition_inner(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ConnectorParserListener ) ((ConnectorParserListener)listener).exitOffset_partition_inner(this);
		}
	}

	public final Offset_partition_innerContext offset_partition_inner() throws RecognitionException {
		Offset_partition_innerContext _localctx = new Offset_partition_innerContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_offset_partition_inner);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(300);
			match(INT);
			setState(303);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(301);
				match(COMMA);
				setState(302);
				match(INT);
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

	public static class Offset_partitionContext extends ParserRuleContext {
		public TerminalNode LEFT_PARAN() { return getToken(ConnectorParser.LEFT_PARAN, 0); }
		public Offset_partition_innerContext offset_partition_inner() {
			return getRuleContext(Offset_partition_innerContext.class,0);
		}
		public TerminalNode RIGHT_PARAN() { return getToken(ConnectorParser.RIGHT_PARAN, 0); }
		public Offset_partitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_offset_partition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ConnectorParserListener ) ((ConnectorParserListener)listener).enterOffset_partition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ConnectorParserListener ) ((ConnectorParserListener)listener).exitOffset_partition(this);
		}
	}

	public final Offset_partitionContext offset_partition() throws RecognitionException {
		Offset_partitionContext _localctx = new Offset_partitionContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_offset_partition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(305);
			match(LEFT_PARAN);
			setState(306);
			offset_partition_inner();
			setState(307);
			match(RIGHT_PARAN);
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

	public static class Partition_offset_listContext extends ParserRuleContext {
		public List<Offset_partitionContext> offset_partition() {
			return getRuleContexts(Offset_partitionContext.class);
		}
		public Offset_partitionContext offset_partition(int i) {
			return getRuleContext(Offset_partitionContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(ConnectorParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(ConnectorParser.COMMA, i);
		}
		public Partition_offset_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_partition_offset_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ConnectorParserListener ) ((ConnectorParserListener)listener).enterPartition_offset_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ConnectorParserListener ) ((ConnectorParserListener)listener).exitPartition_offset_list(this);
		}
	}

	public final Partition_offset_listContext partition_offset_list() throws RecognitionException {
		Partition_offset_listContext _localctx = new Partition_offset_listContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_partition_offset_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(309);
			offset_partition();
			setState(314);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(310);
				match(COMMA);
				setState(311);
				offset_partition();
				}
				}
				setState(316);
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

	public static class With_offset_listContext extends ParserRuleContext {
		public TerminalNode WITHOFFSET() { return getToken(ConnectorParser.WITHOFFSET, 0); }
		public Partition_offset_listContext partition_offset_list() {
			return getRuleContext(Partition_offset_listContext.class,0);
		}
		public With_offset_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_with_offset_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ConnectorParserListener ) ((ConnectorParserListener)listener).enterWith_offset_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ConnectorParserListener ) ((ConnectorParserListener)listener).exitWith_offset_list(this);
		}
	}

	public final With_offset_listContext with_offset_list() throws RecognitionException {
		With_offset_listContext _localctx = new With_offset_listContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_with_offset_list);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(317);
			match(WITHOFFSET);
			setState(318);
			partition_offset_list();
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

	public static class Sample_clauseContext extends ParserRuleContext {
		public TerminalNode SAMPLE() { return getToken(ConnectorParser.SAMPLE, 0); }
		public Sample_valueContext sample_value() {
			return getRuleContext(Sample_valueContext.class,0);
		}
		public TerminalNode EVERY() { return getToken(ConnectorParser.EVERY, 0); }
		public Sample_periodContext sample_period() {
			return getRuleContext(Sample_periodContext.class,0);
		}
		public Sample_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sample_clause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ConnectorParserListener ) ((ConnectorParserListener)listener).enterSample_clause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ConnectorParserListener ) ((ConnectorParserListener)listener).exitSample_clause(this);
		}
	}

	public final Sample_clauseContext sample_clause() throws RecognitionException {
		Sample_clauseContext _localctx = new Sample_clauseContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_sample_clause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(320);
			match(SAMPLE);
			setState(321);
			sample_value();
			setState(322);
			match(EVERY);
			setState(323);
			sample_period();
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

	public static class Sample_valueContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(ConnectorParser.INT, 0); }
		public Sample_valueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sample_value; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ConnectorParserListener ) ((ConnectorParserListener)listener).enterSample_value(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ConnectorParserListener ) ((ConnectorParserListener)listener).exitSample_value(this);
		}
	}

	public final Sample_valueContext sample_value() throws RecognitionException {
		Sample_valueContext _localctx = new Sample_valueContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_sample_value);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(325);
			match(INT);
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

	public static class Sample_periodContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(ConnectorParser.INT, 0); }
		public Sample_periodContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sample_period; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ConnectorParserListener ) ((ConnectorParserListener)listener).enterSample_period(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ConnectorParserListener ) ((ConnectorParserListener)listener).exitSample_period(this);
		}
	}

	public final Sample_periodContext sample_period() throws RecognitionException {
		Sample_periodContext _localctx = new Sample_periodContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_sample_period);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(327);
			match(INT);
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

	public static class With_format_clauseContext extends ParserRuleContext {
		public TerminalNode WITHFORMAT() { return getToken(ConnectorParser.WITHFORMAT, 0); }
		public With_formatContext with_format() {
			return getRuleContext(With_formatContext.class,0);
		}
		public With_format_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_with_format_clause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ConnectorParserListener ) ((ConnectorParserListener)listener).enterWith_format_clause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ConnectorParserListener ) ((ConnectorParserListener)listener).exitWith_format_clause(this);
		}
	}

	public final With_format_clauseContext with_format_clause() throws RecognitionException {
		With_format_clauseContext _localctx = new With_format_clauseContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_with_format_clause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(329);
			match(WITHFORMAT);
			setState(330);
			with_format();
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

	public static class With_formatContext extends ParserRuleContext {
		public TerminalNode FORMAT() { return getToken(ConnectorParser.FORMAT, 0); }
		public With_formatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_with_format; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ConnectorParserListener ) ((ConnectorParserListener)listener).enterWith_format(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ConnectorParserListener ) ((ConnectorParserListener)listener).exitWith_format(this);
		}
	}

	public final With_formatContext with_format() throws RecognitionException {
		With_formatContext _localctx = new With_formatContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_with_format);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(332);
			match(FORMAT);
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3&\u0151\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\3\2\3\2\5\2k\n\2\3\3\3\3\3\4\3\4\3\5\3\5\3\5\3\6\3\6\3\6\3\7\3\7\3"+
		"\7\3\7\3\7\3\b\3\b\3\b\5\b\177\n\b\3\t\3\t\3\n\3\n\3\n\3\n\5\n\u0087\n"+
		"\n\3\n\3\n\5\n\u008b\n\n\3\n\5\n\u008e\n\n\3\n\5\n\u0091\n\n\3\n\5\n\u0094"+
		"\n\n\3\n\5\n\u0097\n\n\3\n\5\n\u009a\n\n\3\n\5\n\u009d\n\n\3\n\5\n\u00a0"+
		"\n\n\3\n\5\n\u00a3\n\n\3\13\3\13\3\13\5\13\u00a8\n\13\3\13\5\13\u00ab"+
		"\n\13\3\13\5\13\u00ae\n\13\3\f\3\f\3\f\3\f\3\f\3\f\5\f\u00b6\n\f\3\r\3"+
		"\r\3\16\3\16\3\17\3\17\3\17\5\17\u00bf\n\17\3\17\5\17\u00c2\n\17\3\20"+
		"\3\20\3\21\3\21\3\21\7\21\u00c9\n\21\f\21\16\21\u00cc\13\21\3\22\3\22"+
		"\3\22\3\23\3\23\3\24\3\24\3\24\7\24\u00d6\n\24\f\24\16\24\u00d9\13\24"+
		"\3\25\3\25\3\26\3\26\3\26\7\26\u00e0\n\26\f\26\16\26\u00e3\13\26\3\27"+
		"\3\27\3\30\3\30\3\31\3\31\3\32\3\32\3\32\3\32\3\33\3\33\3\34\3\34\3\35"+
		"\3\35\3\35\7\35\u00f6\n\35\f\35\16\35\u00f9\13\35\3\36\3\36\3\36\3\37"+
		"\3\37\3 \3 \3 \7 \u0103\n \f \16 \u0106\13 \3!\3!\3!\3!\3!\3!\3\"\3\""+
		"\3\"\3#\3#\3$\3$\3$\3%\3%\3&\3&\3\'\3\'\3(\3(\3(\7(\u011f\n(\f(\16(\u0122"+
		"\13(\3)\3)\3)\3)\3)\3)\3*\3*\3*\3+\3+\3,\3,\3,\5,\u0132\n,\3-\3-\3-\3"+
		"-\3.\3.\3.\7.\u013b\n.\f.\16.\u013e\13.\3/\3/\3/\3\60\3\60\3\60\3\60\3"+
		"\60\3\61\3\61\3\62\3\62\3\63\3\63\3\63\3\64\3\64\3\64\2\2\65\2\4\6\b\n"+
		"\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJLNPRTVXZ\\"+
		"^`bdf\2\5\3\2#$\4\2\24\24##\4\2\35\35#$\u0138\2j\3\2\2\2\4l\3\2\2\2\6"+
		"n\3\2\2\2\bp\3\2\2\2\ns\3\2\2\2\fv\3\2\2\2\16~\3\2\2\2\20\u0080\3\2\2"+
		"\2\22\u0082\3\2\2\2\24\u00a4\3\2\2\2\26\u00af\3\2\2\2\30\u00b7\3\2\2\2"+
		"\32\u00b9\3\2\2\2\34\u00c1\3\2\2\2\36\u00c3\3\2\2\2 \u00c5\3\2\2\2\"\u00cd"+
		"\3\2\2\2$\u00d0\3\2\2\2&\u00d2\3\2\2\2(\u00da\3\2\2\2*\u00dc\3\2\2\2,"+
		"\u00e4\3\2\2\2.\u00e6\3\2\2\2\60\u00e8\3\2\2\2\62\u00ea\3\2\2\2\64\u00ee"+
		"\3\2\2\2\66\u00f0\3\2\2\28\u00f2\3\2\2\2:\u00fa\3\2\2\2<\u00fd\3\2\2\2"+
		">\u00ff\3\2\2\2@\u0107\3\2\2\2B\u010d\3\2\2\2D\u0110\3\2\2\2F\u0112\3"+
		"\2\2\2H\u0115\3\2\2\2J\u0117\3\2\2\2L\u0119\3\2\2\2N\u011b\3\2\2\2P\u0123"+
		"\3\2\2\2R\u0129\3\2\2\2T\u012c\3\2\2\2V\u012e\3\2\2\2X\u0133\3\2\2\2Z"+
		"\u0137\3\2\2\2\\\u013f\3\2\2\2^\u0142\3\2\2\2`\u0147\3\2\2\2b\u0149\3"+
		"\2\2\2d\u014b\3\2\2\2f\u014e\3\2\2\2hk\5\22\n\2ik\5\24\13\2jh\3\2\2\2"+
		"ji\3\2\2\2k\3\3\2\2\2lm\7\5\2\2m\5\3\2\2\2no\7\27\2\2o\7\3\2\2\2pq\7\3"+
		"\2\2qr\5\4\3\2r\t\3\2\2\2st\7\4\2\2tu\5\4\3\2u\13\3\2\2\2vw\7\4\2\2wx"+
		"\5\6\4\2xy\7#\2\2yz\5\4\3\2z\r\3\2\2\2{\177\5\b\5\2|\177\5\n\6\2}\177"+
		"\5\f\7\2~{\3\2\2\2~|\3\2\2\2~}\3\2\2\2\177\17\3\2\2\2\u0080\u0081\7#\2"+
		"\2\u0081\21\3\2\2\2\u0082\u0083\5\16\b\2\u0083\u0084\5\32\16\2\u0084\u0086"+
		"\5\26\f\2\u0085\u0087\5,\27\2\u0086\u0085\3\2\2\2\u0086\u0087\3\2\2\2"+
		"\u0087\u008a\3\2\2\2\u0088\u0089\7\27\2\2\u0089\u008b\5*\26\2\u008a\u0088"+
		"\3\2\2\2\u008a\u008b\3\2\2\2\u008b\u008d\3\2\2\2\u008c\u008e\5.\30\2\u008d"+
		"\u008c\3\2\2\2\u008d\u008e\3\2\2\2\u008e\u0090\3\2\2\2\u008f\u0091\5\62"+
		"\32\2\u0090\u008f\3\2\2\2\u0090\u0091\3\2\2\2\u0091\u0093\3\2\2\2\u0092"+
		"\u0094\5\64\33\2\u0093\u0092\3\2\2\2\u0093\u0094\3\2\2\2\u0094\u0096\3"+
		"\2\2\2\u0095\u0097\5:\36\2\u0096\u0095\3\2\2\2\u0096\u0097\3\2\2\2\u0097"+
		"\u0099\3\2\2\2\u0098\u009a\5@!\2\u0099\u0098\3\2\2\2\u0099\u009a\3\2\2"+
		"\2\u009a\u009c\3\2\2\2\u009b\u009d\5P)\2\u009c\u009b\3\2\2\2\u009c\u009d"+
		"\3\2\2\2\u009d\u009f\3\2\2\2\u009e\u00a0\5B\"\2\u009f\u009e\3\2\2\2\u009f"+
		"\u00a0\3\2\2\2\u00a0\u00a2\3\2\2\2\u00a1\u00a3\5F$\2\u00a2\u00a1\3\2\2"+
		"\2\u00a2\u00a3\3\2\2\2\u00a3\23\3\2\2\2\u00a4\u00a5\5\26\f\2\u00a5\u00a7"+
		"\5d\63\2\u00a6\u00a8\5R*\2\u00a7\u00a6\3\2\2\2\u00a7\u00a8\3\2\2\2\u00a8"+
		"\u00aa\3\2\2\2\u00a9\u00ab\5\\/\2\u00aa\u00a9\3\2\2\2\u00aa\u00ab\3\2"+
		"\2\2\u00ab\u00ad\3\2\2\2\u00ac\u00ae\5^\60\2\u00ad\u00ac\3\2\2\2\u00ad"+
		"\u00ae\3\2\2\2\u00ae\25\3\2\2\2\u00af\u00b0\7\6\2\2\u00b0\u00b1\5 \21"+
		"\2\u00b1\u00b2\7\7\2\2\u00b2\u00b5\5\30\r\2\u00b3\u00b4\7\b\2\2\u00b4"+
		"\u00b6\5&\24\2\u00b5\u00b3\3\2\2\2\u00b5\u00b6\3\2\2\2\u00b6\27\3\2\2"+
		"\2\u00b7\u00b8\t\2\2\2\u00b8\31\3\2\2\2\u00b9\u00ba\t\2\2\2\u00ba\33\3"+
		"\2\2\2\u00bb\u00be\7#\2\2\u00bc\u00bd\7\t\2\2\u00bd\u00bf\5\36\20\2\u00be"+
		"\u00bc\3\2\2\2\u00be\u00bf\3\2\2\2\u00bf\u00c2\3\2\2\2\u00c0\u00c2\7\36"+
		"\2\2\u00c1\u00bb\3\2\2\2\u00c1\u00c0\3\2\2\2\u00c2\35\3\2\2\2\u00c3\u00c4"+
		"\7#\2\2\u00c4\37\3\2\2\2\u00c5\u00ca\5\34\17\2\u00c6\u00c7\7\37\2\2\u00c7"+
		"\u00c9\5\34\17\2\u00c8\u00c6\3\2\2\2\u00c9\u00cc\3\2\2\2\u00ca\u00c8\3"+
		"\2\2\2\u00ca\u00cb\3\2\2\2\u00cb!\3\2\2\2\u00cc\u00ca\3\2\2\2\u00cd\u00ce"+
		"\7\7\2\2\u00ce\u00cf\5\32\16\2\u00cf#\3\2\2\2\u00d0\u00d1\7#\2\2\u00d1"+
		"%\3\2\2\2\u00d2\u00d7\5$\23\2\u00d3\u00d4\7\37\2\2\u00d4\u00d6\5$\23\2"+
		"\u00d5\u00d3\3\2\2\2\u00d6\u00d9\3\2\2\2\u00d7\u00d5\3\2\2\2\u00d7\u00d8"+
		"\3\2\2\2\u00d8\'\3\2\2\2\u00d9\u00d7\3\2\2\2\u00da\u00db\7#\2\2\u00db"+
		")\3\2\2\2\u00dc\u00e1\5(\25\2\u00dd\u00de\7\37\2\2\u00de\u00e0\5(\25\2"+
		"\u00df\u00dd\3\2\2\2\u00e0\u00e3\3\2\2\2\u00e1\u00df\3\2\2\2\u00e1\u00e2"+
		"\3\2\2\2\u00e2+\3\2\2\2\u00e3\u00e1\3\2\2\2\u00e4\u00e5\7\n\2\2\u00e5"+
		"-\3\2\2\2\u00e6\u00e7\7\13\2\2\u00e7/\3\2\2\2\u00e8\u00e9\7\35\2\2\u00e9"+
		"\61\3\2\2\2\u00ea\u00eb\7\16\2\2\u00eb\u00ec\7\34\2\2\u00ec\u00ed\5\60"+
		"\31\2\u00ed\63\3\2\2\2\u00ee\u00ef\7\17\2\2\u00ef\65\3\2\2\2\u00f0\u00f1"+
		"\7#\2\2\u00f1\67\3\2\2\2\u00f2\u00f7\5\66\34\2\u00f3\u00f4\7\37\2\2\u00f4"+
		"\u00f6\5\66\34\2\u00f5\u00f3\3\2\2\2\u00f6\u00f9\3\2\2\2\u00f7\u00f5\3"+
		"\2\2\2\u00f7\u00f8\3\2\2\2\u00f89\3\2\2\2\u00f9\u00f7\3\2\2\2\u00fa\u00fb"+
		"\7\20\2\2\u00fb\u00fc\58\35\2\u00fc;\3\2\2\2\u00fd\u00fe\7#\2\2\u00fe"+
		"=\3\2\2\2\u00ff\u0104\5<\37\2\u0100\u0101\7\37\2\2\u0101\u0103\5<\37\2"+
		"\u0102\u0100\3\2\2\2\u0103\u0106\3\2\2\2\u0104\u0102\3\2\2\2\u0104\u0105"+
		"\3\2\2\2\u0105?\3\2\2\2\u0106\u0104\3\2\2\2\u0107\u0108\7\21\2\2\u0108"+
		"\u0109\5> \2\u0109\u010a\7\5\2\2\u010a\u010b\5J&\2\u010b\u010c\7\r\2\2"+
		"\u010cA\3\2\2\2\u010d\u010e\7\22\2\2\u010e\u010f\5D#\2\u010fC\3\2\2\2"+
		"\u0110\u0111\t\3\2\2\u0111E\3\2\2\2\u0112\u0113\7\23\2\2\u0113\u0114\5"+
		"H%\2\u0114G\3\2\2\2\u0115\u0116\7#\2\2\u0116I\3\2\2\2\u0117\u0118\7\35"+
		"\2\2\u0118K\3\2\2\2\u0119\u011a\7#\2\2\u011aM\3\2\2\2\u011b\u0120\5L\'"+
		"\2\u011c\u011d\7\37\2\2\u011d\u011f\5L\'\2\u011e\u011c\3\2\2\2\u011f\u0122"+
		"\3\2\2\2\u0120\u011e\3\2\2\2\u0120\u0121\3\2\2\2\u0121O\3\2\2\2\u0122"+
		"\u0120\3\2\2\2\u0123\u0124\7\f\2\2\u0124\u0125\5N(\2\u0125\u0126\7\5\2"+
		"\2\u0126\u0127\5J&\2\u0127\u0128\7\r\2\2\u0128Q\3\2\2\2\u0129\u012a\7"+
		"\25\2\2\u012a\u012b\5T+\2\u012bS\3\2\2\2\u012c\u012d\t\4\2\2\u012dU\3"+
		"\2\2\2\u012e\u0131\7\35\2\2\u012f\u0130\7\37\2\2\u0130\u0132\7\35\2\2"+
		"\u0131\u012f\3\2\2\2\u0131\u0132\3\2\2\2\u0132W\3\2\2\2\u0133\u0134\7"+
		"!\2\2\u0134\u0135\5V,\2\u0135\u0136\7\"\2\2\u0136Y\3\2\2\2\u0137\u013c"+
		"\5X-\2\u0138\u0139\7\37\2\2\u0139\u013b\5X-\2\u013a\u0138\3\2\2\2\u013b"+
		"\u013e\3\2\2\2\u013c\u013a\3\2\2\2\u013c\u013d\3\2\2\2\u013d[\3\2\2\2"+
		"\u013e\u013c\3\2\2\2\u013f\u0140\7\26\2\2\u0140\u0141\5Z.\2\u0141]\3\2"+
		"\2\2\u0142\u0143\7\30\2\2\u0143\u0144\5`\61\2\u0144\u0145\7\31\2\2\u0145"+
		"\u0146\5b\62\2\u0146_\3\2\2\2\u0147\u0148\7\35\2\2\u0148a\3\2\2\2\u0149"+
		"\u014a\7\35\2\2\u014ac\3\2\2\2\u014b\u014c\7\32\2\2\u014c\u014d\5f\64"+
		"\2\u014de\3\2\2\2\u014e\u014f\7\33\2\2\u014fg\3\2\2\2\34j~\u0086\u008a"+
		"\u008d\u0090\u0093\u0096\u0099\u009c\u009f\u00a2\u00a7\u00aa\u00ad\u00b5"+
		"\u00be\u00c1\u00ca\u00d7\u00e1\u00f7\u0104\u0120\u0131\u013c";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}