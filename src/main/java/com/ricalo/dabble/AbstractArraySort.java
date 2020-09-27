package com.ricalo.dabble;

import java.util.Arrays;
import org.checkerframework.checker.nullness.qual.NonNull;

public abstract class AbstractArraySort {
  abstract void internalSort(
      @NonNull final int start, @NonNull final int end, @NonNull final int... array);

  /**
   * Sorts the provided array using the algorithm provided by children classes. The original array
   * is not modified.
   *
   * @param array The input array, which is not modified by the sorting algorithm.
   * @return An array that contains the same elements in the input array, but sorted from the
   *     smallest to the highest.
   */
  public int[] sort(@NonNull final int... array) {
    // Make a clone of the initial array just to preserve the original
    final int[] ret = array.clone();

    System.out.println("      Input: " + Arrays.toString(array));
    internalSort(0, ret.length - 1, ret);
    System.out.println("     Output: " + Arrays.toString(ret));

    return ret;
  }

  String getPaddingForArray(@NonNull final int start, @NonNull final int... array) {
    final StringBuilder stringBuilder = new StringBuilder();
    for (int i = 0; i < start; i++) {
      if (array[i] >= 0) {
        stringBuilder.append("   ");
      } else {
        stringBuilder.append("    ");
      }
    }

    return stringBuilder.toString();
  }
}
