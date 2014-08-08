// Generated from Expr.g4 by ANTLR 4.4
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link ExprParser}.
 */
public interface ExprListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by the {@code assign}
	 * labeled alternative in {@link ExprParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterAssign(@NotNull ExprParser.AssignContext ctx);
	/**
	 * Exit a parse tree produced by the {@code assign}
	 * labeled alternative in {@link ExprParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitAssign(@NotNull ExprParser.AssignContext ctx);
	/**
	 * Enter a parse tree produced by the {@code blank}
	 * labeled alternative in {@link ExprParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterBlank(@NotNull ExprParser.BlankContext ctx);
	/**
	 * Exit a parse tree produced by the {@code blank}
	 * labeled alternative in {@link ExprParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitBlank(@NotNull ExprParser.BlankContext ctx);
	/**
	 * Enter a parse tree produced by the {@code int}
	 * labeled alternative in {@link ExprParser#param}.
	 * @param ctx the parse tree
	 */
	void enterInt(@NotNull ExprParser.IntContext ctx);
	/**
	 * Exit a parse tree produced by the {@code int}
	 * labeled alternative in {@link ExprParser#param}.
	 * @param ctx the parse tree
	 */
	void exitInt(@NotNull ExprParser.IntContext ctx);
	/**
	 * Enter a parse tree produced by the {@code funcparams}
	 * labeled alternative in {@link ExprParser#params}.
	 * @param ctx the parse tree
	 */
	void enterFuncparams(@NotNull ExprParser.FuncparamsContext ctx);
	/**
	 * Exit a parse tree produced by the {@code funcparams}
	 * labeled alternative in {@link ExprParser#params}.
	 * @param ctx the parse tree
	 */
	void exitFuncparams(@NotNull ExprParser.FuncparamsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AddSub}
	 * labeled alternative in {@link ExprParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterAddSub(@NotNull ExprParser.AddSubContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AddSub}
	 * labeled alternative in {@link ExprParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitAddSub(@NotNull ExprParser.AddSubContext ctx);
	/**
	 * Enter a parse tree produced by the {@code readfunc}
	 * labeled alternative in {@link ExprParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterReadfunc(@NotNull ExprParser.ReadfuncContext ctx);
	/**
	 * Exit a parse tree produced by the {@code readfunc}
	 * labeled alternative in {@link ExprParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitReadfunc(@NotNull ExprParser.ReadfuncContext ctx);
	/**
	 * Enter a parse tree produced by the {@code parens}
	 * labeled alternative in {@link ExprParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterParens(@NotNull ExprParser.ParensContext ctx);
	/**
	 * Exit a parse tree produced by the {@code parens}
	 * labeled alternative in {@link ExprParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitParens(@NotNull ExprParser.ParensContext ctx);
	/**
	 * Enter a parse tree produced by the {@code funcparam}
	 * labeled alternative in {@link ExprParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterFuncparam(@NotNull ExprParser.FuncparamContext ctx);
	/**
	 * Exit a parse tree produced by the {@code funcparam}
	 * labeled alternative in {@link ExprParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitFuncparam(@NotNull ExprParser.FuncparamContext ctx);
	/**
	 * Enter a parse tree produced by the {@code float}
	 * labeled alternative in {@link ExprParser#param}.
	 * @param ctx the parse tree
	 */
	void enterFloat(@NotNull ExprParser.FloatContext ctx);
	/**
	 * Exit a parse tree produced by the {@code float}
	 * labeled alternative in {@link ExprParser#param}.
	 * @param ctx the parse tree
	 */
	void exitFloat(@NotNull ExprParser.FloatContext ctx);
	/**
	 * Enter a parse tree produced by the {@code print}
	 * labeled alternative in {@link ExprParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterPrint(@NotNull ExprParser.PrintContext ctx);
	/**
	 * Exit a parse tree produced by the {@code print}
	 * labeled alternative in {@link ExprParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitPrint(@NotNull ExprParser.PrintContext ctx);
	/**
	 * Enter a parse tree produced by the {@code MulDiv}
	 * labeled alternative in {@link ExprParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterMulDiv(@NotNull ExprParser.MulDivContext ctx);
	/**
	 * Exit a parse tree produced by the {@code MulDiv}
	 * labeled alternative in {@link ExprParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitMulDiv(@NotNull ExprParser.MulDivContext ctx);
	/**
	 * Enter a parse tree produced by the {@code id}
	 * labeled alternative in {@link ExprParser#param}.
	 * @param ctx the parse tree
	 */
	void enterId(@NotNull ExprParser.IdContext ctx);
	/**
	 * Exit a parse tree produced by the {@code id}
	 * labeled alternative in {@link ExprParser#param}.
	 * @param ctx the parse tree
	 */
	void exitId(@NotNull ExprParser.IdContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprParser#prog}.
	 * @param ctx the parse tree
	 */
	void enterProg(@NotNull ExprParser.ProgContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#prog}.
	 * @param ctx the parse tree
	 */
	void exitProg(@NotNull ExprParser.ProgContext ctx);
	/**
	 * Enter a parse tree produced by the {@code fname}
	 * labeled alternative in {@link ExprParser#func}.
	 * @param ctx the parse tree
	 */
	void enterFname(@NotNull ExprParser.FnameContext ctx);
	/**
	 * Exit a parse tree produced by the {@code fname}
	 * labeled alternative in {@link ExprParser#func}.
	 * @param ctx the parse tree
	 */
	void exitFname(@NotNull ExprParser.FnameContext ctx);
}