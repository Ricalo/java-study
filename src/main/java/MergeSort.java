import java.util.Arrays;

public class MergeSort {
    public static void sort(int[] array) {
        System.out.println("Splitting " + Arrays.toString(array));
        if(array.length > 1) {
            int mid = array.length / 2;
            int[] left = Arrays.copyOfRange(array, 0, mid);
            int[] right = Arrays.copyOfRange(array, mid, array.length);

            sort(left);
            sort(right);

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
