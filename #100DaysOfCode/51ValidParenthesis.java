
/*
 * Problem Link: https://leetcode.com/problems/valid-parentheses/description/
 * Problem:
 * Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.

An input string is valid if:

Open brackets must be closed by the same type of brackets.
Open brackets must be closed in the correct order.
Every close bracket has a corresponding open bracket of the same type.
 

Example 1:

Input: s = "()"
Output: true
Example 2:

Input: s = "()[]{}"
Output: true
Example 3:

Input: s = "(]"
Output: false
 

Constraints:

1 <= s.length <= 104
s consists of parentheses only '()[]{}'.
 
 */

// Solution :-

class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        int i = 0;
        while(i < s.length()){
            char ch = s.charAt(i);
            if(stack.isEmpty() || ch == '(' || ch == '[' || ch == '{'){
                stack.push(ch);
            }else{
                if((ch == ')' && stack.peek() == '(') || (ch == ']' && stack.peek() == '[') || (ch == '}' && stack.peek() == '{')){
                stack.pop();
                }else{
                return false;
                }
            }
            i++;
        }

        if(stack.size() == 0){
        return true;
        }else{
        return false;
        }
    }
}
