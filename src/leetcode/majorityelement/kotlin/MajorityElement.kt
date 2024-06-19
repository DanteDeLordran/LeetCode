package leetcode.majorityelement.kotlin

class MajorityElement {
    fun majorityElement(nums: IntArray): Int {
        nums.sort()
        val majorities = mutableMapOf<Int, Int>()

        for (num in nums) {
            if (num in majorities) {
                majorities[num] = majorities[num]!! + 1
            } else {
                majorities[num] = 1
            }
        }

        val majority = majorities.entries.sortedBy { it.value }.associate { it.toPair() }
        println(majority.entries)
        var currentMajority = 0
        for (e in majority.entries) {
            currentMajority = e.key
        }

        println(currentMajority)
        return currentMajority
    }
}