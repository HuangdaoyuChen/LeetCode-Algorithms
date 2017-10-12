/*
Given a binary tree, find its maximum depth.

The maximum depth is the number of nodes along the longest path from the root node down to the farthest leaf node.

*/

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class MaximumDepthofBinaryTree {
    public int maxDepth(TreeNode root) {
        //if the node does not exist, simply return 0. 
        if (root == null) return 0;
        
        //Otherwise, return the 1+the longer distance of its subtree.
        return 1+ Math.max(maxDepth(root.left), maxDepth(root.right));
        
    }
}
