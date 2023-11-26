
/*
 * Problem Link: https://www.hackerrank.com/contests/interview-prep-cohort-1/challenges/found-queue-even-palindrome-kth-number
 * Problem:
 * Given K, Print the Kth Palindrome Number in the increasing series of even digit numbers using digits 1 and 2 only.
Input Format

The only line contains number K
Constraints

1<= K <=20
Output Format

Return the kth number of the series
Sample Input 0

5
Sample Output 0

2112
 
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
        
        System.out.println(KPalindrome(k));
        
    }
    
    public static String KPalindrome(int k){
        Queue<String> q = new LinkedList<>();
        
        q.add("11");
        q.add("22");
        
        String ans = "";
        
        for(int i=1;i<=k;i++){
            String temp = q.remove();
            ans = temp;
            String left = temp.substring(0,temp.length()/2);
            String right = temp.substring(temp.length()/2,temp.length());
            
            q.add(left+"11"+right);
            q.add(left+"22"+right);
            
        }
        
        return ans;

    }
}