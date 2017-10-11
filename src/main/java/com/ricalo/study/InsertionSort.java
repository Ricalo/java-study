package com.ricalo.study;

import org.checkerframework.checker.nullness.qual.NonNull;
import java.util.Arrays;

public class InsertionSort extends AbstractArraySort {
    void internalSort(@NonNull final int start, @NonNull final int end,
            @NonNull final int... array) {
        if(array.length < 2) {
            return;
        }

        for(int j = 1; j < array.length; j++) {
            int key = array[j];
            System.out.println("Sorting key: " + getPaddingForArray(j, array)
                    + " " + key);
            int i = j - 1;
            while(i >= 0 && array[i] > key) {
                array[i + 1] = array[i];
                i = i - 1;
            }
            array[i + 1] = key;
            System.out.println("    Sorting: " + Arrays.toString(array));
        }
    }
}
