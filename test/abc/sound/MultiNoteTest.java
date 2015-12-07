package abc.sound;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import abc.player.Fraction;
import abc.player.Playable;
import abc.player.playable.Concat;
import abc.player.playable.MultiNote;
import abc.player.playable.Note;
import abc.player.playable.Rest;

public class MultiNoteTest {
    
    // Test strategy:
    //
    // --------getLength--------
    // Input: Single input, inputs of same length, inputs of different lengths
    //
    // --------ticksPerBeat--------
    // Input: Single input, multiple inputs, inputs with un-reduced lengths
    // Output: 1, equal to some denominator value, equal to no denominator values    
    
    @Test
    public void testGetLengthSingleElement(){
        //Test single note
        List<Note> noteList = new ArrayList<Note>();
        noteList.add(new Note(Pitch.MIDDLE_C,new Fraction(1,4)));
        MultiNote multi = new MultiNote(noteList);
        assertEquals(new Fraction(1,4),multi.getLength());
    }
    
    @Test
    public void testGetLengthSameLength(){
        //Test multiple notes with the same length
        List<Note> noteList = new ArrayList<Note>();
        noteList.add(new Note(Pitch.MIDDLE_C,new Fraction(1,4)));
        noteList.add(new Note(Pitch.MIDDLE_C,new Fraction(1,4)));
        MultiNote multi = new MultiNote(noteList);
        assertEquals(new Fraction(1,4),multi.getLength());
    }
    
    @Test
    public void testGetLengthDifferentLengths(){
      //Test multiple notes with different lengths
        
      //First note longer
        List<Note> noteList = new ArrayList<Note>();
        noteList.add(new Note(Pitch.MIDDLE_C,new Fraction(1,4)));
        noteList.add(new Note(Pitch.MIDDLE_C,new Fraction(1,8)));
        MultiNote multi = new MultiNote(noteList);
        assertEquals(new Fraction(1,4),multi.getLength());
        
      //First note shorter
        noteList = new ArrayList<Note>();
        noteList.add(new Note(Pitch.MIDDLE_C,new Fraction(1,8)));
        noteList.add(new Note(Pitch.MIDDLE_C,new Fraction(1,4)));
        multi = new MultiNote(noteList);
        assertEquals(new Fraction(1,8),multi.getLength());
    }
    
    @Test
    public void testTicksPerBeatWholeNote(){
        //Test ticksPerBeat with a whole note, should be 1 tick
        List<Note> noteList = new ArrayList<>();
        noteList.add(new Note(Pitch.MIDDLE_C,new Fraction(1,1)));
        MultiNote multiNote = new MultiNote(noteList);
        assertEquals(1,multiNote.ticksPerBeat());
        
        //Should get the same result even when the whole note is defined with length 2/2
        noteList = new ArrayList<>();
        noteList.add(new Note(Pitch.MIDDLE_C,new Fraction(2,2)));
        multiNote = new MultiNote(noteList);
        assertEquals(1,multiNote.ticksPerBeat());
    }
    
    @Test
    public void testTicksPerBeatMultipleElements(){
        //Test ticksPerBeat with a collection of notes
        List<Note> noteList = new ArrayList<Note>();
        noteList.add(new Note(Pitch.MIDDLE_C.transpose(Pitch.OCTAVE),new Fraction(1,4)));
        noteList.add(new Note(Pitch.MIDDLE_C,new Fraction(1,2)));
        
        MultiNote multiNote = new MultiNote(noteList);
        assertEquals(4,multiNote.ticksPerBeat());
    }
    
    @Test
    public void testTicksPerBeatNonequalDenominator(){
        // Test ticksPerBeat with a list of notes that necessitates finding their
        // least common multiple to calculate the ticks per beat.
        List<Note> noteList = new ArrayList<>();
        noteList.add(new Note(Pitch.MIDDLE_C,new Fraction(1,12)));
        noteList.add(new Note(Pitch.MIDDLE_C,new Fraction(1,8)));
        MultiNote multiNote = new MultiNote(noteList);
        assertEquals(24,multiNote.ticksPerBeat());
    }

}
