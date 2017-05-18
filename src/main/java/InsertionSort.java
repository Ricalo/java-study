import java.util.Arrays;

public class InsertionSort {
    public static int[] sort(int[] array) {
        for(int j = 1; j < array.length; j++) {
            int key = array[j];
        System.out.println("Sorting key: " + key);
        int i = j - 1;
        while(i >= 0 && array[i] > key) {
            array[i + 1] = array[i];
            i = i - 1;
        }
        array[i + 1] = key;
        System.out.println("Sorting " + Arrays.toString(array));
    }
    return array;
    }
}

