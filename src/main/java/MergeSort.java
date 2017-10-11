import java.util.Arrays;

public class MergeSort extends AbstractArraySort {
    void internalSort(int[] array, int start, int end) {
        if(array.length > 1) {
            System.out.println("  Splitting: " + Arrays.toString(array));
            int mid = array.length / 2;
            int[] left = Arrays.copyOfRange(array, 0, mid);
            int[] right = Arrays.copyOfRange(array, mid, array.length);

            internalSort(left, 0, left.length - 1);
            internalSort(right, 0, right.length - 1);

            int i = 0;
            int j = 0;
            int resultIndex = 0;

            System.out.print("    Merging: " + Arrays.toString(left) +
                    " and " + Arrays.toString(right) + " -> ");

            while(i < left.length && j < right.length) {
                if(left[i] < right[j]) {
                    array[resultIndex] = left[i];
                    i++;
                } else {
                    array[resultIndex] = right[j];
                    j++;
                }
                resultIndex++;
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

            System.out.println(Arrays.toString(array));
        }
    }
}

