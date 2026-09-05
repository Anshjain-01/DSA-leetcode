class Solution {
    public int firstStableIndex(int[] nums, int k) {
        int[] minnums=new int[nums.length];
        int min=nums[nums.length-1];
        for(int i=nums.length-1;i>=0;i--){
                if(min>nums[i]){
                    min=nums[i];
                }
                minnums[i]=min;
        }
        int max=nums[0];
        int ans=Integer.MAX_VALUE;
        for(int i=0;i<nums.length;i++){
            if(max<nums[i]){
                max=nums[i];
            }
            if(max-minnums[i]<=k){
                ans=Math.min(ans,i);
            }
        }
        if(ans==Integer.MAX_VALUE){
            return -1;
        }
        return ans;
    }
}