import org.checkerframework.checker.nullness.qual.NonNull;

public class Math {
    public static int factorial(@NonNull int value) {
        if(value < 0) {
            throw new ArithmeticException("Factorial doesn't accept negative numbers");
        } else if(value == 0) {
            return 1;
        } else {
            return factorial(value - 1) * value;
        }
    }

    public static double toPowerRecursive(@NonNull long base, @NonNull int power) {
        if(power == 0) {
            return 1;
        } else {
            return base * toPowerRecursive(base, power - 1);
        }
    }

    public static double toPowerIterative(@NonNull long base, @NonNull int power) {
        double ret=1;
        for (int i = 0; i < power; i++) {
            ret = ret * base;
        }
        return ret;
    }
}

