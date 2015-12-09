package abc.player;

import java.io.IOException;
import java.math.BigInteger;
import java.util.HashMap;
import java.util.Map;

import javax.sound.midi.InvalidMidiDataException;
import javax.sound.midi.MidiUnavailableException;

import org.antlr.v4.runtime.ANTLRFileStream;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.BaseErrorListener;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.RecognitionException;
import org.antlr.v4.runtime.Recognizer;
import org.antlr.v4.runtime.misc.ParseCancellationException;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import abc.parser.AbcLexer;
import abc.parser.AbcParser;
import abc.parser.AbcTuneListener;
import abc.sound.SequencePlayer;

/**
 * A tune that can be played back by a MIDI player - essentially
 * a set of voices plus some metadata.
 */
public class Tune {
    private final int number;
    private final String title;
    private final String composer;
    private final String key;
    private final Fraction defaultLength;
    private final Fraction meter;
    private final int tempo;
    private final Map<String, Playable> voices;
    
    /**
     * Parse a tune from an abc file.
     * 
     * @param file the file to parse
     * @return the parsed tune
     * @throws IOException if the file cannot be read
     * @throws ParseCancellationException if the parse fails
     */
    public static Tune fromFile(final String file) throws IOException, ParseCancellationException {
        final CharStream stream = new ANTLRFileStream(file);
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
        
        return listener.getParsedTune();
    }

    /**
     * Parse a tune from an abc-formatted string.
     * 
     * @param abcTune the abc-formatted string
     * @return the parsed tune
     * @throws ParseCancellationException if the parse fails
     */
    public static Tune fromString(final String abcTune) throws ParseCancellationException {
        final CharStream stream = new ANTLRInputStream(abcTune);
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
        
        return listener.getParsedTune();
    }
    
    /**
     * Create a new Tune, with the given parameters.
     * 
     * @param number
     * @param title
     * @param composer
     * @param key
     * @param defaultLength
     * @param meter
     * @param tempo
     * @param voices
     */
    public Tune(int number, String title, String composer, String key,
            Fraction defaultLength, Fraction meter, int tempo,
            Map<String, Playable> voices) {
        this.number = number;
        this.title = title;
        this.composer = composer;
        this.key = key;
        this.defaultLength = defaultLength;
        this.meter = meter;
        this.tempo = tempo;
        this.voices = new HashMap<>(voices);
    }
    
    /**
     * @return the index number of the tune
     */
    public int getNumber(){
        return number;
    }
    
    /**
     * @return the title of the tune
     */
    public String getTitle(){
        return title;
    }
    
    /**
     * @return the composer of the tune
     */
    public String getComposer(){
        return composer;
    }
    
    /**
     * @return the key in which the tune is to be played
     */
    public String getKey(){
        return key;
    }
    
    /**
     * @return the default duration of a note
     */
    public Fraction getDefaultLength(){
        return defaultLength;
    }
    
    /**
     * @return the meter of the tune
     */
    public Fraction getMeter(){
        return meter;
    }
    
    /**
     * @return how many notes of length getDefaultLength()
     * should be played per minute
     */
    public int getTempo(){
        return tempo;
    }
    
    /**
     * @return a map from each voice's identifier to the piece
     * of music played by that voice
     */
    public Map<String, Playable> getVoices(){
        return new HashMap<>(voices);
    }
    
    /**
     * Play the Tune
     */
    public void play(){
        try {
            int ticksPerBeat = 1;
            double tuneDuration = 0;//tune duration in beats
            
            for(Playable voice : getVoices().values()){
                tuneDuration = Math.max(tuneDuration, voice.getLength().valueOf());
                //Ticks per beat is least common multiple of all ticks per beat
                int voiceTicks = voice.ticksPerBeat();
                ticksPerBeat = (voiceTicks*ticksPerBeat)/
                        BigInteger.valueOf(voiceTicks).gcd(BigInteger.valueOf(ticksPerBeat)).intValue();
            }
            
            //Create a new sequence player
            SequencePlayer player = new SequencePlayer(getTempo(), ticksPerBeat);
            
            for(Playable voice : getVoices().values()){
                voice.addToPlayer(player, ticksPerBeat, 0);
            }
            
            player.play();
            
            int tuneMilliseconds = (int)(60000*tuneDuration/(getTempo()));
            Thread.sleep(tuneMilliseconds+1000);
            
        } catch (MidiUnavailableException | InvalidMidiDataException e) {
            System.out.println("Error initializing the MIDI player!");
            e.printStackTrace();
        } catch (InterruptedException e) {
            System.out.println("Tune interrupted!");
            e.printStackTrace();
        }
    }
}
