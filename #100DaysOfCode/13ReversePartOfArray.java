
/*
 * Hackerrank Link: https://www.hackerrank.com/contests/interview-prep-cohort-1/challenges/reverse-part-of-array
 * Problem:
Given n length Array and two valid index [s,e], You have to Reverse the array from s to e and print the final array.
Input Format

Each of the test cases have 3 lines.
The First line contains the size of the array n.
The second line contains the n elements of the array.
The third line contains two index s and e
Constraints

2 <= array length <= 10^5
-10^4 <= array[i] <= 10^4
Output Format

Print all the array element in a line separated by space after reversing part of array [s,e]
Sample Input 0

10
-3 4 2 8 3 9 6 2 8 10
3 7
Sample Output 0

-3 4 2 2 6 9 3 8 8 10
 */

// Solution :-


import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int s = sc.nextInt();
        int e = sc.nextInt();
        
        reversePart(arr,s,e);
        
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
    
    public static void reversePart(int[]arr, int s, int e){
        int sp = s;
        int ep = e;
        while(sp < ep){
            int temp = arr[sp];
            arr[sp] = arr[ep];
            arr[ep] = temp;
            sp++;
            ep--;
        }

    }
}

