/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */

class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        // here are some cases we have to be identify 
        // like if we got p or q in same side is that either in left or in right 
        // the we have to return 1st p or q we got 
        // 2nd case is if we got p from left nd q from right so 
        // is that neither left is null nor right is null both of them returning something
        // so we will return root on that case
        
        if(root==null)
            return null;
        if(root.val==p.val || root.val==q.val)
            return root;
        TreeNode left=lowestCommonAncestor(root.left,p,q);
        TreeNode right=lowestCommonAncestor(root.right,p,q);
        
        if(left==null)
            return right;
        if(right==null)
            return left;
        else
            return root;
    }
}