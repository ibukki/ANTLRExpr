import java.util.HashMap;
import java.util.Map;


public class FloatEvalVisitor extends ExprBaseVisitor<Float> {

	Map<String, Float> memory = new HashMap<String, Float>();

	@Override
	public Float visitAssign(ExprParser.AssignContext ctx) {
		String id = ctx.ID().getText(); // id is left-hand side of '='
		float value = visit(ctx.expr()); // compute value of expression on right
		memory.put(id, value); // store it in our memory
		return value;
	}

	/** INT */
	@Override
	public Float visitInt(ExprParser.IntContext ctx) {
		return Float.valueOf(ctx.INT().getText());
	}

	/** ID */
	@Override
	public Float visitId(ExprParser.IdContext ctx) {
		String id = ctx.ID().getText();
		if (memory.containsKey(id))
			return memory.get(id);
		return 0f;
	}
	
	/** expr op=('*'|'/') expr */
	@Override
	public Float visitMulDiv(ExprParser.MulDivContext ctx) {
		float left = visit(ctx.expr(0)); // get value of left subexpression
		float right = visit(ctx.expr(1)); // get value of right subexpression
		if ( ctx.op.getType() == ExprParser.MUL ) return left * right;
		return left / right; // must be DIV
	}
	
	/** expr op=('+'|'-') expr */
	@Override
	public Float visitAddSub(ExprParser.AddSubContext ctx) {
		float left = visit(ctx.expr(0)); // get value of left subexpression
		float right = visit(ctx.expr(1)); // get value of right subexpression
		if ( ctx.op.getType() == ExprParser.ADD ) return left + right;
		return left - right; // must be SUB
	}
	
	/** '(' expr ')' */
	@Override
	public Float visitParens(ExprParser.ParensContext ctx) {
		return visit(ctx.expr()); // return child expr's value
	}
	
	@Override
	public Float visitFloat(ExprParser.FloatContext ctx){
		return Float.valueOf(ctx.FLOAT().getText());
	}
	
	@Override
	public Float visitPrint(ExprParser.PrintContext ctx) { 
		if (memory.containsKey(ctx.ID().getText())){
			System.out.println(ctx.ID() + " = " + memory.get(ctx.ID().getText()));
		}
		return 0f;
	}
	
	@Override
	public Float visitFname(ExprParser.FnameContext ctx) { 
		return 0f;
	}
	
	@Override
	public Float visitReadfunc(ExprParser.ReadfuncContext ctx) { 
		String fname = ctx.func().getText();
		if(fname.equals("func_readconf")){
			System.out.println("read data from ccc");
		}
		return 0f;
	}
	
	@Override
	public Float visitFuncparam(ExprParser.FuncparamContext ctx) { 
		return visit(ctx.param());
	}
}
