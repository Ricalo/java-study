import org.checkerframework.checker.nullness.qual.NonNull;
import java.util.Arrays;

public class BubbleSort {
    public static int[] sort(@NonNull int[] array) {
        if(array.length < 2) {
            return array;
        }

        // Make a clone of the initial array to preserve the original order
        int[] ret = array.clone();

        System.out.println("      Input: " + Arrays.toString(array));

        for(int i = 0; i < ret.length; i++) {
            for(int j = ret.length - 1; j > i; j--) {
                if(ret[j] < ret[j - 1]) {
                    int temp;
                    temp = ret[j];
                    ret[j] = ret[j - 1];
                    ret[j - 1] = temp;
                }
            }
        }

        System.out.println("     Output: " + Arrays.toString(ret));
        return ret;
    }
}
