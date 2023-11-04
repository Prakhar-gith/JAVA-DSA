
/*
 * Problem Link: https://www.hackerrank.com/contests/interview-prep-cohort-1/challenges/found-sorting-good-integer-distinct
 * Problem:
Given N array Integers, Calculate number of good integers. An element is said to be good integers, if {No. of element < element == element itself}

Note: Array elements are distinct.
Input Format

Integer representing N representing length of array
N numbers of Array
Constraints

1<= N <= 10 ^ 6
1<= A[i] <=10 ^ 9
Output Format

Count of Good Integers
Sample Input 0

6
-1 -4 3 5 -15 4
Sample Output 0

3
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
        System.out.println(GoodIntegers(arr));
    }
    
    public static int GoodIntegers(int[] arr){
        int n = arr.length;
        Arrays.sort(arr);
        int ans =0;
        
        for(int i=0;i<arr.length;i++){
           if(arr[i] == i){
               ans++;
           }
        }
        
        return ans;
    }

}