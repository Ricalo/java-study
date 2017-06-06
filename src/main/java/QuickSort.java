import java.util.Arrays;

public class QuickSort {
    private static int[] ret;

    public static int[] sort(int[] array) {
        if(array.length < 2) {
            return array;
        }

        // Make a clone of the initial array just to preserve it
        ret = (int[])array.clone();

        internalSort(ret);

        System.out.println("Original: " + Arrays.toString(array));
        System.out.println("  Sorted: " + Arrays.toString(ret));
        return ret;
    }

    private static void internalSort(int[] array) {
        System.out.println("Dividing " + Arrays.toString(array));
        int i = 0;
        int j = array.length - 1;

        if(array.length > 1) {
            while(j > i) {
                if(array[j] < array[j-1]) {
                    int temp = array[j];
                    array[j] = array[j-1];
                    array[j-1] = temp;
                    j = j - 1;
                } else {
                    int temp = array[i];
                    array[i] = array[j-1];
                    array[j-1] = temp;
                    i = i + 1;
                }
            }
            int[] left = Arrays.copyOfRange(array, 0, i);
            int[] right = Arrays.copyOfRange(array, j, array.length);
            internalSort(left);
            internalSort(right);
        }
    }
}

