public class BaseArraySortTest {
    protected boolean isSorted(int[] array) {
        if(array.length < 2) {
            return true;
        } else {
            for(int i = 0; i < array.length - 1; i++) {
                if(array[i] > array[i + 1]) {
                    return false;
                }
            }
            return true;
        }
    }
}

