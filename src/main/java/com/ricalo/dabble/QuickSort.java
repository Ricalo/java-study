package com.ricalo.dabble;

import java.util.Arrays;
import org.checkerframework.checker.nullness.qual.NonNull;

public class QuickSort extends AbstractArraySort {
  void internalSort(@NonNull final int start, @NonNull final int end, @NonNull final int... array) {
    if (end - start > 0) {
      int current = start;
      int wall = start;
      final int pivot = end;

      System.out.println(formatArrayStatusBeforeIteration(start, end, pivot, array));

      while (current < pivot) {
        if (array[current] >= array[pivot]) {
          current = current + 1;
        } else {
          final int temp = array[current];
          array[current] = array[wall];
          array[wall] = temp;
          wall = wall + 1;
          current = current + 1;
        }
      }

      final int temp = array[pivot];
      array[pivot] = array[wall];
      array[wall] = temp;

      System.out.println(formatArrayStatusAfterIteration(start, end, wall, array));

      internalSort(start, wall - 1, array);
      internalSort(wall + 1, end, array);
    }
  }

  private String formatArrayStatusBeforeIteration(
      @NonNull final int start,
      @NonNull final int end,
      @NonNull final int pivot,
      @NonNull final int... array) {
    final StringBuilder stringBuilder = new StringBuilder();
    stringBuilder
        .append("Now sorting: ")
        .append(getPaddingForArray(start, array))
        .append(Arrays.toString(Arrays.copyOfRange(array, start, end)))
        .append(" " + array[pivot] + "←");

    return stringBuilder.toString();
  }

  private String formatArrayStatusAfterIteration(
      @NonNull final int start,
      @NonNull final int end,
      @NonNull final int wall,
      @NonNull final int... array) {
    final StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append("     Result: ").append(getPaddingForArray(start, array));
    final int[] left = Arrays.copyOfRange(array, start, wall);
    final int[] right = Arrays.copyOfRange(array, wall + 1, end + 1);

    if (left.length > 0) {
      stringBuilder.append(Arrays.toString(left)).append('<');
    } else {
      stringBuilder.append(' ');
    }

    stringBuilder.append(array[wall]);
    if (right.length > 0) {
      stringBuilder.append('<').append(Arrays.toString(right));
    }

    return stringBuilder.toString();
  }
}
