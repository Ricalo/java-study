package com.ricalo.dabble;

import java.util.Arrays;
import org.checkerframework.checker.nullness.qual.NonNull;

public class MergeSort extends AbstractArraySort {
  void internalSort(@NonNull final int start, @NonNull final int end, @NonNull final int... array) {
    if (array.length > 1) {
      System.out.println("  Splitting: " + Arrays.toString(array));
      final int mid = array.length / 2;
      final int[] left = Arrays.copyOfRange(array, 0, mid);
      final int[] right = Arrays.copyOfRange(array, mid, array.length);

      internalSort(0, left.length - 1, left);
      internalSort(0, right.length - 1, right);

      int leftIndex = 0;
      int rightIndex = 0;
      int resultIndex = 0;

      System.out.print(
          "    Merging: " + Arrays.toString(left) + " and " + Arrays.toString(right) + " -> ");

      while (leftIndex < left.length && rightIndex < right.length) {
        if (left[leftIndex] < right[rightIndex]) {
          array[resultIndex] = left[leftIndex];
          leftIndex++;
        } else {
          array[resultIndex] = right[rightIndex];
          rightIndex++;
        }
        resultIndex++;
      }

      while (leftIndex < left.length) {
        array[resultIndex] = left[leftIndex];
        leftIndex++;
        resultIndex++;
      }

      while (rightIndex < right.length) {
        array[resultIndex] = right[rightIndex];
        rightIndex++;
        resultIndex++;
      }

      System.out.println(Arrays.toString(array));
    }
  }
}
