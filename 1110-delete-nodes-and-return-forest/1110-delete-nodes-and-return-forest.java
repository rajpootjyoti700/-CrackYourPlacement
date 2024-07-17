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
    public List<TreeNode> delNodes(TreeNode root, int[] to_delete) {
       // we have to take the arraylist and also we will contain value we want to delete 
        //into set so that we can check if it contain then we have to store it into the answer
        
        // imp we have to add only the root of every subtree it will autoatically take the whle tree
        
     //   ****************************&&&&&&&&&&&&&&&*********************
        // take the list andthe set
        ArrayList<TreeNode> ans=new ArrayList<>();
        HashSet<Integer> set=new HashSet<>();
        
        // add the value in the set
        for(int a: to_delete){
            set.add(a);
        }
        helper(root,set,ans);
        if(!set.contains(root.val))
            ans.add(root);
        return ans;
        
    }
     public TreeNode helper(TreeNode root, HashSet<Integer> set, ArrayList<TreeNode> ans){
         // base case
         if(root==null)
             return null;
         
         // whatever the left part return it will add to the root left
         root.left=helper(root.left,set,ans);
         // and whatevwe the rigtht part it will add to the root right
         root.right=helper(root.right,set,ans);
         if(set.contains(root.val)){
             if(root.left!=null)
                 ans.add(root.left);
             if(root.right!=null)
                 ans.add(root.right);
             return null;
         }
         else
             return root;
     }
}