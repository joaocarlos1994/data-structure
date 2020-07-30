package br.com.datastructure.array;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

/**
 * <i>https://www.hackerrank.com/challenges/array-left-rotation/problem</i>
 * */
public class ArrayLeftRotationTest {

    //FIXME: Exits a A Juggling Algorithm to move left
    //Fixme: <i>https://www.geeksforgeeks.org/array-rotation/</i>

    @Test
    public void testOne() {

        int d = 4;
        final int[] a = {1, 2, 3, 4, 5};
        final ArrayLeftRotation arrayLeftRotation = new ArrayLeftRotation();

        int[] expected = {5, 1, 2, 3, 4};
        Assert.assertArrayEquals(expected, arrayLeftRotation.leftRotationOne(d, a));
    }


    @Test
    public void testTwo() {

        int d = 4;
        final int[] a = {1, 2, 3, 4, 5, 6};
        final ArrayLeftRotation arrayLeftRotation = new ArrayLeftRotation();

        int[] expected = {5, 6, 1, 2, 3, 4};
        Assert.assertArrayEquals(expected, arrayLeftRotation.leftRotationTwo(d, a));
    }

}
