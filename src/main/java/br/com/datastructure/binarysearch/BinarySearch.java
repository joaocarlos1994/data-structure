package br.com.datastructure.binarysearch;

import java.util.*;

public class BinarySearch {

    private final List<Integer> numbers = new Vector<>();

    public void add(final Integer number) {
        int index = Collections.binarySearch(this.numbers, number);
        if (index < 0) {
            index = ~index;
        }
        this.numbers.add(index, number);
    }

    public double getMedian() {
        if (numbers.isEmpty()) {
            return 0;
        }

        if (numbers.size() == 1) {
            return numbers.get(0).doubleValue();
        }

        final int middle = numbers.size() / 2;
        if (numbers.size() % 2 == 0) {
            final int value = (numbers.get(middle - 1) + ((int ) numbers.get(middle)));
            return (double) value / 2;
        }
        return (numbers.get(middle)).doubleValue();
    }

    public double[] getMedian(final int[] a) {
        final double[] result = new double[a.length];
        for (int i = 0; i < a.length; i++) {
            this.add(a[i]);
            result[i] = getMedian();
        }
        return result;
    }
}
