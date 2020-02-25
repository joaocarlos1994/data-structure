package br.com.datastructure.binarysearch;


import org.junit.Assert;
import org.junit.jupiter.api.Test;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class BinarySearchTest {

    @Test
    public void testOne() {
        final BinarySearch binarySearch = new BinarySearch();

        binarySearch.add(12);
        Assert.assertEquals(12, binarySearch.getMedian(), 0);


        binarySearch.add(4);
        Assert.assertEquals(8, binarySearch.getMedian(), 0);

        binarySearch.add(5);
        Assert.assertEquals(5, binarySearch.getMedian(), 0);

        binarySearch.add(3);
        Assert.assertEquals(4.5, binarySearch.getMedian(), 0);

        binarySearch.add(8);
        Assert.assertEquals(5, binarySearch.getMedian(), 0);

        binarySearch.add(7);
        Assert.assertEquals(6, binarySearch.getMedian(), 0);

    }


    @Test
    public void testTwo() {
        final BinarySearch binarySearch = new BinarySearch();
        final int[] numbers = {12, 4, 5, 3, 8, 7};
        final double[] median = binarySearch.getMedian(numbers);
        System.out.println(median);
    }

    @Test
    public void testThree() throws IOException {
        final BinarySearch binarySearch = new BinarySearch();

        final Path path = Paths.get("C:\\Users\\Dell\\Documents\\input.txt");
        int lineCount = (int) Files.lines(path).count();
        final int[] a = new int[lineCount];

        try (final Stream<String> lines = Files.lines(path)) {
            final List<String> collect = lines.map(String::toString).collect(Collectors.toList());
            for (int i = 0; i <  collect.size(); i++) {
                a[i] = Integer.parseInt(collect.get(i));
            }
        } catch (final IOException e) {
        }

        final double[] searchMedian = binarySearch.getMedian(a);
        for (final double z : searchMedian) {
            System.out.println(z);
        }
    }

    @Test
    public void testFour() throws IOException {
        final BinarySearch binarySearch = new BinarySearch();

        final Path path = Paths.get("C:\\Users\\Dell\\Documents\\input-3.txt");
        int lineCount = (int) Files.lines(path).count();
        final int[] a = new int[lineCount];

        try (final Stream<String> lines = Files.lines(path)) {
            final List<String> collect = lines.map(String::toString).collect(Collectors.toList());
            for (int i = 0; i <  collect.size(); i++) {
                a[i] = Integer.parseInt(collect.get(i));
            }
        } catch (final IOException e) {
        }

        final double[] searchMedian = binarySearch.getMedian(a);
        System.out.println(searchMedian);
    }

}
