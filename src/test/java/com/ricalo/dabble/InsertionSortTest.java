package com.ricalo.dabble;

public class InsertionSortTest extends AbstractArraySortTest {
  AbstractArraySort getArraySort() {
    return new InsertionSort();
  }
}
