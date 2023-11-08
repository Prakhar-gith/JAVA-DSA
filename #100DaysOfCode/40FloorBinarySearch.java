
/*
 * Problem Link: https://www.hackerrank.com/contests/interview-prep-cohort-1/challenges/found-binary-search-floor-in-an-array
 * Problem:
Given a sorted array of n integers and a number k, Return floor(k).
Input Format

First line contains integer n representing the length of array
Second line contains n integers
Third line contains integer k
Constraints

1 <= n <= 10^9
Output Format

Return floor of k.
Sample Input 0

9
-4 3 4 7 10 11 12 15 19
5
Sample Output 0

4

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
        
        int k = sc.nextInt();
        System.out.println(Floor(arr,k));
    }
    
    public static int Floor(int[] arr, int k){
        int lo = 0;
        int hi = arr.length - 1;
        int ans = Integer.MIN_VALUE;
        
        while(lo <= hi){
            int m = (lo+hi)/2;
            
            if(arr[m] == k){
                return k;
            }else if(arr[m] < k){
                ans = arr[m];
                lo = m + 1;
            }else{
                hi = m-1;
            }
        }
        
        return ans;
    }
}