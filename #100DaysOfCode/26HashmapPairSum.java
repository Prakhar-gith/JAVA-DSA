
/*
 * Hackerrank Link: https://practice.geeksforgeeks.org/problems/key-pair5616/1
 * Problem:
Given an array Arr of N positive integers and another number X. Determine whether or not there exist two elements in Arr whose sum is exactly X.

Example 1:

Input:
N = 6, X = 16
Arr[] = {1, 4, 45, 6, 10, 8}
Output: Yes
Explanation: Arr[3] + Arr[4] = 6 + 10 = 16
Example 2:

Input:
N = 5, X = 10
Arr[] = {1, 2, 4, 3, 6}
Output: Yes
Explanation: Arr[2] + Arr[4] = 4 + 6 = 10
Your Task:
You don't need to read input or print anything. Your task is to complete the function hasArrayTwoCandidates() which takes the array of integers arr, n and x as parameters and returns a boolean denoting the answer.

Expected Time Complexity: O(N)
Expected Auxiliary Space: O(N)

Constraints:
1 ≤ N ≤ 10^5
1 ≤ Arr[i] ≤ 10^5
 */

// Solution :-

public class Solution {

     public static boolean PairSum(int[] arr, int n, int x) {
        n = arr.length;
        HashMap<Integer,Integer> map = new HashMap<>();
        for (int num : arr) {
            if(map.containsKey(num) == true){
                int temp = map.get(num);
                map.put(num,temp+1);
            }else{
                map.put(num,1);
            }
        }

        for(int i=0;i<n;i++){
            int a = arr[i];
            int b = x - a;
            
            if((a != b) && (map.containsKey(b)==true)){
                return true;
            }else if((a == b) && (map.get(b) > 1)){
                return true;
            }
        }
         
         return false;
    }

}