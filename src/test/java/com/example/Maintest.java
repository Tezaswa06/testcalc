import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class Maintest {

    // Define a tolerance for double comparisons to handle floating-point imprecision
    private static final double TOLERANCE = 1e-10;

    // You can add more test cases based on your requirements

    @Test
    public void testSquareRoot() {
        assertEquals(2.0, main.squareRoot(4.0), TOLERANCE);
        assertEquals(3.0, main.squareRoot(9.0), TOLERANCE);
        assertEquals(Double.NaN, main.squareRoot(-1.0), TOLERANCE); // Square root of a negative number
    }

    @Test
    public void testFactorial() {
        assertEquals(1, main.factorial(0));
        assertEquals(1, main.factorial(1));
        assertEquals(120, main.factorial(5));
        assertEquals(-1, main.factorial(-5)); // Factorial of a negative number
    }

    @Test
    public void testNaturalLog() {
        assertEquals(Double.NaN, main.naturalLog(0.0), TOLERANCE); // Logarithm of a non-positive number
        assertEquals(1.0, main.naturalLog(Math.E), TOLERANCE);
    }

    @Test
    public void testExponent() {
        assertEquals(8.0, main.exponent(2.0, 3.0), TOLERANCE);
        assertEquals(1.0, main.exponent(5.0, 0.0), TOLERANCE);
    }

    // You can add more tests for other functionalities as needed

    // Optional: If your main method requires input, you can simulate it using System.setIn()

    @Before
    public void setUp() {
        // Set up any necessary resources or configurations before each test
    }

    @After
    public void tearDown() {
        // Clean up any resources after each test
    }
}
