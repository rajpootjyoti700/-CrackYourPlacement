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
int max=0;
    int length=0;
    public int maxDepth(TreeNode root) {
      return   fun(root);
       // return max+1;
    }
    
    public int fun(TreeNode root){
        // try to use Math.max and bottom up 
        // base case 
        if(root==null)
            return 0;
        int lh=fun(root.left);
        int rh=fun(root.right);
        length=Math.max(lh,rh);
         max=Math.max(length,max);
        return 1+Math.max(lh,rh);
    }
}