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
    public int getDecimalValue(ListNode head) {
        ListNode temp=head;
        int count=0;
        int ans=1;
        int sum=0;
        while(temp!=null){
            temp=temp.next;
            count++;
        }
        temp=head;
        while(count>0){
            ans=1;
            if(temp.val==1){
                for(int i=0;i<count-1;i++){
                    ans=ans*2;
                }
                sum=sum+ans;
                count--;
                    temp=temp.next;
            }
            else if(temp.val==0){
                count--;
                temp=temp.next;
            }
                
        }
        return sum;
    }
}