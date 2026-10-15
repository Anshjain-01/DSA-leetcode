class Solution {
    public int subarraysWithKDistinct(int[] nums, int k) {
        return helper(nums,k)-helper(nums,k-1);
    }
    public int helper(int[] nums,int k){
        HashMap<Integer,Integer> map=new HashMap<>();
        int ans=0;
        int start=0;
        for(int end=0;end<nums.length;end++){
            map.put(nums[end],map.getOrDefault(nums[end],0)+1);
            while(map.size()>k){
                if(map.get(nums[start])>1){
                    map.put(nums[start],map.get(nums[start])-1);
                }
                else{
                    map.remove(nums[start]);
                }
                start++;
            }
             ans+=end-start+1;
        }
        return ans;
    }
}