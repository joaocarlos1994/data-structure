package br.com.datastructure.longestsubstring;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LongestSubstringTest {

    @Test
    public void one() {
        LongestSubstring longestSubstring = new LongestSubstring();
        int sum = longestSubstring.lengthOfLongestSubstring("abcabcbb");
        System.out.println(sum);
    }

    @Test
    public void two() {
        LongestSubstring longestSubstring = new LongestSubstring();
        int sum = longestSubstring.lengthOfLongestSubstring("pwwkew");
        System.out.println(sum);
    }

    @Test
    public void three() {
        LongestSubstring longestSubstring = new LongestSubstring();
        int sum = longestSubstring.lengthOfLongestSubstring(" ");
        System.out.println(sum);
    }
}
