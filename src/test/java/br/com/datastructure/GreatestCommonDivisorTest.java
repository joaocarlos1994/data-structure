package br.com.datastructure;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

public class GreatestCommonDivisorTest {

    @Test
    public void test() {
        final int aux[] = new int[5];
        final int [] input = {2, 4, 6, 8, 10};
        int greatestCommonDivisor = findGreatestCommonDivisor(input, 5);
        Assert.assertEquals(2, greatestCommonDivisor);
    }

    private int findGreatestCommonDivisor(final int numbers[], int num) {
        int result = numbers[0];
        for (int i = 1; i < num; i++) {
            result = greatestCommonDivisor(numbers[i], result);
        }
        return result;
    }

    private int greatestCommonDivisor(int number1, int number2) {
        if(number2 == 0) {
            return number1;
        }
        return greatestCommonDivisor(number2, number1 % number2);
    }

}
