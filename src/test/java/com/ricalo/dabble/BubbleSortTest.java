package com.ricalo.dabble;

public class BubbleSortTest extends AbstractArraySortTest {
  AbstractArraySort getArraySort() {
    return new BubbleSort();
  }
}
