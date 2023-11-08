
/*
 * Problem Link: https://leetcode.com/problems/single-element-in-a-sorted-array/
 * Problem:
You are given a sorted array consisting of only integers where every element appears exactly twice, except for one element which appears exactly once.

Return the single element that appears only once.

Your solution must run in O(log n) time and O(1) space.

 

Example 1:

Input: nums = [1,1,2,3,3,4,4,8,8]
Output: 2
Example 2:

Input: nums = [3,3,7,7,10,11,11]
Output: 10
 

Constraints:

1 <= nums.length <= 105
0 <= nums[i] <= 105
 */

// Solution :-

class Solution {
    public int singleNonDuplicate(int[] nums) {
        if(nums.length == 1){
            return nums[0];
        }
        if(nums[0] != nums[1]){
            return nums[0];
        }
        if(nums[nums.length-1] != nums[nums.length - 2]){
            return nums[nums.length-1];
        }
        int left = 2;
        int right = nums.length - 3;

        while(left <  right){
            int middle = (left+right)/2;

            if(nums[middle-1]!= nums[middle] && nums[middle]!= nums[middle+1]){
                return nums[middle];
            }

            if(nums[middle] == nums[middle - 1]){
                middle --;
            }
            if(middle % 2 == 0){
                left = middle + 2;
            }else{
                right = middle - 1;
            }
        }

        return nums[left];
    }
}