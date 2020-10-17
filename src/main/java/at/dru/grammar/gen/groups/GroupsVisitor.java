// Generated from /home/dru/SpringWork/grammar/Groups.g4 by ANTLR 4.8
package at.dru.grammar.gen.groups;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link GroupsParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface GroupsVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link GroupsParser#decimalGroup}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDecimalGroup(GroupsParser.DecimalGroupContext ctx);
	/**
	 * Visit a parse tree produced by {@link GroupsParser#decimalGroupTerm}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDecimalGroupTerm(GroupsParser.DecimalGroupTermContext ctx);
	/**
	 * Visit a parse tree produced by {@link GroupsParser#decimalRange}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDecimalRange(GroupsParser.DecimalRangeContext ctx);
	/**
	 * Visit a parse tree produced by {@link GroupsParser#decimalRangeTerm}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDecimalRangeTerm(GroupsParser.DecimalRangeTermContext ctx);
	/**
	 * Visit a parse tree produced by {@link GroupsParser#integerGroup}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntegerGroup(GroupsParser.IntegerGroupContext ctx);
	/**
	 * Visit a parse tree produced by {@link GroupsParser#integerGroupTerm}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntegerGroupTerm(GroupsParser.IntegerGroupTermContext ctx);
	/**
	 * Visit a parse tree produced by {@link GroupsParser#integerRange}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntegerRange(GroupsParser.IntegerRangeContext ctx);
	/**
	 * Visit a parse tree produced by {@link GroupsParser#integerRangeTerm}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntegerRangeTerm(GroupsParser.IntegerRangeTermContext ctx);
	/**
	 * Visit a parse tree produced by {@link GroupsParser#boostTerm}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBoostTerm(GroupsParser.BoostTermContext ctx);
	/**
	 * Visit a parse tree produced by {@link GroupsParser#decimal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDecimal(GroupsParser.DecimalContext ctx);
	/**
	 * Visit a parse tree produced by {@link GroupsParser#decimalSuffix}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDecimalSuffix(GroupsParser.DecimalSuffixContext ctx);
	/**
	 * Visit a parse tree produced by {@link GroupsParser#integer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInteger(GroupsParser.IntegerContext ctx);
}