package abc.parser;

import java.io.IOException;

import org.antlr.v4.gui.Trees;
import org.antlr.v4.runtime.ANTLRFileStream;
import org.antlr.v4.runtime.BaseErrorListener;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.RecognitionException;
import org.antlr.v4.runtime.Recognizer;
import org.antlr.v4.runtime.tree.ParseTree;

/**
 * Utility to visualize our parse trees.
 */
public final class Visualizer {
    public static void main(String[] args) {
        final CharStream stream;
        try {
            stream = new ANTLRFileStream("sample_abc/fur_elise.abc");
        } catch (IOException e) {
            e.printStackTrace();
            return;
        }
        AbcLexer lexer = new AbcLexer(stream);
        lexer.reportErrorsAsExceptions();

        AbcParser parser = new AbcParser(new CommonTokenStream(lexer));
        parser.addErrorListener(new BaseErrorListener() {
            public void syntaxError(Recognizer<?, ?> recognizer,
                                    Object offendingSymbol, 
                                    int line, int charPositionInLine,
                                    String msg, RecognitionException e) {
                 return;
            }
        });
        parser.reportErrorsAsExceptions();
        
        ParseTree tree = parser.abc_tune();
        
        Trees.inspect(tree, parser);
    }
}
