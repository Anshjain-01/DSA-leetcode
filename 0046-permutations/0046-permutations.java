class Solution {
    public List<List<Integer>> ans=new ArrayList<>(); 
    public List<List<Integer>> permute(int[] nums) {
        boolean[] used=new boolean[nums.length];
        Arrays.fill(used,false);
         helper(nums,new ArrayList<>(),used);
        return ans;

    }
    public void helper(int[] nums,List<Integer> list,boolean[] used){
        if(list.size()==nums.length){
            ans.add(new ArrayList<>(list));
            return;
        }
        for(int i=0;i<nums.length;i++){
            if(used[i]){
                continue;
            }
            used[i]=true;
            list.add(nums[i]);
            helper(nums,list,used);
            list.remove(list.size()-1);
            used[i]=false;
        }

    }
}