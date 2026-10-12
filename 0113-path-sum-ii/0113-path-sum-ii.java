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
    public List<List<Integer>> ansList=new ArrayList<>();
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        if(root==null)return ansList;
        List<Integer> list=new ArrayList<>();
        list.add(root.val);
        helper(root,targetSum,root.val,list);
        return ansList;
    }
    public void helper(TreeNode root,int targetSum,int sum,List<Integer> temp){
        if(root.right==null && root.left==null){
            if(targetSum==sum){
                ansList.add(new ArrayList<>(temp));
            }
            return ;
        }
        if(root.left!=null){
            sum+=root.left.val;
            temp.add(root.left.val);
            helper(root.left,targetSum,sum,temp);
            sum-=root.left.val;
            temp.remove(temp.size()-1);
        }
        if(root.right!=null){
            sum+=root.right.val;
            temp.add(root.right.val);
            helper(root.right,targetSum,sum,temp);
            sum-=root.right.val;
            temp.remove(temp.size()-1);
        }
       
    }
}