
/*
 * Problem Link: https://leetcode.com/problems/powx-n/
 * Problem:
Given two Integer a and n, find a^n (a raise to power n).

Note: Use Recursion and Expected Time complexity is O(logN).

Leetcode Link: https://leetcode.com/problems/powx-n/
Input Format

Single line contains 2 integers a and n
Constraints

1<= a <= 10
1<= n <= 18
Output Format

Return the answer a^n
Sample Input 0

2
10
Sample Output 0

1024
 */

// Solution :-

class Solution {
    public double myPow(double x, int n) {
        if (n ==0) {
            return 1.0;
        }
        double temp = myPow(x, n/2);
        if (n % 2 == 0) {
            return temp*temp;
        } else {
            if (n > 0) {
                return temp*temp*x;
            } else {
                return temp*temp/x;
            }
        }
    }
}