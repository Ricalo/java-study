package com.ricalo.study;

import org.checkerframework.checker.nullness.qual.NonNull;

public class BubbleSort extends AbstractArraySort {
    public void internalSort(@NonNull final int start, @NonNull final int end,
            @NonNull final int... array) {
        if(array.length == 1) {
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
