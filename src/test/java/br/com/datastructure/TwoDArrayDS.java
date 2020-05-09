package br.com.datastructure;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import java.util.Collections;
import java.util.Set;
import java.util.TreeSet;


/**
 * <i>https://www.hackerrank.com/challenges/2d-array/problem</i>
 *
 * */
public class TwoDArrayDS {

    @Test
    public void oneTest() {
        final int[][] input = new int[6][];
        input[0] = new int[] {-9, -9, -9, 1, 1, 1};
        input[1] = new int[] {0, -9, 0, 4, 3, 2};
        input[2] = new int[] {-9, -9, -9, 1, 2, 3};
        input[3] = new int[] {-0, 0, 8, 6, 6, 0};
        input[4] = new int[] {0, 0, 0, -2, 0, 0};
        input[5] = new int[] {0, 0, 1, 2, 4, 0};

        int hourglassSum = hourglassSum(input);
        Assert.assertEquals(28, hourglassSum);
    }

    // Complete the hourglassSum function below.
    static int hourglassSum(int[][] arr) {
        final Set<Integer> results = new TreeSet<Integer>();
        for (int row = 0, column = 0; row < 4; column++) {
            int actualLine = totalSum(arr[row], column);
            int belowValue = arr[row + 1][column + 1];
            int nextLine = totalSum(arr[row + 2], column);
            results.add(actualLine + belowValue + nextLine);

            if (column == 3) {
                if (row == 4) {
                    break;
                } else {
                    column = -1;
                    row++;
                }
            }
        }
        return Collections.max(results);
    }

    static int totalSum(final int[] arr, final int index) {
        int total = 0;
        for (int columnIndex = index; columnIndex < (3 + index); columnIndex++) {
            total += arr[columnIndex];
        }
        return total;
    }
}
