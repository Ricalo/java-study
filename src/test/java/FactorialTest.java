import org.junit.Test;
import static org.junit.Assert.*;

public class FactorialTest {
    @Test
    public void testZero() {
        assertTrue(Factorial.execute(0) == 1);
    }

    @Test
    public void testOne() {
        assertTrue(Factorial.execute(1) == 1);
    }

    @Test
    public void testEight() {
        assertTrue(Factorial.execute(8) == 40320);
    }

    @Test(expected = ArithmeticException.class)
    public void testNegative() {
        Factorial.execute(-1);
    }
}

