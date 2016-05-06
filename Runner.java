import java.util.Arrays;

public class Runner {
    public static void main(String[] args) {
        int[] array = {5, 2, 4, 6, 1, 3};
	System.out.println(Arrays.toString(array));
	BubbleSort.sort(array);
	System.out.println(Arrays.toString(array));
    }
}
