package br.com.datastructure.validparentheses;

import org.junit.jupiter.api.Test;

public class ValidParenthesesTest {


    @Test
    public void one() {
        final ValidParentheses validParentheses = new ValidParentheses();
        assert validParentheses.isValid("({[]})");
        assert validParentheses.isValid("()[]{}");
    }
}
