package abc.sound;

import static org.junit.Assert.fail;

import java.io.IOException;

import javax.sound.midi.InvalidMidiDataException;
import javax.sound.midi.MidiUnavailableException;

import org.junit.Test;

/**
 * @category no_didit
 */
public class SequencePlayerTest {
    
    @Test
    public void testPieceTwo() throws MidiUnavailableException,
            InvalidMidiDataException,
            InterruptedException {
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
        
        Thread.sleep(7000);
    }

    @Test
    public void testPlayPieceOne() throws MidiUnavailableException,
            InvalidMidiDataException,
            InterruptedException {
        int C = new Pitch('C').toMidiNote();
        int D = new Pitch('D').toMidiNote();
        int E = new Pitch('E').toMidiNote();
        int F = new Pitch('F').toMidiNote();
        int G = new Pitch('G').toMidiNote();
        int c = new Pitch('C').transpose(Pitch.OCTAVE).toMidiNote();
        
        final SequencePlayer player = new SequencePlayer(140, 12);

        // C
        player.addNote(C, 0, 12);
        // C
        player.addNote(C, 12, 12);
        // C3/4
        player.addNote(C, 24, 9);
        // D/4
        player.addNote(D, 33, 3);
        // E
        player.addNote(E, 36, 12);

        // E3/4
        player.addNote(E, 48, 9);
        // D/4
        player.addNote(D, 57, 3);
        // E3/4
        player.addNote(E, 60, 9);
        // F/4
        player.addNote(F, 69, 3);
        // G2
        player.addNote(G, 72, 24);

        // c1/2
        player.addNote(c, 96, 4);
        // c1/2
        player.addNote(c, 100, 4);
        // c1/2
        player.addNote(c, 104, 4);
        // G1/2
        player.addNote(G, 108, 4);
        // G1/2
        player.addNote(G, 112, 4);
        // G1/2
        player.addNote(G, 116, 4);
        // E1/2
        player.addNote(E, 120, 4);
        // E1/2
        player.addNote(E, 124, 4);
        // E1/2
        player.addNote(E, 128, 4);
        // C1/2
        player.addNote(C, 132, 4);
        // C1/2
        player.addNote(C, 136, 4);
        // C1/2
        player.addNote(C, 140, 4);
        
        // G3/4
        player.addNote(G, 144, 9);
        // F/4
        player.addNote(F, 153, 3);
        // E3/4
        player.addNote(E, 156, 9);
        // D/4
        player.addNote(D, 165, 3);
        // C2
        player.addNote(C, 168, 24);
        
        player.play();
        
        Thread.sleep(7000);
    }
}
