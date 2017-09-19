import org.checkerframework.checker.nullness.qual.NonNull;
import java.util.Arrays;

public class InsertionSort extends BaseArraySort {
    void internalSort(@NonNull int[] array, int start, int end) {
        if(array.length < 2) {
            return;
        }

        for(int j = 1; j < array.length; j++) {
            int key = array[j];
            System.out.println("Sorting key: " + key);
            int i = j - 1;
            while(i >= 0 && array[i] > key) {
                array[i + 1] = array[i];
                i = i - 1;
            }
            array[i + 1] = key;
            System.out.println("Sorting " + Arrays.toString(array));
        }
    }
}

