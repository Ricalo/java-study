import org.junit.Test;
import static org.junit.Assert.*;

public class QuickSortTest {
    @Test
    public void testAlreadySorted() {
        int[] data = {1, 2, 3, 4};
        int[] sortedData = QuickSort.sort(data);
        assertTrue(sortedData[0] == 1);
        assertTrue(sortedData[3] == 4);
    }

    @Test
    public void testWorstScenario() {
        int[] data = {4, 3, 2, 1};
        int[] sortedData = QuickSort.sort(data);

        assertTrue(sortedData[0] == 1);
        assertTrue(sortedData[3] == 4);
    }

    @Test
    public void testEmpty() {
        int[] data = {};
        int[] sortedData = QuickSort.sort(data);
        assertTrue(sortedData.length == 0);
    }

    @Test
    public void testSameNumber() {
        int[] data = {1, 1, 1, 1};
        int[] sortedData = QuickSort.sort(data);
        assertTrue(sortedData.length == 4);
    }

    @Test
    public void testOneElement() {
        int[] data = {672};
        int[] sortedData = QuickSort.sort(data);
        assertTrue(sortedData.length == 1);
    }

    @Test
    public void testOddNumber() {
        int[] data = {4, 3, 5, 2, 1};
        int[] sortedData = QuickSort.sort(data);

        assertTrue(sortedData[0] == 1);
        assertTrue(sortedData[4] == 5);
    }

    @Test
    public void testNegative() {
        int[] data = {-4, -3, -5, -2, -1};
        int[] sortedData = QuickSort.sort(data);

        assertTrue(sortedData[0] == -5);
        assertTrue(sortedData[4] == -1);
    }

    @Test
    public void testSplitMiddle() {
        int[] data = {-4, -3, -5, 2, 1, 8, 0};
        int[] sortedData = QuickSort.sort(data);

        assertTrue(sortedData[0] == -5);
        assertTrue(sortedData[6] == 8);
    }
}

