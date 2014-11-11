package com.bubuwork.bukki.inherit;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import com.bubuwork.bukki.BukkiBaseVisitor;
import com.bubuwork.bukki.BukkiParser;
import com.bubuwork.bukki.BukkiParser.AddsubContext;
import com.bubuwork.bukki.BukkiParser.AndorContext;
import com.bubuwork.bukki.BukkiParser.AssignContext;
import com.bubuwork.bukki.BukkiParser.BoolContext;
import com.bubuwork.bukki.BukkiParser.CallfuncContext;
import com.bubuwork.bukki.BukkiParser.CondContext;
import com.bubuwork.bukki.BukkiParser.EqnoteqContext;
import com.bubuwork.bukki.BukkiParser.FloatContext;
import com.bubuwork.bukki.BukkiParser.FuncparamContext;
import com.bubuwork.bukki.BukkiParser.GeContext;
import com.bubuwork.bukki.BukkiParser.GtContext;
import com.bubuwork.bukki.BukkiParser.IdContext;
import com.bubuwork.bukki.BukkiParser.IfcondContext;
import com.bubuwork.bukki.BukkiParser.IntContext;
import com.bubuwork.bukki.BukkiParser.LeContext;
import com.bubuwork.bukki.BukkiParser.LtContext;
import com.bubuwork.bukki.BukkiParser.MuldivContext;
import com.bubuwork.bukki.BukkiParser.NotContext;
import com.bubuwork.bukki.BukkiParser.ParamContext;
import com.bubuwork.bukki.BukkiParser.ParensContext;
import com.bubuwork.bukki.BukkiParser.ProgContext;
import com.bubuwork.bukki.BukkiParser.StatContext;
import com.bubuwork.bukki.BukkiParser.StringContext;
import com.bubuwork.bukki.function.FunctionExecutor;
import com.bubuwork.bukki.function.FunctionExecutorFactory;
import com.bubuwork.bukki.util.CalculationMemory;

public class BukkiEvalVisitor extends BukkiBaseVisitor<Object>{
	
	private CalculationMemory memory;
	
	public BukkiEvalVisitor(CalculationMemory memory){
		this.memory = memory;
	}
	
	/* (non-Javadoc)
	 * @see com.bubuwork.bukki.BukkiBaseVisitor#visitAssign(com.bubuwork.bukki.BukkiParser.AssignContext)
	 */
	@Override
	public Object visitAssign(AssignContext ctx) {
		String id = ctx.ID().getText(); // id is left-hand side of '='
		Object value = visit(ctx.expr()); // compute value of expression on right
		memory.addVariable(id, value); // store it in our memory
		return null;
	}

	/* (non-Javadoc)
	 * @see com.bubuwork.bukki.BukkiBaseVisitor#visitGe(com.bubuwork.bukki.BukkiParser.GeContext)
	 * Always use double value to compare
	 */
	@Override
	public Object visitGe(GeContext ctx) {
		Object value1 = visit(ctx.expr(0));
		Object value2 = visit(ctx.expr(1));
		Double dValue1 = 0d;
		Double dValue2 = 0d;
		if(value1 instanceof Long){
			dValue1 = 0d + (Long)value1;
		}else if(value1 instanceof Double){
			dValue1 = (Double)value1;
		}
		
		if(value2 instanceof Long){
			dValue2 = 0d + (Long)value2;
		}else if(value2 instanceof Double){
			dValue2 = (Double)value2;
		}
		
		if(dValue1 >= dValue2){
			return true;
		}else{
			return false;
		}
	}
	
	/* (non-Javadoc)
	 * @see com.bubuwork.bukki.BukkiBaseVisitor#visitLt(com.bubuwork.bukki.BukkiParser.LtContext)
	 */
	@Override
	public Object visitLt(LtContext ctx) {
		Object value1 = visit(ctx.expr(0));
		Object value2 = visit(ctx.expr(1));
		Double dValue1 = 0d;
		Double dValue2 = 0d;
		if(value1 instanceof Long){
			dValue1 = 0d + (Long)value1;
		}else if(value1 instanceof Double){
			dValue1 = (Double)value1;
		}
		
		if(value2 instanceof Long){
			dValue2 = 0d + (Long)value2;
		}else if(value2 instanceof Double){
			dValue2 = (Double)value2;
		}
		
		if(dValue1 < dValue2){
			return true;
		}else{
			return false;
		}
	}

	/* (non-Javadoc)
	 * @see com.bubuwork.bukki.BukkiBaseVisitor#visitFuncparam(com.bubuwork.bukki.BukkiParser.FuncparamContext)
	 */
	@Override
	public Object visitFuncparam(FuncparamContext ctx) {
		return super.visitFuncparam(ctx);
	}

	/* (non-Javadoc)
	 * @see com.bubuwork.bukki.BukkiBaseVisitor#visitFloat(com.bubuwork.bukki.BukkiParser.FloatContext)
	 */
	@Override
	public Object visitFloat(FloatContext ctx) {
		return Double.parseDouble(ctx.FLOAT().getText());
	}
	
	
	public Object visitString(StringContext ctx) { 
		return ctx.STRING().getText(); 
	}
	
