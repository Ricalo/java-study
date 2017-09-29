import org.junit.Test;
import static org.junit.Assert.*;

public class MathTest {
    @Test
    public void testFactorialZero() {
        assertTrue(Math.factorial(0) == 1);
    }

    @Test
    public void testFactorialOne() {
        assertTrue(Math.factorial(1) == 1);
    }

    @Test
    public void testFactorialEight() {
        assertTrue(Math.factorial(8) == 40320);
    }

    @Test(expected = ArithmeticException.class)
    public void testFactorialNegative() {
        Math.factorial(-1);
    }
}

