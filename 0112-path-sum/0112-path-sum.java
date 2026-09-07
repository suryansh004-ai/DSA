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
     boolean res = false;
        int sum =0;
    public boolean hasPathSum(TreeNode root, int targetSum) {
        if(root==null)
        return res;
        sum+=root.val;
        if(root.left==null&&root.right==null)
        {
         if(sum == targetSum)
         res = true;
    sum -=root.val;
         return res;
        }
    hasPathSum(root.left, targetSum);
    hasPathSum(root.right, targetSum);
   sum-= root.val;
    return res;
    
    }

}