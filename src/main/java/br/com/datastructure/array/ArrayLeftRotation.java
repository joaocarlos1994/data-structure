package br.com.datastructure.array;

import java.util.Arrays;
import java.util.stream.IntStream;

public class ArrayLeftRotation {

    public int[] leftRotationOne(final int totalElements, final int[] array) {
        for (int i = 0; i < totalElements; i++) {
            int firstElement = array[0];
            for (int y = 0, aux = 1; y < array.length; y++, aux++) {
                if (y !=  array.length - 1) {
                    array[y] = array[aux];
                }
            }
            array[array.length - 1] = firstElement;
        }
        return array;
    }

    public int[] leftRotationTwo(final int totalElements, final int[] array) {
        final int[] aux = new int[totalElements];
        final int[] aux2 = new int[array.length - totalElements];

        for (int i = 0; i < totalElements; i++) {
            aux[i] = array[i];
        }

        for (int i = totalElements, index = 0; i < array.length; i++, index++) {
            aux2[index] = array[i];
        }
        return IntStream.concat(Arrays.stream(aux2), Arrays.stream(aux)).toArray();
    }

}
