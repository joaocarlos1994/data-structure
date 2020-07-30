package br.com.datastructure.array;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

/**
 * <i>https://www.hackerrank.com/challenges/arrays-ds/problem</i>
 * */
public class ArraysDSTest {

    @Test
    public void oneTest() {
        final int[] input = {1, 4, 3, 2};
        int[] result = ArraysDS.reverseArray(input);
        int[] expected = {2, 3, 4, 1};
        Assert.assertArrayEquals(expected, input);
    }

    @Test
    public void twoTest() {
        final int[] input = {1, 4, 3, 2, 5};
        int[] result = ArraysDS.reverseArray(input);
        int[] expected = {5, 2, 3, 4, 1};
        Assert.assertArrayEquals(expected, input);
    }




}
