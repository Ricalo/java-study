package com.ricalo.study;

import java.util.EmptyStackException;

import org.junit.Assert;
import org.junit.Test;

public class StackTest {
  @Test
  public void testOneElement() {
    final Stack stack = new Stack();

    final int pushed = 1;
    stack.push(pushed);
        
    final int popped = stack.pop();
    Assert.assertSame(popped, pushed);
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

    Assert.assertTrue(stack.toString().isEmpty());
  }

  @SuppressWarnings("PMD.LawOfDemeter")
  @Test
  public void testToStringOneElement() {
    final Stack stack = new Stack();

    final int pushed = 1;
    stack.push(pushed);

    Assert.assertEquals(stack.toString(), pushed + "\n");
  }
}
