package abc.sound;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import abc.player.Fraction;
import abc.player.Playable;
import abc.player.playable.*;

public class ConcatTest {
    
    // Test strategy:
    //
    // --------getLength--------
    // Input: Single input, multiple inputs
    //        Rest, Note, Nested Concats
    //
    // --------ticksPerBeat--------
    // Input: Single input, multiple inputs, inputs with un-reduced lengths
    // Output: 1, equal to some denominator value, equal to no denominator values
    
    @Test
    public void testGetLengthSingleElement(){
        //Test single note
        List<Playable> concatList = new ArrayList<Playable>();
        concatList.add(new Note(Pitch.MIDDLE_C,new Fraction(1,4)));
        Concat concat = new Concat(concatList);
        assertEquals(new Fraction(1,4),concat.getLength());
        
        //Test single rest
        concatList = new ArrayList<Playable>();
        concatList.add(new Rest(new Fraction(1,4)));
        concat = new Concat(concatList);
        assertEquals(new Fraction(1,4),concat.getLength());
    }
    
    @Test
    public void testGetLengthMultipleElements(){
        //Test two notes separated by a two rests
        List<Playable> concatList = new ArrayList<Playable>();
        concatList.add(new Note(Pitch.MIDDLE_C,new Fraction(1,8)));
        concatList.add(new Rest(new Fraction(1,4)));
        concatList.add(new Rest(new Fraction(1,4)));
        concatList.add(new Note(Pitch.MIDDLE_C,new Fraction(1,8)));
        Concat concat = new Concat(concatList);
        assertEquals(new Fraction(3,4),concat.getLength().reduce());
    }
    
    @Test
    public void testGetLengthNestedConcats(){
        //Test two concatenated concats, each containing a note and a rest
        List<Playable> concatList = new ArrayList<Playable>();
        concatList.add(new Note(Pitch.MIDDLE_C,new Fraction(1,8)));
        concatList.add(new Rest(new Fraction(1,8)));
        Concat subConcat1 = new Concat(concatList);
        Concat subConcat2 = new Concat(concatList);
        concatList = new ArrayList<Playable>();
        concatList.add(subConcat1);
        concatList.add(subConcat2);
        Concat testConcat = new Concat(concatList);
        assertEquals(new Fraction(1,2),testConcat.getLength());
    }
    
    @Test
    public void testTicksPerBeatWholeNote(){
        //Test ticksPerBeat with a whole note, should be 1 tick
        List<Playable> concatList = new ArrayList<Playable>();
        concatList.add(new Note(Pitch.MIDDLE_C,new Fraction(1,1)));
        Concat concat = new Concat(concatList);
        assertEquals(1,concat.ticksPerBeat());
        
        //Should get the same result even when the whole note is defined with length 2/2
        concatList = new ArrayList<Playable>();
        concatList.add(new Note(Pitch.MIDDLE_C,new Fraction(2,2)));
        concat = new Concat(concatList);
        assertEquals(1,concat.ticksPerBeat());
    }
    
    @Test
    public void testTicksPerBeatMultipleElements(){
        //Test ticksPerBeat with a collection of all Playable implementations
        List<Playable> subConcatList = new ArrayList<Playable>();
        subConcatList.add(new Note(Pitch.MIDDLE_C,new Fraction(1,2)));
        subConcatList.add(new Rest(new Fraction(1,4)));
        subConcatList.add(new Note(Pitch.MIDDLE_C,new Fraction(1,4)));
        
        List<Note> multiNoteList = new ArrayList<Note>();
        multiNoteList.add(new Note(Pitch.MIDDLE_C.transpose(Pitch.OCTAVE),new Fraction(1,1)));
        multiNoteList.add(new Note(Pitch.MIDDLE_C,new Fraction(1,1)));
        
        List<Playable> concatList = new ArrayList<Playable>();
        concatList.add(new MultiNote(multiNoteList));
        concatList.add(new Concat(subConcatList));
        
        Concat concat = new Concat(concatList);
        assertEquals(4,concat.ticksPerBeat());
    }
    
    @Test
    public void testTicksPerBeatNonequalDenominator(){
        // Test ticksPerBeat with a list of notes and rests that necessitates finding their
        // least common multiple to calculate the ticks per beat.
        List<Playable> concatList = new ArrayList<Playable>();
        concatList.add(new Note(Pitch.MIDDLE_C,new Fraction(1,12)));
        concatList.add(new Rest(new Fraction(1,8)));
        concatList.add(new Note(Pitch.MIDDLE_C,new Fraction(1,8)));
        Concat concat = new Concat(concatList);
        assertEquals(24,concat.ticksPerBeat());
    }
}
