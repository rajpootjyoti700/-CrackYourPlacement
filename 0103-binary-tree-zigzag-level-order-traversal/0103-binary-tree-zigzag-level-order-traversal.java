/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> ans=new ArrayList<>();
        boolean flag=true;
        if(root==null)
            return ans;
        Queue<TreeNode> q=new LinkedList<>();
        q.add(root);
        while(q.size()>0){
            int n=q.size();
            ArrayList<Integer> l=new ArrayList<>();
            for(int i=0;i<n;i++){
                TreeNode temp=q.remove();    
                if(flag)
                    l.addLast(temp.val);
                else
                    l.addFirst(temp.val);
                if(temp.left!=null)
                    q.add(temp.left);
                if(temp.right!=null)
                    q.add(temp.right);
                
            }
            flag=!flag;
            ans.add(l);
        }
        return ans;
    }
}