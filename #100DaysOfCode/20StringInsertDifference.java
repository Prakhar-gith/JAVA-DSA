
/*
 * Hackerrank Link: https://www.hackerrank.com/contests/interview-prep-cohort-1/challenges/found-string-insert-difference-hw
 * Problem:
Take as input String.

Write a code that inserts between each pair of characters the difference
between their ascii codes. Print the final string.

Note: You can use adding at the end of the string

Example:

Input:
abfk

output
a1b4f5k

1 = b-a
4 = f-b
5 = k-f
Input Format

String representing S.
Constraints

Size of String may be large.
Output Format

Print the string after inserting the difference of ASCII
Sample Input 0

abfk
Sample Output 0

a1b4f5k
 */

// Solution :-


import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String st=sc.nextLine();
        System.out.println(insert(st));
    }

    private static String insert(String st) {
        String ans = "";
        
        for(int i=0;i<st.length()-1;i++){
            char ch1 = st.charAt(i);
            ans = ans + ch1;
            int temp = st.charAt(i+1)-st.charAt(i);
            ans = ans + temp;
        }
        
        ans = ans + st.charAt(st.length()-1);
        return ans;

        
    }
}