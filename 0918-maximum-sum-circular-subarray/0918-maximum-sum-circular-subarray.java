class Solution {
    public int maxSubarraySumCircular(int[] nums) {
        int totalsum=0;
        int currMin=0;
        int minSum=Integer.MAX_VALUE;
        int currmax=0;
        int maxsum=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            totalsum+=nums[i];
            currmax=Math.max(nums[i],currmax+nums[i]);
            maxsum=Math.max(maxsum,currmax);
            currMin=Math.min(nums[i],currMin+nums[i]);
            minSum=Math.min(currMin,minSum);
        }
        if(maxsum<0){
            return maxsum;
        }
        else{
            return Math.max(maxsum,totalsum-minSum);
        }

    }
}