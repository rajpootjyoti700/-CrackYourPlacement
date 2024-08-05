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
    public boolean isPalindrome(ListNode head) {
        // we can solve this by storing the values in array;
        //then we willl check array is palindrome r not
        
        int count=0;
        ListNode temp=head;
        while(temp!=null){
            temp=temp.next;
            count++;
        }
        int[] arr=new int[count];
        temp=head;
        int i=0;
        while(temp!=null){
            arr[i]=temp.val;
            temp=temp.next;
            i++;
        }
        for(int j=0;j<count;j++){
            if(arr[j]!=arr[count-1-j])
                return false;
        }
        return true;
    }
}