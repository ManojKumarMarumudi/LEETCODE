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
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> lst=new ArrayList<Integer>();
        if(root==null){
            return lst;
        }
        return inorder(lst,root);
    }
    public List inorder(List lst,TreeNode root){
        if(root == null){
            return lst;
        }
        inorder(lst,root.left);
        lst.add(root.val);
        inorder(lst,root.right);
        return lst;
    }
}
