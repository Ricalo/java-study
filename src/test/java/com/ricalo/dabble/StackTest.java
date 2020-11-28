package com.ricalo.dabble;

import static com.google.common.truth.Truth.assertThat;
import java.util.EmptyStackException;
import static org.junit.Assert.assertThrows;
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

  @Test
  public void testPopEmptyStack() {
    final Stack stack = new Stack();
    assertThrows(EmptyStackException.class, () -> stack.pop());
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
