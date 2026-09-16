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
    List<List<Integer>> ans = new ArrayList<>();
    List<Integer> path = new ArrayList<>();
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        dfs(root , targetSum);
        return ans;

    }

void dfs(TreeNode root ,int ts){
    if(root==null)
    return;

    path.add(root.val);

    if(root.left==null&& root.right==null&& root.val==ts){
        ans.add(new ArrayList<>(path));
    }    
    dfs(root.left , ts-root.val);
    dfs(root.right , ts-root.val);

    path.remove(path.size()-1);

}




}