package leetcode.removeelement.kotlin

class RemoveElement {
    fun removeElement(nums : IntArray, num : Int) : Int {
        val result = nums.filter { n -> n != num }.toIntArray()
        println(result.contentToString())
        return result.size
    }
}