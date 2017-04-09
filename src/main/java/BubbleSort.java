import org.checkerframework.checker.nullness.qual.*;
import java.util.Arrays;

public class BubbleSort {
    public static int[] sort(@NonNull int[] array) {
        for(int i = 0; i < array.length; i++) {
	        for(int j = array.length - 1; j > i; j--) {
    		    if(array[j] < array[j - 1]) {
	                int temp;
    		        temp = array[j];
                    array[j] = array[j - 1];
        	        array[j - 1] = temp;
	     	    }
	        }
	    }
        return array;
    }
}
