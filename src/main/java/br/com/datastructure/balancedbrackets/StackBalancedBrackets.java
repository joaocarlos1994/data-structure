package br.com.datastructure.balancedbrackets;

public class StackBalancedBrackets {

    int top = -1;
    final char items[] = new char[1000];

    public void push(final char character) {
        items[++top] = character;
    }

    public char pop() {
        char element = items[top];
        top--;
        return element;
    }

    public boolean isMatchingPair(final char character1, final char character2) {
        if (character1 == '(' && character2 == ')') {
            return true;
        } else if (character1 == '{' && character2 == '}') {
            return true;
        } else if (character1 == '[' && character2 == ']') {
            return true;
        }
        return false;
    }

    public boolean areParenthesisBalanced(final char exp[]) {
        for (int i = 0; i < exp.length; i++) {
            if (exp[i] == '{' || exp[i] == '(' || exp[i] == '[') {
                this.push(exp[i]);
            }

            if (exp[i] == '}' || exp[i] == ')' || exp[i] == ']') {

                if (this.isEmpty()) {
                    return false;
                }

                else if (!isMatchingPair(this.pop(), exp[i])) {
                    return false;
                }
            }
        }

        if (this.isEmpty())
            return true;
        else {
            return false;
        }
    }

    public boolean isEmpty() {
        return (top == -1) ? true : false;
    }
}