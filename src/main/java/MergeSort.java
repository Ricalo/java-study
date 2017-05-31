import java.util.Arrays;

public class MergeSort {
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
        System.out.println("Splitting " + Arrays.toString(array));
        if(array.length > 1) {
            int mid = array.length / 2;
            int[] left = Arrays.copyOfRange(array, 0, mid);
            int[] right = Arrays.copyOfRange(array, mid, array.length);

            internalSort(left);
            internalSort(right);

            int i = 0;
            int j = 0;
            int resultIndex = 0;

            while(i < left.length && j < right.length) {
                if(left[i] < right[j]) {
                    array[resultIndex] = left[i];
                    i++;
                    resultIndex++;
                } else {
                    array[resultIndex] = right[j];
                    j++;
                    resultIndex++;
                }
            }

            while(i < left.length) {
                array[resultIndex] = left[i];
                i++;
                resultIndex++;
            }

            while(j < right.length) {
                array[resultIndex] = right[j];
                j++;
                resultIndex++;
            }
        }

        System.out.println("Merging " + Arrays.toString(array));
    }
}
