package com.ricalo.dabble;

import static com.google.common.truth.Truth.assertThat;
import org.junit.Before;
import org.junit.Test;

public abstract class AbstractArraySortTest {
  private AbstractArraySort arraySort;

  abstract AbstractArraySort getArraySort();

  @Before
  public void initializeArraySort() {
    arraySort = getArraySort();
  }

  protected boolean isSorted(final int... array) {
    if (array.length < 2) {
      return true;
    } else {
      for (int i = 0; i < array.length - 1; i++) {
        if (array[i] > array[i + 1]) {
          return false;
        }
      }
      return true;
    }
  }

  @Test
  public void testAlreadySorted() {
    final int[] data = {1, 2, 3, 4};
    final int[] sortedData = arraySort.sort(data);

    assertThat(isSorted(sortedData)).isTrue();
  }

  @Test
  public void testWorstScenario() {
    final int[] data = {4, 3, 2, 1};
    final int[] sortedData = arraySort.sort(data);

    assertThat(isSorted(sortedData)).isTrue();
  }

  @Test
  public void testEmpty() {
    final int[] data = {};
    final int[] sortedData = arraySort.sort(data);

    assertThat(isSorted(sortedData)).isTrue();
  }

  @Test
  public void testSameNumber() {
    final int[] data = {1, 1, 1, 1};
    final int[] sortedData = arraySort.sort(data);

    assertThat(isSorted(sortedData)).isTrue();
  }

  @Test
  public void testOneElement() {
    final int[] sortedData = arraySort.sort(672);

    assertThat(isSorted(sortedData)).isTrue();
  }

  @Test
  public void testOddNumber() {
    final int[] data = {4, 3, 5, 2, 1};
    final int[] sortedData = arraySort.sort(data);

    assertThat(isSorted(sortedData)).isTrue();
  }

  @Test
  public void testNegative() {
    final int[] data = {-4, -3, -5, -2, -1};
    final int[] sortedData = arraySort.sort(data);

    assertThat(isSorted(sortedData)).isTrue();
  }

  @Test
  public void testSplitMiddle() {
    final int[] data = {-4, -3, -5, 2, 1, 8, 0};
    final int[] sortedData = arraySort.sort(data);

    assertThat(isSorted(sortedData)).isTrue();
  }
}
