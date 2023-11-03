
/*
 * Problem Link: https://www.hackerrank.com/contests/interview-prep-cohort-1/challenges/found-sorting-order-of-removal
 * Problem:
Given N length Array, at every step remove an array element. Cost to remove element = sum of array elements present. Find min cost to remove all the elements.

Note: Add to cost first and then remove.
Input Format

Integer representing N representing length of array
N numbers of Array
Constraints

1<= N <= 10 ^ 6
1<= A[i] <=10 ^ 9
Output Format

Return the min cost to remove all the elements.
Sample Input 0

3
3 2 5
Sample Output 0

17
 */

// Solution :-

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println(orderOfRemoval(arr));
    }
    
    public static int orderOfRemoval(int[] arr){
        int n = arr.length;
        Arrays.sort(arr);
        int ans =0;
        
        for(int i=0;i<arr.length;i++){
            int temp = arr[i] * (n-i);
            ans = ans + temp;
        }
        
        return ans;
    }
}