package br.com.datastructure.integerroman;

public class IntegerRoman {

    public String intToRoman(int number) {
        int[] value ={1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4 ,1};
        String[] symbol = {"M", "CM", "D", "CD", "C", "XC", "L", "XL","X", "IX", "V", "IV", "I"};
        final StringBuilder result = new StringBuilder();
        for (int i = 0; i < value.length & number >= 0; i++){
            while(number >= value[i]){
                result.append(symbol[i]);
                number -=value[i];
            }
        }
        return result.toString();
    }
}
