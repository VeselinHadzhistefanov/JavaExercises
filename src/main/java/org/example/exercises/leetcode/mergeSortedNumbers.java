package org.example.exercises.leetcode;

import java.util.Arrays;

public class mergeSortedNumbers {

    public static void main(String[] args) {
        int[] num1 = new int[]{1, 2, 3, 0, 0, 0};
        int[] num2 = new int[]{2, 5, 6};

        merge(num1, 3, num2, 3);
        System.out.println(Arrays.toString(num1));
    }

    public static void merge(int[] nums1, int n, int[] nums2, int m) {

        int[] result = new int[nums1.length];
        int j = 0;
        int i = 0;

        int num1;
        int num2;

        while (i < n || j < m) {
            if (i == n) {
                while(j < m){
                    result[i + j] = nums2[j];
                    j++;
                }
                continue;
            }

            if (j == m) {
                while(i < n){
                    result[i + j] = nums1[i];
                    i++;
                }
                continue;
            }

            num1 = nums1[i];
            num2 = nums2[j];
            if (num1 < num2) {
                result[i + j] = num1;
                i++;
            } else {
                result[i + j] = num2;
                j++;
            }
        }

        for (i = 0; i < nums1.length; i++) {
            nums1[i] = result[i];
        }
    }

}
