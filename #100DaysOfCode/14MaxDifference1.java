
/*
 * Hackerrank Link: https://www.hackerrank.com/contests/interview-prep-cohort-1/challenges/found-arrays2-max-difference-1-hw
 * Problem:
Given n length array "arr". Find the pair with maximum value of arr[i] - arr[j]. You need to print max value of (arr[i] - arr[j]) possible and not the (i,j) itself.

Note: Doing it by checking all the possible pairs. Works but can you do something smart?
Input Format

Each of the test cases have 2 lines.
The First line contains the size of the array n.
The second line contains the n elements of the array.
Constraints

2 <= array length <= 10^5
-10^4 <= array[i] <= 10^4
Output Format

Print the maximum value of arr[i] - arr[j] Possible.
Sample Input 0

5
3 9 8 4 1
Sample Output 0

8
 */

// Solution :-


import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Main {
    public static void main(String[] args) {
        
       Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[]arr = new int[n];
        
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        
        System.out.println(maxdifference_1(arr));
       
    }
    
    public static int maxdifference_1(int[]arr){
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
        
        return max - min;
    }
}
