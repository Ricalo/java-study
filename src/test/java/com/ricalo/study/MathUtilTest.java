package com.ricalo.study;

import org.junit.Assert;
import org.junit.Test;

@SuppressWarnings("PMD.TooManyMethods")
public class MathUtilTest {
  @Test
  public void testFactorialZero() {
    Assert.assertEquals(1, MathUtil.factorial(0), 0);
  }

  @Test
  public void testFactorialOne() {
    Assert.assertEquals(1, MathUtil.factorial(1), 0);
  }

  @Test
  public void testFactorialEight() {
    Assert.assertEquals(40320, MathUtil.factorial(8), 0);
  }

  @Test(expected = ArithmeticException.class)
  public void testFactorialNegative() {
    MathUtil.factorial(-1);
  }

  @Test
  public void testPowerRecursivePositiveBaseZeroPower() {
    Assert.assertEquals(1, MathUtil.toPowerRecursive(1, 0), 0);
  }

  @Test
  public void testPowerRecursivePositiveBasePositivePower01() {
    Assert.assertEquals(8, MathUtil.toPowerRecursive(2, 3), 0);
  }

  @Test
  public void testPowerRecursivePositiveBasePositivePower02() {
    Assert.assertEquals(243, MathUtil.toPowerRecursive(3, 5), 0);
  }

  @Test
  public void testPowerRecursivePositiveBasePositivePower03() {
    Assert.assertEquals(59049, MathUtil.toPowerRecursive(3, 10), 0);
  }

  @Test
  public void testPowerRecursiveZeroBaseZeroPower() {
    Assert.assertEquals(1, MathUtil.toPowerRecursive(0, 0), 0);
  }

  @Test
  public void testPowerRecursiveZeroBasePositivePower() {
    Assert.assertEquals(0, MathUtil.toPowerRecursive(0, 1), 0);
  }

  @Test
  public void testPowerRecursiveNegativeBasePositiveOddPower() {
    Assert.assertEquals(-8, MathUtil.toPowerRecursive(-2, 3), 0);
  }

  @Test
  public void testPowerRecursiveBigNumber() {
    Assert.assertEquals(Math.pow(2, 80), MathUtil.toPowerRecursive(2, 80), 0);
  }

  @Test
  public void testPowerRecursivePositiveBaseNegativePower() {
    Assert.assertEquals(0.125, MathUtil.toPowerRecursive(2, -3), 0);
  }

  @Test
  public void testPowerIterativePositiveBaseZeroPower() {
    Assert.assertEquals(1, MathUtil.toPowerIterative(1, 0), 0);
  }

  @Test
  public void testPowerIterativePositiveBasePositivePower01() {
    Assert.assertEquals(8, MathUtil.toPowerIterative(2, 3), 0);
  }

  @Test
  public void testPowerIterativePositiveBasePositivePower02() {
    Assert.assertEquals(243, MathUtil.toPowerIterative(3, 5), 0);
  }

  @Test
  public void testPowerIterativePositiveBasePositivePower03() {
    Assert.assertEquals(59049, MathUtil.toPowerIterative(3, 10), 0);
  }

  @Test
  public void testPowerIterativeZeroBaseZeroPower() {
    Assert.assertEquals(1, MathUtil.toPowerIterative(0, 0), 0);
  }

  @Test
  public void testPowerIterativeZeroBasePositivePower() {
    Assert.assertEquals(0, MathUtil.toPowerIterative(0, 1), 0);
  }

  @Test
  public void testPowerIterativeNegativeBasePositiveOddPower() {
    Assert.assertEquals(-8, MathUtil.toPowerIterative(-2, 3), 0);
  }

  @Test
  public void testPowerIterativeBigNumber() {
    Assert.assertEquals(Math.pow(2, 80), MathUtil.toPowerIterative(2, 80), 0);
  }

  @Test
  public void testPowerIterativePositiveBaseNegativePower() {
    Assert.assertEquals(0.125, MathUtil.toPowerIterative(2, -3), 0);
  }
}
