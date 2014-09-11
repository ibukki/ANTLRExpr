package com.bubuwork.bukki;

import java.util.HashMap;
import java.util.Map;

import com.bubuwork.bukki.BukkiParser.AddsubContext;
import com.bubuwork.bukki.BukkiParser.AssignContext;
import com.bubuwork.bukki.BukkiParser.BoolContext;
import com.bubuwork.bukki.BukkiParser.CallfuncContext;
import com.bubuwork.bukki.BukkiParser.CondContext;
import com.bubuwork.bukki.BukkiParser.CondstatContext;
import com.bubuwork.bukki.BukkiParser.EqualContext;
import com.bubuwork.bukki.BukkiParser.FloatContext;
import com.bubuwork.bukki.BukkiParser.FnameContext;
import com.bubuwork.bukki.BukkiParser.FuncContext;
import com.bubuwork.bukki.BukkiParser.FuncparamContext;
import com.bubuwork.bukki.BukkiParser.GeContext;
import com.bubuwork.bukki.BukkiParser.GtContext;
import com.bubuwork.bukki.BukkiParser.IdContext;
import com.bubuwork.bukki.BukkiParser.IfcondContext;
import com.bubuwork.bukki.BukkiParser.IfstatContext;
import com.bubuwork.bukki.BukkiParser.IntContext;
import com.bubuwork.bukki.BukkiParser.LeContext;
import com.bubuwork.bukki.BukkiParser.LtContext;
import com.bubuwork.bukki.BukkiParser.MuldivContext;
import com.bubuwork.bukki.BukkiParser.NotContext;
import com.bubuwork.bukki.BukkiParser.ParensContext;
import com.bubuwork.bukki.BukkiParser.ProgContext;

public class BukkiEvalVisitor extends BukkiBaseVisitor<Object>{
	
	private Map<String, Object> memory = new HashMap<String, Object>();
	
	
	/* (non-Javadoc)
	 * @see com.bubuwork.bukki.BukkiBaseVisitor#visitAssign(com.bubuwork.bukki.BukkiParser.AssignContext)
	 */
	@Override
	public Object visitAssign(AssignContext ctx) {
		String id = ctx.ID().getText(); // id is left-hand side of '='
		Object value = visit(ctx.expr()); // compute value of expression on right
		memory.put(id, value); // store it in our memory
		return null;
	}

