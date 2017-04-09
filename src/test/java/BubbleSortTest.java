import org.junit.Test;
import static org.junit.Assert.*;

public class BubbleSortTest {
    @Test
    public void testAlreadySorted() {
        int[] data = {1, 2, 3, 4};
	int[] sortedData = BubbleSort.sort(data);
        assertTrue("Bubble sort works with already sorted arrays", sortedData[0] == 1);
        assertTrue("Bubble sort works with already sorted arrays", sortedData[3] == 4);
    }

    @Test
    public void testWorstScenario() {
        int[] data = {4, 3, 2, 1};
	int[] sortedData = BubbleSort.sort(data);
        assertTrue("Bubble sort works with arrays in reverse order", sortedData[0] == 1);
        assertTrue("Bubble sort works with arrays in reverse order", sortedData[3] == 4);
    }

    @Test
    public void testEmpty() {
        int[] data = {};
        int[] sortedData = BubbleSort.sort(data);
        assertTrue("Bubble sort works with empty arrays",
                sortedData.length == 0);
    }
}
