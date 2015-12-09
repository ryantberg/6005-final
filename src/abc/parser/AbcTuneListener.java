package abc.parser;

import java.util.Deque;
import java.util.HashMap;
import java.util.HashSet;
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
	@Override public void exitField_number(final AbcParser.Field_numberContext ctx) {
	    assert !this.lastParsedNumberStack.isEmpty();
	    
	    this.trackNumber = this.lastParsedNumberStack.pop();
	}

	/**
	 * {@inheritDoc}
	 *
	 * Sets the title field.
	 */
	@Override public void exitField_title(final AbcParser.Field_titleContext ctx) {
	    this.title = ctx.TEXT().getText();
	}

	/**
	 * {@inheritDoc}
	 *
	 * Sets the composer field.
	 */
	@Override public void exitField_composer(final AbcParser.Field_composerContext ctx) {
	    this.composer = ctx.TEXT().getText();
	}

	/**
	 * {@inheritDoc}
	 *
	 * Sets the default length field.
	 */
	@Override public void exitField_default_length(final AbcParser.Field_default_lengthContext ctx) {
	    this.defaultLength = this.popFraction();
	}

	/**
	 * {@inheritDoc}
	 *
	 * Sets the meter field.
	 */
	@Override public void exitField_meter(final AbcParser.Field_meterContext ctx) {
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
	@Override public void exitField_tempo(final AbcParser.Field_tempoContext ctx) {
	    assert !this.lastParsedNumberStack.isEmpty();
	    
	    this.tempoBeat = this.popFraction();
	    this.tempoBeatsPerMinute = this.lastParsedNumberStack.pop();
	}

	/**
	 * {@inheritDoc}
	 *
	 * Parse a header beat into the lastParsedFraction.
	 */
	@Override public void exitHeader_beat(final AbcParser.Header_beatContext ctx) {
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
	@Override public void exitField_voice(AbcParser.Field_voiceContext ctx) {
	    this.voiceNames.add(ctx.TEXT().getText());
	}

	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitField_key(AbcParser.Field_keyContext ctx) {
	    this.key = ctx.KEY().getText();
	}

    /**
	 * {@inheritDoc}
	 * 
	 * Ensures that all fields have been set and prepares parser to parse music.
	 */
	@Override public void exitAbc_header(AbcParser.Abc_headerContext ctx) {
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
     * The threshold for resolving the default beat length.
     * If meter is below, default length is 1/16.
     * If meter is above, default length is 1/8.
     */
    private static final Double EIGHTH_SIXTEENTH_THRESHOLD = .75;

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

}
