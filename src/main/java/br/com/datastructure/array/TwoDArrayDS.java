package br.com.datastructure.array;

import java.util.Collections;
import java.util.Set;
import java.util.TreeSet;

public class TwoDArrayDS {

    // Complete the hourglassSum function below.
    public static int hourglassSum(int[][] arr) {
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
