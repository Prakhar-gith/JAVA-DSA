
/*
 * Problem Link: https://www.hackerrank.com/contests/interview-prep-cohort-1/challenges/levelup-18aug-countofrightangledtriangle
 * Problem:
Given an array arr[] of N distinct integers points on the 2D Plane. The task is to count the number of Right-Angled Triangle from N points such that the base or perpendicular is parallel to the X or Y-axis.
Input Format

The first line contains number of coordinates N.
Next N lines contains pair  "X Y" denoting coordinates
Constraints

1<=n<=10^5
1<=X,Y<=10^5
Output Format

Print number of triangles.
Sample Input 0

3
4 2
2 1
1 3
Sample Output 0

0
 */

// Solution :-

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[][] a = new int[n][2];
        
        for(int i=0;i<n;i++){
            for(int j=0;j<2;j++){
                a[i][j] = scn.nextInt();
            }
        }
        
        System.out.println(RightAngled(a,n));
    }
    
    static int RightAngled(int a[][], int n){

    HashMap<Integer, Integer> xpoints = new HashMap<>();
    HashMap<Integer, Integer> ypoints = new HashMap<>();

    for (int i = 0; i < n; i++){
        if(xpoints.containsKey(a[i][0])){
            xpoints.put(a[i][0], xpoints.get(a[i][0]) + 1);
        }else{
            xpoints.put(a[i][0], 1);
            }
        if(ypoints.containsKey(a[i][1])){
             ypoints.put(a[i][1], ypoints.get(a[i][1]) + 1);
        }
        else{
             ypoints.put(a[i][1], 1);
            }
    }

        int count = 0;

        for (int i = 0; i < n; i++){
            if (xpoints.get(a[i][0]) >= 1 &&
                ypoints.get(a[i][1]) >= 1){

                count += (xpoints.get(a[i][0]) - 1) *
                    (ypoints.get(a[i][1]) - 1);
            }
        }

    
        return count;
    }

}