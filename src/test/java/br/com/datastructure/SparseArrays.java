package br.com.datastructure;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

public class SparseArrays {

    @Test
    public void oneTest() {
        final List<String> input = Arrays.asList("def", "de", "fgh");
        final List<String> input2 = Arrays.asList("de", "lmn", "fgh");
        int[] ints = matchingStrings((String[]) input.toArray(), (String[]) input2.toArray());

    }

    @Test
    public void twoTest() {
        final List<String> input = Arrays.asList("aba", "baba", "aba", "xzxb");
        final List<String> input2 = Arrays.asList("aba", "xzxb", "ab");
        int[] ints = matchingStrings((String[]) input.toArray(), (String[]) input2.toArray());

    }

    // Complete the matchingStrings function below.
    static int[] matchingStrings(String[] strings, String[] queries) {
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
