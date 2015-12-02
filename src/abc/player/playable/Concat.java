package abc.player.playable;

import java.util.List;

import abc.player.Fraction;
import abc.player.Playable;
import abc.sound.SequencePlayer;

public class Concat implements Playable {

    private final Playable[] subPlayables; //The playables to be played sequentially within this Concat
    
    /**
     * Create a new Concat 
     * @param subPlayables The playables to be played sequentially within this Concat
     */
    public Concat(List<Playable> subPlayables){
        this.subPlayables = subPlayables.toArray(new Playable[0]);
    }
    
    @Override
    public Fraction getLength() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public void addToPlayer(SequencePlayer player, int ticksPerBeat, int startTick) throws IllegalArgumentException {
        // TODO Auto-generated method stub

    }

}
