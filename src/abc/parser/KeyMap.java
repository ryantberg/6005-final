package abc.parser;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

import abc.sound.Pitch;

/**
 * Mutable ADT.
 * Represents the mapping of notes in a musical key, possibly with extra accidentals added.
 * Used to map in-key notes to key-C notes during parsing.
 * Note that this class does not distinguish between major and minor keys,
 * or between enharmonic keys; it is only able to map notes.
 */
public class KeyMap {
    public static final int DOUBLE_FLAT_OFFSET = -2;
    public static final int FLAT_OFFSET = -1;
    public static final int NEUTRAL_OFFSET = 0;
    public static final int SHARP_OFFSET = 1;
    public static final int DOUBLE_SHARP_OFFSET = 2;

    /**
     * The map from pitches to pitch-offsets used with this key.
     * All pitches have values in the range 0-11 inclusive;
     * that is to say, middle C to the above F.
     * No pitch offset is 0; no offset is represented by absence
     * from the map.
     */
    private final Map<Pitch, Integer> pitchOffsets;
    
    // Safety from Rep Exposure:
    //  Makes defensive copy of input map,
    //  observer methods only return individual immutable Pitches

    /**
     * Create a new KeyMap.
     * 
     * @param pitchOffsets the offsets to use
     */
    public KeyMap(Map<Pitch, Integer> pitchOffsets) {
        this.pitchOffsets = new HashMap<>(pitchOffsets);
    }
    
    /**
     * Create a new KeyMap from a list of sharps and flats.
     * 
     * @param sharps a string list of sharped pitches; must be capital letters.
     * @param flats a string list of flatted pitches; must be capital letters.
     */
    public KeyMap(String sharps, String flats) {
        this.pitchOffsets = new HashMap<>();
        for (char sharp : sharps.toCharArray()) {
            this.pitchOffsets.put(new Pitch(sharp), SHARP_OFFSET);
        }
        for (char flat : flats.toCharArray()) {
            this.pitchOffsets.put(new Pitch(flat), FLAT_OFFSET);
        }
    }
    
    /**
     * Copy constructor.
     * 
     * @param other KeyMap to copy
     */
    public KeyMap(KeyMap other) {
        this(other.pitchOffsets);
    }
    
    /**
     * Look up the value of a note in this key.
     * 
     * @param input the pitch to (maybe) offset
     * @return the value of the pitch in this key
     */
    public Pitch forPitch(Pitch input) {
        // We can't just look up the key pitch in the pitch offsets, since there are many
        // 'C's, but we only want to store one in our set
        for (Pitch keyPitch : this.pitchOffsets.keySet()) {
            if (Math.abs(keyPitch.difference(input)) % Pitch.OCTAVE == 0) {
                // the input is the same note as keyPitch;
                // return it offsetted.
                return new Pitch(input.getValue() + this.pitchOffsets.get(keyPitch));
            }
        }

        // The input pitch isn't any of our notes; ignore it
        return input;
    }
    
    /**
     * Set the offset for the given Pitch in this keyMap.
     * 
     * @param pitch the pitch to offset
     * @param offset the new offset of the pitch
     */
    public void setOffset(final Pitch pitch, final int offset) {
        if (offset == 0) {
            if (this.pitchOffsets.containsKey(pitch)) {
                this.pitchOffsets.remove(pitch);
            }
        } else {
            // Normalize pitch to correct range (0 - 11)
            final Pitch normalizedPitch = new Pitch(pitch.difference(Pitch.MIDDLE_C));
            // Store pitch
            this.pitchOffsets.put(normalizedPitch, offset);
        }
    }

    private static final Map<String, KeyMap> standardKeys = new HashMap<>();
    static {
        // Majors
        standardKeys.put("Cb", new KeyMap("", "BEADGCF"));
        standardKeys.put("Gb", new KeyMap("", "BEADGC"));
        standardKeys.put("Db", new KeyMap("", "BEADG"));
        standardKeys.put("Ab", new KeyMap("", "BEAD"));
        standardKeys.put("Eb", new KeyMap("", "BEA"));
        standardKeys.put("Bb", new KeyMap("", "BE"));
        standardKeys.put("F", new KeyMap("", "B"));
        standardKeys.put("C", new KeyMap("", ""));
        standardKeys.put("G", new KeyMap("F", ""));
        standardKeys.put("D", new KeyMap("FC", ""));
        standardKeys.put("A", new KeyMap("FCG", ""));
        standardKeys.put("E", new KeyMap("FCGD", ""));
        standardKeys.put("B", new KeyMap("FCGDA", ""));
        standardKeys.put("F#", new KeyMap("FCGDAE", ""));
        standardKeys.put("C#", new KeyMap("FCGDAEB", ""));

        // Minors
        standardKeys.put("Ebm", new KeyMap("", "BEADGC"));
        standardKeys.put("Bm", new KeyMap("", "BEADG"));
        standardKeys.put("Fm", new KeyMap("", "BEAD"));
        standardKeys.put("Cm", new KeyMap("", "BEA"));
        standardKeys.put("Gm", new KeyMap("", "BE"));
        standardKeys.put("Dm", new KeyMap("", "B"));
        standardKeys.put("Am", new KeyMap("", ""));
        standardKeys.put("Em", new KeyMap("F", ""));
        standardKeys.put("Bm", new KeyMap("FC", ""));
        standardKeys.put("F#m", new KeyMap("FCG", ""));
        standardKeys.put("C#m", new KeyMap("FCGD", ""));
        standardKeys.put("G#m", new KeyMap("FCGDA", ""));
        standardKeys.put("D#m", new KeyMap("FCGDAE", ""));
    }

    /**
     * Look up a key with the given name.
     */
    public static KeyMap forKeyName(String name) {
        assert standardKeys.keySet().contains(name);

        return standardKeys.get(name);
    }
    
    public String toString() {
        return this.pitchOffsets.toString();
    }
}
