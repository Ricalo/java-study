package com.ricalo.study;

import java.util.Arrays;
import java.lang.StringBuilder;

import org.checkerframework.checker.nullness.qual.NonNull;

public class QuickSort extends AbstractArraySort {
    void internalSort(@NonNull final int start, @NonNull final int end,
            @NonNull final int... array) {
        if(end - start > 0) {
            int current = start;
            int wall = start;
            int pivot = end;

            System.out.println(formatArrayStatusBeforeIteration(start, end, pivot, array));

            while(current < pivot) {
                if(array[current] >= array[pivot]) {
                    current = current + 1;
                } else {
                    int temp = array[current];
                    array[current] = array[wall];
                    array[wall] = temp;
                    wall = wall + 1;
                    current = current + 1;
                }
            }

            int temp = array[pivot];
            array[pivot] = array[wall];
            array[wall] = temp;

            System.out.println(formatArrayStatusAfterIteration(start, end, wall, array));

            internalSort(start, wall - 1, array);
            internalSort(wall + 1, end, array);

        }
    }

    private String formatArrayStatusBeforeIteration(int start, int end, int pivot, int... array){
        StringBuilder sb = new StringBuilder();
        sb.append("Now sorting: ");
        sb.append(getPaddingForArray(start, array) + Arrays.toString(Arrays.copyOfRange(array, start, end)));
        sb.append(" " + array[pivot] + "←");

        return sb.toString();
    }

    private String formatArrayStatusAfterIteration(int start, int end, int wall, int... array){
        StringBuilder sb = new StringBuilder();
        sb.append("     Result: ");
        sb.append(getPaddingForArray(start, array));
        int[] left  = Arrays.copyOfRange(array, start, wall);
        int[] right = Arrays.copyOfRange(array, wall + 1, end + 1);
        if(left.length > 0)
            sb.append(Arrays.toString(left) + "<");
        else
            sb.append(" ");
        sb.append(array[wall]);
        if(right.length > 0)
            sb.append("<" + Arrays.toString(right));

        return sb.toString();
    }
}

