import java.util.Arrays;

public class QuickSort {
    private static int[] ret;

    public static int[] sort(int[] array) {
        if(array.length < 2) {
            return array;
        }

        // Make a clone of the initial array just to preserve the original
        ret = array.clone();

        System.out.println("     Original: " + Arrays.toString(array));
        internalSort(ret, 0, ret.length - 1);
        System.out.println("  Sorted: " + Arrays.toString(ret));
        return ret;
    }

    private static void internalSort(int[] array, int start, int end) {
        if(end - start > 0) {
            int current = start;
            int wall = start;
            int pivot = end;

            System.out.print("  Now sorting: ");
            String pad = "";
            for(int i = 0; i < start; i++)
                pad = pad + "   ";
            System.out.print(pad + Arrays.toString(Arrays.copyOfRange(array, start, end)));
            System.out.println("[" + array[pivot] + "]");

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

            // Print the next recursive calls
            System.out.print("       Result: ");
            int[] left  = Arrays.copyOfRange(array, start, wall);
            int[] right = Arrays.copyOfRange(array, wall + 1, end + 1);
            System.out.print(pad);
            if(left.length > 0)
                System.out.print(Arrays.toString(left));
            System.out.print("[" + array[wall] + "]");
            if(right.length > 0)
                System.out.println(Arrays.toString(right));
            System.out.println();

            if(wall - start > 1)
                internalSort(array, start, wall - 1);
            if(end - wall > 1)
                internalSort(array, wall + 1, end);

        }
    }
}

