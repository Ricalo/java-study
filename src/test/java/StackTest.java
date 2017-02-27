import org.junit.Test;
import static org.junit.Assert.*;

public class StackTest {
    @Test
    public void testOneElement() {
        Stack stack = new Stack();

	int pushed = 1;
	stack.push(pushed);
        
	int popped = stack.pop();
	assertTrue("We should get what we pushed into the stack", popped == pushed);
    }
}
	
