package com.bubuwork.bukki.intro;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Iterator;
import java.util.Map;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

import com.bubuwork.bukki.BukkiEvalVisitor;
import com.bubuwork.bukki.BukkiLexer;
import com.bubuwork.bukki.BukkiParser;

public class Runner {
	public static void main(String[] args) throws Exception {
		
		String inputFile = "src/com/bubuwork/bukki/r.expr";
		if(args.length > 0) inputFile = args[0];
		
		InputStream is = null;
		if( inputFile != null){
			is = new FileInputStream(new File(inputFile));
			ANTLRInputStream input = new ANTLRInputStream(is);
			BukkiLexer lexer = new BukkiLexer(input);
			CommonTokenStream tokens = new CommonTokenStream(lexer);
			BukkiParser parser = new BukkiParser(tokens);
			ParseTree tree = parser.prog();
			BukkiEvalVisitor eval = new BukkiEvalVisitor();
			eval.visit(tree);
			
			Map<String, Object> memory = eval.getMemory();
			for (Iterator iterator = memory.keySet().iterator(); iterator.hasNext();) {
				String key = (String) iterator.next();
				System.out.println("key " + key + " value: " + memory.get(key));
			}
		}
		
	}
}
