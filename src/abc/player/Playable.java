package abc.player;

import abc.sound.SequencePlayer;

/**
 * Represents a musical entity that can be played.
 */
public interface Playable {

    /**
     * @return the length of this Playable, as a fraction of a beat.
     */
    Fraction getLength();
    
    /**
     * Add this Playable to a sequence player.
     * 
     * @param player the player to be added to
     * @param ticksPerBeat the ticks of the player in a single beat;
     *      must be divisible by the denominator of getLength()
     * @param startTick the tick to start playing this playable on
     * @throws IllegalArgumentException if ticksPerBeat is invalid
     */
    void addToPlayer(SequencePlayer player, int ticksPerBeat, int startTick)
            throws IllegalArgumentException;
}
