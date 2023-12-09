
/*
 * Problem Link: https://leetcode.com/problems/climbing-stairs/
 * Problem:
 * You are climbing a staircase. It takes n steps to reach the top.

Each time you can either climb 1 or 2 steps. In how many distinct ways can you climb to the top?

 

Example 1:

Input: n = 2
Output: 2
Explanation: There are two ways to climb to the top.
1. 1 step + 1 step
2. 2 steps
Example 2:

Input: n = 3
Output: 3
Explanation: There are three ways to climb to the top.
1. 1 step + 1 step + 1 step
2. 1 step + 2 steps
3. 2 steps + 1 step
 

Constraints:

1 <= n <= 45
 
 */

// Solution :-

class Solution {
    public int climbStairs(int n) {
        int[] dp = new int[n+1];
        Arrays.fill(dp, -1);
        return climbstairsHelperFunc(n,dp);
    }

    public int climbstairsHelperFunc(int n, int[] dp) {
        if(n==1 || n==2){
            return n;
        }
        if(dp[n] != -1) {
            return dp[n];
        }
        int s1 = climbstairsHelperFunc(n-1, dp);
        int s2 = climbstairsHelperFunc(n-2, dp);

        dp[n] = s1+s2;
        return dp[n];
    }
}