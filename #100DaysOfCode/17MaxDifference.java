
/*
 * Hackerrank Link: https://www.hackerrank.com/contests/interview-prep-cohort-1/challenges/found-arrays2-max-difference-4-hw
 * Problem:
Given n length array "arr". Find (i,j) with maximum value of (abs(arr[i] - arr[j]) + i - j). You need to print max value of (abs(arr[i] - arr[j]) + i - j) possible and not the (i,j) itself.

Note 1: abs represents the postive part only. ex: abs(8) = 8 and abs(-8) = 8.

Note 2: Doing it by checking all the possible pairs. Works but can you do something smart?
Input Format

Each of the test cases have 2 lines.
The First line contains the size of the array n.
The second line contains the n elements of the array.
Constraints

2 <= array length <= 10^5
-10^4 <= array[i] <= 10^4
Output Format

Print the maximum value of (abs(arr[i] - arr[j]) + i - j) Possible.
Sample Input 0

5
3 9 8 4 1
Sample Output 0

11
 */

// Solution :-


import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

// "static void main" must be defined in a public class.
public class Main {
    public static void main(String[] args) {
        
       Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[]arr = new int[n];
        
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int max = Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            for(int j =0;j<n;j++){
                if(Math.abs(arr[i]-arr[j])+i-j > max){
                    max = Math.abs(arr[i]-arr[j])+i-j;
                }
            }
        }
        
        //System.out.println(max);
        
        int ans1 = maxdifference_2(arr);
        int ans2 = maxdifference_3(arr);
        
        System.out.println(Math.max(ans1,ans2));
       
    }
    
     public static int maxdifference_3(int[]arr){
        for(int i=0;i<arr.length;i++){
            arr[i] = arr[i] - i;
        }
        
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        
        for(int i=0;i<arr.length;i++){
            if(arr[i] > max){
                max = arr[i];
            }
            
            if(arr[i] < min){
                min = arr[i];
            }
            
        }
        
         for(int i=0;i<arr.length;i++){
            arr[i] = arr[i] + i;
        }
        return max - min;
    }

    
    public static int maxdifference_2(int[]arr){
        for(int i=0;i<arr.length;i++){
            arr[i] = arr[i] + i;
        }
        
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        
        for(int i=0;i<arr.length;i++){
            if(arr[i] > max){
                max = arr[i];
            }
            
            if(arr[i] < min){
                min = arr[i];
            }
            
        }
         for(int i=0;i<arr.length;i++){
            arr[i] = arr[i] - i;
        }
        
        return max - min;
    }
}
