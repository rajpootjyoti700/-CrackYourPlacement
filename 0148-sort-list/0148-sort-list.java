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
    public ListNode sortList(ListNode head) {
        ListNode temp=head;
        int count=0;
        while(temp!=null){
            count++;
            temp=temp.next;
        }
        int[] arr=new int[count];
        temp=head;
        int i=0;
        while(temp!=null){
            arr[i]=temp.val;
            i++;
            temp=temp.next;
        }
        Arrays.sort(arr);
        ListNode dummy=new ListNode(0);
        dummy.next=head;
        ListNode curr=dummy;
        for(int j=0;j<arr.length;j++){
            ListNode node=new ListNode(arr[j]);
            curr.next=node;
            curr=curr.next;
        }
        return dummy.next;
    }
}