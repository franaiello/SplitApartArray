package com.interview.questions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SplitArrayApart {


    /**
     * Method takes two parameters, the first is an integer array to
     * split apart and the second argument is how many times you want
     * to split up the array into separate individual arrays
     *
     * @param array
     * @param splitInto
     *
     * Example: array [1,2,3,4,5,6]
     *          returns [1,2] [3,4] [5,6]
     */
    public static List<int[]> splitIntegerArray(int[] array, int splitInto) {
        int arrayLength = array.length;
        int subArraySize = arrayLength / splitInto;
        List<int[]> list = new ArrayList<int[]>();

        for (int i = 0; i <= array.length - 1; i = i + subArraySize) {
            list.add(Arrays.copyOfRange(array, i, i + subArraySize));
        }

        return list;
    }

    /**
     * Method takes two parameters, the first is a String array to
     * split apart and the second argument is how many times you want
     * to split up the array into separate individual arrays
     *
     * @param array
     * @param splitInto
     * @return
     */
    public static List<String[]> splitStringArray(String[] array, int splitInto) {
        int arrayLength = array.length;
        int subArraySize = arrayLength / splitInto;
        List<String[]> list = new ArrayList<String[]>();

        for (int i = 0; i <= array.length - 1; i = i + subArraySize) {
            list.add(Arrays.copyOfRange(array, i, i + subArraySize));
        }

        return list;
    }
}
