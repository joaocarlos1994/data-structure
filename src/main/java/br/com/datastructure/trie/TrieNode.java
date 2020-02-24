package br.com.datastructure.trie;

public class TrieNode {

    private final TrieNode[] children = new TrieNode[26];
    private boolean isEndOfWord;

    public TrieNode(){
        isEndOfWord = false;
        for (int i = 0; i < 26; i++)
            children[i] = null;
    }

    public void setEndOfWord(final boolean endOfWord) {
        this.isEndOfWord = endOfWord;
    }

    public boolean isNull(final int index) {
        return children[index] == null;
    }

    public void addNode(final int index) {
        this.children[index] = new TrieNode();
    }

    public TrieNode getNode(final int index) {
        return children[index];
    }

    public boolean isEndOfWord() {
        return isEndOfWord;
    }
}
