package com.ricalo.study;

import java.util.EmptyStackException;

import org.checkerframework.checker.nullness.qual.NonNull;

public class Stack {
    ListElement head;

    public int pop() {
        if(head == null) {
            throw new EmptyStackException();
        } else {
            final int temp = head.data;
            head = head.next;
            return temp;
        }
    }

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
        while(current != null) {
            stringBuilder.append(current.data).append('\n');
            current = current.next;
        }

        return stringBuilder.toString();
    }
}

