import org.checkerframework.checker.nullness.qual.NonNull;

public class Math {
    public static int factorial(@NonNull int value) {
        if(value < 0) {
            throw new ArithmeticException("Factorial doesn't accept negative" +
                    "numbers");
        } else if(value == 0) {
            return 1;
        } else {
            return factorial(value - 1) * value;
        }
    }
}

