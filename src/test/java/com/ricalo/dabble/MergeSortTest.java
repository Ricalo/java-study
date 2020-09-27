package com.ricalo.dabble;

public class MergeSortTest extends AbstractArraySortTest {
  AbstractArraySort getArraySort() {
    return new MergeSort();
  }
}
