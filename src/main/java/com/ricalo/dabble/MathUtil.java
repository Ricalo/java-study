package com.ricalo.dabble;

import com.google.common.flogger.FluentLogger;
import org.checkerframework.checker.nullness.qual.NonNull;

public final class MathUtil {
  private static final FluentLogger logger = FluentLogger.forEnclosingClass();

  private MathUtil() {}

  /**
   * Returns the factorial of the provided value.
   *
   * @param value The value whose factorial is calculated.
   * @return The factorial of the value provided.
   */
  public static int factorial(@NonNull final int value) {
    if (value < 0) {
      String message = "Factorial doesn't accept negative numbers";
      ArithmeticException arithmeticException = new ArithmeticException(message);
      logger.atWarning().withCause(arithmeticException).log(message, value);
      throw arithmeticException;
    } else if (value == 0) {
      return 1;
    } else {
      return factorial(value - 1) * value;
    }
  }

  /**
   * Returns the value of the base elevated to the power using a recursive algorithm.
   *
   * @param base The base value that is elevated to the power.
   * @param power The value to whom the base is elevated to.
   * @return The value of the base elevated to the power.
   */
  public static double toPowerRecursive(@NonNull final double base, @NonNull final double power) {
    if (power == 0) {
      return 1;
    } else if (power < 0) {
      return 1 / toPowerRecursive(base, power * -1);
    } else {
      if (power % 2 == 0) {
        return toPowerRecursive(base * base, power / 2);
      } else {
        return base * toPowerRecursive(base, power - 1);
      }
    }
  }

  /**
   * Returns the value of the base elevated to the power using an iterative algorithm.
   *
   * @param base The base value that is elevated to the power.
   * @param power The value to whom the base is elevated to.
   * @return The value of the base elevated to the power.
   */
  public static double toPowerIterative(@NonNull final double base, @NonNull final double power) {
    double ret = 1;
    final boolean negativePower = power < 0;
    double absolutePower = negativePower ? power * -1 : power;
    double tempBase = base;

    int index = 0;
    while (index < absolutePower) {
      if (absolutePower % 2 == 0) {
        absolutePower = absolutePower / 2;
        tempBase = tempBase * tempBase;
      } else {
        ret = ret * tempBase;
        index++;
      }
    }

    return negativePower ? 1 / ret : ret;
  }

  /**
   * Returns the approximate square root of the value provided. 
   *
   * @param value   The value for which to calculate the square root.
   * @param epsilon The acceptable error.
   * @return        The square root of value that is within the acceptable error.
   */
  public static double squareRoot(double value, double epsilon) {
    double initialGuess = value;
    return MathUtil.squareRootRecursive(initialGuess, value, epsilon);
  }

  private static double squareRootRecursive(double guess, double value, double epsilon) {
    final double guessSquare = guess * guess;
    final double diff = guessSquare - value;
    final double absDiff = Math.abs(diff);
    if(absDiff <= epsilon) {
      return guess;
    } else {
      // Use Newton's method to calculate the new guess.
      double newGuess = (guess + (value / guess)) / 2;
      return squareRootRecursive(newGuess, value, epsilon);
    }
  }
}
