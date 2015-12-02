package abc.sound;

import static org.junit.Assert.*;
import org.junit.Test;

import abc.player.Fraction;
import abc.player.playable.Note;

public class NoteTest {
    
    // Test strategy:
    //
    // --------getLength--------
    // Input: Note of any length
    // Output: Length of that note
    
    @Test
    public void testGetLength(){
        Note testNote = new Note(0,new Fraction(1,4));
        assertEquals(new Fraction(1,4),testNote.getLength());
        
        testNote = new Note(0,new Fraction(2,1));
        assertEquals(new Fraction(2,1),testNote.getLength());
    }
    
}
