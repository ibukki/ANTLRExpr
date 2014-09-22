package com.bubuwork.bukki;

// Generated from Bukki.g4 by ANTLR 4.4
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link BukkiParser}.
 */
public interface BukkiListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by the {@code assign}
	 * labeled alternative in {@link BukkiParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterAssign(@NotNull BukkiParser.AssignContext ctx);
	/**
	 * Exit a parse tree produced by the {@code assign}
	 * labeled alternative in {@link BukkiParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitAssign(@NotNull BukkiParser.AssignContext ctx);
	/**
	 * Enter a parse tree produced by {@link BukkiParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(@NotNull BukkiParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link BukkiParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(@NotNull BukkiParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ge}
	 * labeled alternative in {@link BukkiParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterGe(@NotNull BukkiParser.GeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ge}
	 * labeled alternative in {@link BukkiParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitGe(@NotNull BukkiParser.GeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code lt}
	 * labeled alternative in {@link BukkiParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterLt(@NotNull BukkiParser.LtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code lt}
	 * labeled alternative in {@link BukkiParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitLt(@NotNull BukkiParser.LtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code funcparam}
	 * labeled alternative in {@link BukkiParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterFuncparam(@NotNull BukkiParser.FuncparamContext ctx);
	/**
	 * Exit a parse tree produced by the {@code funcparam}
	 * labeled alternative in {@link BukkiParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitFuncparam(@NotNull BukkiParser.FuncparamContext ctx);
	/**
	 * Enter a parse tree produced by the {@code float}
	 * labeled alternative in {@link BukkiParser#param}.
	 * @param ctx the parse tree
	 */
	void enterFloat(@NotNull BukkiParser.FloatContext ctx);
	/**
	 * Exit a parse tree produced by the {@code float}
	 * labeled alternative in {@link BukkiParser#param}.
	 * @param ctx the parse tree
	 */
	void exitFloat(@NotNull BukkiParser.FloatContext ctx);
	/**
	 * Enter a parse tree produced by the {@code cond}
	 * labeled alternative in {@link BukkiParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterCond(@NotNull BukkiParser.CondContext ctx);
	/**
	 * Exit a parse tree produced by the {@code cond}
	 * labeled alternative in {@link BukkiParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitCond(@NotNull BukkiParser.CondContext ctx);
	/**
	 * Enter a parse tree produced by the {@code id}
	 * labeled alternative in {@link BukkiParser#param}.
	 * @param ctx the parse tree
	 */
	void enterId(@NotNull BukkiParser.IdContext ctx);
	/**
	 * Exit a parse tree produced by the {@code id}
	 * labeled alternative in {@link BukkiParser#param}.
	 * @param ctx the parse tree
	 */
	void exitId(@NotNull BukkiParser.IdContext ctx);
	/**
	 * Enter a parse tree produced by {@link BukkiParser#prog}.
	 * @param ctx the parse tree
	 */
	void enterProg(@NotNull BukkiParser.ProgContext ctx);
	/**
	 * Exit a parse tree produced by {@link BukkiParser#prog}.
	 * @param ctx the parse tree
	 */
	void exitProg(@NotNull BukkiParser.ProgContext ctx);
	/**
	 * Enter a parse tree produced by the {@code muldiv}
	 * labeled alternative in {@link BukkiParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterMuldiv(@NotNull BukkiParser.MuldivContext ctx);
	/**
	 * Exit a parse tree produced by the {@code muldiv}
	 * labeled alternative in {@link BukkiParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitMuldiv(@NotNull BukkiParser.MuldivContext ctx);
	/**
	 * Enter a parse tree produced by {@link BukkiParser#func}.
	 * @param ctx the parse tree
	 */
	void enterFunc(@NotNull BukkiParser.FuncContext ctx);
	/**
	 * Exit a parse tree produced by {@link BukkiParser#func}.
	 * @param ctx the parse tree
	 */
	void exitFunc(@NotNull BukkiParser.FuncContext ctx);
	/**
	 * Enter a parse tree produced by {@link BukkiParser#ifstat}.
	 * @param ctx the parse tree
	 */
	void enterIfstat(@NotNull BukkiParser.IfstatContext ctx);
	/**
	 * Exit a parse tree produced by {@link BukkiParser#ifstat}.
	 * @param ctx the parse tree
	 */
	void exitIfstat(@NotNull BukkiParser.IfstatContext ctx);
	/**
	 * Enter a parse tree produced by {@link BukkiParser#fname}.
	 * @param ctx the parse tree
	 */
	void enterFname(@NotNull BukkiParser.FnameContext ctx);
	/**
	 * Exit a parse tree produced by {@link BukkiParser#fname}.
	 * @param ctx the parse tree
	 */
	void exitFname(@NotNull BukkiParser.FnameContext ctx);
	/**
	 * Enter a parse tree produced by the {@code callfunc}
	 * labeled alternative in {@link BukkiParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterCallfunc(@NotNull BukkiParser.CallfuncContext ctx);
	/**
	 * Exit a parse tree produced by the {@code callfunc}
	 * labeled alternative in {@link BukkiParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitCallfunc(@NotNull BukkiParser.CallfuncContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ifcond}
	 * labeled alternative in {@link BukkiParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterIfcond(@NotNull BukkiParser.IfcondContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ifcond}
	 * labeled alternative in {@link BukkiParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitIfcond(@NotNull BukkiParser.IfcondContext ctx);
	/**
	 * Enter a parse tree produced by the {@code int}
	 * labeled alternative in {@link BukkiParser#param}.
	 * @param ctx the parse tree
	 */
	void enterInt(@NotNull BukkiParser.IntContext ctx);
	/**
	 * Exit a parse tree produced by the {@code int}
	 * labeled alternative in {@link BukkiParser#param}.
	 * @param ctx the parse tree
	 */
	void exitInt(@NotNull BukkiParser.IntContext ctx);
	/**
	 * Enter a parse tree produced by the {@code equal}
	 * labeled alternative in {@link BukkiParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterEqual(@NotNull BukkiParser.EqualContext ctx);
	/**
	 * Exit a parse tree produced by the {@code equal}
	 * labeled alternative in {@link BukkiParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitEqual(@NotNull BukkiParser.EqualContext ctx);
	/**
	 * Enter a parse tree produced by the {@code parens}
	 * labeled alternative in {@link BukkiParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterParens(@NotNull BukkiParser.ParensContext ctx);
	/**
	 * Exit a parse tree produced by the {@code parens}
	 * labeled alternative in {@link BukkiParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitParens(@NotNull BukkiParser.ParensContext ctx);
	/**
	 * Enter a parse tree produced by {@link BukkiParser#params}.
	 * @param ctx the parse tree
	 */
	void enterParams(@NotNull BukkiParser.ParamsContext ctx);
	/**
	 * Exit a parse tree produced by {@link BukkiParser#params}.
	 * @param ctx the parse tree
	 */
	void exitParams(@NotNull BukkiParser.ParamsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code not}
	 * labeled alternative in {@link BukkiParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterNot(@NotNull BukkiParser.NotContext ctx);
	/**
	 * Exit a parse tree produced by the {@code not}
	 * labeled alternative in {@link BukkiParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitNot(@NotNull BukkiParser.NotContext ctx);
	/**
	 * Enter a parse tree produced by {@link BukkiParser#condstat}.
	 * @param ctx the parse tree
	 */
	void enterCondstat(@NotNull BukkiParser.CondstatContext ctx);
	/**
	 * Exit a parse tree produced by {@link BukkiParser#condstat}.
	 * @param ctx the parse tree
	 */
	void exitCondstat(@NotNull BukkiParser.CondstatContext ctx);
	/**
	 * Enter a parse tree produced by the {@code addsub}
	 * labeled alternative in {@link BukkiParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterAddsub(@NotNull BukkiParser.AddsubContext ctx);
	/**
	 * Exit a parse tree produced by the {@code addsub}
	 * labeled alternative in {@link BukkiParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitAddsub(@NotNull BukkiParser.AddsubContext ctx);
	/**
	 * Enter a parse tree produced by the {@code le}
	 * labeled alternative in {@link BukkiParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterLe(@NotNull BukkiParser.LeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code le}
	 * labeled alternative in {@link BukkiParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitLe(@NotNull BukkiParser.LeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code codeblock}
	 * labeled alternative in {@link BukkiParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterCodeblock(@NotNull BukkiParser.CodeblockContext ctx);
	/**
	 * Exit a parse tree produced by the {@code codeblock}
	 * labeled alternative in {@link BukkiParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitCodeblock(@NotNull BukkiParser.CodeblockContext ctx);
	/**
	 * Enter a parse tree produced by the {@code gt}
	 * labeled alternative in {@link BukkiParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterGt(@NotNull BukkiParser.GtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code gt}
	 * labeled alternative in {@link BukkiParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitGt(@NotNull BukkiParser.GtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code bool}
	 * labeled alternative in {@link BukkiParser#param}.
	 * @param ctx the parse tree
	 */
	void enterBool(@NotNull BukkiParser.BoolContext ctx);
	/**
	 * Exit a parse tree produced by the {@code bool}
	 * labeled alternative in {@link BukkiParser#param}.
	 * @param ctx the parse tree
	 */
	void exitBool(@NotNull BukkiParser.BoolContext ctx);
}