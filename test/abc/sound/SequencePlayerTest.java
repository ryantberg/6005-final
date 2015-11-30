package abc.sound;

import static org.junit.Assert.fail;

import java.io.IOException;

import javax.sound.midi.InvalidMidiDataException;
import javax.sound.midi.MidiUnavailableException;

import org.junit.Test;

public class SequencePlayerTest {

    // TODO: warmup #2
    
    @Test
    public void test() {
        
        fail("Not yet implemented");
    }
    
    @Test
    public void testPiece2() throws MidiUnavailableException, InvalidMidiDataException, IOException {
        SequencePlayer player = new SequencePlayer(200, 12);

        //MEASURE 1
        player.addNote(new Pitch('E').transpose(Pitch.OCTAVE).toMidiNote(), 0, 6);
        player.addNote(new Pitch('F').transpose(1).toMidiNote(), 0, 6);

        player.addNote(new Pitch('E').transpose(Pitch.OCTAVE).toMidiNote(), 6, 6);
        player.addNote(new Pitch('F').transpose(1).toMidiNote(), 6, 6);

        player.addNote(new Pitch('E').transpose(Pitch.OCTAVE).toMidiNote(), 18, 6);
        player.addNote(new Pitch('F').transpose(1).toMidiNote(), 18, 6);

        player.addNote(new Pitch('C').transpose(Pitch.OCTAVE).toMidiNote(), 30, 6);
        player.addNote(new Pitch('F').transpose(1).toMidiNote(), 30, 6);

        player.addNote(new Pitch('E').transpose(Pitch.OCTAVE).toMidiNote(), 36, 12);
        player.addNote(new Pitch('F').transpose(1).toMidiNote(), 36, 12);
        
        //MEASURE 2

        player.addNote(new Pitch('G').transpose(Pitch.OCTAVE).toMidiNote(), 48, 12);
        player.addNote(new Pitch('B').toMidiNote(), 48, 12);
        player.addNote(new Pitch('G').toMidiNote(), 48, 12);

        player.addNote(new Pitch('G').toMidiNote(), 72, 12);

        //MEASURE 3
        player.addNote(new Pitch('C').transpose(Pitch.OCTAVE).toMidiNote(), 96, 18);
        
        player.addNote(new Pitch('G').toMidiNote(), 114, 6);
        
        player.addNote(new Pitch('E').toMidiNote(), 132, 12);
        
        //MEASURE 4
        player.addNote(new Pitch('E').toMidiNote(), 144, 6);
        
        player.addNote(new Pitch('A').toMidiNote(), 150, 12);

        player.addNote(new Pitch('B').toMidiNote(), 162, 12);

        player.addNote(new Pitch('B').transpose(-1).toMidiNote(), 174, 6);

        player.addNote(new Pitch('A').toMidiNote(), 180, 12);
        
        //MEASURE 5
        player.addNote(new Pitch('G').toMidiNote(), 192, 8);

        player.addNote(new Pitch('E').transpose(Pitch.OCTAVE).toMidiNote(), 200, 8);

        player.addNote(new Pitch('G').transpose(Pitch.OCTAVE).toMidiNote(), 208, 8);

        player.addNote(new Pitch('A').transpose(Pitch.OCTAVE).toMidiNote(), 216, 12);

        player.addNote(new Pitch('F').transpose(Pitch.OCTAVE).toMidiNote(), 228, 6);

        player.addNote(new Pitch('G').transpose(Pitch.OCTAVE).toMidiNote(), 234, 6);
        
        //MEASURE 6
        player.addNote(new Pitch('E').transpose(Pitch.OCTAVE).toMidiNote(), 246, 12);

        player.addNote(new Pitch('C').transpose(Pitch.OCTAVE).toMidiNote(), 258, 6);

        player.addNote(new Pitch('D').transpose(Pitch.OCTAVE).toMidiNote(), 264, 6);

        player.addNote(new Pitch('B').toMidiNote(), 270, 9);
        
        System.out.println(player);
        
        player.play();
        System.in.read();
    }
}
