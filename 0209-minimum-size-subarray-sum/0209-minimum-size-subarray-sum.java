class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int start=0;
        int sum=0;
        int end=0;
        int anslen=Integer.MAX_VALUE;
        while(end<nums.length){
            sum+=nums[end];
           while(sum>=target){
                anslen=Math.min(anslen,end-start+1);
                sum-=nums[start];
                start++;;
            }
            end++;
        } 
        if(anslen==Integer.MAX_VALUE){
            return 0;
        }
        return anslen;
    }
}