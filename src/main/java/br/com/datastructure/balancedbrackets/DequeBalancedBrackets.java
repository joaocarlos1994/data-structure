package br.com.datastructure.balancedbrackets;

import java.util.Deque;
import java.util.LinkedList;

public class DequeBalancedBrackets {

    final Deque<Character> brackets = new LinkedList<>();

    public boolean isBalanced(final char[] characters) {
        if (!(characters.length % 2 == 0)) {
            return false;
        }

        for (final Character character : characters) {
            if (character == '{' || character == '[' || character == '(') {
                this.brackets.addFirst(character);
            } else if ((!brackets.isEmpty()) && (character == '}' || character == ']' || character == ')')) {
                final Character firstCharacter = this.brackets.peekFirst();
                if ((firstCharacter.equals('{') && character.equals('}')) || (firstCharacter.equals('[') && character.equals(']')) || (firstCharacter.equals('(') && character.equals(')'))) {
                    brackets.removeFirst();
                } else {
                    brackets.clear();
                    return false;
                }
            } else {
                return false;
            }
        }
        final boolean empty = brackets.isEmpty();
        brackets.clear();
        return empty;
    }

}
