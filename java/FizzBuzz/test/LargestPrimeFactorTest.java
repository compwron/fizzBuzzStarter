import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LargestPrimeFactorTest {
    @Test
    public void shouldFindLargestPrimeFactorOfOneIsOne(){
        assertEquals(1, new LargestPrimeFactor().factorOf(1));
    }

    @Test
    public void shouldFindLargestPrimeFactorOfTwoIsTwo(){
        assertEquals(2, new LargestPrimeFactor().factorOf(2));
    }
}
