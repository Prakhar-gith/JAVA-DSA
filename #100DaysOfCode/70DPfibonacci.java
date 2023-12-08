
/*
 * Problem Link: https://leetcode.com/problems/fibonacci-number/description/
 * Problem:
 * The Fibonacci numbers, commonly denoted F(n) form a sequence, called the Fibonacci sequence, such that each number is the sum of the two preceding ones, starting from 0 and 1. That is,

F(0) = 0, F(1) = 1
F(n) = F(n - 1) + F(n - 2), for n > 1.
Given n, calculate F(n). Using the concept of dynamic programming

 

Example 1:

Input: n = 2
Output: 1
Explanation: F(2) = F(1) + F(0) = 1 + 0 = 1.
Example 2:

Input: n = 3
Output: 2
Explanation: F(3) = F(2) + F(1) = 1 + 1 = 2.
Example 3:

Input: n = 4
Output: 3
Explanation: F(4) = F(3) + F(2) = 2 + 1 = 3.
 

Constraints:

0 <= n <= 30
 
 */

// Solution :-

class Solution {
    public int fib(int n) {
        int[] dp = new int [n+1];
        Arrays.fill(dp,-1);
        int ans = new_fib(n,dp);
        return ans;
    }

    public int new_fib(int n, int[] dp) {
        if(n==0 || n==1) {
            return n;
        }
        if(dp[n] != -1){
            return dp[n];
        }
        int a = new_fib(n-1,dp);
        int b = new_fib(n-2,dp);

        dp[n] = a+b;
        return a+b;
    }
}