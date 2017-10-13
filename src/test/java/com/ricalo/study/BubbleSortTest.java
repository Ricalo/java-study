package com.ricalo.study;

public class BubbleSortTest extends AbstractArraySortTest {
  AbstractArraySort getArraySort() {
    return new BubbleSort();
  }
}
