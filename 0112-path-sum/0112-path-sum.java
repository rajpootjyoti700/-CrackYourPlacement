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
    int sum=0;
    public boolean hasPathSum(TreeNode root, int targetSum) {
       return  fun(root,targetSum);
        
    }
    
    public boolean fun(TreeNode root,int targetSum){
        if(root==null)
            return false;
        sum=sum+root.val;
        if((root.left==null && root.right==null) && sum==targetSum){
            return true;
        }
        if((root.left==null && root.right==null) && sum!=targetSum){
            sum=sum-root.val;
            return false;
        }
    
             boolean left=hasPathSum(root.left,targetSum);
             boolean right=hasPathSum(root.right,targetSum);
        sum=sum-root.val;
        return left||right;
    }
}