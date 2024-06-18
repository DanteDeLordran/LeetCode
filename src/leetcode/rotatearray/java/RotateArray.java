package leetcode.rotatearray.java;

/*
Given an integer array nums, rotate the array to the right by k steps, where k is non-negative.
 */

import java.util.Arrays;

public class RotateArray {
    public void rotate(int[] nums, int k) {
        System.out.println("Begin " + Arrays.toString(nums));
        for (int i = 0; i < k; i++) {
            int[] arr = nums.clone();
            for (int j = 0; j < nums.length; j++) {
                if (j == nums.length - 1){
                    nums[0] = arr[j];
                }else {
                    nums[j+1] = arr[j];
                }
            }
        }
        System.out.println("End " + Arrays.toString(nums));
    }
}
