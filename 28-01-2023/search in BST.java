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
    public TreeNode searchBST(TreeNode root, int val) {
        TreeNode current=root;
        if(current==null){
            return null;
        }
        else if(current.val==val){
            return current;
        }
        else if(val>current.val){
            return searchBST(current.right,val);
        }
        else{
            return searchBST(current.left,val);
        }
    }
    
}
