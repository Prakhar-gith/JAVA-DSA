
/*
 * Problem Link: https://www.hackerrank.com/contests/interview-prep-cohort-1/challenges/found-recursion-print-decreasing-hw/problem
 * Problem:
Take as input N

Print numbers from N to 1 in N lines
Input Format

Integer representing n
Constraints

1 <= n <= 10 ^ 9
Output Format

Print Numbers from N to 1.
Sample Input 0

3
Sample Output 0

3
2
1
 */

// Solution :-

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        dec(n);
        
    }
    
    public static void dec(int n){
        if(n == 1){
            System.out.println(1);
            return;
        }
        
        
        System.out.println(n);
        dec(n-1);
    }
}