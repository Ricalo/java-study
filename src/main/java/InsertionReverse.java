import org.checkerframework.checker.nullness.qual.NonNull;

public class InsertionReverse {
    public static int[] sort(@NonNull int[] array) {
        for(int j = 1; j < array.length; j++) {
            int key = array[j];
            int i = j - 1;
            while(i >= 0 && array[i] < key) {
                array[i + 1] = array[i];
                i = i - 1;
            }
            array[i + 1] = key;
        }
        return array;
    }
}

