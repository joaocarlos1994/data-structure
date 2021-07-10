package br.com.datastructure.romaninteger;

import br.com.datastructure.validparentheses.ValidParentheses;
import org.junit.jupiter.api.Test;

public class RomanIntegerTest {

    @Test
    public void one() {
        final RomanInteger romanInteger = new RomanInteger();
        assert 1994 == romanInteger.romanToInt("MCMXCIV");
        assert 58 == romanInteger.romanToInt("LVIII");
        assert 40 == romanInteger.romanToInt("XL");
        assert 27 == romanInteger.romanToInt("XXVII");
        assert 12 == romanInteger.romanToInt("XII");
        assert 9 == romanInteger.romanToInt("IX");
    }
}
