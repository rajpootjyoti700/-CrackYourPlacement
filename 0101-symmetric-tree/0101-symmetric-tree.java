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
    public boolean isSymmetric(TreeNode root) {
        boolean ans=fun(root,root);
        return ans;
    }
    
    boolean fun(TreeNode a,TreeNode b){
        if(a==null && b==null)
            return true;
            if(a==null && b!=null)
                return false;
            if(a!=null && b==null)
                return false;
            
            if(a.val!=b.val)
                return false;
        boolean left=fun(a.left,b.right);
            boolean right=fun(a.right,b.left);
            return  (left && right);
        
    }
}