package abc.player.playable;

import abc.player.Fraction;
import abc.player.Playable;
import abc.sound.SequencePlayer;

public class Note implements Playable {

    private final int pitch; //The pitch of the note, in a format that can be fed directly to player.addNote
    private final Fraction length; //The length of the note, as a fraction of a beat
    
    /**
     * Create a new Note 
     * @param pitch The pitch of the note, in a format that can be fed directly to player.addNote 
     * @param length The length of the note, as a fraction of a beat
     */
    public Note(int pitch, Fraction length){
        this.pitch = pitch;
        this.length = length;
    }
    
    @Override
    public Fraction getLength() {
        return length;
    }

    @Override
    public void addToPlayer(SequencePlayer player, int ticksPerBeat, int startTick) throws IllegalArgumentException {
        // TODO Auto-generated method stub

    }

}
