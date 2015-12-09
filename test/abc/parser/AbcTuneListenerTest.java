package abc.parser;

import static org.junit.Assert.*;

import java.io.File;
import java.io.IOException;

import org.antlr.v4.runtime.ANTLRFileStream;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.BaseErrorListener;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.RecognitionException;
import org.antlr.v4.runtime.Recognizer;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import org.junit.Before;
import org.junit.Test;

import abc.player.Fraction;
import abc.player.Tune;

public class AbcTuneListenerTest {
    private AbcTuneListener walkString(String abcText) {
        final CharStream stream = new ANTLRInputStream(abcText);
        final AbcLexer lexer = new AbcLexer(stream);
        lexer.reportErrorsAsExceptions();

        final AbcParser parser = new AbcParser(new CommonTokenStream(lexer));
        parser.addErrorListener(new BaseErrorListener() {
            public void syntaxError(Recognizer<?, ?> recognizer,
                                    Object offendingSymbol, 
                                    int line, int charPositionInLine,
                                    String msg, RecognitionException e) {
                 return;
            }
        });
        parser.reportErrorsAsExceptions();
        
        final ParseTree tree = parser.abcTune();
        
        final AbcTuneListener listener = new AbcTuneListener();
        
        new ParseTreeWalker().walk(listener, tree);

        return listener;
    }
    
    @Test
    public void testHeaderFields() {
        final Tune tune = walkString("X:1573202\n"
                + "T:Bananas\n"
                + "C:Potassium Sandwich\n"
                + "M:4/4\n"
                +"L:1/4\n"
                + "Q:1/4=200\n"
                + "K:Am\n"
                + "z\n").getParsedTune();
        
        assertEquals(1573202, tune.getNumber());
        assertEquals("Bananas", tune.getTitle());
        assertEquals("Potassium Sandwich", tune.getComposer());
        assertEquals(new Fraction(4, 4), tune.getMeter());
        assertEquals(new Fraction(1, 4), tune.getDefaultLength());
        assertEquals(200, tune.getTempo());
        assertEquals("Am", tune.getKey());
    }
    
    @Test
    public void testHeaderFieldDefaults() {
                final Tune tune = walkString("X:36\n"
                + "T:what??????\n"
                + "K:C#\n"
                + "z\n").getParsedTune();
        
        assertEquals(36, tune.getNumber());
        assertEquals("what??????", tune.getTitle());
        assertEquals("", tune.getComposer());
        assertEquals(new Fraction(4, 4), tune.getMeter());
        assertEquals(new Fraction(1, 8), tune.getDefaultLength());
        assertEquals(100, tune.getTempo());
        assertEquals("C#", tune.getKey());
    }
    
    // Test that we can load all the sample files.
    /**
     * @category no_didit
     */
    @Test
    public void testWalksAllSamples() throws IOException {
        final File sampleDir = new File("sample_abc/");
        final File[] abcFiles = sampleDir.listFiles((file) -> file.getName().endsWith(".abc"));

        for (File file : abcFiles) {
            try {
                final CharStream stream = new ANTLRFileStream(file.getAbsolutePath());
                AbcLexer lexer = new AbcLexer(stream);
                lexer.reportErrorsAsExceptions();

                AbcParser parser = new AbcParser(new CommonTokenStream(lexer));
                parser.addErrorListener(new BaseErrorListener() {
                    public void syntaxError(Recognizer<?, ?> recognizer, Object offendingSymbol, int line,
                            int charPositionInLine, String msg, RecognitionException e) {
                        return;
                    }
                });
                parser.reportErrorsAsExceptions();

                final ParseTree tree = parser.abcTune();
                
                final AbcTuneListener listener = new AbcTuneListener();
                
                // This will throw an exception if it fails
                new ParseTreeWalker().walk(listener, tree);
            } catch (Exception e) {
                System.err.println(file);
                throw e;
            }
        }
    }
}
