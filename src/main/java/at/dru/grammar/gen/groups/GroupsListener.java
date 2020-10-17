// Generated from /home/dru/SpringWork/grammar/Groups.g4 by ANTLR 4.8
package at.dru.grammar.gen.groups;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link GroupsParser}.
 */
public interface GroupsListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link GroupsParser#decimalGroup}.
	 * @param ctx the parse tree
	 */
	void enterDecimalGroup(GroupsParser.DecimalGroupContext ctx);
	/**
	 * Exit a parse tree produced by {@link GroupsParser#decimalGroup}.
	 * @param ctx the parse tree
	 */
	void exitDecimalGroup(GroupsParser.DecimalGroupContext ctx);
	/**
	 * Enter a parse tree produced by {@link GroupsParser#decimalGroupTerm}.
	 * @param ctx the parse tree
	 */
	void enterDecimalGroupTerm(GroupsParser.DecimalGroupTermContext ctx);
	/**
	 * Exit a parse tree produced by {@link GroupsParser#decimalGroupTerm}.
	 * @param ctx the parse tree
	 */
	void exitDecimalGroupTerm(GroupsParser.DecimalGroupTermContext ctx);
	/**
	 * Enter a parse tree produced by {@link GroupsParser#decimalRange}.
	 * @param ctx the parse tree
	 */
	void enterDecimalRange(GroupsParser.DecimalRangeContext ctx);
	/**
	 * Exit a parse tree produced by {@link GroupsParser#decimalRange}.
	 * @param ctx the parse tree
	 */
	void exitDecimalRange(GroupsParser.DecimalRangeContext ctx);
	/**
	 * Enter a parse tree produced by {@link GroupsParser#decimalRangeTerm}.
	 * @param ctx the parse tree
	 */
	void enterDecimalRangeTerm(GroupsParser.DecimalRangeTermContext ctx);
	/**
	 * Exit a parse tree produced by {@link GroupsParser#decimalRangeTerm}.
	 * @param ctx the parse tree
	 */
	void exitDecimalRangeTerm(GroupsParser.DecimalRangeTermContext ctx);
	/**
	 * Enter a parse tree produced by {@link GroupsParser#integerGroup}.
	 * @param ctx the parse tree
	 */
	void enterIntegerGroup(GroupsParser.IntegerGroupContext ctx);
	/**
	 * Exit a parse tree produced by {@link GroupsParser#integerGroup}.
	 * @param ctx the parse tree
	 */
	void exitIntegerGroup(GroupsParser.IntegerGroupContext ctx);
	/**
	 * Enter a parse tree produced by {@link GroupsParser#integerGroupTerm}.
	 * @param ctx the parse tree
	 */
	void enterIntegerGroupTerm(GroupsParser.IntegerGroupTermContext ctx);
	/**
	 * Exit a parse tree produced by {@link GroupsParser#integerGroupTerm}.
	 * @param ctx the parse tree
	 */
	void exitIntegerGroupTerm(GroupsParser.IntegerGroupTermContext ctx);
	/**
	 * Enter a parse tree produced by {@link GroupsParser#integerRange}.
	 * @param ctx the parse tree
	 */
	void enterIntegerRange(GroupsParser.IntegerRangeContext ctx);
	/**
	 * Exit a parse tree produced by {@link GroupsParser#integerRange}.
	 * @param ctx the parse tree
	 */
	void exitIntegerRange(GroupsParser.IntegerRangeContext ctx);
	/**
	 * Enter a parse tree produced by {@link GroupsParser#integerRangeTerm}.
	 * @param ctx the parse tree
	 */
	void enterIntegerRangeTerm(GroupsParser.IntegerRangeTermContext ctx);
	/**
	 * Exit a parse tree produced by {@link GroupsParser#integerRangeTerm}.
	 * @param ctx the parse tree
	 */
	void exitIntegerRangeTerm(GroupsParser.IntegerRangeTermContext ctx);
	/**
	 * Enter a parse tree produced by {@link GroupsParser#boostTerm}.
	 * @param ctx the parse tree
	 */
	void enterBoostTerm(GroupsParser.BoostTermContext ctx);
	/**
	 * Exit a parse tree produced by {@link GroupsParser#boostTerm}.
	 * @param ctx the parse tree
	 */
	void exitBoostTerm(GroupsParser.BoostTermContext ctx);
	/**
	 * Enter a parse tree produced by {@link GroupsParser#decimal}.
	 * @param ctx the parse tree
	 */
	void enterDecimal(GroupsParser.DecimalContext ctx);
	/**
	 * Exit a parse tree produced by {@link GroupsParser#decimal}.
	 * @param ctx the parse tree
	 */
	void exitDecimal(GroupsParser.DecimalContext ctx);
	/**
	 * Enter a parse tree produced by {@link GroupsParser#decimalSuffix}.
	 * @param ctx the parse tree
	 */
	void enterDecimalSuffix(GroupsParser.DecimalSuffixContext ctx);
	/**
	 * Exit a parse tree produced by {@link GroupsParser#decimalSuffix}.
	 * @param ctx the parse tree
	 */
	void exitDecimalSuffix(GroupsParser.DecimalSuffixContext ctx);
	/**
	 * Enter a parse tree produced by {@link GroupsParser#integer}.
	 * @param ctx the parse tree
	 */
	void enterInteger(GroupsParser.IntegerContext ctx);
	/**
	 * Exit a parse tree produced by {@link GroupsParser#integer}.
	 * @param ctx the parse tree
	 */
	void exitInteger(GroupsParser.IntegerContext ctx);
}