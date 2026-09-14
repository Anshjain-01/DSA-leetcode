class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int start=0;
        double sum=0;
        double max=Integer.MIN_VALUE;
        for(int end=0;end<nums.length;end++){
            sum+=nums[end];
            if(end-start+1==k){
                double avg=sum/(end-start+1);
                max=Math.max(max,avg);
                sum-=nums[start];
                start++;
            }
        }
        return max;
    }
}