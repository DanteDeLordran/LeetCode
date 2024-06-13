package leetcode.mergesortedarray.kotlin

class MergeSortedArray {

    fun merge(nums1: IntArray, m: Int, nums2: IntArray, n: Int): Unit {
        for (i in 0..<n){
            nums1[m + i] = nums2[i]
        }
        nums1.sort()
        println(nums1.contentToString())
    }

}