package abc.player;

/**
 * Class to represent musical meter
 */
public class Meter {
    private int top; 
    private int bottom;
    
    /**
     * Create a new meter
     * @param top the number of notes in a measure, must be >0
     * @param bottom the length of a note, must be >0
     */
    public Meter(int top, int bottom){
        this.top = top;
        this.bottom = bottom;
        
        assert top>0 && bottom>0;
    }
    
    /**
     * @return the top part of this meter
     */
    public int top(){
        return top;
    }
    
    
    /**
     * @return the bottom part of this meter
     */
    public int bottom(){
        return bottom;
    }
}
