package abc.player.playable;

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
        Fraction max = notes.get(0).getLength();
        for(Note note : notes) {
            if( !max.greaterThanOrEqual( note.getLength() ) ) {
                max = note.getLength();
            }
        }
        return max;
    }

    @Override
    public void addToPlayer(SequencePlayer player, int ticksPerBeat, int startTick) throws IllegalArgumentException {
        for(Note note : notes) {
            note.addToPlayer(player, ticksPerBeat, startTick);
        }
    }

}
