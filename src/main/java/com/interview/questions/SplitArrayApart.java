package com.interview.questions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * input [1,2,3,4,5,6]
 * returns [1,2] [3,4] [5,6]
 */
public class SplitArrayApart {

    public static List<int[]> splitIntegerArray(int[] array) {
        int splitBy = 3;
        int arrayLength = array.length;
        int subArraySize = arrayLength / splitBy;
        List<int[]> list = new ArrayList<int[]>();

        for (int i = 0; i <= array.length - 1; i = i + subArraySize) {
            list.add(Arrays.copyOfRange(array, i, i + subArraySize));
        }

        return list;
    }

    public static List<String[]> splitStringArray(String[] array) {
        int splitBy = 3;
        int arrayLength = array.length;
        int subArraySize = arrayLength / splitBy;
        List<String[]> list = new ArrayList<String[]>();

        for (int i = 0; i <= array.length - 1; i = i + subArraySize) {
            list.add(Arrays.copyOfRange(array, i, i + subArraySize));
        }

        return list;
    }
}
