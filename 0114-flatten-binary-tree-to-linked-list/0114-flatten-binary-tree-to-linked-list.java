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
    Queue<TreeNode> q=new LinkedList<>();
    public void preorder(TreeNode root){
        if(root!=null){
        q.add(root);
        preorder(root.left);
        preorder(root.right);
        }
    }
    public void flatten(TreeNode root) {
        //store the node in form of preorder
        preorder(root);
        
        while(!q.isEmpty()){
            TreeNode temp=q.poll();
             temp.right=q.peek();
            temp.left=null;
        }
        
    }
    
    
}