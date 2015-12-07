package abc.sound;

import static org.junit.Assert.*;
import org.junit.Test;

import abc.player.Fraction;
import abc.player.playable.Note;
import abc.player.playable.Rest;

public class RestTest {
    
    // Test strategy:
    //
    // --------getLength--------
    // Input: Rest of any length
    // Output: Length of that Rest
    //
    // --------ticksPerBeat--------
    // Input: Reduced, unreduced
    
    @Test
    public void testGetLength(){
        Rest testRest = new Rest(new Fraction(1,4));
        assertEquals(new Fraction(1,4),testRest.getLength());
        
        testRest = new Rest(new Fraction(2,1));
        assertEquals(new Fraction(2,1),testRest.getLength());
    }
    
    @Test
    public void testTicksPerBeat(){
        Rest testRest = new Rest(new Fraction(1,4));
        assertEquals(4, testRest.ticksPerBeat());
        
        testRest = new Rest(new Fraction(2,8));
        assertEquals(4, testRest.ticksPerBeat());
    }
    
}
