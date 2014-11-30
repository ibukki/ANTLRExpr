package com.bubuwork.bukki.intro;

import java.io.IOException;
import java.io.InputStream;
import java.util.Map;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

import com.bubuwork.bukki.BukkiLexer;
import com.bubuwork.bukki.BukkiParser;
import com.bubuwork.bukki.function.FunctionExecutor;
import com.bubuwork.bukki.function.FunctionExecutorFactory;
import com.bubuwork.bukki.inherit.BukkiEvalVisitor;
import com.bubuwork.bukki.util.CalculationMemory;

public class CalculationRunner {
	
	/**
	 * memory
	 */
	private CalculationMemory memory = new CalculationMemory();
	
	public Map<String, Object> executeCalculation(String filePath) throws IOException{
		InputStream is = CalculationRunner.class.getResourceAsStream(filePath);
		return this.executeCalculation(is);
	}
	
	public void addFunctionImpl(FunctionExecutor executer){
		FunctionExecutorFactory.registerFunction(executer);
	}
	
	public void addGloabalVariable(String key, Object value){
		this.memory.addVariable(key, value);
	}
	
	public Map<String, Object> executeCalculation(InputStream is) throws IOException{
		if(is == null){
			throw new IOException("unable to find the input stream");
		}
		ANTLRInputStream input = new ANTLRInputStream(is);
		BukkiLexer lexer = new BukkiLexer(input);
		CommonTokenStream tokens = new CommonTokenStream(lexer);
		BukkiParser parser = new BukkiParser(tokens);
		ParseTree tree = parser.prog();
		BukkiEvalVisitor eval = new BukkiEvalVisitor(memory);
		eval.visit(tree);
		
		return eval.getMemory().memory();
	}
	
	public static void main(String[] args) throws Exception {
		CalculationRunner runner = new CalculationRunner();
		String inputFile = "t.expr";
		Map result = runner.executeCalculation(inputFile);
		System.out.println(result.get("TOTALPAY"));
		
	}
}
