class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        int ans=0;
        long product=1;
        int start=0;
        for(int end=0;end<nums.length;end++){
            product*=nums[end];
            while(start<=end && product>=k){
                product/=nums[start];
                start++;
            }
            ans+=end-start+1;
        }
        return ans;
    }
}