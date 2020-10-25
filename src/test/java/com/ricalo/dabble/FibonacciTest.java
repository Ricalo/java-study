package com.ricalo.dabble;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class FibonacciTest {
  @Test
  public void testZero() {
    final int expected = 0;

    Fibonacci fibonacci = new Fibonacci();
    Assert.assertTrue(expected == fibonacci.calculate(0));
  }

  @Test
  public void testOne() {
    final int expected = 1;

    Fibonacci fibonacci = new Fibonacci();
    Assert.assertTrue(expected == fibonacci.calculate(1));
  }

  @Test
  public void testTwo() {
    final int expected = 1;

    Fibonacci fibonacci = new Fibonacci();
    Assert.assertTrue(expected == fibonacci.calculate(2));
  }

  @Test
  public void testFifty() {
    final long expected = 12586269025L;

    Fibonacci fibonacci = new Fibonacci();
    Assert.assertTrue(expected == fibonacci.calculate(50));
  }
}
