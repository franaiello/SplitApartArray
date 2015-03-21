package com.interview.questions;

import org.testng.annotations.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class SplitArrayApartTest {
    @Test
    public void splitIntegerArray_Valid() {
        List<int[]> list = SplitArrayApart.splitIntegerArray(new int[]{1, 2, 3, 4, 5, 6});
        assertThat(list).containsExactly(new int[] {1,2}, new int[] {3,4}, new int[] {5,6});
    }

    @Test
    public void splitStringArray_Valid() {
        List<String[]> list = SplitArrayApart.splitStringArray(new String[]{"a", "b", "c", "d", "e", "f"});
        assertThat(list).containsExactly(new String[] {"a","b"}, new String[] {"c","d"}, new String[] {"e","f"});
    }

}
