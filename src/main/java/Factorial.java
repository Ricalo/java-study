import org.checkerframework.checker.nullness.qual.NonNull;

public class Factorial {
    public static int execute(@NonNull int value) {
        if(value < 0) {
            throw new ArithmeticException("Factorial doesn't accept negative" +
                    "numbers");
        } else if(value == 0) {
            return 1;
        } else {
            return execute(value - 1) * value;
        }
    }
}

