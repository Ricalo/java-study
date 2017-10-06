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
        } else if (power < 0) {
            return 1 / toPowerRecursive(base, power * -1);
        } else {
            if(power % 2 == 0) {
                return toPowerRecursive(base * base, power / 2);
            } else {
                return base * toPowerRecursive(base, power - 1);
            }
        }
    }

    public static double toPowerIterative(@NonNull long base, @NonNull int power) {
        double ret=1;
        boolean negativePower = power < 0;

        if(negativePower) {
            power = power * -1;
        }

        int i = 0;
        while (i < power) {
            if(power % 2 == 0) {
                power = power / 2;
                base = base * base;
            } else {
                ret = ret * base;
                i++;
            }
        }

        return negativePower ? 1 / ret : ret;
    }
}
