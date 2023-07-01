package org.example.exercises.leetcode;

public class twoSum {
    public static void main(String[] args) {

    }

    public int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            int remainderTarget = target - nums[i];

            for (int j = i + 1; j < nums.length; j++) {
                if (i == j)
                    continue;
                if (remainderTarget == nums[j]) {
                    return new int[]{i, j};
                }
            }
        }

        return null;
    }
}
