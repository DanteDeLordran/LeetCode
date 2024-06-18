import leetcode.majorityelement.java.MajorityElement;
import leetcode.mergesortedarray.kotlin.MergeSortedArray;
import leetcode.removeduplicatesfromsortedarray.java.RemoveDuplicatesFromSortedArray;
import leetcode.removeduplicatesfromsortedarraytwo.java.RemoveDuplicatesFromSortedArrayTwo;
import leetcode.removeelement.java.RemoveElement;
import leetcode.rotatearray.java.RotateArray;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        //int[] nums1 = {1,2,3,0,0,0};
        //int[] nums2 = {2,5,6};
        //System.out.println("Merge sorted array");
        //new MergeSortedArray().merge(nums1, 3, nums2, 3);

        //int[] nums3 = {0,0,1,1,1,2,2,3,3,4};
        //System.out.println("Remove element");
        //new RemoveElement().removeElement(nums3, 2);

        //System.out.println("Remove duplicates from sorted array");
        //new RemoveDuplicatesFromSortedArray().removeDuplicates(nums3);

        //int[] nums4 = {0,0,1,1,1,1,2,3,3,3,3,3,3,3,3,4,4,4,4,4,4,5};
        //int[] nums5 = {1,1,1,2,2,3};
        //System.out.println("Remove duplicates 2");
        //new RemoveDuplicatesFromSortedArrayTwo().removeDuplicates(nums5);
        //int[] nums = {0,0,1,1,1,1,2,3,3,3,3,3,3,3,3,4,4,4,4,4,4,5};
        //new MajorityElement().majorityElement(nums);
        int[] nums = {1,2,3,4,5,6,7};
        new RotateArray().rotate(nums, 3);
    }
}