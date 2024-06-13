package leetcode.removeduplicatesfromsortedarray.java;

import java.util.HashSet;

public class RemoveDuplicatesFromSortedArray {
    public int removeDuplicates(int[] nums) {
        var result = new HashSet<Integer>();
        for (int n : nums){
            result.add(n);
        }
        System.out.println(result.toString());
        return result.size();
    }
}
