
/*
 * Problem Link: https://www.hackerrank.com/contests/interview-prep-cohort-1/challenges/found-recursion-sum
 * Problem:
Take as input N

Print numbers from 1 to N in N lines
Input Format

Integer representing n
Constraints

1 <= n <= 10 ^ 9
Output Format

Print numbers from 1 to N
Sample Input 0

4
Sample Output 0

1
2
3
4
 */

// Solution :-

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        inc(n);
        
    }
    
    public static void inc(int n){
        if(n == 1){
            System.out.println(1);
            return;
        }
        
        inc(n-1);
        System.out.println(n);
        
    }
}

