package com.ricalo.dabble;

import com.google.common.flogger.FluentLogger;
import java.util.EmptyStackException;
import org.checkerframework.checker.nullness.qual.NonNull;

public class Stack {
  ListElement head;
  private static final FluentLogger logger = FluentLogger.forEnclosingClass();

  /**
   * Returns the element at the top of the stack.
   *
   * @returns The element at the top of the stack.
   * @throws EmptyStackException if the stack is empty.
   */
  public int pop() {
    if (head == null) {
      String message = "Attempt to perform a pop operation on an empty stack";
      EmptyStackException stackException = new EmptyStackException();
      logger.atWarning().withCause(stackException).log(message, head);
      throw stackException;
    } else {
      final int temp = head.data;
      head = head.next;
      return temp;
    }
  }

  /**
   * Inserts an element at the top of the stack.
   *
   * @param data The element to be inserted at the top of the stack.
   */
  public void push(@NonNull final int data) {
    final ListElement newElement = new ListElement();
    newElement.data = data;

    newElement.next = head;
    head = newElement;
  }

  @Override
  public String toString() {
    ListElement current = head;
    final StringBuilder stringBuilder = new StringBuilder();
    while (current != null) {
      stringBuilder.append(current.data).append('\n');
      current = current.next;
    }

    return stringBuilder.toString();
  }
}
