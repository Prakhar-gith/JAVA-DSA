
/*
 * Problem Link: https://practice.geeksforgeeks.org/problems/delete-a-node-in-single-linked-list/1
 * Problem:
 * Given a singly linked list and an integer x.Delete xth node from the singly linked list.

Example 1:

Input: 1 -> 3 -> 4 
       x = 3
Output: 1 -> 3
Explanation:
After deleting the node at 3rd
position (1-base indexing), the
linked list is as 1 -> 3. 

Your task: Your task is to complete the method deleteNode() which takes two arguments: the address of the head of the linked list and an integer x. The function returns the head of the modified linked list.

Constraints:
2 <= N <= 105
1 <= x <= N
 */

// Solution :-

class GfG
{
    Node deleteNode(Node head, int x)
    {	
	 if(head==null){
	            return null;
	    }
	    Node y=head;
	    if(x==1&&y.next==null){
	           return null;
	    }
	    if(x==1&&y.next!=null){
	        head=head.next;
	        return head;
	    }
	    Node temp=null;
	    for(int i=1;i<x-1;i++){
	        y=y.next;
	    }
	    temp=y.next.next;
	    Node del=y.next;
	    del.next=null;
	    y.next=temp;
	    return head;

    }
}
