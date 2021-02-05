package br.com.datastructure.twosum;


import org.junit.Assert;
import org.junit.jupiter.api.Test;

/**
 * <i>https://www.hackerrank.com/challenges/contacts/problem</i>
 * */
public class TwoSumTest {

    @Test
    public void testOne() {
        final TwoSum sum = new TwoSum();
        int[] result = sum.twoSum(new int[]{1, 3, 4, 5, 7, 10, 11}, 9);
        Assert.assertArrayEquals(new int[] {2, 3}, result);
    }

    @Test
    public void testTwo() {
        final TwoSum sum = new TwoSum();
        int[] result = sum.twoSum(new int[]{2, 7, 11, 15}, 9);
        Assert.assertArrayEquals(new int[] {0, 1}, result);
    }

    @Test
    public void testThree() {
        final TwoSum sum = new TwoSum();
        int[] result = sum.twoSum(new int[]{3, 2, 4}, 6);
        Assert.assertArrayEquals(new int[] {1, 2}, result);
    }
}
