class Solution {
    public int minOperations(int[] nums, int x) {
        int totalsum=0;
        for(int i=0;i<nums.length;i++){
            totalsum+=nums[i];
        }
        if(totalsum<x){
            return -1;
        }
        int start=0;
        int keepsum=totalsum-x;
        int sum=0;
        int ans=Integer.MAX_VALUE;
        for(int end=0;end<nums.length;end++){
            sum+=nums[end];
            if(sum==keepsum){
                ans=Math.min(ans, nums.length-(end-start+1));
            }
            while(sum>keepsum && start<nums.length){
                sum-=nums[start];
                start++;
                 if(sum==keepsum){
                ans=Math.min(ans, nums.length-(end-start+1));
            }
            }
        }

        return ans!=Integer.MAX_VALUE?ans:-1;
    }
}