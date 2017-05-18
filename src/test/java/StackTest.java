import org.junit.Test;
import static org.junit.Assert.*;

public class StackTest {
    @Test
    public void testOneElement() {
        Stack stack = new Stack();

        int pushed = 1;
        stack.push(pushed);
        
        int popped = stack.pop();
        assertTrue(
            "We should get what we pushed into the stack", popped == pushed
        );
    }
    
    @Test(expected = NullPointerException.class)
    public void testPopEmptyStack() {
        Stack stack = new Stack();
        stack.pop();
    }

    @Test
    public void testThousandElements() {
        Stack stack = new Stack();

        for(int i = 0; i < 1000; i++) {
            stack.push(i);
        }
    }

    @Test
    public void testToStringEmptyStack() {
        Stack stack = new Stack();

        assertTrue(
                "Empty stack should return empty string",
                stack.toString().length() == 0
                );
    }

    @Test
    public void testToStringOneElement() {
        Stack stack = new Stack();

        int pushed = 1;
        stack.push(pushed);

        assertTrue(
                "One element stack should return the element + \\n",
                stack.toString().equals(String.valueOf(pushed) + "\n")
                );
    }
}

