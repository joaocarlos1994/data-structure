package br.com.datastructure.validparentheses;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class ValidParentheses {

    public boolean isValidWithoutStack(String s) {
        final Map<Character, Character> characters = new HashMap<>(3);
        characters.put('(', ')');
        characters.put('{', '}');
        characters.put('[', ']');

        final char[] brackets = s.toCharArray();
        if (brackets.length % 2 == 0) {
            int leftIndex = (brackets.length / 2) - 1;
            int rightIndex = (brackets.length / 2);
            while (leftIndex >= 0 && rightIndex < brackets.length) {
                char leftBracket = brackets[leftIndex];
                char rightBracket = brackets[rightIndex];
                if (!(characters.get(leftBracket) == rightBracket)) {
                    return false;
                }
                leftIndex -= 1;
                rightIndex += 1;
            }
            return true;
        }
        return false;
    }

    public boolean isValid(String s) {
        final Stack<Character> stack = new Stack<>();
        for (char c : s.toCharArray()) {
            if (c == '(' || c == '[' || c == '{') {
                stack.push(c);
            } else if (c == ')' && !stack.isEmpty() && stack.peek() == '(') {
                stack.pop();
            } else if (c == ']' && !stack.isEmpty() && stack.peek() == '[') {
                stack.pop();
            } else if (c == '}' && !stack.isEmpty() && stack.peek() == '{') {
                stack.pop();
            } else {
                return false;
            }
        }
        return stack.isEmpty();
    }
}
