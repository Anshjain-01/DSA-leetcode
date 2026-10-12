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
    public int ans=0;
    public int sumNumbers(TreeNode root) {
        if(root==null)return -1;
        int temp=root.val;
        helper(root,temp);
        return ans;
    }
    public void helper(TreeNode root,int temp){
        if(root.left==null && root.right==null){
            ans+=temp;
            return;
        }
        if(root.left!=null){
            temp=(temp*10)+root.left.val;
            helper(root.left,temp);
            temp/=10;
        }
        if(root.right!=null){
            temp=(temp*10)+root.right.val;
            helper(root.right,temp);
            temp/=10;
        }
    }
}