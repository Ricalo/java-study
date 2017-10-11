package com.ricalo.study;

import org.checkerframework.checker.nullness.qual.NonNull;

public final class Math {
    private Math() {
        throw new AssertionError("Instantiating a utility class");
    }

    public static int factorial(@NonNull final int value) {
        if(value < 0) {
            throw new ArithmeticException("Factorial doesn't accept negative numbers");
        } else if(value == 0) {
            return 1;
        } else {
            return factorial(value - 1) * value;
        }
    }

    public static double toPowerRecursive(@NonNull final long base, @NonNull final int power) {
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

    public static double toPowerIterative(@NonNull final long base, @NonNull final int power) {
        double ret = 1;
        final boolean negativePower = power < 0;
        int absolutePower = negativePower ? power * -1 : power;
        long tempBase = base;

        int index = 0;
        while (index < absolutePower) {
            if(absolutePower % 2 == 0) {
                absolutePower = absolutePower / 2;
                tempBase = tempBase * tempBase;
            } else {
                ret = ret * tempBase;
                index++;
            }
        }

        return negativePower ? 1 / ret : ret;
    }
}
