
/*
 * Hackerrank Link: https://practice.geeksforgeeks.org/problems/non-repeating-element3958/1
 * Problem:
Find the first non-repeating element in a given array arr of N integers.
Note: Array consists of only positive and negative integers and not zero.

Example 1:

Input : arr[] = {-1, 2, -1, 3, 2}
Output : 3
Explanation:
-1 and 2 are repeating whereas 3 is 
the only number occuring once.
Hence, the output is 3. 
 

Example 2:

Input : arr[] = {1, 1, 1}
Output : 0

Your Task:
This is a function problem. The input is already taken care of by the driver code. You only need to complete the function firstNonRepeating() that takes an array (arr), sizeOfArray (n), and returns the first non-repeating element. The driver code takes care of the printing.

Expected Time Complexity: O(N).
Expected Auxiliary Space: O(N).

Constraints:
1 <= N <= 107
-1016 <= Ai <= 1016
{Ai !=0 }
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
        int[]arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        
        System.out.println(countDistinct(arr));
    }
    public static int countDistinct(int[] arr){
        int n = arr.length;
        HashSet<Integer> hs = new HashSet<Integer>();

        for (int i = 0; i < n; i++) {
            hs.add(arr[i]);
        }
        return hs.size();
    }

}
