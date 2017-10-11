package com.ricalo.study;

import org.junit.Test;
import static org.junit.Assert.*;

public class MathUtilTest {
    @Test
    public void testFactorialZero() {
        assertTrue(MathUtil.factorial(0) == 1);
    }

    @Test
    public void testFactorialOne() {
        assertTrue(MathUtil.factorial(1) == 1);
    }

    @Test
    public void testFactorialEight() {
        assertTrue(MathUtil.factorial(8) == 40320);
    }

    @Test(expected = ArithmeticException.class)
    public void testFactorialNegative() {
        MathUtil.factorial(-1);
    }

    @Test
    public void testPowerRecursivePositiveBaseZeroPower() {
        assertEquals(1, MathUtil.toPowerRecursive(1, 0), 0);
    }

    @Test
    public void testPowerRecursivePositiveBasePositivePower01() {
        assertEquals(8, MathUtil.toPowerRecursive(2, 3), 0);
    }

    @Test
    public void testPowerRecursivePositiveBasePositivePower02() {
        assertEquals(243, MathUtil.toPowerRecursive(3, 5), 0);
    }

    @Test
    public void testPowerRecursivePositiveBasePositivePower03() {
        assertEquals(59049, MathUtil.toPowerRecursive(3, 10), 0);
    }

    @Test
    public void testPowerRecursiveZeroBaseZeroPower() {
        assertEquals(1, MathUtil.toPowerRecursive(0, 0), 0);
    }

    @Test
    public void testPowerRecursiveZeroBasePositivePower() {
        assertEquals(0, MathUtil.toPowerRecursive(0, 1), 0);
    }

    @Test
    public void testPowerRecursiveNegativeBasePositiveOddPower() {
        assertEquals(-8, MathUtil.toPowerRecursive(-2, 3), 0);
    }

    public void testPowerRecursiveInfinity() {
        assertEquals(Double.POSITIVE_INFINITY,
                MathUtil.toPowerRecursive(Long.MAX_VALUE, Integer.MAX_VALUE), 0);
    }

    @Test
    public void testPowerRecursivePositiveBaseNegativePower() {
        assertEquals(0.125, MathUtil.toPowerRecursive(2, -3), 0);
    }

    @Test
    public void testPowerIterativePositiveBaseZeroPower() {
        assertEquals(1, MathUtil.toPowerIterative(1, 0), 0);
    }

    @Test
    public void testPowerIterativePositiveBasePositivePower01() {
        assertEquals(8, MathUtil.toPowerIterative(2, 3), 0);
    }

    @Test
    public void testPowerIterativePositiveBasePositivePower02() {
        assertEquals(243, MathUtil.toPowerIterative(3, 5), 0);
    }

    @Test
    public void testPowerIterativePositiveBasePositivePower03() {
        assertEquals(59049, MathUtil.toPowerIterative(3, 10), 0);
    }

    @Test
    public void testPowerIterativeZeroBaseZeroPower() {
        assertEquals(1, MathUtil.toPowerIterative(0, 0), 0);
    }

    @Test
    public void testPowerIterativeZeroBasePositivePower() {
        assertEquals(0, MathUtil.toPowerIterative(0, 1), 0);
    }

    @Test
    public void testPowerIterativeNegativeBasePositiveOddPower() {
        assertEquals(-8, MathUtil.toPowerIterative(-2, 3), 0);
    }

    @Test
    public void testPowerIterativeInfinity() {
        assertEquals(Double.POSITIVE_INFINITY,
                MathUtil.toPowerIterative(Long.MAX_VALUE, Integer.MAX_VALUE), 0);
    }

    @Test
    public void testPowerIterativePositiveBaseNegativePower() {
        assertEquals(0.125, MathUtil.toPowerIterative(2, -3), 0);
    }
}

