package br.com.datastructure.hackerrank;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MatrixExercise {

    @Test
    public void five() {
        List<List<Integer>> grid = new ArrayList<>();
        grid.add(Arrays.asList(0, 1, 1, 0, 1));
        grid.add(Arrays.asList(0, 1, 0, 1, 0));
        grid.add(Arrays.asList(0, 0, 0, 0, 1));
        grid.add(Arrays.asList(0, 1, 0, 0, 0));

        minimumHours(4, 5, grid);
    }

    @Test
    public void six() {
        List<List<Integer>> grid = new ArrayList<>();
        grid.add(Arrays.asList(0, 0, 1, 0, 0));
        grid.add(Arrays.asList(0, 0, 0, 0, 0));
        grid.add(Arrays.asList(0, 0, 0, 1, 0));
        grid.add(Arrays.asList(0, 0, 0, 0, 1));

        minimumHours(4, 5, grid);
    }

    int minimumHours(int rows, int columns, List<List<Integer> > grid) {
        boolean existsServerWithoutFile = true;
        int totalHour = 0;
        while (existsServerWithoutFile) {
            totalHour += 1;
            List<List<Integer>> serverAfterOneHour = execute(grid);
            existsServerWithoutFile = findServerWithoutFile(serverAfterOneHour);
        }
        return totalHour;
    }

    private boolean findServerWithoutFile(List<List<Integer>> serverAfterOneHour) {
        for (int row = 0; row < serverAfterOneHour.size(); row++) {
            List<Integer> servers = serverAfterOneHour.get(row);
            boolean exitsServerWithoutFile = servers.contains(0);
            if (exitsServerWithoutFile) {
                return true;
            }
        }
        return false;
    }


    // METHOD SIGNATURE BEGINS, THIS METHOD IS REQUIRED
    List<List<Integer>> execute(List<List<Integer> > grid) {
        for (int row = 0; row < grid.size(); row++) {
            List<Integer> c = grid.get(row);
            for (int column = 0; column < c.size(); column++) {
                final Integer valueColumn = c.get(column);
                if (valueColumn ==  1) {
                    if (row != 0) {
                        Integer above = grid.get(row - 1).set(column, 1);
                    }

                    if (!(column == 0)) {
                        Integer left = c.set(column - 1, 1);
                    }


                    if (!(column == c.size() - 1)) {
                        Integer right = c.set(column + 1, 1);
                    }

                    if (!(row == grid.size() - 1)) {
                        Integer below = grid.get(row + 1).set(column, 1);
                    }
                }
            }
        }
        return grid;
    }

}
