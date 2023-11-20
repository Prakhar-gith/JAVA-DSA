
/*
 * Problem Link: https://leetcode.com/problems/reorder-list/description/
 * Problem:
 * You are given the head of a singly linked-list. The list can be represented as:

L0 → L1 → … → Ln - 1 → Ln
Reorder the list to be on the following form:

L0 → Ln → L1 → Ln - 1 → L2 → Ln - 2 → …
You may not modify the values in the list's nodes. Only nodes themselves may be changed.

 

Example 1:


Input: head = [1,2,3,4]
Output: [1,4,2,3]
Example 2:


Input: head = [1,2,3,4,5]
Output: [1,5,2,4,3]
 

Constraints:

The number of nodes in the list is in the range [1, 5 * 104].
1 <= Node.val <= 1000
 
 */

// Solution :-

public void reorderList(ListNode head) {
    if(head==null||head.next==null) return;
    ListNode s=head;
    ListNode f=head;
    while(f.next!=null&&f.next.next!=null){
        s=s.next;
        f=f.next.next;
    }
    ListNode Prev=null;
    ListNode Curr=s.next;
    s.next = null;
    while(Curr!=null){
        ListNode Currp1 = Curr.next;
        Curr.next = Prev;
        Prev = Curr;
        Curr = Currp1;
    }


    ListNode left=head;
    ListNode right=Prev;
    while(right != null){
        ListNode leftp1 = left.next;
        ListNode rightp1 = right.next;
        left.next = right;
        right.next = leftp1;
        left = leftp1;
        right = rightp1;
    }
}
