
/*
 * Problem Link: https://leetcode.com/problems/validate-stack-sequences/description/
 * Problem:
 * Given two integer arrays pushed and popped each with distinct values, return true if this could have been the result of a sequence of push and pop operations on an initially empty stack, or false otherwise.

Example 1:

Input: pushed = [1,2,3,4,5], popped = [4,5,3,2,1]
Output: true
Explanation: We might do the following sequence:
push(1), push(2), push(3), push(4),
pop() -> 4,
push(5),
pop() -> 5, pop() -> 3, pop() -> 2, pop() -> 1
Example 2:

Input: pushed = [1,2,3,4,5], popped = [4,3,5,1,2]
Output: false
Explanation: 1 cannot be popped before 2.
 

Constraints:

1 <= pushed.length <= 1000
0 <= pushed[i] <= 1000
All the elements of pushed are unique.
popped.length == pushed.length
popped is a permutation of pushed.
 
 */

// Solution :-

public int[] asteroidCollision(int[] asteroids) {
    Stack<Integer> st = new Stack<>();
    int n = asteroids.length;
    int i=0;
    while(i < n){
        if(asteroids[i] < 0){
            if(st.size()==0 || st.peek()<0){
            st.push(asteroids[i]);
            i++;
            }
            else if(st.peek() == Math.abs(asteroids[i])){
                st.pop();
                i++;
            }
            else if(st.peek()< Math.abs(asteroids[i])){
                st.pop();
            }
            else if(st.peek() > Math.abs(asteroids[i])){
                i++;
            }
            }else{
                st.push(asteroids[i]);
                i++;
            }
    }
    int[] ans = new int[st.size()];
    for(int j=ans.length-1;j>=0;j--){
    ans[j] = st.pop();

    }
    return ans;
}
