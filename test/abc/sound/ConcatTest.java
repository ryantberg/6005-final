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
    
    @Test
    public void testGetLengthSingleElement(){
        //Test single note
        List<Playable> concatList = new ArrayList<Playable>();
        concatList.add(new Note(0,new Fraction(1,4)));
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
        concatList.add(new Note(0,new Fraction(1,8)));
        concatList.add(new Rest(new Fraction(1,4)));
        concatList.add(new Rest(new Fraction(1,4)));
        concatList.add(new Note(0,new Fraction(1,8)));
        Concat concat = new Concat(concatList);
        assertEquals(new Fraction(3,4),concat.getLength().reduce());
    }
    
    @Test
    public void testGetLengthNestedConcats(){
        //Test two concatenated concats, each containing a note and a rest
        List<Playable> concatList = new ArrayList<Playable>();
        concatList.add(new Note(0,new Fraction(1,8)));
        concatList.add(new Rest(new Fraction(1,8)));
        Concat subConcat1 = new Concat(concatList);
        Concat subConcat2 = new Concat(concatList);
        concatList = new ArrayList<Playable>();
        concatList.add(subConcat1);
        concatList.add(subConcat2);
        Concat testConcat = new Concat(concatList);
        assertEquals(new Fraction(1,2),testConcat.getLength());
    }

}
