package br.com.datastructure.trie;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Trie {

    private TrieNode root;

    public void insert(final String key) {
        if (Objects.isNull(root)) {
            this.root = new TrieNode();
        }
        int length = key.length();
        int index;

        TrieNode node = this.root;

        for (int level = 0; level < length; level++) {
            index = key.charAt(level) - 'a';

            if (node.isNull(index)) {
                node.addNode(index);
                node = node.getNode(index);
            } else {
                node.incrementElement();
                node = node.getNode(index);
            }
        }
        node.setEndOfWord(true);
    }

    public int meets(final String key) {
        int length = key.length();

        int index;
        TrieNode node = this.root;

        for (int level = 0; level < length; level++) {
            index = key.charAt(level) - 'a';

            if (Objects.isNull(node) || node.isNull(index)) {
                return 0;
            } else if ((level == (length - 1))) {
                continue;
            }
            node = node.getNode(index);
        }
        return node.getCountElements();
    }


    public boolean search(final String key) {
        int level;
        int length = key.length();
        int index;
        TrieNode node = this.root;

        for (level = 0; level < length; level++) {

            index = key.charAt(level) - 'a';

            if (node.isNull(index)) {
                return false;
            }
            node = node.getNode(index);
        }
        return (node != null && node.isEndOfWord());
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
        return results.stream().mapToInt(i->i).toArray();
    }
}
