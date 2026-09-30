class Solution {
    public long zeroFilledSubarray(int[] nums) {
        int start=0;
        long ans=0;
        for(int end=0;end<nums.length;end++){
           if(nums[end]==0){
             ans+=end-start+1;
           }else{
            start=end+1;
           }
        }
       
        return ans;
    }
}