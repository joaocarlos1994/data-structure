package br.com.datastructure.trie;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Trie {

    private TrieNode root = new TrieNode(0);

    public void insert(final String key) {
        final int length = key.length();

        TrieNode node = this.root;

        for (int level = 0; level < length; level++) {
            final int index = key.charAt(level) - 'a';

            if (node.isNull(index)) {
                TrieNode newNode = node.addNode(index);
                node = newNode;
            } else {
                node = node.getNode(index);
                node.incrementElement();
            }
        }
        node.setEndOfWord(true);
    }

    public int meets(final String key) {
        int length = key.length();
        TrieNode node = this.root;

        if (key.length() == 1 && !(node.isNull(key.charAt(0) - 'a'))) {
            return node.getNode(key.charAt(0) - 'a').getCountElements();
        } else {
            for (int level = 0; level < length; level++) {
                final int index = key.charAt(level) - 'a';

                if (Objects.isNull(node) || node.isNull(index)) {
                    return 0;
                }
                node = node.getNode(index);
            }
            return node.getCountElements();
        }
    }

    public int[] execute(final String[][] queries) {
        final List<Integer> results = new ArrayList<>();

        for (int i = 0; i < queries.length; i++) {
            final String key = queries[i][0];
            final String word = queries[i][1];
            if (key.equalsIgnoreCase("add")) {
                this.insert(word);
            } else {
                final int count = this.meets(word);
                results.add(count);
            }
        }
        return results.stream().mapToInt(i -> i).toArray();
    }
}
