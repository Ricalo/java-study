package com.ricalo.dabble;

import java.util.Arrays;
import org.checkerframework.checker.nullness.qual.NonNull;

public class InsertionSort extends AbstractArraySort {
  void internalSort(@NonNull final int start, @NonNull final int end, @NonNull final int... array) {
    if (array.length == 1) {
      return;
    }

    for (int j = 1; j < array.length; j++) {
      final int key = array[j];
      System.out.println("Sorting key: " + getPaddingForArray(j, array) + " " + key);

      int index = j - 1;
      while (index >= 0 && array[index] > key) {
        array[index + 1] = array[index];
        index--;
      }

      array[index + 1] = key;
      System.out.println("    Sorting: " + Arrays.toString(array));
    }
  }
}
