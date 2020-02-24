package br.com.datastructure.trie;

import java.util.Objects;

public class Trie {

    private TrieNode root;

    public void insert(final String key) {

        if (Objects.isNull(root)) {
            this.root = new TrieNode();
        }

        int level;
        int length = key.length();
        int index;

        TrieNode node = this.root;

        for (level = 0; level < length; level++) {
            index = key.charAt(level) - 'a';
            if (node.isNull(index)) {
                node.addNode(index);
            }
            node = node.getNode(index);
        }
        node.setEndOfWord(true);
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

}
