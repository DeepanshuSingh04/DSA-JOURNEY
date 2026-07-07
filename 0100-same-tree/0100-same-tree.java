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
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if(p==null && q == null) return true;

        if(p==null || q==null) return false;   //is condition pr tabhi phochega jab upar wala false hoga

        if(p.val != q.val) return false;
        // if(!isIdentical(p.left,q.left)) return false; 
        // if(isIdentical(p.right,q.right)) return false; 
        
        // return true;
        
        return isSameTree(p.left,q.left) && isSameTree(p.right,q.right);  
    }
}