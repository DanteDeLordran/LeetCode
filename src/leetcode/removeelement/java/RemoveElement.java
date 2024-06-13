package leetcode.removeelement.java;

import java.util.Arrays;

public class RemoveElement {

    public int removeElement(int[] nums, int val) {
        var result = Arrays.stream(nums).filter(n -> n != val).toArray();
        System.out.println(Arrays.toString(result));
        return result.length;
    }

}
