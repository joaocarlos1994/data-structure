package br.com.datastructure.palindromenumber;

public class PalindromeNumber {

    public boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        }

        String numberAsString = Integer.toString(x);
        char[] palindromeArray = new char [numberAsString.length()];

        int count = 0;
        for (int i = numberAsString.length() - 1; i > -1; i--) {
            palindromeArray[count] = numberAsString.charAt(i);
            count++;
        }
        return numberAsString.equals(new String(palindromeArray));
    }
}
