package com.ricalo.dabble;

import static com.google.common.truth.Truth.assertThat;
import java.util.EmptyStackException;
import org.junit.Test;

public class StackTest {
  @Test
  public void testOneElement() {
    final Stack stack = new Stack();

    final int pushed = 1;
    stack.push(pushed);

    final int popped = stack.pop();
    assertThat(popped).isEqualTo(pushed);
  }

  @Test(expected = EmptyStackException.class)
  public void testPopEmptyStack() {
    final Stack stack = new Stack();
    stack.pop();
  }

  @Test(expected = Test.None.class)
  public void testThousandElements() {
    final Stack stack = new Stack();

    for (int i = 0; i < 1000; i++) {
      stack.push(i);
    }
  }

  @SuppressWarnings("PMD.LawOfDemeter")
  @Test
  public void testToStringEmptyStack() {
    final Stack stack = new Stack();

    assertThat(stack.toString().isEmpty()).isTrue();
  }

  @SuppressWarnings("PMD.LawOfDemeter")
  @Test
  public void testToStringOneElement() {
    final Stack stack = new Stack();

    final int pushed = 1;
    stack.push(pushed);

    assertThat(stack.toString()).isEqualTo(pushed + "\n");
  }
}
