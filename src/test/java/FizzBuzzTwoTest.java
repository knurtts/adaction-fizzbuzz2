import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FizzBuzzTwoTest {

    @Test
    void testBuzzle() {

        FizzBuzzTwo fizzBuzzTwo = new FizzBuzzTwo();
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20};
        Object[] expected = {1, 2, "lucky", 4, "buzz", "fizz", 7, 8, "fizz", "buzz", 11, "fizz", "lucky", 14, "fizzbuzz", 16, 17, "fizz", 19, "buzz"};

        Assertions.assertArrayEquals(expected, fizzBuzzTwo.buzzle(numbers));    }
}
