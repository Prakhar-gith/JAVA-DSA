
/*
 * Hackerrank Link: https://www.hackerrank.com/contests/interview-prep-cohort-1/challenges/floor-of-sqrt
 * Problem:
You need to find the square root of a given number N. If N is not a perfect square, then floor(√x) must be returned.
Input Format

Each of the test cases have one line containing the number N.
Constraints

1 ≤ N ≤ 10^9
Output Format

Output a line containing the required output for above query.
Sample Input 0

4
Sample Output 0

2
Sample Input 1

11
Sample Output 1

3
 */

// Solution :-


import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int i = 1;
        int sqrt = 1;

        while (i * i <= n) {
            sqrt = i;
            i++;
        }

        System.out.println(sqrt);
    }
}