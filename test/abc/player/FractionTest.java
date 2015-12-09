package abc.player;

import static org.junit.Assert.*;
import org.junit.Test;

public class FractionTest {
    
    // Testing strategy:
    //
    // --------Reduce--------
    // Input: reducible, irreducible
    // Output: Make sure original fraction is unchanged
    //
    // --------Add--------
    // Input: Same denominator, different denominators
    // Output: Make sure original fraction is unchanged
    
    @Test
    public void testReduce(){
        Fraction fraction = new Fraction(4,16);
        Fraction reducedFraction = fraction.reduce();
        
        //Make sure the reduced fraction is fully reduced
        assertEquals(1,reducedFraction.numerator());
        assertEquals(4,reducedFraction.denominator());
        
        //Make sure the original fraction is unchanged
        assertEquals(4,fraction.numerator());
        assertEquals(16,fraction.denominator());
        
        //Make sure there aren't any errors when reducing an irreducible fraction
        reducedFraction = reducedFraction.reduce();
        assertEquals(1,reducedFraction.numerator());
        assertEquals(4,reducedFraction.denominator());
    }
    
    @Test
    public void testAdd(){
        //Test with the same denominator
        Fraction addend1 = new Fraction(1,5);
        Fraction addend2 = new Fraction(2,5);
        Fraction sum = addend1.add(addend2);
        assertEquals(3,sum.numerator());
        assertEquals(5,sum.denominator());
        
        //Make sure original fractions are unchanged
        assertEquals(1,addend1.numerator());
        assertEquals(5,addend1.denominator());
        assertEquals(2,addend2.numerator());
        assertEquals(5,addend2.denominator());
        
        //Test with different denominators
        addend1 = new Fraction(1,6);
        addend2 = new Fraction(1,3);
        sum = addend1.add(addend2);
        assertEquals(1,sum.numerator());
        assertEquals(2,sum.denominator());
    }
    
    @Test
    public void testMultiply() {
        // Test random (prime) multiplication
        Fraction a = new Fraction(29, 11);
        Fraction b = new Fraction(37, 89);
        Fraction ab = a.multiply(b);
        
        assertEquals(ab.numerator(), a.numerator()*b.numerator());
        assertEquals(ab.denominator(), a.denominator()*b.denominator());
        
        // Test multiplying by oneself
        Fraction one = new Fraction(1,1);

        Fraction oneSquared = one.multiply(one);
        
        assertEquals(oneSquared.numerator(), 1);
        assertEquals(oneSquared.denominator(), 1);
        
        // Test reduction
        Fraction c = new Fraction(100, 200);
        Fraction cReduced = c.multiply(one);
        
        assertEquals(cReduced.numerator(), 1);
        assertEquals(cReduced.denominator(), 2);
    }
    
    @Test
    public void testInvert() {
        // Test works and does not reduce
        Fraction invertee = new Fraction(100, 5);
        Fraction inverted = invertee.invert();
        
        assertEquals(inverted.numerator(), 5);
        assertEquals(inverted.denominator(), 100);
    }
    
    @Test
    public void testDivide() {
        // Test dividing by oneself yields one
        Fraction a = new Fraction(5403, 302);
        Fraction one = a.divide(a);
        
        assertEquals(one.numerator(), 1);
        assertEquals(one.denominator(), 1);
        
        Fraction half = new Fraction(1, 2);
        Fraction twentyFive = new Fraction(25, 1);
        Fraction fiftieth = half.divide(twentyFive);
        
        assertEquals(fiftieth.numerator(), 1);
        assertEquals(fiftieth.denominator(), 50);
    }
}
