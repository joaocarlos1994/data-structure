package br.com.datastructure.array;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;

public class ArrayManipulationTest {

    @Test
    public void testOne() {
        final int[][] queries = new int[3][5];
        queries[0][0] = 1;
        queries[0][1] = 2;
        queries[0][2] = 100;

        queries[1][0] = 2;
        queries[1][1] = 5;
        queries[1][2] = 100;

        queries[2][0] = 3;
        queries[2][1] = 4;
        queries[2][2] = 100;

        final ArrayManipulation arrayManipulation = new ArrayManipulation();
        long result = arrayManipulation.arrayManipulation(5, queries);
        Assert.assertEquals(200, result);
    }

    @Test
    public void testTwo() {
        final int[][] queries = new int[3][5];
        queries[0][0] = 1;
        queries[0][1] = 5;
        queries[0][2] = 3;

        queries[1][0] = 4;
        queries[1][1] = 8;
        queries[1][2] = 7;

        queries[2][0] = 6;
        queries[2][1] = 9;
        queries[2][2] = 1;

        final ArrayManipulation arrayManipulation = new ArrayManipulation();
        long result = arrayManipulation.arrayManipulation(10, queries);
        Assert.assertEquals(10, result);
    }

    @Test
    public void testThree() throws IOException {
        final Path path = Paths.get("src/main/resources/array-manipulation-input04.txt");
        int n = 4000;
        int m = 30000;
        int[][] queries = new int[m][3];

        List<String> lines = Files.lines(path).map(String::toString).collect(Collectors.toList());

        for (int i = 0; i < m; i++) {
            final String[] queriesRowItems = lines.get(i).split(" ");
            for (int j = 0; j < 3; j++) {
                int queriesItem = Integer.parseInt(queriesRowItems[j]);
                queries[i][j] = queriesItem;
            }
        }

        final ArrayManipulation arrayManipulation = new ArrayManipulation();
        long result = arrayManipulation.arrayManipulation(n, queries);
        Assert.assertEquals(7542539201L, result);
    }
}
