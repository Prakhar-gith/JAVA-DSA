
/*
 * Hackerrank Link: https://www.hackerrank.com/contests/interview-prep-cohort-1/challenges/levelup-18aug-frequencyqueries
 * Problem:
Given N array elements and Q queries. For every query find frequency of element in array.
Input Format

First line contains 2 integers N, M denoting size of the array and the number of queries.
Second line contains the elements of the array.
Third line contains M elements representin queries. 
Constraints

1 <= arr.length <= 10^5
1 <= arr[i], value <= 10^4
0 <= left <= right < arr.length
Output Format

Output M integers in different lines denoting the frequency of each query.
Sample Input 0

9 2
2 8 6 9 8 6 8 2 11
2 8
Sample Output 0

2
3
 */

// Solution :-

import java.util.*;
import java.util.Map;

class Solution {
    public static void FrequencyQueries(int[] arr,int[] queries) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        for (int num : arr) {
            if(hm.containsKey(num)== true){
                int temp = hm.get(num);
                hm.put(num,temp+1);
            }else{
                hm.put(num,1);
            }
        }

        for (int num : queries) {
            if(hm.containsKey(num)== true){
                System.out.println(hm.get(num));
            }else{
                System.out.println(0);
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        
        int[]arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        
        int[] queries = new int[m];
        for(int i=0;i<m;i++){
            queries[i] = sc.nextInt();
        }
        
        FrequencyQueries(arr, queries); // Output: 3
    }
}
