package com.ricalo.dabble;

import static com.google.common.truth.Truth.assertThat;
import org.junit.Before;
import org.junit.Test;

public class FibonacciTest {
  @Test
  public void testZero() {
    Fibonacci fibonacci = new Fibonacci();
    assertThat(fibonacci.calculate(0)).isEqualTo(0);
  }

  @Test
  public void testOne() {
    Fibonacci fibonacci = new Fibonacci();
    assertThat(fibonacci.calculate(1)).isEqualTo(1);
  }

  @Test
  public void testTwo() {
    Fibonacci fibonacci = new Fibonacci();
    assertThat(fibonacci.calculate(2)).isEqualTo(1);
  }

  @Test
  public void testFifty() {
    Fibonacci fibonacci = new Fibonacci();
    assertThat(fibonacci.calculate(50)).isEqualTo(12586269025L);
  }
}
