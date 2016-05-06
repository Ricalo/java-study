import java.util.Arrays;

public class Runner {
    public static void main(String[] args) {
        int[] array = {5, 2, 4, 6, 1, 3};
	System.out.println(Arrays.toString(array));
	MergeSort.sort(array);
	System.out.println(Arrays.toString(array));
    }

    public static void printArray(int[] array) {
        for(int i  = 0; i < array.length; i++) {
            System.out.print(array[i] + ", ");
	}
	System.out.println();
    }
}
