package com.bubuwork.bukki;

// Generated from Bukki.g4 by ANTLR 4.4
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link BukkiParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface BukkiVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by the {@code assign}
	 * labeled alternative in {@link BukkiParser#stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssign(@NotNull BukkiParser.AssignContext ctx);
	/**
	 * Visit a parse tree produced by {@link BukkiParser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(@NotNull BukkiParser.BlockContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ge}
	 * labeled alternative in {@link BukkiParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGe(@NotNull BukkiParser.GeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code lt}
	 * labeled alternative in {@link BukkiParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLt(@NotNull BukkiParser.LtContext ctx);
	/**
	 * Visit a parse tree produced by the {@code funcparam}
	 * labeled alternative in {@link BukkiParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFuncparam(@NotNull BukkiParser.FuncparamContext ctx);
	/**
	 * Visit a parse tree produced by the {@code float}
	 * labeled alternative in {@link BukkiParser#param}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFloat(@NotNull BukkiParser.FloatContext ctx);
	/**
	 * Visit a parse tree produced by the {@code cond}
	 * labeled alternative in {@link BukkiParser#stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCond(@NotNull BukkiParser.CondContext ctx);
	/**
	 * Visit a parse tree produced by the {@code id}
	 * labeled alternative in {@link BukkiParser#param}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitId(@NotNull BukkiParser.IdContext ctx);
	/**
	 * Visit a parse tree produced by {@link BukkiParser#prog}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProg(@NotNull BukkiParser.ProgContext ctx);
	/**
	 * Visit a parse tree produced by the {@code muldiv}
	 * labeled alternative in {@link BukkiParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMuldiv(@NotNull BukkiParser.MuldivContext ctx);
	/**
	 * Visit a parse tree produced by {@link BukkiParser#func}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunc(@NotNull BukkiParser.FuncContext ctx);
	/**
	 * Visit a parse tree produced by {@link BukkiParser#ifstat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfstat(@NotNull BukkiParser.IfstatContext ctx);
	/**
	 * Visit a parse tree produced by {@link BukkiParser#fname}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFname(@NotNull BukkiParser.FnameContext ctx);
	/**
	 * Visit a parse tree produced by the {@code callfunc}
	 * labeled alternative in {@link BukkiParser#stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCallfunc(@NotNull BukkiParser.CallfuncContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ifcond}
	 * labeled alternative in {@link BukkiParser#stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfcond(@NotNull BukkiParser.IfcondContext ctx);
	/**
	 * Visit a parse tree produced by the {@code int}
	 * labeled alternative in {@link BukkiParser#param}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInt(@NotNull BukkiParser.IntContext ctx);
	/**
	 * Visit a parse tree produced by the {@code equal}
	 * labeled alternative in {@link BukkiParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEqual(@NotNull BukkiParser.EqualContext ctx);
	/**
	 * Visit a parse tree produced by the {@code parens}
	 * labeled alternative in {@link BukkiParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParens(@NotNull BukkiParser.ParensContext ctx);
	/**
	 * Visit a parse tree produced by {@link BukkiParser#params}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParams(@NotNull BukkiParser.ParamsContext ctx);
	/**
	 * Visit a parse tree produced by the {@code not}
	 * labeled alternative in {@link BukkiParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNot(@NotNull BukkiParser.NotContext ctx);
	/**
	 * Visit a parse tree produced by {@link BukkiParser#condstat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondstat(@NotNull BukkiParser.CondstatContext ctx);
	/**
	 * Visit a parse tree produced by the {@code addsub}
	 * labeled alternative in {@link BukkiParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAddsub(@NotNull BukkiParser.AddsubContext ctx);
	/**
	 * Visit a parse tree produced by the {@code le}
	 * labeled alternative in {@link BukkiParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLe(@NotNull BukkiParser.LeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code codeblock}
	 * labeled alternative in {@link BukkiParser#stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCodeblock(@NotNull BukkiParser.CodeblockContext ctx);
	/**
	 * Visit a parse tree produced by the {@code gt}
	 * labeled alternative in {@link BukkiParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGt(@NotNull BukkiParser.GtContext ctx);
	/**
	 * Visit a parse tree produced by the {@code bool}
	 * labeled alternative in {@link BukkiParser#param}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBool(@NotNull BukkiParser.BoolContext ctx);
	/**
	 * Visit a parse tree produced by the {@code andor}
	 * labeled alternative in {@link BukkiParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAndor(@NotNull BukkiParser.AndorContext ctx);
}