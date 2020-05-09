package br.com.datastructure;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.stream.IntStream;

/**
 * <i>https://www.hackerrank.com/challenges/array-left-rotation/problem</i>
 * */
public class LeftRotation {

    //FIXME: Exits a A Juggling Algorithm to move left
    //Fixme: <i>https://www.geeksforgeeks.org/array-rotation/</i>

    @Test
    public void testOne() {

        int d = 4;
        final int[] a = {1, 2, 3, 4, 5};

        for (int i = 0; i < d; i++) {
            int firstElement = a[0];
            for (int y = 0, aux = 1; y < a.length; y++, aux++) {
                if (y !=  a.length - 1) {
                    a[y] = a[aux];
                }
            }
            a[a.length - 1] = firstElement;
        }

        int[] expected = {5, 1, 2, 3, 4};
        Assert.assertArrayEquals(expected, a);
    }


    @Test
    public void testTwo() {

        int d = 4;
        final int[] a = {1, 2, 3, 4, 5, 6};

        final int[] aux = new int[d];
        final int[] aux2 = new int[a.length - d];

        for (int i = 0; i < d; i++) {
            aux[i] = a[i];
        }

        for (int i = d, index = 0; i < a.length; i++, index++) {
            aux2[index] = a[i];
        }

        int[] result = IntStream.concat(Arrays.stream(aux2), Arrays.stream(aux)).toArray();

        int[] expected = {5, 6, 1, 2, 3, 4};
        Assert.assertArrayEquals(expected, result);
    }

}
