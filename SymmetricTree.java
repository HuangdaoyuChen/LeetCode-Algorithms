/*
Given a binary tree, check whether it is a mirror of itself (ie, symmetric around its center).

For example, this binary tree [1,2,2,3,4,4,3] is symmetric:

    1
   / \
  2   2
 / \ / \
3  4 4  3
But the following [1,2,2,null,3,null,3] is not:
    1
   / \
  2   2
   \   \
   3    3

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
class Solution {
    public boolean isSymmetric(TreeNode root) {
        if (root ==null) return true;
        return isSymmetricHelp(root.left, root.right);
    }
    
    private boolean isSymmetricHelp(TreeNode leftNode, TreeNode rightNode){
    if (leftNode == null && rightNode == null)
        return true;   
    if(leftNode==null || rightNode==null)
        return false;
    if(leftNode.val!=rightNode.val)
        return false;
    return isSymmetricHelp(leftNode.left, rightNode.right) && isSymmetricHelp(leftNode.right, rightNode.left);
    }
}
