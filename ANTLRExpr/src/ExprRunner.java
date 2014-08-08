import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;


public class ExprRunner {
	
	public static void main(String[] args) throws Exception {
		String inputFile = "src/t.expr";
		if(args.length > 0) inputFile = args[0];
		
		InputStream is = null;
		if( inputFile != null){
			is = new FileInputStream(new File(inputFile));
			ANTLRInputStream input = new ANTLRInputStream(is);
			ExprLexer lexer = new ExprLexer(input);
			CommonTokenStream tokens = new CommonTokenStream(lexer);
			ExprParser parser = new ExprParser(tokens);
			ParseTree tree = parser.prog();
			System.out.println(tree.toStringTree(parser));
		}
	}
	
}
