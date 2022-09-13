import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ErrorCollector;

import static org.junit.Assert.assertEquals;

public class FizzBuzzTest {
    @Rule
    public ErrorCollector errorCollector = new ErrorCollector();

    @Test
    public void testBuzz() {
        int[] testNums = {5, 10, 20, 35};
        for (int j : testNums) {
            try {
                assertEquals("Buzz", FizzBuzz.BadFizzBuzz(j));
                assertEquals(j + " Buzz", FizzBuzz.BetterFizzBuzz(j));
                assertEquals("Buzz", FizzBuzz.EvenBetterFizzBuzz(j));
                assertEquals("Pizza", FizzBuzz.CustomFizzBuzz(j, 3, 5, "Hamster", "Pizza"));
            } catch (Throwable t) {
                errorCollector.addError(t);
            }
        }
    }

    @Test
    public void testFizz() {
        int[] testNums = {3, 6, 9, 18};
        for (int j : testNums) {
            try {
                assertEquals("Fizz", FizzBuzz.BadFizzBuzz(j));
                assertEquals(j + " Fizz", FizzBuzz.BetterFizzBuzz(j));
                assertEquals("Fizz", FizzBuzz.EvenBetterFizzBuzz(j));
                assertEquals("Hamster", FizzBuzz.CustomFizzBuzz(j, 3, 5, "Hamster", "Pizza"));
            } catch (Throwable t) {
                errorCollector.addError(t);
            }
        }
    }


    @Test
    public void testFizzBuzz() {
        int[] testNums = {15, 30, 60, 90};
        for (int j : testNums) {
            try {
                assertEquals("FizzBuzz", FizzBuzz.BadFizzBuzz(j));
                assertEquals(j + " FizzBuzz", FizzBuzz.BetterFizzBuzz(j));
                assertEquals("FizzBuzz", FizzBuzz.EvenBetterFizzBuzz(j));
                assertEquals("HamsterPizza", FizzBuzz.CustomFizzBuzz(j, 3, 5, "Hamster", "Pizza"));
            } catch (Throwable t) {
                errorCollector.addError(t);
            }
        }
    }

    @Test
    public void testNoFizzOrBuzz() {
        int[] testNums = {2, 4, 8, 61};
        for (int j : testNums) {
            try {
                assertEquals(String.valueOf(j), FizzBuzz.BadFizzBuzz(j));
                assertEquals(String.valueOf(j), FizzBuzz.BetterFizzBuzz(j));
                assertEquals(String.valueOf(j), FizzBuzz.EvenBetterFizzBuzz(j));
                assertEquals(String.valueOf(j), FizzBuzz.CustomFizzBuzz(j, 3, 5, "Hamster", "Pizza"));
            } catch (Throwable t) {
                errorCollector.addError(t);
            }
        }
    }
}