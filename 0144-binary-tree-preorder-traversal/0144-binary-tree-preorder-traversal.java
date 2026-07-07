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
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> ans = new ArrayList<>();
        if(root == null) return ans ;
        ans.add(root.val) ;
        //left subtree ki list
        ans.addAll(preorderTraversal(root.left));
        //right subtree ki list
        ans.addAll(preorderTraversal(root.right));

        return ans ;
    }
}


// with the help of helper function


// public void dfs(Node root, ArrayList<Integer> ans){
//      if(root==null) return;
//      ans.add(root.val);
//      dfs(root.left, ans);
//      dfs(root.right, ans);
// }
// public List<Integer> inorderTraversal(TreeNode root) {
//         ArrayList<Integer> ans = new ArrayList<>();
//         dfs(root.ans);
//         return ans;
// }