package abc.player.playable;

import java.util.List;

import abc.player.Fraction;
import abc.player.Playable;
import abc.sound.SequencePlayer;

public class Concat implements Playable {

    private final Playable[] subPlayables; //The playables to be played sequentially within this Concat
    
    /**
     * Create a new Concat 
     * @param subPlayables The playables to be played sequentially within this Concat. Must have more than one element.
     */
    public Concat(List<Playable> subPlayables){
        this.subPlayables = subPlayables.toArray(new Playable[0]);
        assert subPlayables.size() > 0;
    }
    
    @Override
    public Fraction getLength() {
        Fraction length = subPlayables[0].getLength();
        for(int i=1; i<subPlayables.length; i++){
            length = length.add(subPlayables[i].getLength());
        }
        return length;
    }

    @Override
    public void addToPlayer(SequencePlayer player, int ticksPerBeat, int startTick) throws IllegalArgumentException {
        // TODO Auto-generated method stub

    }

}
