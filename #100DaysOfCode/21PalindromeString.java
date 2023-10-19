
/*
 * Hackerrank Link: https://www.hackerrank.com/contests/interview-prep-cohort-1/challenges/found-string-is-palindrome-hw
 * Problem:
Take as input String.

Write a Function to Check whether it is palindrome or not. if yes print true
otherwise false. Palindrome means string and it's reversed form are same

please Note: Lower and Upper case letter treated as equal.


Example(To be used only for expected output):

Input:
aBcba

output
true
Input Format

String representing S.
Constraints

Size of String may be large.
Output Format

print true if the string is palindrome else print false.
Sample Input 0

abbc
Sample Output 0

false
Sample Input 1

abba
Sample Output 1

true
 */

// Solution :-


import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String st=sc.nextLine();
        int n = st.length();
        
        char[] arr = new char[n];
        for(int i=0;i<n;i++){
            if(st.charAt(i)>='A' && st.charAt(i)<='Z'){
                arr[i] = (char)(st.charAt(i) + 32);
            }else{
                arr[i] = st.charAt(i);
            }
        }
        
        int sp = 0;
        int ep = n-1;
        
        while(sp<ep){
            if(arr[sp]!= arr[ep]){
                System.out.println("false");
                return;
            }
            
            sp++;
            ep--;
        }
        
        System.out.println("true");
    }
}