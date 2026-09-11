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
    int res = 0;

    public int diameterOfBinaryTree(TreeNode root) {
        height(root);
        return res;
    }

    // Returns height of the tree
    public int height(TreeNode root) {

        // Empty tree has height 0
        if (root == null) {
            return 0;
        }

        // Get height of left and right subtrees
        int left = height(root.left);
        int right = height(root.right);

        // Diameter passing through current node
        res = Math.max(res, left + right);

        // Return height to the parent
        return 1 + Math.max(left, right);
    }
}