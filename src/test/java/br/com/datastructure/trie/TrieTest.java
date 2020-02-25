package br.com.datastructure.trie;


import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TrieTest {

    @Test
    public void testTrie() {
        final String keys[] = {"the", "a", "there", "answer", "any", "by", "bye", "their"};
        final String output[] = {"Not present in trie", "Present in trie"};

        final Trie trie = new Trie();
        for (final String word :  keys) {
            trie.insert(word);
        }

        // Search for different keys
        if(trie.search("the") == true)
            System.out.println("the --- " + output[1]);
        else System.out.println("the --- " + output[0]);

    }

    @Test
    public void testOne() {
        final Trie trie = new Trie();
        final String keys[][] = { {"add", "s"},{"add", "ss"}, {"add", "sss"}, {"add", "ssss"}, {"add", "sssss"}, {"find", "s"}, {"find", "ss"}, {"find", "sss"},{"find", "ssss"}, {"find", "sssss"}, {"find", "ssssss"}};
        //final String keys[][] = { {"add", "eouecvksgllpvfxfvndu"}, {"find", "zivh"}, {"add", "uugxgcrtujxzyjysqrhu"}, {"find", "ccyc"}};

        final int[] results = trie.execute(keys);
    }

    @Test
    public void testTwo() throws IOException {
        final Trie trie = new Trie();
        final Path path = Paths.get("C:\\Users\\Dell\\Documents\\input-5.txt");
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
        Arrays.stream(results).forEach(System.out::println);
    }

}
