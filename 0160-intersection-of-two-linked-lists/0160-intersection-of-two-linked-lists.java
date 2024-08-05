/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if(headA==null)
            return null;
        if(headB==null)
            return null;
        int count1=0;
        int count2=0;
        int d=0;
        
        ListNode temp1=headA;
        ListNode temp2=headB;
       while(temp1!=null){
           temp1=temp1.next;
           count1++;
       }
        while(temp2!=null){
            temp2=temp2.next;
            count2++;
        }
        ListNode ptr1;
        ListNode ptr2;
        if(count1>count2){
             d=count1-count2;
            ptr1=headA;
            ptr2=headB;
            
        }
        else{
         d=count2-count1;
            ptr1=headB;
            ptr2=headA;
        }
        while(d>0){
            ptr1=ptr1.next;
            d--;
        }
        while(ptr1!=null && ptr2!=null){
            if(ptr1==ptr2){
                return ptr1;
            }
            ptr1=ptr1.next;
            ptr2=ptr2.next;
        }
        return null;
    }
}