class Solution {
    public long maxAlternatingSum(int[] nums) {
        long[] numsSq=new long[nums.length];
        for(int i=0;i<nums.length;i++){
            numsSq[i]=(long) nums[i]*nums[i];
        }
        Arrays.sort(numsSq);
        long leftsum=0;
        for(int i=0;i<numsSq.length/2;i++){
            leftsum+=numsSq[i];
        }
        long rightsum=0;
        for(int i=numsSq.length/2;i<numsSq.length;i++){
            rightsum+=numsSq[i];
        }
        return rightsum-leftsum;
    }
}