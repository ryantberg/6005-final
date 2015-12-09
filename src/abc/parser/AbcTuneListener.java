package abc.parser;

import java.util.Deque;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import abc.player.Fraction;
import abc.player.Playable;
import abc.player.Tune;

public class AbcTuneListener extends AbcParserBaseListener {
    /**
     * The default composer if none is given.
     */
    private static final String COMPOSER_DEFAULT = "";
    
    /**
     * The default meter if none is given.
     */
    private static final Fraction METER_DEFAULT = new Fraction(4, 4);
    
    /**
     * The time for the meter "C".
     */
    private static final Fraction COMMON_TIME = new Fraction(4, 4);
     
    /**
     * The time for the meter "C|".
     */
    private static final Fraction CUT_COMMON_TIME = new Fraction(2, 2);

    /**
     * The default tempo if none is given.
     */
    private static final int TEMPO_DEFAULT = 100;

    /**
     * The threshold for resolving the default beat length.
     * If meter is below, default length is 1/16.
     * If meter is above, default length is 1/8.
     */
    private static final Double EIGHTH_SIXTEENTH_THRESHOLD = .75;

    /**
     * The default name for the default voice.
     */
    private static final String DEFAULT_DEFAULT_VOICE_NAME = "default";
    
    /**
     * The result of the parse.
     * Set when the parse is finished.
     */
    private Tune result;
    
    // Header fields.
    /**
     * The number of the track.
     * Must be set during header parsing.
     * An integer to distinguish between "unset" and 0.
     */
    private Integer trackNumber;

    /**
     * The title of the track.
     * Must be set during header parsing.
     */
    private String title;
    
    /**
     * The key of the track.
     * Must be set during header parsing.
     */
    private String key;

    /**
     * The composer of the track.
     * Must be set during header parsing.
     */
    private String composer;
    
    /**
     * The meter of the track.
     * May be set during header parsing.
     * Otherwise, will be set at the end of header parsing.
     */
    private Fraction meter;

    /**
     * The tempo of the track.
     * Computed at the end of header parsing.
     */
    private Integer tempo;

    /**
     * The default beat length of the track.
     * May be set during header parsing.
     * If not set, computed using resolveDefaultLength.
     */
    private Fraction defaultLength;
    
    /**
     * The actual voices of the music.
     */
    private final Map<String, Playable> voices;
    
    // Used during parsing
    /**
     * A stack of recently parsed numbers.
     */
    private Deque<Integer> lastParsedNumberStack;

    /**
     * The names of the voices of the piece.
     * Used when we don't have anything to put in the voices
     * map.
     */
    private final Set<String> voiceNames;
   

    // Used during header parsing
    /**
     * The most recently parsed fraction.
     * Could be a stack, but there's only ever
     * one at a time.
     * Should be set to null after it's used.
     */
    private Fraction lastParsedFraction;

    /**
     * The tempo beat.
     */
    private Fraction tempoBeat;
    
    /**
     * The number of tempo beats per minute.
     */
    private int tempoBeatsPerMinute;
    
    // Used during music parsing
    /**
     * The sequence of playables for the current line.
     */
    private List<Playable> currentLine;

    /**
     * The voice currently being used.
     * Starts out being the default voice.
     */
    private String currentVoice;
    
    /**
     * Construct an AbcTuneListener.
     */
    public AbcTuneListener() {
        this.voiceNames = new HashSet<>();
        this.voices = new HashMap<>();
    }

    // Header parsing.
    
	/**
	 * {@inheritDoc}
	 *
	 * Sets the number field.
	 */
	@Override public void exitFieldNumber(final AbcParser.FieldNumberContext ctx) {
	    assert !this.lastParsedNumberStack.isEmpty();
	    
	    this.trackNumber = this.lastParsedNumberStack.pop();
	}

	/**
	 * {@inheritDoc}
	 *
	 * Sets the title field.
	 */
	@Override public void exitFieldTitle(final AbcParser.FieldTitleContext ctx) {
	    this.title = ctx.TEXT().getText();
	}

	/**
	 * {@inheritDoc}
	 *
	 * Sets the composer field.
	 */
	@Override public void exitFieldComposer(final AbcParser.FieldComposerContext ctx) {
	    this.composer = ctx.TEXT().getText();
	}

	/**
	 * {@inheritDoc}
	 *
	 * Sets the default length field.
	 */
	@Override public void exitFieldDefaultLength(final AbcParser.FieldDefaultLengthContext ctx) {
	    this.defaultLength = this.popFraction();
	}

	/**
	 * {@inheritDoc}
	 *
	 * Sets the meter field.
	 */
	@Override public void exitFieldMeter(final AbcParser.FieldMeterContext ctx) {
	    if (ctx.METER_SHORTHAND() != null) {
	        switch (ctx.METER_SHORTHAND().getText()) {
	        case "C":
	            this.meter = COMMON_TIME;
	            break;
	        case "C|":
	            this.meter = CUT_COMMON_TIME;
	            break;
	        default:
	            throw new RuntimeException("Impossible meter shorthand: "+ctx.METER_SHORTHAND().getText());
	        }
	    } else {
	        this.meter = this.popFraction();
	    }
	}

