package br.com.datastructure.palindromenumber;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

public class PalindromeNumberTest {

    @Test
    public void testOne() {
        final PalindromeNumber palindromeNumber = new PalindromeNumber();
        boolean result = palindromeNumber.isPalindrome(121);
        Assert.assertTrue(result);
    }

    @Test
    public void testTwo() {
        final PalindromeNumber palindromeNumber = new PalindromeNumber();
        boolean result = palindromeNumber.isPalindrome(-121);
        Assert.assertFalse(result);
    }

    @Test
    public void testThree() {
        final PalindromeNumber palindromeNumber = new PalindromeNumber();
        boolean result = palindromeNumber.isPalindrome(10);
        Assert.assertFalse(result);
    }

    @Test
    public void testFour() {
        final PalindromeNumber palindromeNumber = new PalindromeNumber();
        boolean result = palindromeNumber.isPalindrome(1);
        Assert.assertFalse(result);
    }
}
