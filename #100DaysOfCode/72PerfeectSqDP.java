
/*
 * Problem Link: https://leetcode.com/problems/perfect-squares/description/
 * Problem:
 * Given an integer n, return the least number of perfect square numbers that sum to n.

A perfect square is an integer that is the square of an integer; in other words, it is the product of some integer with itself. For example, 1, 4, 9, and 16 are perfect squares while 3 and 11 are not.

 

Example 1:

Input: n = 12
Output: 3
Explanation: 12 = 4 + 4 + 4.
Example 2:

Input: n = 13
Output: 2
Explanation: 13 = 4 + 9.
 

Constraints:

1 <= n <= 104
 
 */

// Solution :-

class Solution {
    public int numSquares(int n) {
        int[] dp = new int[n + 1];
        Arrays.fill(dp,-1);
        return NumSqhelper(n, dp);
    }
    
    public int NumSqhelper(int n, int[] dp) {
        if (n == 0 || n == 1){
            return n;
        }
        
        if (dp[n] != -1)
            return dp[n];
        
        int smallest = Integer.MAX_VALUE;
        
        for (int i = 1; i * i <= n; i++) {
    
            int temp = NumSqhelper(n - i*i,dp);
            smallest = Math.min(smallest, temp);
        }
        
        dp[n] = smallest + 1;
        return smallest + 1;
    }
}