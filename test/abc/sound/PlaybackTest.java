package abc.sound;

import java.util.ArrayList;
import java.util.List;

import javax.sound.midi.InvalidMidiDataException;
import javax.sound.midi.MidiUnavailableException;

import org.junit.Test;

import abc.player.Fraction;
import abc.player.Playable;
import abc.player.playable.Concat;
import abc.player.playable.MultiNote;
import abc.player.playable.Note;
import abc.player.playable.Rest;

/**
 * Test to make sure the Playable's addToPlayer method works properly
 * @category no_didit 
 */
public class PlaybackTest {

    @Test
    public void testPlayback() throws MidiUnavailableException,
            InvalidMidiDataException,
            InterruptedException {
        
        //Construct a series of notes
        List<Note> chord = new ArrayList<>();
        chord.add(new Note(new Pitch('C').transpose(Pitch.OCTAVE),new Fraction(1,2)));
        chord.add(new Note(new Pitch('G'),new Fraction(1,4)));
        chord.add(new Note(new Pitch('C'),new Fraction(1,1)));
        
        List<Playable> concatList = new ArrayList<>();
        concatList.add(new Rest(new Fraction(1,1)));
        concatList.add(new MultiNote(chord));
        concatList.add(new Note(new Pitch('G').transpose(Pitch.OCTAVE),new Fraction(1,2)));
        concatList.add(new Note(new Pitch('C').transpose(Pitch.OCTAVE),new Fraction(1,1)));
        
        for(Playable p : concatList){
            System.out.println(p.getLength());
        }
        
        Concat masterConcat = new Concat(concatList);
        
        SequencePlayer player = new SequencePlayer(120, 8);
        System.out.println(masterConcat.getLength());
        masterConcat.addToPlayer(player, 8, 0);
        player.play();
        
        Thread.sleep(7000);
        
    }
    
}
