package br.com.datastructure.longestsubstring;

import java.util.HashSet;
import java.util.Set;

public class LongestSubstring {


    public int lengthOfLongestSubstring(final String s) {
        final Set<Character> letters = new HashSet<>();
        int i = 0;
        int max = 0;
        for (int j = 0; j < s.length(); j++) {
            char c = s.charAt(j);
            while (letters.contains(c)) {
                letters.remove(s.charAt(i++));
            }
            letters.add(c);
            max = Math.max(max, j - i + 1);
        }
        return max;
    }
}
