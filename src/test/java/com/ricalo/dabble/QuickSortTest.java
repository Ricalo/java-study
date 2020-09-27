package com.ricalo.dabble;

public class QuickSortTest extends AbstractArraySortTest {
  AbstractArraySort getArraySort() {
    return new QuickSort();
  }
}
