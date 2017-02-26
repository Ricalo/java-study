import java.util.Arrays;

public class Runner {
    public static void main(String[] args) {
        // int[] array = {5, 2, 4, 100, 6, 1, 3};
	// System.out.println(Arrays.toString(array));
	// BubbleSort.sort(array);
	// System.out.println(Arrays.toString(array));
	Stack stack = new Stack();

	stack.push(4);
	stack.push(2);
	stack.pop();
	stack.push(9);
	stack.pop();
	stack.pop();
	stack.pop();

	System.out.println(stack.toString());
    }
}
