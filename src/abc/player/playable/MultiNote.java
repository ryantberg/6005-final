package abc.player.playable;

import java.math.BigInteger;
import java.util.Collections;
import java.util.List;

import abc.player.Fraction;
import abc.player.Playable;
import abc.sound.SequencePlayer;

public class MultiNote implements Playable {
    private final List<Note> notes;
    
    /**
     * Creates a new MultiNote
     * @param notes to include in this MultiNote
     */
    public MultiNote(List<Note> notes) {
        this.notes = Collections.unmodifiableList(notes);
    }
    
    @Override
    public Fraction getLength() {
        return notes.get(0).getLength();
    }

    @Override
    public int addToPlayer(SequencePlayer player, int ticksPerBeat, int startTick) throws IllegalArgumentException {
        for(Note note : notes) {
            note.addToPlayer(player, ticksPerBeat, startTick);
        }
        return getLength().numerator()*ticksPerBeat/getLength().denominator();
    }
    
    @Override
    public int ticksPerBeat(){
        //Return the least common multiple of all sub-notes
        int maxTicks = 1;
        for(Note note : notes){
            int noteMaxTicks = note.ticksPerBeat();
            maxTicks = (noteMaxTicks*maxTicks)/
                    BigInteger.valueOf(noteMaxTicks).gcd(BigInteger.valueOf(maxTicks)).intValue();
        }
        return maxTicks;
    }

}
