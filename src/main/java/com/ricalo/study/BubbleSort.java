package com.ricalo.study;

import org.checkerframework.checker.nullness.qual.NonNull;
import java.util.Arrays;

public class BubbleSort extends AbstractArraySort {
    public void internalSort(@NonNull int[] array, int start, int end) {
        if(array.length < 2) {
            return;
        }

        for(int i = start; i < end + 1; i++) {
            for(int j = end; j > i; j--) {
                if(array[j] < array[j - 1]) {
                    int temp;
                    temp = array[j];
                    array[j] = array[j - 1];
                    array[j - 1] = temp;
                }
            }
        }
    }
}
