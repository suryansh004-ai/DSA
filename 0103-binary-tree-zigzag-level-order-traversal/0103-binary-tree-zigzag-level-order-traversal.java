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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {

        // Stores the final answer
        List<List<Integer>> ans = new ArrayList<>();

        // If tree is empty, return empty list
        if (root == null) {
            return ans;
        }

        // Queue is used for BFS traversal
        Queue<TreeNode> q = new LinkedList<>();

        // Add root to the queue
        q.add(root);

        // true  -> left to right
        // false -> right to left
        boolean leftToRight = true;

        while (!q.isEmpty()) {

            // Number of nodes at the current level
            int size = q.size();

            // Stores nodes of the current level
            List<Integer> level = new ArrayList<>();

            for (int i = 0; i < size; i++) {

                // Remove the front node
                TreeNode node = q.poll();

                // Add node value
                level.add(node.val);

                // Add left child to queue
                if (node.left != null) {
                    q.add(node.left);
                }

                // Add right child to queue
                if (node.right != null) {
                    q.add(node.right);
                }
            }

            // If direction is right to left,
            // reverse the current level
            if (!leftToRight) {
                Collections.reverse(level);
            }

            // Add current level to answer
            ans.add(level);

            // Change direction for next level
            leftToRight = !leftToRight;
        }

        return ans;
    }
}