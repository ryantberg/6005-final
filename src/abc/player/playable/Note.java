package abc.player.playable;

import abc.player.Fraction;
import abc.player.Playable;
import abc.sound.Pitch;
import abc.sound.SequencePlayer;

public class Note implements Playable {

    private final Pitch pitch; //The pitch of the note, in a format that can be fed directly to player.addNote
    private final Fraction length; //The length of the note, as a fraction of a beat
    
    /**
     * Create a new Note 
     * @param c a character corresponding to the note
     * @param length The length of the note, as a fraction of a beat
     */
    public Note(Pitch pitch, Fraction length){
        this.pitch = pitch;
        this.length = length;
    }
    
    @Override
    public Fraction getLength() {
        return length;
    }

    @Override
    public int addToPlayer(SequencePlayer player, int ticksPerBeat, int startTick) throws IllegalArgumentException {
        int noteDuration = ticksPerBeat * length.numerator() / length.denominator();
        player.addNote(pitch.toMidiNote(), startTick, noteDuration);
        
        
        return noteDuration;
    }

}