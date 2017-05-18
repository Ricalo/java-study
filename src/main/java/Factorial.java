import org.checkerframework.checker.nullness.qual.NonNull;

public class Factorial {
    public static int execute(@NonNull int value) {
        if(value <= 1) {
            return 1;
        } else {
            return execute(value - 1) * value;
        }
    }
}

