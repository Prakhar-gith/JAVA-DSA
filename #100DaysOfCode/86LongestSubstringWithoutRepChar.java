
/*
 * Problem Link: https://leetcode.com/problems/longest-substring-without-repeating-characters/description/
 * Problem:
 * Given a string s, find the length of the longest 
substring
 without repeating characters.

 

Example 1:

Input: s = "abcabcbb"
Output: 3
Explanation: The answer is "abc", with the length of 3.
Example 2:

Input: s = "bbbbb"
Output: 1
Explanation: The answer is "b", with the length of 1.
Example 3:

Input: s = "pwwkew"
Output: 3
Explanation: The answer is "wke", with the length of 3.
Notice that the answer must be a substring, "pwke" is a subsequence and not a substring.
 

Constraints:

0 <= s.length <= 5 * 104
s consists of English letters, digits, symbols and spaces.
 
 */

// Solution :-

class Solution {
    public int lengthOfLongestSubstring(String s) {
        Set<Character> word = new HashSet<>();
        int max = 0;
        int left = 0;
        for (int right = 0; right < s.length(); right++) {
            char ch = s.charAt(right);
            while (word.contains(ch)) {
                word.remove(s.charAt(left));
                left++;
            }
            word.add(ch);
            int len = right - left + 1;
            max = Math.max(max, len);
        }
        return max;
    }
}