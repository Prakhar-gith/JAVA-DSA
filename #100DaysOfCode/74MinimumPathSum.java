
/*
 * Problem Link: https://leetcode.com/problems/minimum-path-sum/
 * Problem:
 * Given a m x n grid filled with non-negative numbers, find a path from top left to bottom right, which minimizes the sum of all numbers along its path.

Note: You can only move either down or right at any point in time.

 

Example 1:


Input: grid = [[1,3,1],[1,5,1],[4,2,1]]
Output: 7
Explanation: Because the path 1 → 3 → 1 → 1 → 1 minimizes the sum.
Example 2:

Input: grid = [[1,2,3],[4,5,6]]
Output: 12
 

Constraints:

m == grid.length
n == grid[i].length
1 <= m, n <= 200
0 <= grid[i][j] <= 200
 
 */

// Solution :-

class Solution {
    public int minPathSum(int[][] grid) {
        int[][] dp = new int[grid.length][grid[0].length];
        for(int i=0;i<grid.length;i++){
            Arrays.fill(dp[i],-1);
        }
       return minPathSumhelper(grid,grid.length-1,grid[0].length-1,dp);
    }

    public int minPathSumhelper(int[][] grid, int row,int col,int[][]dp) {
        if(row < 0 || col < 0){
            return Integer.MAX_VALUE;
        }

        if(row == 0 && col == 0){
            return grid[row][col];
        }
        if(dp[row][col] != -1){
            return dp[row][col];
        }

        int down = minPathSumhelper(grid,row-1,col,dp);
        int right = minPathSumhelper(grid,row,col-1,dp);

        
        int ans = Math.min(down,right) + grid[row][col];
        dp[row][col] = ans;
        return ans;
    }
}