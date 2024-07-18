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
    public List<String> binaryTreePaths(TreeNode root) {
        // in this we will try to use top down approach
    // until or unless not reach to the leaf node we will add node  to the 
        // string 
        List<String> list=new ArrayList<>();
        if(root!=null){
        fun(root,list,"");
        }
        return list;
        
    }
    public List<String> fun(TreeNode root,List<String> list,String path){
        if(root.left==null && root.right==null)
        list.add(path+root.val);
        if(root.left!=null)
            fun(root.left,list,path+root.val+"->");
        if(root.right!=null)
            fun(root.right,list,path+root.val+"->");
        return list;
    }
}