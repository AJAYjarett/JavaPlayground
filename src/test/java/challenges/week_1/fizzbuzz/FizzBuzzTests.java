package challenges.week_1.fizzbuzz;

import org.junit.jupiter.api.Test;
import static  org.junit.jupiter.api.Assertions.assertEquals;

public class FizzBuzzTests {

    FizzBuzz fizzBuzz = new FizzBuzz(100);

    @Test
    public void fizzBuzzTests(){
        assertEquals(fizzBuzz.getFizzBuzzArrIndex(2),"Fizz");
        assertEquals(fizzBuzz.getFizzBuzzArrIndex(14), "FizzBuzz");
        assertEquals(fizzBuzz.getFizzBuzzArrIndex(4), "Buzz");
        assertEquals(fizzBuzz.getFizzBuzzArrIndex(16), "17");
    }

    @Test
    public void determineDivisibleTests(){
        assertEquals(fizzBuzz.determineDivisible(6), 2);
        assertEquals(fizzBuzz.determineDivisible(15), 1);
    }


}
