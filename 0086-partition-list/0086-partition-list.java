/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode partition(ListNode head, int x) {
       // for this we have to create the new link list
        ListNode temp=head;
        ListNode dummy=new ListNode(0);
        dummy.next=head;
        ListNode curr=dummy;
        while(temp!=null){
            if(temp.val<x){
                ListNode node=new ListNode(temp.val);
                curr.next=node;
                curr=curr.next;
            }
            temp=temp.next;
        }
          ListNode temp1=head;
        while(temp1!=null){
            if(temp1.val>=x){
                ListNode node=new ListNode(temp1.val);
                curr.next=node;
                curr=curr.next;
            }
            temp1=temp1.next;
        }
        return dummy.next;
    }
}