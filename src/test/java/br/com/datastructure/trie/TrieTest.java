package br.com.datastructure.trie;


import org.junit.Assert;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * <i>https://www.hackerrank.com/challenges/contacts/problem</i>
 * */
public class TrieTest {

    @Test
    public void testOne() {
        final Trie trie = new Trie();
        final String keys[][] = { {"add", "s"},{"add", "ss"}, {"add", "sss"}, {"add", "ssss"}, {"add", "sssss"}, {"find", "s"}, {"find", "ss"}, {"find", "sss"},{"find", "ssss"}, {"find", "sssss"}, {"find", "ssssss"}};

        final int[] results = trie.execute(keys);
        final int[] expected = {5, 4, 3, 2, 1, 0};
        Assert.assertArrayEquals(expected, results);
    }

    @Test
    public void testTwo() {
        final Trie trie = new Trie();
        final String keys[][] = { {"add", "hack"}, {"add", "hackerrank"}, {"find", "hac"}, {"find", "hak"}};

        final int[] results = trie.execute(keys);
        final int[] expected = {2, 0};
        Assert.assertArrayEquals(expected, results);
    }

    @Test
    public void testThree() throws IOException {
        final Trie trie = new Trie();
        final Path path = Paths.get("src/main/resources/input-6.txt");
        int lineCount = (int) Files.lines(path).count();
        final String keys[][] = new String[lineCount][lineCount];

        try (final Stream<String> lines = Files.lines(path)) {
            final List<String> collect = lines.map(String::toString).collect(Collectors.toList());
            for (int i = 0; i <  collect.size(); i++) {
                final String[] s = collect.get(i).split(" ");
                keys[i][0] = s[0];
                keys[i][1]= s[1];
            }
        } catch (final IOException e) {
        }

        final int[] results = trie.execute(keys);
    }

}
