package abc.player;

import java.io.File;
import java.math.BigInteger;
import java.util.Map;

import javax.sound.midi.InvalidMidiDataException;
import javax.sound.midi.MidiUnavailableException;

import abc.sound.SequencePlayer;

/**
 * A tune that can be played back by a MIDI player - essentially
 * a set of voices plus some metadata.
 */
public class Tune {
    
    /**
     * Create a new tune from a file in abc format
     */
    public Tune(File file){
        
    }
    
    /**
     * @return the index number of the tune
     */
    public int getNumber(){
       throw new RuntimeException();
    }
    
    /**
     * @return the title of the tune
     */
    public String getTitle(){
        throw new RuntimeException();
    }
    
    /**
     * @return the composer of the tune
     */
    public String getComposer(){
        throw new RuntimeException();
    }
    
    /**
     * @return the key in which the tune is to be played
     */
    public String getKey(){
        throw new RuntimeException();
    }
    
    /**
     * @return the default duration of a note
     */
    public Fraction getDefaultLength(){
        throw new RuntimeException();
    }
    
    /**
     * @return the meter of the tune
     */
    public Fraction getMeter(){
        throw new RuntimeException();
    }
    
    /**
     * @return how many notes of length getDefaultLength()
     * should be played per minute
     */
    public int getTempo(){
        throw new RuntimeException();
    }
    
    /**
     * @return a map from each voice's identifier to the piece
     * of music played by that voice
     */
    public Map<String, Playable> getVoices(){
        throw new RuntimeException();
    }
    
    /**
     * Play the Tune
     */
    public void play(){
        try {
            int ticksPerBeat = 1;
            double tuneDuration = 0;//tune duration in beats
            
            for(Playable voice : getVoices().values()){
                tuneDuration = Math.max(tuneDuration, voice.getLength().valueOf());
                //Ticks per beat is least common multiple of all ticks per beat
                int voiceTicks = voice.ticksPerBeat();
                ticksPerBeat = (voiceTicks*ticksPerBeat)/
                        BigInteger.valueOf(voiceTicks).gcd(BigInteger.valueOf(ticksPerBeat)).intValue();
            }
            
            //Create a new sequence player
            SequencePlayer player = new SequencePlayer(getTempo(), ticksPerBeat);
            
            for(Playable voice : getVoices().values()){
                voice.addToPlayer(player, ticksPerBeat, 0);
            }
            
            player.play();
            
            int tuneMilliseconds = (int)(60000*tuneDuration/(getTempo()));
            Thread.sleep(tuneMilliseconds+1000);
            
        } catch (MidiUnavailableException | InvalidMidiDataException e) {
            System.out.println("Error initializing the MIDI player!");
            e.printStackTrace();
        } catch (InterruptedException e) {
            System.out.println("Tune interrupted!");
            e.printStackTrace();
        }
    }
}
