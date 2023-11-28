
/*
 * Problem Link: https://practice.geeksforgeeks.org/problems/first-non-repeating-character-in-a-stream1216/1
 * Problem:
 * Given an input stream A of n characters consisting only of lower case alphabets. While reading characters from the stream, you have to tell which character has appeared only once in the stream upto that point. If there are many characters that have appeared only once, you have to tell which one of them was the first one to appear. If there is no such character then append '#' to the answer.

NOTE:
1. You need to find the answer for every i (0 <= i < n)
2. In order to find the solution for every i you need to consider the string from starting position till ith position.
 

Example 1:

Input: A = "aabc"
Output: "a#bb"
Explanation: For every ith character we will
consider the string from index 0 till index i first non
repeating character is as follow-
"a" - first non-repeating character is 'a'
"aa" - no non-repeating character so '#'
"aab" - first non-repeating character is 'b'
"aabc" - there are two non repeating characters 'b' and 'c', 
first non-repeating character is 'b' because 'b' comes before
'c' in the stream.
Example 2:

Input: A = "zz"
Output: "z#"
Explanation: For every character first non
repeating character is as follow-
"z" - first non-repeating character is 'z'
"zz" - no non-repeating character so '#'
 

Your Task:
You don't need to read or print anything. Your task is to complete the function FirstNonRepeating() which takes A as input parameter and returns a string after processing the input stream.
 

Expected Time Complexity: O(n)
Expected Space Complexity: O(n)
 

Constraints:
1 <= n <= 105
 
 */

// Solution :-

class Solution
{
    public String FirstNonRepeating(String A)
    {
        // code here
         Queue<Character> q = new LinkedList<>();
        HashMap<Character, Integer>hm = new HashMap<>();
        char[] ans = new char[A.length()];
        
        for(int i=0;i<A.length();i++){
            char c = A.charAt(i);
            
            q.add(c);
            if(hm.containsKey(c) == true){
                int temp = hm.get(c);
                hm.put(c,temp+1);
            }else{
                hm.put(c,1);
            }
            
            while(q.size()>0 && hm.get(q.peek())> 1){
                q.remove();
            }
            
            if(q.size()>0){
                ans[i] = q.peek();
            }else{
                ans[i] = '#';
            }
        }
        
        return String.valueOf(ans);
    }
}