	/* (non-Javadoc)
	 * @see com.bubuwork.bukki.BukkiBaseVisitor#visitId(com.bubuwork.bukki.BukkiParser.IdContext)
	 */
	@Override
	public Object visitId(IdContext ctx) {
		String id = ctx.ID().getText();
		if (memory.containsKey(id))
			return memory.getVariable(id);
		return null;
	}

	/* (non-Javadoc)
	 * @see com.bubuwork.bukki.BukkiBaseVisitor#visitProg(com.bubuwork.bukki.BukkiParser.ProgContext)
	 */
	@Override
	public Object visitProg(ProgContext ctx) {
		return super.visitProg(ctx);
	}

	/* (non-Javadoc)
	 * @see com.bubuwork.bukki.BukkiBaseVisitor#visitMuldiv(com.bubuwork.bukki.BukkiParser.MuldivContext)
	 */
	@Override
	public Object visitMuldiv(MuldivContext ctx) {
		Object left = visit(ctx.expr(0)); // get value of left subexpression
		Object right = visit(ctx.expr(1)); // get value of right subexpression
		Double dleft = 0d;
		Double dright = 0d;
		if(left instanceof Long){
			dleft = 0d + (Long)left;
		}
		if(left instanceof Double){
			dleft = (Double)left;
		}
		
		if(right instanceof Long){
			dright = 0d + (Long)right;
		}
		if(right instanceof Double){
			dright = (Double)right;
		}
		
		if(ctx.op.getType() == BukkiParser.MUL){
			return dleft * dright;
		}else{
			if(dright == 0d){
				return 0d;
			}
			return this.divide(dleft, dright, 3);
		}
	}
	
	
	private double divide(double v1,double v2,int scale)
	{
	   if(scale<0)
	   {
	       throw new IllegalArgumentException("The scale must be a positive integer or zero");
	   }
	   BigDecimal b1 = new BigDecimal(Double.toString(v1));
	   BigDecimal b2 = new BigDecimal(Double.toString(v2));
	   return b1.divide(b2,scale,BigDecimal.ROUND_HALF_UP).doubleValue();
	}  
	
	private double round(double v,int scale)
	{
	   if(scale<0)
	   {
	        throw new IllegalArgumentException( "The scale must be a positive integer or zero");
	   }
	   BigDecimal b = new BigDecimal(Double.toString(v));
	   BigDecimal one = new BigDecimal("1");
	   return b.divide(one,scale,BigDecimal.ROUND_HALF_UP).doubleValue();
	}
	
	/* (non-Javadoc)
	 * @see com.bubuwork.bukki.BukkiBaseVisitor#visitAddsub(com.bubuwork.bukki.BukkiParser.AddsubContext)
	 */
	@Override
	public Object visitAddsub(AddsubContext ctx) {
		Object left = visit(ctx.expr(0)); // get value of left subexpression
		Object right = visit(ctx.expr(1)); // get value of right subexpression
		Double dleft = 0d;
		Double dright = 0d;
		if(left instanceof Long){
			dleft = 0d + (Long)left;
		}
		if(left instanceof Double){
			dleft = (Double)left;
		}
		
		if(right instanceof Long){
			dright = 0d + (Long)right;
		}
		if(right instanceof Double){
			dright = (Double)right;
		}
		
		if ( ctx.op.getType() == BukkiParser.ADD ){
			return dleft + dright;
		}else{
			 return dleft - dright;
		}
	}

	/* (non-Javadoc)
	 * @see com.bubuwork.bukki.BukkiBaseVisitor#visitCallfunc(com.bubuwork.bukki.BukkiParser.CallfuncContext)
	 */
	@Override
	public Object visitCallfunc(CallfuncContext ctx) {
		String variableName = null;
		if(ctx.func().ID() != null){
			variableName = ctx.func().ID().getText();
		}
		
		String functionName = ctx.func().fname().getText();
		FunctionExecutor executor = FunctionExecutorFactory.createExecutor(functionName);
		if(executor != null){
			List<ParamContext> paramList = ctx.func().params().param();
			List paramValueList = new ArrayList();
			for (ParamContext param : paramList) {
				Object paramValue = visit(param);
				paramValueList.add(paramValue);
			}
			Object result = executor.execute(paramValueList, memory);
			if(variableName != null){
				memory.addVariable(variableName, result);
			}
		}else{
			
		}
		return null;
	}

	/* (non-Javadoc)
	 * @see com.bubuwork.bukki.BukkiBaseVisitor#visitIfcond(com.bubuwork.bukki.BukkiParser.IfcondContext)
	 * 
	 * if(xxx){
	 *   xxx
	 * }else{
	 *   xxx
	 * }
	 */
	
