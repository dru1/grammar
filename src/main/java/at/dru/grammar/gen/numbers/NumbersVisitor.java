// Generated from /home/dru/SpringWork/grammar/Numbers.g4 by ANTLR 4.8
package at.dru.grammar.gen.numbers;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link NumbersParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface NumbersVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link NumbersParser#decimal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDecimal(NumbersParser.DecimalContext ctx);
	/**
	 * Visit a parse tree produced by {@link NumbersParser#decimalSuffix}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDecimalSuffix(NumbersParser.DecimalSuffixContext ctx);
	/**
	 * Visit a parse tree produced by {@link NumbersParser#integer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInteger(NumbersParser.IntegerContext ctx);
}