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
    public int findBottomLeftValue(TreeNode root) {
        Queue<TreeNode> q=new LinkedList<>();
        if(root==null){
            return -1;
        }
        q.add(root);
        TreeNode curr=null;
        while(!q.isEmpty()){
           curr=q.remove();
                if(curr.right!=null){
                    q.add(curr.right);
                }
                 if(curr.left!=null){
                     q.add(curr.left);
                }
        }
       
        return curr.val;
    }
}