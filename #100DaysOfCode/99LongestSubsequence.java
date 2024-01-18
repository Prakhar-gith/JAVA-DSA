
/*
 * Problem Link: https://leetcode.com/problems/longest-consecutive-sequence/
 * Problem:
 * Given an unsorted array of integers nums, return the length of the longest consecutive elements sequence.

You must write an algorithm that runs in O(n) time.

 

Example 1:

Input: nums = [100,4,200,1,3,2]
Output: 4
Explanation: The longest consecutive elements sequence is [1, 2, 3, 4]. Therefore its length is 4.
Example 2:

Input: nums = [0,3,7,2,5,8,4,6,0,1]
Output: 9
 

Constraints:

0 <= nums.length <= 105
-109 <= nums[i] <= 109
 
 */

// Solution :-

class Solution {
    public int longestConsecutive(int[] nums) {
        HashMap<Integer , Integer> hm = new HashMap<>();
        int maxlen = 0;
        for(int i =0; i<nums.length; i++){
            int num = nums[i];
            if(!hm.containsKey(num)){
                    int sp = num;
                    int ep = num;
                    if(hm.containsKey(num-1)) sp = sp - hm.get(num-1);
                        
                    if(hm.containsKey(num+1)) ep = ep + hm.get(num+1);
                        
                    int l = ep-sp+1;
                    hm.put(sp, l);
                    hm.put(ep, l);
                    if(sp != num && ep != num) hm.put(num , 1);
                    maxlen = Math.max(maxlen , l);
                    
                    
            }
        }
        
        return maxlen;
    }
}