package leetcode.majorityelement.java;

/*
* Given an array nums of size n, return the majority element.
The majority element is the element that appears more than ⌊n / 2⌋ times. You may assume that the majority element always exists in the array.
* */

import java.util.*;
import java.util.stream.Collectors;

public class MajorityElement {
    public int majorityElement(int[] nums) {
        Arrays.sort(nums);
        Map<Integer,Integer> majorities = new HashMap<>();

        for (int num : nums) {
            if (majorities.containsKey(num)) {
                majorities.put(num, majorities.get(num) + 1);
            } else {
                majorities.put(num, 1);
            }
        }

        var majority = majorities.entrySet().stream().sorted(Map.Entry.comparingByValue()).collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (oldValue, newValue) -> oldValue, LinkedHashMap::new));

        System.out.println(majority.entrySet());
        int currentMajority = 0;
        for (Map.Entry<Integer, Integer> e : majority.entrySet()){
            currentMajority = e.getKey();
        }

        System.out.println(currentMajority);
        return currentMajority;
    }
}
