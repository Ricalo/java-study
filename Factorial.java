import java.util.Arrays;

public class Factorial {
    public static int execute(int value) {
        if(value <= 1) {
	    return 1;
	} else {
            return execute(value - 1) * value;
	}
    }
}
