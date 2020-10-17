// Generated from /home/dru/SpringWork/grammar/Numbers.g4 by ANTLR 4.8
package at.dru.grammar.gen.numbers;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link NumbersParser}.
 */
public interface NumbersListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link NumbersParser#decimal}.
	 * @param ctx the parse tree
	 */
	void enterDecimal(NumbersParser.DecimalContext ctx);
	/**
	 * Exit a parse tree produced by {@link NumbersParser#decimal}.
	 * @param ctx the parse tree
	 */
	void exitDecimal(NumbersParser.DecimalContext ctx);
	/**
	 * Enter a parse tree produced by {@link NumbersParser#decimalSuffix}.
	 * @param ctx the parse tree
	 */
	void enterDecimalSuffix(NumbersParser.DecimalSuffixContext ctx);
	/**
	 * Exit a parse tree produced by {@link NumbersParser#decimalSuffix}.
	 * @param ctx the parse tree
	 */
	void exitDecimalSuffix(NumbersParser.DecimalSuffixContext ctx);
	/**
	 * Enter a parse tree produced by {@link NumbersParser#integer}.
	 * @param ctx the parse tree
	 */
	void enterInteger(NumbersParser.IntegerContext ctx);
	/**
	 * Exit a parse tree produced by {@link NumbersParser#integer}.
	 * @param ctx the parse tree
	 */
	void exitInteger(NumbersParser.IntegerContext ctx);
}