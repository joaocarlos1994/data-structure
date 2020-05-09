package br.com.datastructure.trie;

public class TrieNode {

    private final TrieNode[] children = new TrieNode[26];
    private boolean isEndOfWord;
    private int countElements = 1;

    public TrieNode() {
        isEndOfWord = false;
    }

    public TrieNode(final int countElements) {
        isEndOfWord = false;
        this.countElements = countElements;
    }

    public void setEndOfWord(final boolean endOfWord) {
        this.isEndOfWord = endOfWord;
    }

    public boolean isNull(final int index) {
        return children[index] == null;
    }

    public TrieNode addNode(final int index) {
        this.children[index] = new TrieNode();
        return this.children[index];
    }

    public TrieNode getNode(final int index) {
        return children[index];
    }

    public boolean isEndOfWord() {
        return isEndOfWord;
    }

    public int getCountElements() {
        return this.countElements;
    }

    public void incrementElement() {
        this.countElements += 1;
    }
}
