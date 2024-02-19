package com.example;
import com.example.Main;
import org.junit.Test;
import static org.junit.Assert.*;


public class MainTest {


    // You can add more test cases based on your requirements
        Main main = new Main();
        double delta = 0.001;
    @Test
    public void testSquareRoot() {
        assertEquals(2.0, main.squareRoot(4.0), delta);
        assertEquals(3.0, main.squareRoot(9.0), delta);
    }

    @Test
    public void testFactorial() {
        assertEquals(1, main.factorial(0));
        assertEquals(1, main.factorial(1));
        assertEquals(120, main.factorial(5));
    }

    @Test
    public void testNaturalLog() {
        assertEquals(1.0, main.naturalLog(Math.E), delta);
    }

    @Test
    public void testExponent() {
        assertEquals(8.0, main.exponent(2.0, 3.0), delta);
        assertEquals(1.0, main.exponent(5.0, 0.0), delta);
    }


}
