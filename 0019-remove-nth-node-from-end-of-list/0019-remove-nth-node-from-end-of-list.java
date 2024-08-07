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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode temp=head;
        int count=0;
        ListNode dummy=new ListNode(0);
        dummy.next=head;
        ListNode curr=dummy;
        
        
        while(temp!=null){
           count++;
            temp=temp.next;
        }
        int a=count-n+1;
        for(int i=1;i<a;i++){
            curr=curr.next;
            
        }
        curr.next=curr.next.next;
        
        return dummy.next;
    }
}