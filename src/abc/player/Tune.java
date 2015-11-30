package abc.player;

import java.io.File;

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
    public Meter getDefaultLength(){
        throw new RuntimeException();
    }
    
    /**
     * @return the meter of the tune
     */
    public Meter getMeter(){
        throw new RuntimeException();
    }
    
    /**
     * @return how long it should take to play a note
     * of length getDefaultLength(), in seconds.
     */
    public float getTempo(){
        throw new RuntimeException();
    }
    
    /**
     * @return the array of voices that make up the
     * entirety of the tune.
     */
    public Voice[] getVoices(){
        throw new RuntimeException();
    }
}
