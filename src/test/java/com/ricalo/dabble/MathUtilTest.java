package com.ricalo.dabble;

import static com.google.common.truth.Truth.assertThat;
import org.junit.Test;

@SuppressWarnings("PMD.TooManyMethods")
public class MathUtilTest {
  @Test
  public void testFactorialZero() {
    assertThat(MathUtil.factorial(0)).isEqualTo(1);
  }

  @Test
  public void testFactorialOne() {
    assertThat(MathUtil.factorial(1)).isEqualTo(1);
  }

  @Test
  public void testFactorialEight() {
    assertThat(MathUtil.factorial(8)).isEqualTo(40320);
  }

  @Test(expected = ArithmeticException.class)
  public void testFactorialNegative() {
    MathUtil.factorial(-1);
  }

  @Test
  public void testPowerRecursivePositiveBaseZeroPower() {
    assertThat(MathUtil.toPowerRecursive(1, 0)).isEqualTo(1);
  }

  @Test
  public void testPowerRecursivePositiveBasePositivePower01() {
    assertThat(MathUtil.toPowerRecursive(2, 3)).isEqualTo(8);
  }

  @Test
  public void testPowerRecursivePositiveBasePositivePower02() {
    assertThat(MathUtil.toPowerRecursive(3, 5)).isEqualTo(243);
  }

  @Test
  public void testPowerRecursivePositiveBasePositivePower03() {
    assertThat(MathUtil.toPowerRecursive(3, 10)).isEqualTo(59049);
  }

  @Test
  public void testPowerRecursiveZeroBaseZeroPower() {
    assertThat(MathUtil.toPowerRecursive(0, 0)).isEqualTo(1);
  }

  @Test
  public void testPowerRecursiveZeroBasePositivePower() {
    assertThat(MathUtil.toPowerRecursive(0, 1)).isEqualTo(0);
  }

  @Test
  public void testPowerRecursiveNegativeBasePositiveOddPower() {
    assertThat(MathUtil.toPowerRecursive(-2, 3)).isEqualTo(-8);
  }

  @Test
  public void testPowerRecursiveBigNumber() {
    assertThat(MathUtil.toPowerRecursive(2, 80)).isEqualTo(Math.pow(2, 80));
  }

  @Test
  public void testPowerRecursivePositiveBaseNegativePower() {
    assertThat(MathUtil.toPowerRecursive(2, -3)).isEqualTo(0.125);
  }

  @Test
  public void testPowerIterativePositiveBaseZeroPower() {
    assertThat(MathUtil.toPowerIterative(1, 0)).isEqualTo(1);
  }

  @Test
  public void testPowerIterativePositiveBasePositivePower01() {
    assertThat(MathUtil.toPowerIterative(2, 3)).isEqualTo(8);
  }

  @Test
  public void testPowerIterativePositiveBasePositivePower02() {
    assertThat(MathUtil.toPowerIterative(3, 5)).isEqualTo(243);
  }

  @Test
  public void testPowerIterativePositiveBasePositivePower03() {
    assertThat(MathUtil.toPowerIterative(3, 10)).isEqualTo(59049);
  }

  @Test
  public void testPowerIterativeZeroBaseZeroPower() {
    assertThat(MathUtil.toPowerIterative(0, 0)).isEqualTo(1);
  }

  @Test
  public void testPowerIterativeZeroBasePositivePower() {
    assertThat(MathUtil.toPowerIterative(0, 1)).isEqualTo(0);
  }

  @Test
  public void testPowerIterativeNegativeBasePositiveOddPower() {
    assertThat(MathUtil.toPowerIterative(-2, 3)).isEqualTo(-8);
  }

  @Test
  public void testPowerIterativeBigNumber() {
    assertThat(MathUtil.toPowerIterative(2, 80)).isEqualTo(Math.pow(2, 80));
  }

  @Test
  public void testPowerIterativePositiveBaseNegativePower() {
    assertThat(MathUtil.toPowerIterative(2, -3)).isEqualTo(0.125);
  }

  @Test
  public void testSquareRootOfZero() {
    assertThat(MathUtil.squareRoot(0, 0)).isEqualTo(0);
  }

  @Test
  public void testSquareRootOfOne() {
    assertThat(MathUtil.squareRoot(1, 0)).isEqualTo(1);
  }

  @Test
  public void testSquareRootOfFour() {
    assertThat(MathUtil.squareRoot(4, 0)).isEqualTo(2);
  }

  @Test
  public void testSquareRootOfTwo() {
    assertThat(MathUtil.squareRoot(2, 0.0001)).isWithin(0.01).of(1.41);
  }
}
