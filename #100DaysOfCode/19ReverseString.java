
/*
 * Hackerrank Link: https://www.hackerrank.com/contests/interview-prep-cohort-1/challenges/found-string-print-reverse
 * Problem:
1.Take as input String.

Write a function that reverses the string and then print that String.
Input Format

String representing S.
Constraints

Size of String may be large.
Output Format

print the string after reversing it.
Sample Input 0

aBBc
Sample Output 0

cBBa
 */

// Solution :-


import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        String st=scn.nextLine();
        
        char[] ch = st.toCharArray();
        reverse(ch);
        for(int i=0;i<ch.length;i++){
            System.out.print(ch[i]);
        }
    }

    private static void reverse(char[]ch) {
        
       int sp =0;
       int ep = ch.length - 1;
        
       while(sp < ep){
           char temp = ch[sp];
           ch[sp] = ch[ep];
           ch[ep] = temp;
           sp++;
           ep--;
       }
        
        

    }
}

