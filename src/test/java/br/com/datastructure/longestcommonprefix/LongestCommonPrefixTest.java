package br.com.datastructure.longestcommonprefix;

import org.junit.jupiter.api.Test;

public class LongestCommonPrefixTest {

    @Test
    public void one() {
        final LongestCommonPrefix longestCommonPrefix = new LongestCommonPrefix();
        assert "fl".equals(longestCommonPrefix.longestCommonPrefix(new String[]{"flower", "flow", "flight"}));
    }
}
