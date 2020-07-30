package br.com.datastructure.array;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

public class SparseArraysTest {

    @Test
    public void oneTest() {
        final List<String> input = Arrays.asList("def", "de", "fgh");
        final List<String> input2 = Arrays.asList("de", "lmn", "fgh");
        int[] ints = SparseArrays.matchingStrings((String[]) input.toArray(), (String[]) input2.toArray());

    }

    @Test
    public void twoTest() {
        final List<String> input = Arrays.asList("aba", "baba", "aba", "xzxb");
        final List<String> input2 = Arrays.asList("aba", "xzxb", "ab");
        int[] ints = SparseArrays.matchingStrings((String[]) input.toArray(), (String[]) input2.toArray());

    }
}
