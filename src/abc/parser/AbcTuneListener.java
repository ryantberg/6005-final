package abc.parser;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Deque;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import abc.player.Fraction;
import abc.player.Playable;
import abc.player.Tune;
import abc.player.playable.Concat;
import abc.player.playable.MultiNote;
import abc.player.playable.Note;
import abc.player.playable.Rest;
import abc.sound.Pitch;

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
     * The numerator of note lengths without numerators.
     */
    private static final int DEFAULT_LENGTH_NUMERATOR = 1;

    /**
     * The numerator of note lengths without denominators.
     */
    private static final int DEFAULT_LENGTH_DENOMINATOR = 1;

    

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
     * The actual voices of the music.
     * Added to during music parsing as they are used.
     */
    private final Map<String, Playable> voices;

    /**
     * The voice currently being used.
     * Starts out being the default voice.
     */
    private String currentVoice;

    /**
     * Recently parsed notes; used when parsing chords
     * and notes.
     */
    private Deque<Note> noteQueue;

    /**
     * The current key note-mapping.
     * Modified when we encounter an accidental,
     * reset when we hit a barline.
     */
    private KeyMap keyMap;
    
    /**
     * The sequence of playables for the current major section.
     */
    private List<Playable> currentMajorSection;
    
    /**
     * If we are in a repeat section, this 
     */
    private List<Playable> startOfRepeatSection;
    
    
    /**
     * Construct an AbcTuneListener.
     */
    public AbcTuneListener() {
        this.voiceNames = new HashSet<>();
        this.voices = new HashMap<>();
        this.lastParsedNumberStack = new ArrayDeque<>();
        this.noteQueue = new ArrayDeque<>();
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
	    
	    if (this.meter == null) {
	        this.meter = METER_DEFAULT;
	    }
	    
	    if (this.defaultLength == null) {
	        this.defaultLength = resolveDefaultLength(this.meter);
	    }

	    if (this.tempoBeat == null) {
	        this.tempo = TEMPO_DEFAULT;
	    } else {
	        this.tempo = resolveTempo(this.defaultLength, this.tempoBeat, this.tempoBeatsPerMinute);
	    }
	}
	
	// Music parsing.
	
	@Override public void enterAbcMusic(AbcParser.AbcMusicContext ctx) {
	    // Note: this should happen immediately after exitAbcHeader.
	    // Start parsing the music!

	    // Add default voice 
	    final String defaultVoice = resolveDefaultVoice(this.voiceNames);
	    
	    this.voiceNames.add(defaultVoice);
	    
	    // Set current voice to default voice
	    this.currentVoice = defaultVoice;
	    
	    // Set up the key
	    resetKey();
	    
	    // Start a major section
	    startMajorSection();
	}
	
	@Override public void exitAbcMusic(AbcParser.AbcMusicContext ctx) {
	    endMajorSection();
	    
	    // We're done parsing!
	    
	    this.result = new Tune(
	            this.trackNumber,
	            this.title,
	            this.composer,
	            this.key,
	            this.defaultLength,
	            this.meter,
	            this.tempo,
	            this.voices
	    );
	}
	
	// A note: we deal with repeats in a slightly hacky way.
	// If we encounter a :| with no [1s or [2s since the end of the previous
	// major section, we just double the current major section.
	// So: A A || A A A :| is parsed into sections as:
	//     A A)  (A A A :|
	// And then expanded to:
	//     A A)  (A A A A A A) (
	//
	// If we encounter a [1, we move the current major section into the variable
	// this.startOfRepeatSection, and start parsing a new major section.
	// When we encounter :|, we flatten the sections into a single list:
	//     startOfRepeatSection currentMajorSection startOfRepeatSection
	// Which we move into currentMajorSection and continue onwards.
	// Now, when we encounter a [2, we can just add it at the end of
	// currentMajorSection and continue onwards; we've already added the repeated
	// part.
	
	@Override public void exitNthRepeat(AbcParser.NthRepeatContext ctx) {
	    if (ctx.getText() == "[1") {
	        assert this.startOfRepeatSection == null;
	        this.startOfRepeatSection = this.currentMajorSection;
	        this.currentMajorSection = new ArrayList<>();
	    }
	}
	
	@Override public void exitBarline(AbcParser.BarlineContext ctx) {
	    // Always reset the key.
	    resetKey();
	    
	    switch (ctx.getText()) {
	    case "||": 
	    case "[|":
	    case "|]":
	    case "|:":
	        // Note that we don't handle repeat-starts specially.
	        endMajorSection();
	        startMajorSection();
	        break;
	    case ":|":
            List<Playable> flatSection = new ArrayList<>();

	        if (this.startOfRepeatSection != null) {
	            // Complex repeat; flatten.
	            flatSection.addAll(this.startOfRepeatSection);
	            flatSection.addAll(this.currentMajorSection);
	            flatSection.addAll(this.startOfRepeatSection);
	            this.startOfRepeatSection = null;
	        } else {
	            // Simple repeat; duplicate current major section.
	            flatSection.addAll(this.currentMajorSection);
	            flatSection.addAll(this.currentMajorSection);
	        }
	        this.currentMajorSection = flatSection;
	        endMajorSection();
	        startMajorSection();
	        break;
	    case "|":
	        break;
	    default:
	        throw new RuntimeException("Impossible barline: "+ctx.getText());
	    }
	}

	@Override public void exitVoiceChange(AbcParser.VoiceChangeContext ctx) {
	    endMajorSection();

	    final String newVoice = ctx.TEXT().getText();
	    
	    assert this.voiceNames.contains(newVoice);
	    
	    this.currentVoice = newVoice;
	    
	    resetKey();
	    
	    startMajorSection();
	}

	@Override public void exitNoteElement(AbcParser.NoteElementContext ctx) {
	    // Is this a note or a chord?
	    if (ctx.note() != null) {
	        // It's a note!
	        // Well, it could also be a rest, in which case we'll already have
	        // added it and the note queue will be empty:
	        if (!this.noteQueue.isEmpty()) {
                this.currentMajorSection.add(this.noteQueue.removeFirst());
	        }
	    } else {
	        // It's a chord!
	        // The first note read should be the first note in the MultiNote;
	        // i.e. we should preserve the order of the note queue.
	        MultiNote chord = new MultiNote(new ArrayList<>(this.noteQueue));
	       
	        // Remove all of the elements from the note queue.
	        this.noteQueue.clear();
	        
	        this.currentMajorSection.add(chord);
	    }
	}
	
	@Override public void exitNote(AbcParser.NoteContext ctx) {
	    final Fraction length;
	    if (ctx.noteLength() != null) {
	        AbcParser.NoteLengthContext nl = ctx.noteLength();
	        if (nl.slash() != null) {
	            final int numerator;
	            if (nl.number(0) != null) {
	                numerator = Integer.parseInt(nl.number(0).getText());
	            } else {
	                numerator = DEFAULT_LENGTH_NUMERATOR;
	            }
	            final int denominator;
	            if (nl.number(1) != null) {
	                denominator = Integer.parseInt(nl.number(1).getText());
	            } else {
	                denominator = DEFAULT_LENGTH_DENOMINATOR;
	            }
	            length = new Fraction(numerator, denominator);
	        } else {
	            length = new Fraction(
	                    Integer.parseInt(nl.number(0).getText()),
	                    DEFAULT_LENGTH_DENOMINATOR
	            );
	        }
	    } else {
	        length = new Fraction(DEFAULT_LENGTH_NUMERATOR, DEFAULT_LENGTH_DENOMINATOR);
	    }
	    
	    AbcParser.NoteOrRestContext nr = ctx.noteOrRest();
	    if (nr.REST() != null) {
	        // If this is a rest, we can't be in a chord, so just put it
	        // directly in the current section
	        this.currentMajorSection.add(new Rest(length));
	        return;
	    }

        // It's a note!
        AbcParser.PitchContext p = nr.pitch();

        final char letterNote = p.LETTER_NOTE().getText().charAt(0);

        final Pitch basePitch = new Pitch(Character.toUpperCase(letterNote));

        // We modify our key map for the rest of the bar.
        if (p.ACCIDENTAL() != null) {
            switch (p.ACCIDENTAL().getText()) {
            case "__":
                this.keyMap.setOffset(basePitch, KeyMap.DOUBLE_FLAT_OFFSET);
            case "_":
                this.keyMap.setOffset(basePitch, KeyMap.FLAT_OFFSET);
            case "=":
                this.keyMap.setOffset(basePitch, KeyMap.NEUTRAL_OFFSET);
            case "^":
                this.keyMap.setOffset(basePitch, KeyMap.SHARP_OFFSET);
            case "^^":
                this.keyMap.setOffset(basePitch, KeyMap.DOUBLE_SHARP_OFFSET);
            default:
                throw new RuntimeException("Impossible accidental: " + p.ACCIDENTAL().getText());
            }
        }

        final Pitch keyPitch = this.keyMap.forPitch(basePitch);

        int octavesUp = 0;

        if (Character.isLowerCase(letterNote)) {
            octavesUp++;
        }

        if (p.OCTAVE() != null) {
            for (final char c : p.OCTAVE().getText().toCharArray()) {
                if (c == '\'') {
                    octavesUp++;
                } else {
                    octavesUp--;
                }
            }
        }

        final Pitch resultPitch = keyPitch.transpose(Pitch.OCTAVE * octavesUp);

        this.noteQueue.push(new Note(resultPitch, length));
	}
	
	// Both header and music
	
	@Override public void exitNumber(AbcParser.NumberContext ctx) {
	    this.lastParsedNumberStack.push(Integer.parseInt(ctx.getText()));
	}

	// Helper methods.
	
	/**
	 * Reset the current key we're using.
	 */
	private void resetKey() {
	    this.keyMap = KeyMap.forKeyName(this.key);
	}
	
	/**
	 * Called whenever we start a major section in the music
	 * (at the start of the music, after a voice change, after a fancy bar)
	 */
	private void startMajorSection() {
	    this.currentMajorSection = new ArrayList<>();
	}
	
	/**
	 * Called when we finish a major section in the music.
	 */
	private void endMajorSection() {
	    Playable thisSection = new Concat(currentMajorSection);
	    
	    if (this.voices.containsKey(this.currentVoice)) {
	        // We've had a section with this voice before;
	        // append this line to the current playable for this voice
	        this.voices.put(
	                this.currentVoice,
	                new Concat(Arrays.asList(
	                        this.voices.get(this.currentVoice),
	                        thisSection
                    ))
	        );
	    } else {
	        // This is the first time we've had a line in this voice
	        this.voices.put(this.currentVoice, thisSection);
	    }
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
    protected static Fraction resolveDefaultLength(Fraction meter) {
        if (meter.valueOf() < EIGHTH_SIXTEENTH_THRESHOLD) {
            return new Fraction(1, 16);
        } else { // >=
            return new Fraction(1, 8);
        }
    }

    /**
     * Ensure that the default name is hygenic; that is to say, that it
     * doesn't overlap with a user-defined voice.
     * 
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
    
    protected static int resolveTempo(Fraction defaultLength, Fraction tempoBeat, int tempoBPM) {
        Fraction ratio = tempoBeat.divide(defaultLength);
        
        if (ratio.denominator() != 1) {
            throw new RuntimeException("Can't compute integer bpm: "
                        + tempoBeat + " / " + defaultLength
                        + " is not a whole number");
        }
        
        return ratio.numerator() * tempoBPM;
    }
}
