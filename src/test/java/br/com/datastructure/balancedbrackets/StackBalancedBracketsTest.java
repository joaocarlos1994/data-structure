package br.com.datastructure.balancedbrackets;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StackBalancedBracketsTest {

    @Test
    public void testOne() {
        StackBalancedBrackets brackets = new StackBalancedBrackets();
        final char exp[] = {'{','(',')','}','[',']'};
        final boolean areValid = brackets.areParenthesisBalanced(exp);
        Assert.assertTrue(areValid);
    }

    @Test
    public void testTwo() {
        StackBalancedBrackets brackets = new StackBalancedBrackets();
        final char exp[] = { '{', '[', '(', ')', ']', '}' };
        final boolean valid = brackets.areParenthesisBalanced(exp);
        Assert.assertTrue(valid);
    }

    @Test
    public void testThree() {
        StackBalancedBrackets brackets = new StackBalancedBrackets();
        final char exp[] = { '{', '[', '(', ']', ')', '}' };
        final boolean invaliad = brackets.areParenthesisBalanced(exp);
        Assert.assertFalse(invaliad);
    }

    @Test
    public void testFour() {
        StackBalancedBrackets brackets = new StackBalancedBrackets();
        final char exp[] = { '{', '{', '[', '[', '(', '(', ')', ')', ']', ']', '}', '}' };
        final boolean valid = brackets.areParenthesisBalanced(exp);
        Assert.assertTrue(valid);
    }

    @Test
    public void testFive() {
        DequeBalancedBrackets brackets = new DequeBalancedBrackets();
        final char exp[] = { '{', '{', '[', '[', '(', '(', ')', ')', ']', ']', '}', '}' };
        final boolean valid = brackets.isBalanced(exp);
        Assert.assertTrue(valid);
    }

    @Test
    public void testSix() {
        DequeBalancedBrackets brackets = new DequeBalancedBrackets();
        final String exp = "))";
        final boolean invaliad = brackets.isBalanced(exp.toCharArray());
        Assert.assertFalse(invaliad);
    }

    @Test
    public void t() {
        DequeBalancedBrackets brackets = new DequeBalancedBrackets();
        final Path path = Paths.get("C:\\Users\\Dell\\Documents\\input-4.txt");

        try (final Stream<String> lines = Files.lines(path)) {
            final List<String> collect = lines.map(String::toString).collect(Collectors.toList());
            int i = 1;
            for (final String line : collect) {
                final boolean result = brackets.isBalanced(line.toCharArray());
                System.out.println("Linha " + i + ": " + result);
                i++;
            }
        } catch (final IOException e) {

        }
    }
}
