package br.com.datastructure.trie;


import br.com.datastructure.nonbinary.NonBinaryNode;
import br.com.datastructure.nonbinary.NonBinaryTree;
import br.com.datastructure.nonbinary.NonBinaryTreeInverseOrder;
import org.junit.jupiter.api.Test;

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
}
