package br.com.datastructure.twosum;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class TwoSum {

    public int[] twoSumWithSortArray(final int[] nums, final int target) {
        int rightIndex = nums.length - 1;
        int[] result = new int[2];

        for (int leftIndex = 0; leftIndex < rightIndex; ) {

            if (nums[leftIndex] + nums[rightIndex] > target) {
                rightIndex -= 1;
                continue;
            }

            if (nums[leftIndex] + nums[rightIndex] < target) {
                leftIndex += 1;
                continue;
            }

            if (nums[leftIndex] + nums[rightIndex] == target) {
                result = new int[] {leftIndex, rightIndex};
                break;
            }

        }
        return result;
    }

    public int[] twoSum(final int[] nums, final int target) {
        final int[] result = new int[2];
        final Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            final int key = target - nums[i];
            if (map.containsKey(nums[i])) {
                result[0] = map.get(nums[i]);
                result[1] = i;
            }
            map.put(key, i);
        }
        return result;
    }
}
