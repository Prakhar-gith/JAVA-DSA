
/*
 * Problem Link: https://leetcode.com/problems/rotting-oranges/description/
 * Problem:
 * You are given an m x n grid where each cell can have one of three values:

0 representing an empty cell,
1 representing a fresh orange, or
2 representing a rotten orange.
Every minute, any fresh orange that is 4-directionally adjacent to a rotten orange becomes rotten.

Return the minimum number of minutes that must elapse until no cell has a fresh orange. If this is impossible, return -1.

 

Example 1:


Input: grid = [[2,1,1],[1,1,0],[0,1,1]]
Output: 4
Example 2:

Input: grid = [[2,1,1],[0,1,1],[1,0,1]]
Output: -1
Explanation: The orange in the bottom left corner (row 2, column 0) is never rotten, because rotting only happens 4-directionally.
Example 3:

Input: grid = [[0,2]]
Output: 0
Explanation: Since there are already no fresh oranges at minute 0, the answer is just 0.
 

Constraints:

m == grid.length
n == grid[i].length
1 <= m, n <= 10
grid[i][j] is 0, 1, or 2.
 
 */

// Solution :-

class Solution {
     static class Pair{
		int row;
		int col ; 
		int time;
		Pair(int row, int col, int time){
			this.row = row;
			this.col = col;
			this.time = time;
		}
	}
    
  public int orangesRotting(int[][] grid) {
        int m = grid.length;
				int n = grid[0].length;
		
		Queue<Pair> q = new LinkedList<>();

				int count1 = 0; 
				int count2 = 0;
        for(int i = 0 ; i < m ; i++){
            for(int j = 0 ; j < n ; j++){
                if(grid[i][j] == 2){
                    q.add(new Pair(i, j, 0));		
										count2++;
                }else if(grid[i][j] == 1){
									count1++;
								}
            }
        }

				if(count1 == 0){
					return 0;
				}else if(count2 == 0){
					return -1;
				}
		
		int ans = -1;
		while(!q.isEmpty()) {
			
			Pair removed = q.poll();
			int r = removed.row;
			int c = removed.col;
			int t = removed.time;

      ans = removed.time;
			
			if(r + 1 < m && grid[r + 1][c] == 1 ) {
				q.add(new Pair(r + 1, c, t + 1));
				grid[r + 1][c] = 2;
			}
			if(r - 1 >= 0  && grid[r - 1][c] == 1 ) {
				q.add(new Pair(r - 1, c, t + 1));
				grid[r - 1][c] = 2;
			}
			if(c + 1 < n && grid[r][c + 1] == 1 ) {
				q.add(new Pair(r , c + 1, t + 1));
				grid[r][c + 1] = 2;
			}
			if(c - 1 >= 0 && grid[r][c - 1] == 1 ) {
				q.add(new Pair(r, c - 1 , t + 1));
				grid[r][c - 1] = 2;
			}
		}
		
		for(int i = 0; i < m ; i++) {
			for(int j = 0 ; j < n ; j++) {
				if(grid[i][j] == 1) {
					return -1;
				}
			}
		}
		return ans;
  }
}