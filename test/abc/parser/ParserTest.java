package abc.parser;

import java.io.File;
import java.io.IOException;

import org.antlr.v4.runtime.ANTLRFileStream;
import org.antlr.v4.runtime.BaseErrorListener;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.RecognitionException;
import org.antlr.v4.runtime.Recognizer;
import org.junit.Test;

public class ParserTest {

    // Ensure that none of the sample_abc files fails to parse
    @Test
    public void testCanParseAllSamples() throws IOException {
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

                parser.abcTune();
            } catch (Exception e) {
                System.err.println(file);
                throw e;
            }
        }
    }

}
