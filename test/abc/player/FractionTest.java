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
    
}
