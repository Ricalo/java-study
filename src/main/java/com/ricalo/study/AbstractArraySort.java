package com.ricalo.study;

import org.checkerframework.checker.nullness.qual.NonNull;
import java.util.Arrays;

public abstract class AbstractArraySort {
    abstract void internalSort(@NonNull final int start, @NonNull final int end,
            @NonNull final int... array);

    public int[] sort(@NonNull final int... array) {
        // Make a clone of the initial array just to preserve the original
        final int[] ret = array.clone();

        System.out.println("      Input: " + Arrays.toString(array));
        internalSort(0, ret.length - 1, ret);
        System.out.println("     Output: " + Arrays.toString(ret));

        return ret;
    }

    String getPaddingForArray(@NonNull final int start, @NonNull final int... array){
        final StringBuilder stringBuilder = new StringBuilder();
        for(int i = 0; i < start; i++) {
            if(array[i] >= 0) {
                stringBuilder.append("   ");
            } else {
                stringBuilder.append("    ");
            }
        }

        return stringBuilder.toString();
    }
}
