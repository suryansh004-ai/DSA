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
    List<String> ans = new ArrayList<>();

    public List<String> binaryTreePaths(TreeNode root) {
        btree(root ,"");
        return ans;
        
    }
  void  btree(TreeNode root , String path){
    if(root ==null)
    return;
     
    if(path.equals(""))
    {
   path+= root.val;
    } 
   else{
    path= path+"->"+root.val;
    }
    if(root.left==null&&root.right==null){
        ans.add(path);
        return;
        
    }

btree(root.left ,path);
btree(root.right, path);
  }


}