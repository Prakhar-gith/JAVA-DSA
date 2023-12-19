
/*
 * Problem Link: https://leetcode.com/problems/valid-anagram/?envType=daily-question&envId=2023-12-16
 * Problem:
 * Given two strings s and t, return true if t is an anagram of s, and false otherwise.

An Anagram is a word or phrase formed by rearranging the letters of a different word or phrase, typically using all the original letters exactly once.

 

Example 1:

Input: s = "anagram", t = "nagaram"
Output: true
Example 2:

Input: s = "rat", t = "car"
Output: false
 

Constraints:

1 <= s.length, t.length <= 5 * 104
s and t consist of lowercase English letters.
 
 
 */

// Solution :-

class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()){
            return false;
        }

        char[] Array_of_s = s.toCharArray();
        char[] Array_of_t = t.toCharArray();

        Arrays.sort(Array_of_s);
        Arrays.sort(Array_of_t);

        return Arrays.equals(Array_of_s,Array_of_t);
    }
}