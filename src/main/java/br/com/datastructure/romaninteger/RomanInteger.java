package br.com.datastructure.romaninteger;

import java.util.HashMap;
import java.util.Map;

public class RomanInteger {

    public int romanToInt(String s) {
        final char[] letters = s.toCharArray();
        final Map<Character, Integer> romamToNumber = new HashMap<>();
        romamToNumber.put('M', 1000);
        romamToNumber.put('D', 500);
        romamToNumber.put('C', 100);
        romamToNumber.put('L', 50);
        romamToNumber.put('X', 10);
        romamToNumber.put('V', 5);
        romamToNumber.put('I', 1);

        if (letters.length == 1) {
            return romamToNumber.get(letters[0]);
        }

        int count = 0;
        char nextLetter = letters[1];
        for (int i = 0; i < letters.length; i++) {
            if (isBefore(letters[i], nextLetter)) {
                count += (romamToNumber.get(nextLetter) - romamToNumber.get(letters[i]));
                i++;
            } else {
                count += romamToNumber.get(letters[i]);
            }

            if ((i + 2) >= letters.length) {
                nextLetter = letters[letters.length - 1];
            } else {
                nextLetter = letters[i + 2];
            }

        }
        return count;
    }

    boolean isBefore(final char firstLetter, final char secondLetter) {
        final String letters = "MDCLXVI";
        final int before = letters.indexOf(firstLetter);
        final int after = letters.indexOf(secondLetter);
        return before > after;
    }

}
