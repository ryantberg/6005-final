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
        
    }
    
    /**
     * @return the title of the tune
     */
    public String getTitle(){
        
    }
    
    /**
     * @return the composer of the tune
     */
    public String getComposer(){
        
    }
    
    /**
     * @return the key in which the tune is to be played
     */
    public String getKey(){
        
    }
    
    /**
     * @return the default duration of a note
     */
    public float getDefaultLength(){
        
    }
    
    /**
     * @return the meter of the tune
     */
    public float getMeter(){
        
    }
    
    /**
     * @return how long it should take to play a note
     * of length getDefaultLength().
     */
    public float getTempo(){
        
    }
    
    /**
     * @return the array of voices that make up the
     * entirety of the tune.
     */
    public Voice[] getVoices(){
        
    }
}
