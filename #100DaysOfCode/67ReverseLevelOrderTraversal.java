
/*
 * Problem Link: https://practice.geeksforgeeks.org/problems/reverse-level-order-traversal/1?utm_source=gfg
 * Problem:
 * Fast-Track your resumes to top companies and get the job you deserve! Register for hiring challenge exclusively for working professionals 

banner
Given a binary tree of size N, find its reverse level order traversal. ie- the traversal must begin from the last level.

Example 1:

Input :
        1
      /   \
     3     2

Output: 3 2 1
Explanation:
Traversing level 1 : 3 2
Traversing level 0 : 1
Example 2:

Input :
       10
      /  \
     20   30
    / \ 
   40  60

Output: 40 60 20 30 10
Explanation:
Traversing level 2 : 40 60
Traversing level 1 : 20 30
Traversing level 0 : 10

Your Task: 
You dont need to read input or print anything. Complete the function reverseLevelOrder() which takes the root of the tree as input parameter and returns a list containing the reverse level order traversal of the given tree.


Expected Time Complexity: O(N)
Expected Auxiliary Space: O(N)


Constraints:
1 ≤ N ≤ 10^4
 
 */

// Solution :-


/* 
class Node
{
    int data;
    Node left, right;

    Node(int item)
    {
        data = item;
        left = right = null;
    }
}
*/

class Tree
{
    public ArrayList<Integer> reverseLevelOrder(Node node) 
    {
        // code here
        Stack<Node> s = new Stack<Node>();

        Queue<Node> q = new LinkedList<Node>();
        
            ArrayList<Integer> t = new ArrayList<Integer>();
            if(node != null){
                q.add(node);
                s.push(node);
            }
            
            while(q.size() > 0){
              Node temp = q.remove();
              
            if(temp.right != null){
                  q.add(temp.right);
                  s.push(temp.right);
              }
              if(temp.left != null){
                  q.add(temp.left);
                  s.push(temp.left);
              }

              
              
            }
            
            while(s.size()>0){
                Node temp = s.pop();
                t.add(temp.data);
            }
            
            return t;
    }
}