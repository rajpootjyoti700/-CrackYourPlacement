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
    public ListNode modifiedList(int[] nums, ListNode head) {
         Set<Integer> st = new HashSet<>();
        for (int num : nums) {
            st.add(num);
        }
        ListNode prev = new ListNode(0);
        ListNode dummy=prev;
        prev.next = head;
        ListNode temp = head;

        while (temp != null) {
            if (st.contains(temp.val)) {
                dummy.next = temp.next;
                temp=temp.next;
                
            } else {
                temp = temp.next;
                dummy=dummy.next;
            }
        }

        return prev.next;
    } 
}