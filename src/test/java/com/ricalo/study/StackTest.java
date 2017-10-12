package com.ricalo.study;

import java.util.EmptyStackException;

import org.junit.Test;
import static org.junit.Assert.*;

public class StackTest {
    @Test
    public void testOneElement() {
        final Stack stack = new Stack();

        final int pushed = 1;
        stack.push(pushed);
        
        final int popped = stack.pop();
        assertSame(popped, pushed);
    }
    
    @Test(expected = EmptyStackException.class)
    public void testPopEmptyStack() {
        final Stack stack = new Stack();
        stack.pop();
    }

    @Test
    public void testThousandElements() {
        final Stack stack = new Stack();

        for(int i = 0; i < 1000; i++) {
            stack.push(i);
        }
    }

    @SuppressWarnings("PMD.LawOfDemeter")
    @Test
    public void testToStringEmptyStack() {
        final Stack stack = new Stack();

        assertTrue(stack.toString().isEmpty());
    }

    @SuppressWarnings("PMD.LawOfDemeter")
    @Test
    public void testToStringOneElement() {
        final Stack stack = new Stack();

        final int pushed = 1;
        stack.push(pushed);

        assertEquals(stack.toString(), pushed + "\n");
    }
}
