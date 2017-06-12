import org.junit.Test;
import static org.junit.Assert.*;

public class QuickSortTest {
    @Test
    public void testAlreadySorted() {
        int[] data = {1, 2, 3, 4};
        int[] sortedData = QuickSort.sort(data);
        assertTrue("Quick sort works with already sorted arrays",
                sortedData[0] == 1);
        assertTrue("Quick sort works with already sorted arrays",
                sortedData[3] == 4);
    }

    @Test
    public void testWorstScenario() {
        int[] data = {4, 3, 2, 1};
        int[] sortedData = QuickSort.sort(data);

        assertTrue("Quick sort works with arrays in reverse order",
                sortedData[0] == 1);
        assertTrue("Quick sort works with arrays in reverse order",
                sortedData[3] == 4);
    }

    @Test
    public void testEmpty() {
        int[] data = {};
        int[] sortedData = QuickSort.sort(data);
        assertTrue("Quick sort works with empty arrays",
                sortedData.length == 0);
    }

    @Test
    public void testSameNumber() {
        int[] data = {1, 1, 1, 1};
        int[] sortedData = QuickSort.sort(data);
        assertTrue("Quick sort works with an array with the same number in it",
                sortedData.length == 4);
    }

    @Test
    public void testOneElement() {
        int[] data = {672};
        int[] sortedData = QuickSort.sort(data);
        assertTrue("Quick sort works with an array of one element",
                sortedData.length == 1);
    }

    @Test
    public void testOddNumber() {
        int[] data = {4, 3, 5, 2, 1};
        int[] sortedData = QuickSort.sort(data);

        assertTrue("Quick sort works with an odd number of elements",
                sortedData[0] == 1);
        assertTrue("Quick sort works with an odd number of elements",
                sortedData[4] == 5);
    }

    @Test
    public void testNegative() {
        int[] data = {-4, -3, -5, -2, -1};
        int[] sortedData = QuickSort.sort(data);

        assertTrue("Quick sort works with negative numbers",
                sortedData[0] == -5);
        assertTrue("Quick sort works with negative numbers",
                sortedData[4] == -1);
    }
}
