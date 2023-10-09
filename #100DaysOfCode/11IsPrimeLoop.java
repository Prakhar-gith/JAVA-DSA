
/*
 * Hackerrank Link: https://www.hackerrank.com/contests/interview-prep-cohort-1/challenges/pep-java-1gettingstarted-1isprime/submissions/code/1365616865
 * 
 * Problem:
Take as input a number n. Determine whether it is prime or not. If it is prime, 
print "Prime" otherwise print "Not Prime".
Input Format

Integer

Constraints

n <= 10 ^ 9

Output Format

String

Sample Input 0

7
Sample Output 0

Prime
Sample Input 1

9
Sample Output 1

Not Prime
 */

// Solution :-


import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    public static void main(String args[] ) throws Exception {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT */
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        
        boolean isPrime = true;
        
        if (n <= 1) {
            isPrime = false;
        } else {
            for (int i = 2; i * i <= n; i++) {
                if (n % i == 0) {
                    isPrime = false;
                    break;
                }
            }
        }
        
        if (isPrime) {
            System.out.println("Prime");
        } else {
            System.out.println("Not Prime");
        }
    }
}