	/* (non-Javadoc)
	 * @see com.bubuwork.bukki.BukkiBaseVisitor#visitGe(com.bubuwork.bukki.BukkiParser.GeContext)
	 */
	@Override
	public Object visitGe(GeContext ctx) {
		Long value1 = (Long) visit(ctx.expr(0));
		Long value2 = (Long) visit(ctx.expr(1));
		if(value1 >= value2){
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
		Long value1 = (Long) visit(ctx.expr(0));
		Long value2 = (Long) visit(ctx.expr(1));
		if(value1 < value2){
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
		// TODO Auto-generated method stub
		return super.visitFuncparam(ctx);
	}

	/* (non-Javadoc)
	 * @see com.bubuwork.bukki.BukkiBaseVisitor#visitFloat(com.bubuwork.bukki.BukkiParser.FloatContext)
	 */
	@Override
	public Object visitFloat(FloatContext ctx) {
		return Double.parseDouble(ctx.FLOAT().getText());
	}

	/* (non-Javadoc)
	 * @see com.bubuwork.bukki.BukkiBaseVisitor#visitCond(com.bubuwork.bukki.BukkiParser.CondContext)
	 */
	@Override
	public Object visitCond(CondContext ctx) {
		// TODO Auto-generated method stub
		return super.visitCond(ctx);
	}

	/* (non-Javadoc)
	 * @see com.bubuwork.bukki.BukkiBaseVisitor#visitId(com.bubuwork.bukki.BukkiParser.IdContext)
	 */
	@Override
	public Object visitId(IdContext ctx) {
		String id = ctx.ID().getText();
		if (memory.containsKey(id))
			return memory.get(id);
		return null;
	}

	/* (non-Javadoc)
	 * @see com.bubuwork.bukki.BukkiBaseVisitor#visitProg(com.bubuwork.bukki.BukkiParser.ProgContext)
	 */
	@Override
	public Object visitProg(ProgContext ctx) {
		// TODO Auto-generated method stub
		return super.visitProg(ctx);
	}

	/* (non-Javadoc)
	 * @see com.bubuwork.bukki.BukkiBaseVisitor#visitMuldiv(com.bubuwork.bukki.BukkiParser.MuldivContext)
	 */
	@Override
	public Object visitMuldiv(MuldivContext ctx) {
		Object left = visit(ctx.expr(0)); // get value of left subexpression
		Object right = visit(ctx.expr(1)); // get value of right subexpression
		if(left instanceof Long && right instanceof Long){
			if ( ctx.op.getType() == BukkiParser.MUL ){
				return (Long)left * (Long)right;
			}else{
				 return (Long)left / (Long)right;
			}
		}else if(left instanceof Double && right instanceof Double){
			if ( ctx.op.getType() == BukkiParser.MUL ){
				return (Double)left * (Double)right;
			}else{
				 return (Double)left / (Double)right;
			}
		}
		return null; // must be DIV
	}

	/* (non-Javadoc)
	 * @see com.bubuwork.bukki.BukkiBaseVisitor#visitAddsub(com.bubuwork.bukki.BukkiParser.AddsubContext)
	 */
	@Override
	public Object visitAddsub(AddsubContext ctx) {
		Object left = visit(ctx.expr(0)); // get value of left subexpression
		Object right = visit(ctx.expr(1)); // get value of right subexpression
		if(left instanceof Long && right instanceof Long){
			if ( ctx.op.getType() == BukkiParser.ADD ){
				return (Long)left + (Long)right;
			}else{
				 return (Long)left - (Long)right;
			}
		}else if(left instanceof Double && right instanceof Double){
			if ( ctx.op.getType() == BukkiParser.ADD ){
				return (Double)left + (Double)right;
			}else{
				 return (Double)left - (Double)right;
			}
		}
		return null; // must be DIV
	}

	/* (non-Javadoc)
	 * @see com.bubuwork.bukki.BukkiBaseVisitor#visitFunc(com.bubuwork.bukki.BukkiParser.FuncContext)
	 */
	@Override
	public Object visitFunc(FuncContext ctx) {
		// TODO Auto-generated method stub
		return super.visitFunc(ctx);
	}

	/* (non-Javadoc)
	 * @see com.bubuwork.bukki.BukkiBaseVisitor#visitIfstat(com.bubuwork.bukki.BukkiParser.IfstatContext)
	 */
	@Override
	public Object visitIfstat(IfstatContext ctx) {
		// TODO Auto-generated method stub
		return super.visitIfstat(ctx);
	}

	/* (non-Javadoc)
	 * @see com.bubuwork.bukki.BukkiBaseVisitor#visitFname(com.bubuwork.bukki.BukkiParser.FnameContext)
	 */
	@Override
	public Object visitFname(FnameContext ctx) {
		// TODO Auto-generated method stub
		return super.visitFname(ctx);
	}

	/* (non-Javadoc)
	 * @see com.bubuwork.bukki.BukkiBaseVisitor#visitCallfunc(com.bubuwork.bukki.BukkiParser.CallfuncContext)
	 */
	@Override
	public Object visitCallfunc(CallfuncContext ctx) {
		// TODO Auto-generated method stub
		return super.visitCallfunc(ctx);
	}

	/* (non-Javadoc)
	 * @see com.bubuwork.bukki.BukkiBaseVisitor#visitIfcond(com.bubuwork.bukki.BukkiParser.IfcondContext)
	 */
	@Override
	public Object visitIfcond(IfcondContext ctx) {
		// TODO Auto-generated method stub
		return super.visitIfcond(ctx);
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
	public Object visitEqual(EqualContext ctx) {
		// TODO Auto-generated method stub
		return super.visitEqual(ctx);
	}

	/* (non-Javadoc)
	 * @see com.bubuwork.bukki.BukkiBaseVisitor#visitParens(com.bubuwork.bukki.BukkiParser.ParensContext)
	 */
	@Override
	public Object visitParens(ParensContext ctx) {
		// TODO Auto-generated method stub
		return super.visitParens(ctx);
	}

	/* (non-Javadoc)
	 * @see com.bubuwork.bukki.BukkiBaseVisitor#visitNot(com.bubuwork.bukki.BukkiParser.NotContext)
	 */
	@Override
	public Object visitNot(NotContext ctx) {
		// TODO Auto-generated method stub
		return super.visitNot(ctx);
	}

	/* (non-Javadoc)
	 * @see com.bubuwork.bukki.BukkiBaseVisitor#visitCondstat(com.bubuwork.bukki.BukkiParser.CondstatContext)
	 */
	@Override
	public Object visitCondstat(CondstatContext ctx) {
		// TODO Auto-generated method stub
		return super.visitCondstat(ctx);
	}

	/* (non-Javadoc)
	 * @see com.bubuwork.bukki.BukkiBaseVisitor#visitLe(com.bubuwork.bukki.BukkiParser.LeContext)
	 */
	@Override
	public Object visitLe(LeContext ctx) {
		// TODO Auto-generated method stub
		return super.visitLe(ctx);
	}

	/* (non-Javadoc)
	 * @see com.bubuwork.bukki.BukkiBaseVisitor#visitGt(com.bubuwork.bukki.BukkiParser.GtContext)
	 */
	@Override
	public Object visitGt(GtContext ctx) {
		Long value1 = (Long) visit(ctx.expr(0));
		Long value2 = (Long) visit(ctx.expr(1));
		if(value1 > value2){
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
	public Map<String, Object> getMemory() {
		return memory;
	}

	/**
	 * @param memory the memory to set
	 */
	public void setMemory(Map<String, Object> memory) {
		this.memory = memory;
	}

}
