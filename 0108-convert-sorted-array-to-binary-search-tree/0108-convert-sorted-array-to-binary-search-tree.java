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
    public TreeNode sortedArrayToBST(int[] nums) {
        //As it is a bst so we can ssolve this like th mid element 
        // should the root of the tree and from l to mid-1 should be the 
        // left subtree  and
        //mid +1 to r should be the right subtree 
        /// so idea is binay search type of thing
        
       return  fun(nums,0,nums.length-1);
    }
    
    public TreeNode fun(int[] nums, int l,int r){
        if(l>r)
            return  null;
        int mid=(l+r)/2;
        TreeNode root=new TreeNode(nums[mid]);
        root.left=fun(nums,l,mid-1);
        root.right=fun(nums,mid+1,r);
        
        return root;
        
    }
}