package br.com.datastructure.combinationsum;

import java.util.*;

public class CombinationSum {

    Set<List<Integer>> res = new HashSet<>();
    int[] numbers;

    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        numbers = candidates;
        helper(new ArrayList<>(), target);
        return new LinkedList<>(res);
    }


    private void helper(List<Integer> integers, int target) {
        if (0 > target) return;
        if (target == 0) {
            List<Integer> combinations = new ArrayList<>(integers);
            Collections.sort(combinations);
            res.add(combinations);
            return;
        }

        for (int number : numbers) {
            if (target - number < 0) continue;
            integers.add(number);
            helper(integers, target - number);
            int lastIndex = integers.size() - 1;
            integers.remove(lastIndex);
        }
    }
}
