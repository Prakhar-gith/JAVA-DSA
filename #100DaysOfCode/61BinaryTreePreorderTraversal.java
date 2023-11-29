
/*
 * Problem Link: https://leetcode.com/problems/binary-tree-preorder-traversal/description/
 * Problem:
 * Given the root of a binary tree, return the preorder traversal of its nodes' values.

 

Example 1:


Input: root = [1,null,2,3]
Output: [1,2,3]
Example 2:

Input: root = []
Output: []
Example 3:

Input: root = [1]
Output: [1]
 

Constraints:

The number of nodes in the tree is in the range [0, 100].
-100 <= Node.val <= 100
 

Follow up: Recursive solution is trivial, could you do it iteratively?
 
 */

// Solution :-

class Solution {
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> pre = new ArrayList<>();
        preHelper(root,pre);
        return pre;
    }
    public void preHelper(TreeNode root,List<Integer> pre) {
        if(root==null) return;
        pre.add(root.val);
        preHelper(root.left,pre);
        preHelper(root.right,pre);
    }
}
