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
    public String ans;
    public String smallestFromLeaf(TreeNode root) {
        if(root==null)return null;
        StringBuilder sb=new StringBuilder();
        char ch=(char)(root.val+97);
        sb.append(ch);
        helper(root,sb);
        return ans;
    }
    public void helper(TreeNode root,StringBuilder sb){
        if(root.left==null && root.right==null){
            if(ans==null){
                ans=new StringBuilder(sb).reverse().toString();
            }
            else{
                String temp= new StringBuilder(sb).reverse().toString();
                if(ans.compareTo(temp)>0){
                    ans=temp;
                }
            }
            return;
        }
        if(root.left!=null){
            char ch=(char)(root.left.val+97);
            sb.append(ch);
            helper(root.left,sb);
            sb.deleteCharAt(sb.length()-1);
        }
        if(root.right!=null){
             char ch=(char)(root.right.val+97);
            sb.append(ch);
            helper(root.right,sb);
            sb.deleteCharAt(sb.length()-1);
        }
    }
}