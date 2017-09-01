import java.util.Arrays;

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
        int current = start;
        int wall = start;
        int pivot = end;

        if(end - start > 1) {
            System.out.print("Now sorting: ");
            String pad = "";
            for(int i = 0; i < start; i++)
                if(array[i] >= 0)
                    pad = pad + "   ";
                else
                    pad = pad + "    ";
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
            System.out.print("     Result: ");
            int[] left  = Arrays.copyOfRange(array, start, wall);
            int[] right = Arrays.copyOfRange(array, wall + 1, end + 1);
            System.out.print(pad);
            if(left.length > 0)
                System.out.print(Arrays.toString(left));
            System.out.print("<" + array[wall] + "<");
            if(right.length > 0)
                System.out.print(Arrays.toString(right));
            System.out.println();

            internalSort(array, start, wall - 1);
            internalSort(array, wall + 1, end);

        }
    }
}

