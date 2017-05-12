import org.junit.Test;
import static org.junit.Assert.*;

public class MergeSortTest {
    @Test
    public void testAlreadySorted() {
        int[] data = {1, 2, 3, 4};
        int[] sortedData = MergeSort.sort(data);
        assertTrue("Merge sort works with already sorted arrays",
                sortedData[0] == 1);
        assertTrue("Merge sort works with already sorted arrays",
                sortedData[3] == 4);
    }
}
