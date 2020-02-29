package br.com.datastructure.hackerrank;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

public class ArraysDS {

    @Test
    public void oneTest() {
        final int[] input = {1, 4, 3, 2};
        int[] result = reverseArray(input);
        int[] expected = {2, 3, 4, 1};
        Assert.assertArrayEquals(expected, input);
    }

    @Test
    public void twoTest() {
        final int[] input = {1, 4, 3, 2, 5};
        int[] result = reverseArray(input);
        int[] expected = {5, 2, 3, 4, 1};
        Assert.assertArrayEquals(expected, input);
    }

    // Complete the reverseArray function below.
    static int[] reverseArray(int[] a) {
        for (int index = 0, aux = 1; index < a.length / 2; index++, aux++) {
            int actualNumber = a[index];
            int lastNumber = a[a.length - aux];
            a[index] = lastNumber;
            a[a.length - aux] = actualNumber;
        }
        return a;
    }


}
