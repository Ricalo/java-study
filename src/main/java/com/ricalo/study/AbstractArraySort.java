package com.ricalo.study;

import org.checkerframework.checker.nullness.qual.NonNull;
import java.util.Arrays;

public abstract class AbstractArraySort {
    abstract void internalSort(@NonNull int[] array, int start, int end);

    public int[] sort(@NonNull int[] array) {
        // Make a clone of the initial array just to preserve the original
        int[] ret = array.clone();

        System.out.println("      Input: " + Arrays.toString(array));
        internalSort(ret, 0, ret.length - 1);
        System.out.println("     Output: " + Arrays.toString(ret));

        return ret;
    }

    protected String getPaddingForArray(int[] array, int start){
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < start; i++)
            if(array[i] >= 0)
                sb.append("   ");
            else
                sb.append("    ");

        return sb.toString();
    }
}
