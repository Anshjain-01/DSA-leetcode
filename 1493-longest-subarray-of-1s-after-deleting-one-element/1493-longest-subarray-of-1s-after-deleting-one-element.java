class Solution {
    public int longestSubarray(int[] nums) {
        Boolean del=false;
        int start=0;
        int ans=0;
        for(int end=0;end<nums.length;end++){
            if(nums[end]==0 && !del){
                del=true;
            }
            else if(nums[end]==0){
                while(del){
                    if(nums[start]==0){
                        del=false;
                    }
                    start++;
                }
                del=true;
            }
            ans=Math.max(end-start,ans);
        }
        return ans;
    }
}