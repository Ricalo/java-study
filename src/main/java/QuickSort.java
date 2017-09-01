import java.util.Arrays;
import java.lang.StringBuilder;

public class QuickSort {
    private static int[] ret;

    public static int[] sort(int[] array) {
        if(array.length < 2) {
            return array;
        }

        // Make a clone of the initial array just to preserve the original
        ret = array.clone();

        System.out.println("      Input: " + Arrays.toString(array));
        internalSort(ret, 0, ret.length - 1);
        System.out.println("     Output: " + Arrays.toString(ret));
        return ret;
    }

    private static void internalSort(int[] array, int start, int end) {
        if(end - start > 1) {
            int current = start;
            int wall = start;
            int pivot = end;

            System.out.println(formatArrayStatusBeforeIteration(array, start, end, pivot));

            while(current < pivot) {
                if(array[current] >= array[pivot]) {
                    current = current + 1;
                } else {
                    int temp = array[current];
                    array[current] = array[wall];
                    array[wall] = temp;
                    wall = wall + 1;
                    current = current + 1;
                }
            }

            int temp = array[pivot];
            array[pivot] = array[wall];
            array[wall] = temp;

            System.out.println(formatArrayStatusAfterIteration(array, start, end, wall));

            internalSort(array, start, wall - 1);
            internalSort(array, wall + 1, end);

        }
    }

    private static String formatArrayStatusBeforeIteration(int[] array, int start, int end, int pivot){
        StringBuilder sb = new StringBuilder();
        sb.append("Now sorting: ");
        sb.append(getPaddingForArray(array, start) + Arrays.toString(Arrays.copyOfRange(array, start, end)));
        sb.append(" " + array[pivot] + "←");

        return sb.toString();
    }

    private static String formatArrayStatusAfterIteration(int[] array, int start, int end, int wall){
        StringBuilder sb = new StringBuilder();
        sb.append("     Result: ");
        sb.append(getPaddingForArray(array, start));
        int[] left  = Arrays.copyOfRange(array, start, wall);
        int[] right = Arrays.copyOfRange(array, wall + 1, end + 1);
        if(left.length > 0)
            sb.append(Arrays.toString(left) + "<");
        else
            sb.append(" ");
        sb.append(array[wall]);
        if(right.length > 0)
            sb.append("<" + Arrays.toString(right));

        return sb.toString();
    }

    private static String getPaddingForArray(int[] array, int start){
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < start; i++)
            if(array[i] >= 0)
                sb.append("   ");
            else
                sb.append("    ");

        return sb.toString();
    }
}

