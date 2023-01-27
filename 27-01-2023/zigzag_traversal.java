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
        List<List<Integer>> list = new ArrayList<List<Integer>>();
        zigzag(root, list);
        return list;
    }
    public void zigzag(TreeNode root, List<List<Integer>> list){
        if(root==null){
            return;
        }
        Stack<TreeNode> st1 = new Stack<TreeNode>();
        Stack<TreeNode> st2 = new Stack<TreeNode>();
        st1.push(root);
        while(!st1.isEmpty() || !st2.isEmpty()){
            List<Integer> list1 = new ArrayList<Integer>();
            while(!st1.isEmpty()){
                TreeNode out = st1.pop();
                if(out.left!=null){
                    st2.push(out.left);
                }
                if(out.right!=null){
                    st2.push(out.right);
                }
                list1.add(out.val);
            }
            list.add(list1);
            if(st1.isEmpty() && st2.isEmpty()){
                break;
            }
            List<Integer> list2 = new ArrayList<Integer>();
            while(!st2.isEmpty()){
                TreeNode out = st2.pop();
                if(out.right!=null){
                    st1.push(out.right);
                }
                if(out.left!=null){
                    st1.push(out.left);
                }
                list2.add(out.val);
            }
            list.add(list2);
        }
    }
}
