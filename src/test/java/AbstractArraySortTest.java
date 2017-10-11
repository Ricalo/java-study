import org.junit.Test;
import static org.junit.Assert.*;

import org.junit.Before;

public abstract class AbstractArraySortTest {
    AbstractArraySort _arraySort;

    abstract AbstractArraySort getArraySort();

    @Before
    public void initializeArraySort() {
        _arraySort = getArraySort();
    }

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

    @Test
    public void testAlreadySorted() {
        int[] data = {1, 2, 3, 4};
        int[] sortedData = _arraySort.sort(data);

        assertTrue(isSorted(sortedData));
    }

    @Test
    public void testWorstScenario() {
        int[] data = {4, 3, 2, 1};
        int[] sortedData = _arraySort.sort(data);

        assertTrue(isSorted(sortedData));
    }

    @Test
    public void testEmpty() {
        int[] data = {};
        int[] sortedData = _arraySort.sort(data);

        assertTrue(isSorted(sortedData));
    }

    @Test
    public void testSameNumber() {
        int[] data = {1, 1, 1, 1};
        int[] sortedData = _arraySort.sort(data);

        assertTrue(isSorted(sortedData));
    }

    @Test
    public void testOneElement() {
        int[] data = {672};
        int[] sortedData = _arraySort.sort(data);

        assertTrue(isSorted(sortedData));
    }

    @Test
    public void testOddNumber() {
        int[] data = {4, 3, 5, 2, 1};
        int[] sortedData = _arraySort.sort(data);

        assertTrue(isSorted(sortedData));
    }

    @Test
    public void testNegative() {
        int[] data = {-4, -3, -5, -2, -1};
        int[] sortedData = _arraySort.sort(data);

        assertTrue(isSorted(sortedData));
    }

    @Test
    public void testSplitMiddle() {
        int[] data = {-4, -3, -5, 2, 1, 8, 0};
        int[] sortedData = _arraySort.sort(data);

        assertTrue(isSorted(sortedData));
    }
}