	/**
	 * {@inheritDoc}
	 *
	 * Sets the fields that will be used to compute the tempo at the end of header
	 * parsing.
	 */
	@Override public void exitFieldTempo(final AbcParser.FieldTempoContext ctx) {
	    assert !this.lastParsedNumberStack.isEmpty();
	    
	    this.tempoBeat = this.popFraction();
	    this.tempoBeatsPerMinute = this.lastParsedNumberStack.pop();
	}

	/**
	 * {@inheritDoc}
	 *
	 * Parse a header beat into the lastParsedFraction.
	 */
	@Override public void exitHeaderBeat(final AbcParser.HeaderBeatContext ctx) {
	    assert this.lastParsedFraction == null;
	    
	    final Integer denominator = this.lastParsedNumberStack.pop();
	    final Integer numerator = this.lastParsedNumberStack.pop();

	    this.lastParsedFraction = new Fraction(numerator, denominator);
	}
	
	/**
	 * {@inheritDoc}
	 * 
	 * Adds a voice to the set of voice names.
	 */
	@Override public void exitFieldVoice(AbcParser.FieldVoiceContext ctx) {
	    this.voiceNames.add(ctx.TEXT().getText());
	}

	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitFieldKey(AbcParser.FieldKeyContext ctx) {
	    this.key = ctx.KEY().getText();
	}

    /**
	 * {@inheritDoc}
	 * 
	 * Ensures that all fields have been set and prepares parser to parse music.
	 */
	@Override public void exitAbcHeader(AbcParser.AbcHeaderContext ctx) {
	    assert this.trackNumber != null;
	    assert this.title != null;
	    assert this.key != null;
	    
	    if (this.composer == null) {
	        this.composer = COMPOSER_DEFAULT;
	    }

	    if (this.tempo == null) {
	        this.tempo = TEMPO_DEFAULT;
	    }
	    
	    if (this.meter == null) {
	        this.meter = METER_DEFAULT;
	    }
	    
	    if (this.defaultLength == null) {
	        this.defaultLength = resolveDefaultLength(this.meter);
	    }
	    
	    // add default voice 
	    final String defaultVoice = resolveDefaultVoice(this.voiceNames);
	    
	    this.voiceNames.add(defaultVoice);
	    
	    // set current voice to default voice
	    this.currentVoice = defaultVoice;
	}
	
	@Override public void enterVoiceChange(AbcParser.VoiceChangeContext ctx) {
	    final String newVoice = ctx.TEXT().getText();
	    
	    assert this.voiceNames.contains(newVoice);
	    
	    this.currentVoice = newVoice;
	}
	

    /**
     * @return the parsed tune
     * @throws IllegalStateException if this listener has not yet listened 
     *         to an AbcParser
     */
    public Tune getParsedTune() throws IllegalStateException {
        if (result == null) {
            throw new IllegalStateException("Haven't parsed a tune");
        }
        
        return result;
    }
    
    /**
     * Get and unset the last parsed fraction.
     * 
     * @return the last parsed fraction
     */
    private Fraction popFraction() {
        assert this.lastParsedFraction != null;

        final Fraction result = this.lastParsedFraction;

        this.lastParsedFraction = null;

        return result;
    }

    /**
     * Compute the default defaultLength of a beat for a given meter.
     * 
     * @param meter the meter to resolve the defaultLength for.
     * @return the resolved defaultLength for the meter.
     */
    public static Fraction resolveDefaultLength(Fraction meter) {
        if (meter.valueOf() < EIGHTH_SIXTEENTH_THRESHOLD) {
            return new Fraction(1, 16);
        } else { // >=
            return new Fraction(1, 8);
        }
    }

    /**
     * Ensure that the default name is hygenic; that is to say, that it
     * doesn't overlap with a user-defined voice.
     * @param definedVoices voice names we have to avoid
     * @return a name for the default voice
     */
    protected static String resolveDefaultVoice(Set<String> definedVoices) {
        // if they haven't defined a name "default" (which they probably haven't),
        // use the name "default" for the default voice
        if (!definedVoices.contains(DEFAULT_DEFAULT_VOICE_NAME)) {
            return DEFAULT_DEFAULT_VOICE_NAME;
        }
        
        // try "default1", "default2", etc. until we find one they haven't used.
        // If they have defined INT_MAX/2 voices named "default1", "default2"...
        // then they're pathological.
        for (int i = 0; i > 0; i++) {
            String nextAttempt = DEFAULT_DEFAULT_VOICE_NAME + i;
            if (!definedVoices.contains(nextAttempt)) {
                return nextAttempt;
            }
        }
        
        throw new RuntimeException("Can't create a default voice name");
    }
}
