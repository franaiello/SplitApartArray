package com.interview.questions;

import org.testng.annotations.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class SplitArrayApartTest {
    // Split original array into thirds
    int splitIntoThirds = 3;

    // Split original array into halves
    int splitIntoHalves = 2;

    @Test
    public void splitIntegerArray_IntoThirds() {
        List<int[]> list = SplitArrayApart.splitIntegerArray(new int[]{1, 2, 3, 4, 5, 6}, splitIntoThirds);
        assertThat(list).containsExactly(new int[]{1, 2}, new int[]{3, 4}, new int[]{5, 6});
    }

    @Test(enabled = false)
    public void splitIntegerArray_IntoHalves() {
        List<int[]> list = SplitArrayApart.splitIntegerArray(new int[]{1, 2, 3, 4, 5, 6}, splitIntoHalves);
        assertThat(list).containsExactly(new int[]{1, 2, 3}, new int[]{4, 5, 6});
    }

    @Test
    public void splitStringArray_IntoThirds() {
        List<String[]> list = SplitArrayApart.splitStringArray(new String[]{"a", "b", "c", "d", "e", "f"}, splitIntoThirds);
        assertThat(list).containsExactly(new String[]{"a", "b"}, new String[]{"c", "d"}, new String[]{"e", "f"});
    }

    @Test
    public void splitStringArray_IntoHalves() {
        List<String[]> list = SplitArrayApart.splitStringArray(new String[]{"a", "b", "c", "d", "e", "f"}, splitIntoHalves);
        assertThat(list).containsExactly(new String[]{"a", "b", "c"}, new String[]{"d", "e", "f"});
    }

}
