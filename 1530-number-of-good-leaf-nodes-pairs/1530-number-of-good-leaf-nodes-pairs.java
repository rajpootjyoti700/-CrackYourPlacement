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
    public int countPairs(TreeNode root, int distance) {
                int[] result = new int[1];
        countPairsHelper(root, distance, result);
        return result[0];
    }
    private int[] countPairsHelper(TreeNode node, int distance, int[] result) {
        if (node == null) {
            return new int[distance + 1];
        }
        
        if (node.left == null && node.right == null) {
            int[] leafDist = new int[distance + 1];
            leafDist[1] = 1;
            return leafDist;
        }
        
        int[] leftDists = countPairsHelper(node.left, distance, result);
        int[] rightDists = countPairsHelper(node.right, distance, result);
        
        // Count pairs between left and right subtrees
        for (int i = 1; i <= distance; i++) {
            for (int j = 1; j <= distance; j++) {
                if (i + j <= distance) {
                    result[0] += leftDists[i] * rightDists[j];
                }
            }
        }
        
        // Prepare the distance array for the current node
        int[] dists = new int[distance + 1];
        for (int i = 1; i < distance; i++) {
            dists[i + 1] = leftDists[i] + rightDists[i];
        }
        
        return dists;

    }
}