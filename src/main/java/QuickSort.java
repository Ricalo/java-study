import java.util.Arrays;

public class QuickSort {
    private static int[] ret;

    public static int[] sort(int[] array) {
        if(array.length < 2) {
            return array;
        }

        // Make a clone of the initial array just to preserve it
        ret = (int[])array.clone();

        internalSort(ret, 0, ret.length - 1);

        System.out.println("Original: " + Arrays.toString(array));
        System.out.println("  Sorted: " + Arrays.toString(ret));
        return ret;
    }

    private static void internalSort(int[] array, int start, int end) {
        System.out.println("Start: " + start + " End: " + end);

        if(end > 0) {
            System.out.println("Dividing " + Arrays.toString(Arrays.copyOfRange(array, start, end)));
        }
        int i = start;
        int j = end;

        if(end - start > 1) {
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
            internalSort(array, start, i - 1);
            internalSort(array, j, end);
        }
    }
}

