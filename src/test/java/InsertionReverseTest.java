import org.junit.Test;
import static org.junit.Assert.*;

public class InsertionReverseTest {
    @Test
    public void testAlreadySorted() {
        int[] data = {4, 3, 2, 1};
        int[] sortedData = InsertionReverse.sort(data);
        assertTrue( "Insertion reverse works with already sorted arrays",
                sortedData[0] == 4);
        assertTrue( "Insertion reverse works with already sorted arrays",
                sortedData[3] == 1);
    }

    @Test
    public void testWorstScenario() {
        int[] data = {1, 2, 3, 4};
        int[] sortedData = InsertionReverse.sort(data);
        assertTrue( "Insertion reverse works with arrays in reverse order",
                sortedData[0] == 4);
        assertTrue( "Insertion reverse works with arrays in reverse order",
                sortedData[3] == 1);
    }

    @Test
    public void testEmpty() {
        int[] data = {};
        int[] sortedData = InsertionReverse.sort(data);
        assertTrue("Insertion reverse works with empty arrays",
                sortedData.length == 0);
    }

    @Test
    public void testSameNumber() {
        int[] data = {1, 1, 1, 1};
        int[] sortedData = InsertionReverse.sort(data);
        assertTrue("Insertion reverse works with an array with the same " +
                "number in it",
                sortedData.length == 4);
    }

    @Test
    public void testOneElement() {
        int[] data = {672};
        int[] sortedData = InsertionReverse.sort(data);
        assertTrue("Insertion reverse works with an array of one element",
                sortedData.length == 1);
    }
}