	@Override
	public Object visitIfcond(IfcondContext ctx) {
		boolean ifPass = (Boolean) visit(ctx.ifstat().expr());
		List<StatContext> stats = ctx.ifstat().stat();
		if(ifPass){
			if(stats.get(0) != null){
				visit(stats.get(0));
			}
		}else{
			if(stats.size() > 1){
				visit(stats.get(1));
			}
		}
		return null;
	}
	
	/*
	 * (non-Javadoc)
	 * xxxx ? xxx: xxx
	 * 
	 */
	@Override
	public Object visitCond(CondContext ctx) { 
		Boolean condExpr = (Boolean) visit(ctx.condstat().expr(0));
		if(condExpr){
			return visit(ctx.condstat().expr(1));
		}else{
			return visit(ctx.condstat().expr(2));
		}
	}
	
	/* (non-Javadoc)
	 * @see com.bubuwork.bukki.BukkiBaseVisitor#visitInt(com.bubuwork.bukki.BukkiParser.IntContext)
	 */
	@Override
	public Object visitInt(IntContext ctx) {
		return Long.parseLong(ctx.INT().getText());
	}

	/* (non-Javadoc)
	 * @see com.bubuwork.bukki.BukkiBaseVisitor#visitEqual(com.bubuwork.bukki.BukkiParser.EqualContext)
	 */
	@Override
	public Object visitEqnoteq(EqnoteqContext ctx) {
		Object value1 = visit(ctx.expr(0));
		Object value2 = visit(ctx.expr(1));
		if(ctx.op.getType() == BukkiParser.EQUAL){
			if(value1.equals(value2)){
				return true;
			}else{
				return false;
			}
		}
		
		if(ctx.op.getType() == BukkiParser.NOTEQUAL){
			if(!value1.equals(value2)){
				return true;
			}else{
				return false;
			}
		}
		
		return false;
		
	}
	
	
	public Object visitAndor(AndorContext ctx) { 
		Boolean value1 = (Boolean) visit(ctx.expr(0));
		Boolean value2 = (Boolean) visit(ctx.expr(1));
		if ( ctx.op.getType() == BukkiParser.AND ){
			return (value1 && value2);
		}
		if (ctx.op.getType() == BukkiParser.OR){
			return (value1 || value2);
		}
		return null;
	}
	
	
	/* (non-Javadoc)
	 * @see com.bubuwork.bukki.BukkiBaseVisitor#visitParens(com.bubuwork.bukki.BukkiParser.ParensContext)
	 */
	@Override
	public Object visitParens(ParensContext ctx) {
		return this.visit(ctx.expr());
	}

	/* (non-Javadoc)
	 * @see com.bubuwork.bukki.BukkiBaseVisitor#visitNot(com.bubuwork.bukki.BukkiParser.NotContext)
	 */
	@Override
	public Object visitNot(NotContext ctx) {
		Boolean value = (Boolean) visit(ctx.expr());
		return !value;
	}


	/* (non-Javadoc)
	 * @see com.bubuwork.bukki.BukkiBaseVisitor#visitLe(com.bubuwork.bukki.BukkiParser.LeContext)
	 */
	@Override
	public Object visitLe(LeContext ctx) {
		Object value1 = visit(ctx.expr(0));
		Object value2 = visit(ctx.expr(1));
		Double dValue1 = 0d;
		Double dValue2 = 0d;
		if(value1 instanceof Long){
			dValue1 = 0d + (Long)value1;
		}else if(value1 instanceof Double){
			dValue1 = (Double)value1;
		}
		
		if(value2 instanceof Long){
			dValue2 = 0d + (Long)value2;
		}else if(value2 instanceof Double){
			dValue2 = (Double)value2;
		}
		
		if(dValue1 <= dValue2){
			return true;
		}else{
			return false;
		}
	}

	/* (non-Javadoc)
	 * @see com.bubuwork.bukki.BukkiBaseVisitor#visitGt(com.bubuwork.bukki.BukkiParser.GtContext)
	 */
	@Override
	public Object visitGt(GtContext ctx) {
		Object value1 = visit(ctx.expr(0));
		Object value2 = visit(ctx.expr(1));
		Double dValue1 = 0d;
		Double dValue2 = 0d;
		if(value1 instanceof Long){
			dValue1 = 0d + (Long)value1;
		}else if(value1 instanceof Double){
			dValue1 = (Double)value1;
		}
		
		if(value2 instanceof Long){
			dValue2 = 0d + (Long)value2;
		}else if(value2 instanceof Double){
			dValue2 = (Double)value2;
		}
		
		if(dValue1 > dValue2){
			return true;
		}else{
			return false;
		}
	}

	/* (non-Javadoc)
	 * @see com.bubuwork.bukki.BukkiBaseVisitor#visitBool(com.bubuwork.bukki.BukkiParser.BoolContext)
	 */
	@Override
	public Object visitBool(BoolContext ctx) {
		return ctx.BOOLEAN().getText();
	}

	/**
	 * @return the memory
	 */
	public CalculationMemory getMemory() {
		return memory;
	}

	/**
	 * @param memory the memory to set
	 */
	public void setMemory(CalculationMemory memory) {
		this.memory = memory;
	}

}
