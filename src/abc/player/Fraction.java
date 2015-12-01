package abc.player;

import java.math.BigInteger;

/**
 * Immutable class to represent a fraction (musical meter or note denomination)
 */
public class Fraction {
    private final int numerator; 
    private final int denominator;
    
    /**
     * Create a new Fraction
     * @param numerator of the fraction
     * @param denominator of the fraction
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
        final int gcd = BigInteger.valueOf(numerator).gcd(BigInteger.valueOf(denominator)).intValue(); //Java apparently only has gcd for BigIntegers
        return new Fraction(numerator/gcd, denominator/gcd);
    }
    
    /**
     * @return the numerator of this fraction
     */
    public int numerator(){
        return numerator;
    }
    
    
    /**
     * @return the denominator of this fraction
     */
    public int denominator(){
        return denominator;
    }
}
