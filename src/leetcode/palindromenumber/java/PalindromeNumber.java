package leetcode.palindromenumber.java;

/*
Given an integer x, return true if x is a palindrome, and false otherwise.

Example 1:

Input: x = 121
Output: true
Explanation: 121 reads as 121 from left to right and from right to left.

Example 2:

Input: x = -121
Output: false
Explanation: From left to right, it reads -121. From right to left, it becomes 121-. Therefore, it is not a palindrome.

Example 3:

Input: x = 10
Output: false
Explanation: Reads 01 from right to left. Therefore, it is not a palindrome.
*/

import java.util.Arrays;

public class PalindromeNumber {
    public boolean isPalindrome(int x) {
        var number = String.valueOf(x).toCharArray();
        if (number.length %2 == 0) {
            char[] left = new char[(number.length)/2], right = new char[(number.length)/2];

            for (int i = 0; i < (number.length)/2 ; i++) {
                left[i] = number[i];
                right[i] = number[number.length - 1 - i];
            }
            return Arrays.equals(left, right);
        }
        else {
            char[] left = new char[(number.length - 1)/2], right = new char[(number.length - 1)/2];

            for (int i = 0; i < (number.length - 1)/2 ; i++) {
                left[i] = number[i];
                right[i] = number[number.length - 1 - i];
            }
            return Arrays.equals(left, right);
        }
    }
}
