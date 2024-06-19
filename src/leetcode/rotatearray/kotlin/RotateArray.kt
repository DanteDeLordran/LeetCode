package leetcode.rotatearray.kotlin

/*
Given an integer array nums, rotate the array to the right by k steps, where k is non-negative.
 */

class RotateArray {
    fun rotate(nums: IntArray, k: Int) {
        println("Begin ${nums.contentToString()}")
        for ( n in 0 until k){
            val aux = nums.clone()
            for (j in nums.indices){
                if (j == nums.size - 1) nums[0] = aux[j]
                else nums[j+1] = aux[j]
            }
        }
        println("End ${nums.contentToString()}")
    }
}

