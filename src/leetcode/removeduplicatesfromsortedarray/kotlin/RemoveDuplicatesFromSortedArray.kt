package leetcode.removeduplicatesfromsortedarray.kotlin

class RemoveDuplicatesFromSortedArray {
    fun removeDuplicates(nums : IntArray) : Int {
        val result = nums.toSet()
        println(result.toString())
        return result.size
    }
}