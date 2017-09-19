import org.checkerframework.checker.nullness.qual.NonNull;
import java.util.Arrays;

public class InsertionSort {
    public static int[] sort(@NonNull int[] array) {
        if(array.length < 2) {
            return array;
        }

        // Make a clone of the initial array to preserve the original order
        int[] ret = array.clone();

        System.out.println("      Input: " + Arrays.toString(array));

        for(int j = 1; j < ret.length; j++) {
            int key = ret[j];
            System.out.println("Sorting key: " + key);
            int i = j - 1;
            while(i >= 0 && ret[i] > key) {
                ret[i + 1] = ret[i];
                i = i - 1;
            }
            ret[i + 1] = key;
            System.out.println("Sorting " + Arrays.toString(ret));
        }

        System.out.println("     Output: " + Arrays.toString(ret));
        return ret;
    }
}

