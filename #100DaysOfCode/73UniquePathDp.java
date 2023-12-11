
/*
 * Problem Link: https://leetcode.com/problems/unique-paths/description/
 * Problem:
 * There is a robot on an m x n grid. The robot is initially located at the top-left corner (i.e., grid[0][0]). The robot tries to move to the bottom-right corner (i.e., grid[m - 1][n - 1]). The robot can only move either down or right at any point in time.

Given the two integers m and n, return the number of possible unique paths that the robot can take to reach the bottom-right corner.

The test cases are generated so that the answer will be less than or equal to 2 * 109.

 

Example 1:


Input: m = 3, n = 7
Output: 28
Example 2:

Input: m = 3, n = 2
Output: 3
Explanation: From the top-left corner, there are a total of 3 ways to reach the bottom-right corner:
1. Right -> Down -> Down
2. Down -> Down -> Right
3. Down -> Right -> Down
 

Constraints:

1 <= m, n <= 100
 
 */

// Solution :-

class Solution {
    public int uniquePaths(int m, int n) {
        long[][] dp = new long[m][n];

        for (int i = 0; i < m; i++) {
            Arrays.fill(dp[i], -1);
        }
        return (int) pathshelper(m - 1, n - 1, dp);
    }

    public static long pathshelper(int sr, int sc, long[][] dp) {
        if (sr < 0 || sc < 0) {
            return 0;
        }
        if (sr == 0 && sc == 0) {
            return 1;
        }

        if (dp[sr][sc] != -1) {
            return dp[sr][sc];
        }

        long path1 = pathshelper(sr - 1, sc, dp);
        long path2 = pathshelper(sr, sc - 1, dp);

        dp[sr][sc] = path1 + path2;
        return dp[sr][sc];
    }
}
