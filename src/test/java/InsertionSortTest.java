import org.junit.Test;
import static org.junit.Assert.*;

public class InsertionSortTest {
    @Test
    public void testAlreadySorted() {
        int[] data = {1, 2, 3, 4};
        int[] sortedData = InsertionSort.sort(data);
        assertTrue( "Insertion sort works with already sorted arrays",
                sortedData[0] == 1);
        assertTrue( "Insertion sort works with already sorted arrays",
                sortedData[3] == 4);
    }

    @Test
    public void testWorstScenario() {
        int[] data = {4, 3, 2, 1};
        int[] sortedData = InsertionSort.sort(data);
        assertTrue( "Insertion sort works with arrays in reverse order",
                sortedData[0] == 1);
        assertTrue( "Insertion sort works with arrays in reverse order",
                sortedData[3] == 4);
    }

    @Test
    public void testEmpty() {
        int[] data = {};
        int[] sortedData = InsertionSort.sort(data);
        assertTrue("Insertion sort works with empty arrays",
                sortedData.length == 0);
    }

    @Test
    public void testSameNumber() {
        int[] data = {1, 1, 1, 1};
        int[] sortedData = InsertionSort.sort(data);
        assertTrue("Insertion sort works with an array with the same number in it",
                sortedData.length == 4);
    }

    @Test
    public void testOneElement() {
        int[] data = {672};
        int[] sortedData = InsertionSort.sort(data);
        assertTrue("Insertion sort works with an array of one element",
                sortedData.length == 1);
    }
}
