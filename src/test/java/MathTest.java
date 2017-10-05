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

    @Test
    public void testPowerRecursivePositiveBaseZeroPower() {
        assertEquals(1, Math.toPowerRecursive(1, 0), 0);
    }

    @Test
    public void testPowerRecursivePositiveBasePositivePower() {
        assertEquals(8, Math.toPowerRecursive(2, 3), 0);
    }

    @Test
    public void testPowerRecursiveZeroBaseZeroPower() {
        assertEquals(1, Math.toPowerRecursive(0, 0), 0);
    }

    @Test
    public void testPowerRecursiveZeroBasePositivePower() {
        assertEquals(0, Math.toPowerRecursive(0, 1), 0);
    }

    @Test
    public void testPowerRecursiveNegativeBasePositiveOddPower() {
        assertEquals(-8, Math.toPowerRecursive(-2, 3), 0);
    }

    @Test(expected=StackOverflowError.class)
    public void testPowerRecursive() {
        Math.toPowerRecursive(Long.MAX_VALUE, Integer.MAX_VALUE);
    }

    @Test
    public void testPowerIterativePositiveBaseZeroPower() {
        assertEquals(1, Math.toPowerIterative(1, 0), 0);
    }

    @Test
    public void testPowerIterativePositiveBasePositivePower() {
        assertEquals(8, Math.toPowerIterative(2, 3), 0);
    }

    @Test
    public void testPowerIterativeZeroBaseZeroPower() {
        assertEquals(1, Math.toPowerIterative(0, 0), 0);
    }

    @Test
    public void testPowerIterativeZeroBasePositivePower() {
        assertEquals(0, Math.toPowerIterative(0, 1), 0);
    }

    @Test
    public void testPowerIterativeNegativeBasePositiveOddPower() {
        assertEquals(-8, Math.toPowerIterative(-2, 3), 0);
    }

    @Test
    public void testPowerIterativeInfinity() {
        assertEquals(Double.POSITIVE_INFINITY,
                Math.toPowerIterative(Long.MAX_VALUE, Integer.MAX_VALUE), 0);
    }
}
