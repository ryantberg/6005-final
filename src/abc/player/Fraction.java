package abc.player;

/**
 * Immutable class to represent musical meter
 */
public class Fraction {
    private final int numerator; 
    private final int denominator;
    
    /**
     * Create a new meter
     * @param top the number of notes in a measure, must be >0
     * @param bottom the length of a note, must be >0
     */
    public Fraction(int numerator, int denominator){
        this.numerator = numerator;
        this.denominator = denominator;
        
        assert numerator>0 && denominator>0;
    }
    
    /**
     * @return an irreducible fraction equal to this fraction 
     */
    public Fraction reduce(){
        throw new RuntimeException();
    }
    
    /**
     * @return the top part of this meter
     */
    public int numerator(){
        return numerator;
    }
    
    
    /**
     * @return the bottom part of this meter
     */
    public int denominator(){
        return denominator;
    }
}
