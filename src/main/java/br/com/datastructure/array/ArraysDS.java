package br.com.datastructure.array;

public class ArraysDS {

    // Complete the reverseArray function below.
    public static int[] reverseArray(int[] a) {
        for (int index = 0, aux = 1; index < a.length / 2; index++, aux++) {
            int actualNumber = a[index];
            int lastNumber = a[a.length - aux];
            a[index] = lastNumber;
            a[a.length - aux] = actualNumber;
        }
        return a;
    }
}
