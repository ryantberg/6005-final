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
    
    @Test
    public void testGetLengthSingleElement(){
        //Test single note
        List<Note> noteList = new ArrayList<Note>();
        noteList.add(new Note(0,new Fraction(1,4)));
        MultiNote multi = new MultiNote(noteList);
        assertEquals(new Fraction(1,4),multi.getLength());
    }
    
    @Test
    public void testGetLengthSameLength(){
        //Test multiple notes with the same length
        List<Note> noteList = new ArrayList<Note>();
        noteList.add(new Note(0,new Fraction(1,4)));
        noteList.add(new Note(0,new Fraction(1,4)));
        MultiNote multi = new MultiNote(noteList);
        assertEquals(new Fraction(1,4),multi.getLength());
    }
    
    @Test
    public void testGetLengthDifferentLengths(){
      //Test multiple notes with different lengths
        
      //First note longer
        List<Note> noteList = new ArrayList<Note>();
        noteList.add(new Note(0,new Fraction(1,4)));
        noteList.add(new Note(0,new Fraction(1,8)));
        MultiNote multi = new MultiNote(noteList);
        assertEquals(new Fraction(1,4),multi.getLength());
        
      //First note shorter
        noteList = new ArrayList<Note>();
        noteList.add(new Note(0,new Fraction(1,8)));
        noteList.add(new Note(0,new Fraction(1,4)));
        multi = new MultiNote(noteList);
        assertEquals(new Fraction(1,8),multi.getLength());
    }

}
