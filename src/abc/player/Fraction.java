package abc.player;

import java.math.BigInteger;

/**
 * Immutable class to represent a fraction (musical meter or note denomination)
 * Two Fractions are considered equal IF AND ONLY IF their numerator and denominator
 * are both equal. For instance, 1/4 is NOT EQUAL to 2/8. 
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
    
    /**
     * Adds two Fractions
     * @param addend to be added
     * @return a new fraction corresponding to the fractional sum of this fraction and addend
     */
    public Fraction add(Fraction addend){
        final int newDenominator = this.denominator()*addend.denominator();
        final int newNumerator = this.numerator()*addend.denominator() + addend.numerator()*this.denominator();
        return new Fraction(newNumerator, newDenominator).reduce();
    }
    
    /**
     * Returns a double value of this fraction
     * @return double value
     */
    public double valueOf() {
        return (double)numerator / (double)denominator;
    }
    
    /**
     * Compares two fractions
     * @param other Fraction to compare
     * @return true if this >= other, in a mathematical sense
     */
    public boolean greaterThanOrEqual(Fraction other) {
        final Fraction a = this.reduce();
        final Fraction b = other.reduce();
        return a.valueOf() >= b.valueOf();
    }
    
    @Override
    public boolean equals(Object thatObject){
        if ( ! (thatObject instanceof Fraction)) { return false; }
        Fraction that = (Fraction)thatObject;
        return numerator == that.numerator && denominator == that.denominator;
    }
    
    @Override
    public int hashCode(){
        return numerator + denominator;
    }
    
    @Override
    public String toString(){
        return numerator + "/" + denominator;
    }
}
