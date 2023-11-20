
/*
 * Problem Link: https://www.hackerrank.com/contests/interview-prep-cohort-1/challenges/found-stack-remove-adjacent-duplicate
 * Problem:
 * Given a string S, Remove equal pair of adjacent character and return the final String
Input Format

A single line containing the string
Constraints

1 <= S.length() <= 10^5
Output Format

Print the String after removing all the adjacent same characters
Sample Input 0

abbbbd
Sample Output 0

ad
 
 */

// Solution :-

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String s = scn.nextLine();
        
        System.out.println(Removeadjacentduplicate(s));
    }
    
    public static String Removeadjacentduplicate(String s){
        Stack<Character> st = new Stack<>();
        
        for(int i=0;i<s.length();i++){
            if(st.size() == 0){
                st.push(s.charAt(i));
                continue;
            }
            
            if(st.peek() == s.charAt(i)){
                st.pop();
            }else{
                st.push(s.charAt(i));
            }
        }
        
        char[] arr = new char[st.size()];
        
        for(int i=arr.length-1;i>=0;i--){
            arr[i] = st.pop();
        }
        
        return String.valueOf(arr);
    }
}
