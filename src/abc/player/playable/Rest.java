package abc.player.playable;

import abc.player.Fraction;
import abc.player.Playable;
import abc.sound.SequencePlayer;

public class Rest implements Playable {
    private final Fraction duration;
    
    /**
     * Construct a new Rest
     * @param duration of the rest
     */
    public Rest(Fraction duration) {
        this.duration = duration;
    }
    
    @Override
    public Fraction getLength() {
        return duration;
    }

    @Override
    public int addToPlayer(SequencePlayer player, int ticksPerBeat, int startTick) throws IllegalArgumentException {
        return ticksPerBeat*duration.numerator()/duration.denominator();
    }
    
    @Override
    public int ticksPerBeat(){
        return getLength().reduce().denominator();
    }
}
