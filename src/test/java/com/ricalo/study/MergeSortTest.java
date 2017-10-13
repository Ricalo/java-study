package com.ricalo.study;

public class MergeSortTest extends AbstractArraySortTest {
  AbstractArraySort getArraySort() {
    return new MergeSort();
  }
}
