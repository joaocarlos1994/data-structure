package br.com.datastructure.integerroman;

import br.com.datastructure.longestsubstring.LongestSubstring;
import org.junit.jupiter.api.Test;

public class IntegerRomanTest {

    @Test
    public void one() {
        final IntegerRoman integerRoman = new IntegerRoman();
        final String romanNumber = integerRoman.intToRoman(3);
        System.out.println(romanNumber);
    }

    @Test
    public void four() {
        final IntegerRoman integerRoman = new IntegerRoman();
        final String romanNumber = integerRoman.intToRoman(4);
        System.out.println(romanNumber);
    }


}
