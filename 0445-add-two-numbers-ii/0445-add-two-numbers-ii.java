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
    public ListNode reverse(ListNode l1){
        ListNode temp=null;
        ListNode prev=null;
        ListNode curr=l1;
        while(curr!=null){
            temp=curr.next;
            curr.next=prev;
            prev=curr;
            curr=temp;
        }
        return prev; 
    }
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        l1=reverse(l1);
        l2=reverse(l2);
        
        ListNode dummy=new ListNode(0);
        ListNode temp=dummy;
        int carry=0;
        int digit=0;
        while(l1!=null || l2!=null || carry!=0){
            if(l1!=null && l2!=null){
                 digit=l1.val+l2.val+carry;
                l1=l1.next;
                l2=l2.next;
            }
            else if(l1!=null && l2==null){
                digit=l1.val+carry;
                l1=l1.next;
            }
            else if(l1==null && l2!=null){
                digit=l2.val+carry;
                l2=l2.next;
            }
            else if(l1==null && l2==null){
                digit=carry;
            }
            carry=digit/10;
            digit=digit%10;
            ListNode curr=new ListNode(digit);
            temp.next=curr;
            temp=temp.next;
        }
        return reverse(dummy.next);
    }
}