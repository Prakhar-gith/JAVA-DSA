
/*
 * Problem Link: https://www.hackerrank.com/contests/interview-prep-cohort-1/challenges/found-queue-kth-number
 * Problem:
 * GGiven K, Print the Kth Number in the increasing series of number using digits 1 and 2 only.
Input Format

The only line contains number K
Constraints

1<= K <=20
Output Format

Return the kth number of the series
Sample Input 0

5
Sample Output 0

21
 
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
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        System.out.println(kth(k));
        
    }
    
    public static String kth(int k){
        Queue<String> q = new LinkedList<>();
        q.add("1");
        q.add("2");
        
        String ans = "";
        for(int i=0;i<k;i++){
            String temp = q.remove();
            ans = temp;
            q.add(temp+"1");
            q.add(temp+"2");
        }
        
        return ans;

    }
}