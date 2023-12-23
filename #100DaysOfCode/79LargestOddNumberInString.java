
/*
 * Problem Link: hhttps://leetcode.com/problems/largest-odd-number-in-string/description/?envType=daily-question&envId=2023-12-07
 * Problem:
 * You are given a string num, representing a large integer. Return the largest-valued odd integer (as a string) that is a non-empty substring of num, or an empty string "" if no odd integer exists.

A substring is a contiguous sequence of characters within a string.

 

Example 1:

Input: num = "52"
Output: "5"
Explanation: The only non-empty substrings are "5", "2", and "52". "5" is the only odd number.
Example 2:

Input: num = "4206"
Output: ""
Explanation: There are no odd numbers in "4206".
Example 3:

Input: num = "35427"
Output: "35427"
Explanation: "35427" is already an odd number.
 

Constraints:

1 <= num.length <= 105
num only consists of digits and does not contain any leading zeros.
 
 */

// Solution :-

class Solution {
    public String largestOddNumber(String num) {
        int n = num.length();
        for(int i =n-1; i>=0; i--){
            int digit = num.charAt(i)-'0';
            if(digit%2 != 0) {
                return num.substring(0,i+1);
            }
        }
        return "";
    }
}