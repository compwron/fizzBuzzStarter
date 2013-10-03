import org.junit.Test;

import static junit.framework.Assert.assertEquals;


public class FibonacciSequenceTest {
    @Test
    public void shouldReturnFirstFibonacciSequenceNumber(){
        assertEquals(0, new FibonacciSequence().number(1));
    }

    @Test
    public void shouldReturnSecondFibonacciSequenceNumber(){
        assertEquals(1, new FibonacciSequence().number(2));
    }
}
