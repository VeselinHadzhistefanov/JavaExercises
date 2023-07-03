package org.example.exercises.leetcode;

public class removeDuplicates {

    public static void main(String[] args) {

    }

    public int removeDuplicates(int[] nums) {

        int i = 0;
        int j = 0;

        while (i < nums.length && j < nums.length) {
            int val = nums[i];
            while (i < nums.length && nums[i] == val) {
                i++;
            }
            nums[j] = val;
            j++;
        }

        return j;
    }
}
