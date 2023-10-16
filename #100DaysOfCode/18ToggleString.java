
/*
 * Hackerrank Link: https://www.hackerrank.com/contests/interview-prep-cohort-1/challenges/found-string-toggle-character
 * Problem:
G1.Take as input String.
Write a function that toggles the case of all characters in the string and then
print that String.
Example
Input:
AbCs

output
aBcS
Input Format

String representing S.
Constraints
Size of String may be large.
Output Format
print the string after toggling the character.
Sample Input 0
AbCs
Sample Output 0
aBcS
 */

// Solution :-

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        String st=scn.nextLine();
        
        char[] ch = st.toCharArray();
        toggle(ch);
        for(int i=0;i<ch.length;i++){
            System.out.print(ch[i]);
        }
	}

	private static void toggle(char[]ch) {
		
		for(int i=0;i<ch.length;i++){
			if(ch[i] >= 65 && ch[i]<= 90){
                ch[i] = (char)(ch[i] + 32);
            }else{
                ch[i] = (char)(ch[i] - 32);
            }
		}
		
    }
}