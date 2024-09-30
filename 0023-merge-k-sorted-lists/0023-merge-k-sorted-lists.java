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
    public ListNode mergeKLists(ListNode[] lists) {
//         int n=lists.length;
//         int j=0;
//         ArrayList<Integer> list=new ArrayList<>();
//         for(int i=0;i<n;i++){
//             ListNode temp=lists[i];
//             while(temp!=null){
//                 list.add(temp.val);
            
//             }
//         }
//         int m=list.size();
//         ListNode dummy=new ListNode(0);
//         Collections.sort(list);
//         ListNode head=new ListNode(list.get(0));
//         dummy.next=head;
//         ListNode curr=dummy;
//         for(int i=0;i<m;i++){
//             ListNode node=new ListNode(list.get(0));
//             curr.next=node;
//             curr=curr.next;
//         }
            
//     return dummy.next;
        int n=lists.length;
        int j=0;
        ArrayList<Integer> list=new ArrayList<>();
        for(int i=0;i<n;i++){
            ListNode temp=lists[i];
            while(temp!=null){
                list.add(temp.val);
                temp=temp.next;
            }
            
        }
        int m=list.size();
        Collections.sort(list);
        ListNode dummy=new ListNode(0);
        if(list.size()==0)
            return null;
        ListNode head=new ListNode(list.get(0));
        dummy.next=head;
        ListNode curr=dummy;
        for(int i=0;i<m;i++){
            ListNode node=new ListNode(list.get(i));
            curr.next=node;
            curr=curr.next;
        }
        return dummy.next;
    }
}