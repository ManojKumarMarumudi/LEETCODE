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
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> list = new ArrayList<>();
        List<Integer> arr = new ArrayList<>();
        if(root==null){
            return list;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        queue.add(null);
        while(!queue.isEmpty()){
            TreeNode removed_node = queue.poll();
            if(removed_node==null){
                if(queue.peek()==null){
                    list.add(arr);
                    return list;
                }
                queue.add(null);
                list.add(arr);
                arr = new ArrayList<>();
                continue;
            }
            arr.add(removed_node.val);
            if(removed_node.left!=null){
                queue.add(removed_node.left);
            }
            if(removed_node.right!=null){
                queue.add(removed_node.right);
            }
        }
        return list;
    }
}
