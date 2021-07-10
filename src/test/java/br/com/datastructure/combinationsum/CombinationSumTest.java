package br.com.datastructure.combinationsum;

import org.junit.jupiter.api.Test;

public class CombinationSumTest {

    @Test
    public void one() {
        final CombinationSum combinationSum = new CombinationSum();
        //combinationSum.combinationSum(new int[]{2, 3, 6, 7}, 7);
        //combinationSum.combinationSum(new int[]{2}, 1);
        //combinationSum.combinationSum(new int[]{1}, 1);
        //combinationSum.combinationSum(new int[]{1}, 2);
        //combinationSum.combinationSum(new int[]{2, 3, 5}, 8);
        combinationSum.combinationSum(new int[]{1, 2}, 4);
    }

}
