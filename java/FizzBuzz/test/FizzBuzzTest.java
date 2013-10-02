import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FizzBuzzTest {
    FizzBuzz fizzBuzz;

    @Before
    public void setUp(){
        fizzBuzz = new FizzBuzz();
    }

    @Test
    public void shouldReturn1For1(){
        assertEquals(fizzBuzz.valueOf(1), "1");
    }

    @Test
    public void shouldReturn2For2(){
        assertEquals(fizzBuzz.valueOf(2), "2");
    }

    @Test
    public void shouldReturnFizzFor3(){
        assertEquals(fizzBuzz.valueOf(3), "Fizz");
    }

    @Test
    public void shouldReturnBuzzFor5(){
        assertEquals(fizzBuzz.valueOf(5), "Buzz");
    }
}
