package com.ricalo.study;

import org.checkerframework.checker.nullness.qual.NonNull;

public class BubbleSort extends AbstractArraySort {

  /**
   * Sorts the subarray {[start],...,[end]} using the bubble sort algorithm.
   * @param start The index that defines the first element of the subarray to
   *              be sorted.
   * @param end   The index that defines the last element of the subarray to be
   *              sorted.
   * @param array The array that contains the subarray to be sorted.
   */
  public void internalSort(@NonNull final int start, @NonNull final int end,
          @NonNull final int... array) {
    if (array.length == 1) {
      return;
    }

    for (int i = start; i < end + 1; i++) {
      for (int j = end; j > i; j--) {
        if (array[j] < array[j - 1]) {
          int temp;
          temp = array[j];
          array[j] = array[j - 1];
          array[j - 1] = temp;
        }
      }
    }
  }
}
