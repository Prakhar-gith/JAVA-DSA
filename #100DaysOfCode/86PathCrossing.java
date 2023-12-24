
/*
 * Problem Link: https://leetcode.com/problems/path-crossing/description/?envType=daily-question&envId=2023-12-23
 * Problem:
 * Given a string path, where path[i] = 'N', 'S', 'E' or 'W', each representing moving one unit north, south, east, or west, respectively. You start at the origin (0, 0) on a 2D plane and walk on the path specified by path.

Return true if the path crosses itself at any point, that is, if at any time you are on a location you have previously visited. Return false otherwise.

 

Example 1:


Input: path = "NES"
Output: false 
Explanation: Notice that the path doesn't cross any point more than once.
Example 2:


Input: path = "NESWW"
Output: true
Explanation: Notice that the path visits the origin twice.
 

Constraints:

1 <= path.length <= 104
path[i] is either 'N', 'S', 'E', or 'W'.
 
 */

// Solution :-

class Solution {
    public boolean isPathCrossing(String path) {
        Set<String> word = new HashSet<>();
        int x = 0;
        int y = 0;
        word.add(x + "," + y);
        for(char ch : path.toCharArray()) {
            if (ch == 'N') {
                x++;
            }
            if(ch == 'S'){
                x--;
            }
            if(ch == 'E') {
                y++;
            }
            if(ch == 'W') {
                y--;
            }
            String coordinate = x + "," + y;
            if(word.contains(coordinate)) {
                return true;
            }
            word.add(coordinate);
        }
        return false;
    }
}