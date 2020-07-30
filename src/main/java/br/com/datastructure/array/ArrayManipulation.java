package br.com.datastructure.array;

/**
 * <i>https://www.hackerrank.com/challenges/crush/problem</i>
 *
 * For a value k, we can mark its left endpoint a in the original array, along with its right
 * endpoint b in the original array. To distinguish between a and b we can store +k for a and -k for b. Now, we
 * technically have stored all information that the m operations represent, into an array. Most importantly, we
 * stored it in O(m) time.
 *
 *
 *
 * */
public class ArrayManipulation {

    public long arrayManipulation(final int n, final int[][] queries) {
        final long[] result = new long[n + 1];
        for (int i = 0; i < queries.length; i++) {
            final int indexA = queries[i][0];
            final int indexB = queries[i][1];
            final int indexK = queries[i][2];

            result[indexA - 1] += indexK;
            result[indexB] -= indexK;
        }
        return getMax(result);
    }

    private long getMax(long[] inputArray) {
        long max = Long.MIN_VALUE;
        long sum = 0;
        for (int i = 0; i < inputArray.length; i++) {
            sum += inputArray[i];
            max = Math.max(max, sum);
        }
        return max;
    }
}
