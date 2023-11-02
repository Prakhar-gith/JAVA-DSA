
/*
 * Problem Link: https://www.hackerrank.com/contests/interview-prep-cohort-1/challenges/found-recursion-check-sorted
 * Problem:
Take an input N, the size of array.
Take N more inputs and store that in an array.

1.It reads a number N.
2.Take Another N numbers as input and store them in an Array.

Write a recursive function which returns true if the array is sorted and false
otherwise

print returned value.


Example(To be used only for expected output):
Input:
4
2 8 6 4
Output:
false
Input Format

Integer representing N representing length of array
N numbers of Array
Constraints

n <= 10 ^ 9
Output Format

Return true if array is sorted else false
Sample Input 0

5
10 20 30 40 50
Sample Output 0

true
 */

// Solution :-

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int[] arr = new int[m];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(sorted(arr, 0));
    }

    private static boolean sorted(int[] arr, int vidx) {
        if (vidx == arr.length - 1) {
            return true;
        }
        
        
        boolean check = sorted(arr, vidx + 1);
        
        if(check == false){
            return false;
        }else{
            if(arr[vidx] <= arr[vidx+1]){
                return true;
            }else{
                return false;
            }    
        }
        
    }
}