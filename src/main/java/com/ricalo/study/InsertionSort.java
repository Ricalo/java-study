package com.ricalo.study;

import org.checkerframework.checker.nullness.qual.NonNull;
import java.util.Arrays;

public class InsertionSort extends AbstractArraySort {
    void internalSort(@NonNull final int start, @NonNull final int end,
            @NonNull final int... array) {
        if(array.length == BASE_CASE) {
            return;
        }

        for(int j = 1; j < array.length; j++) {
            final int key = array[j];
            System.out.println("Sorting key: " + getPaddingForArray(j, array)
                    + " " + key);

            int index = j - 1;
            while(index >= 0 && array[index] > key) {
                array[index + 1] = array[index];
                index--;
            }

            array[index + 1] = key;
            System.out.println("    Sorting: " + Arrays.toString(array));
        }
    }
}
