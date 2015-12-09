package abc.parser;

import static org.junit.Assert.*;

import org.junit.Test;

import abc.sound.Pitch;

public class KeyMapTest {
    private final static Pitch[] pitches = new Pitch[] {
            new Pitch('A'),
            new Pitch('B'),
            new Pitch('C'),
            new Pitch('D'),
            new Pitch('E'),
            new Pitch('F'),
            new Pitch('G')
    };
    
    // Testing Strategy:
    //
    // --------forPitch--------
    // Input: C Major (every note is the same),
    //        keys with flats, keys with sharps,
    //        keys with varied modifiers.
    
    @Test
    public void testCorrectPitches() {
        final KeyMap c = KeyMap.forKeyName("C");
        
        for (int i = 0; i < 12; i++) {
            final Pitch pitch = new Pitch(i);
            
            assertEquals(pitch, c.forPitch(pitch));
        }

        final KeyMap cb = KeyMap.forKeyName("Cb");
        
        for (Pitch pitch : pitches) {
            assertEquals(pitch.transpose(KeyMap.FLAT_OFFSET), cb.forPitch(pitch));
        }
        
        final KeyMap cs = KeyMap.forKeyName("C#");
        
        for (Pitch pitch : pitches) {
            assertEquals(pitch.transpose(KeyMap.SHARP_OFFSET), cs.forPitch(pitch));
        }

        final KeyMap g = KeyMap.forKeyName("G");

        assertEquals(new Pitch('A'), g.forPitch(new Pitch('A')));
        assertEquals(new Pitch('B'), g.forPitch(new Pitch('B')));
        assertEquals(new Pitch('C'), g.forPitch(new Pitch('C')));
        assertEquals(new Pitch('D'), g.forPitch(new Pitch('D')));
        assertEquals(new Pitch('E'), g.forPitch(new Pitch('E')));
        assertEquals(new Pitch('F').transpose(KeyMap.SHARP_OFFSET),
                g.forPitch(new Pitch('F')));
        assertEquals(new Pitch('G'), g.forPitch(new Pitch('G')));
    }
}
