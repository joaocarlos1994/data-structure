package br.com.datastructure.array;

import java.util.Arrays;

public class SparseArrays {

    // Complete the matchingStrings function below.
    public static int[] matchingStrings(String[] strings, String[] queries) {
        final int[] result = new int[queries.length];
        Arrays.sort(strings);

        for (int index = 0; index < queries.length; index++) {
            if (Arrays.binarySearch(strings, queries[index]) < 0) {
                result[index] = 0;
                continue;
            }
            final int element = index;
            result[index] = (int) Arrays
                    .stream(strings).filter(string -> string.equals(queries[element]))
                    .count();
        }
        return result;
    }

}
