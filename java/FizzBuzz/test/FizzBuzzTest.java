import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FizzBuzzTest {
    FizzBuzz fizzBuzz;

    @Before
    public void setUp(){
        fizzBuzz = new FizzBuzz(1);
    }

    @Test
    public void shouldReturn1For1(){
        assertEquals(fizzBuzz.valueOf(1), "1");
    }

    @Test
    public void shouldReturn2ForNumberNotDivisibleBy3Or5(){
        assertEquals(fizzBuzz.valueOf(2), "2");
    }

    @Test
    public void shouldReturnFizzForNumberDivisibleBy3(){
        assertEquals(fizzBuzz.valueOf(3), "Fizz");
    }

    @Test
    public void shouldReturnBuzzForNumberDivisibleBy5(){
        assertEquals(fizzBuzz.valueOf(5), "Buzz");
    }

    @Test
    public void shouldReturnFizzBuzzForNumberDivisibleByBoth3And55(){
        assertEquals(fizzBuzz.valueOf(15), "FizzBuzz");
    }

    @Test
    public void shouldHaveNumbers(){
        assertEquals(2, fizzBuzz.numbers().size());
    }
}
