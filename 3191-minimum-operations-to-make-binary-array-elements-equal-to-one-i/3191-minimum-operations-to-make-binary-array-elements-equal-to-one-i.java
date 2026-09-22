class Solution {
    public int minOperations(int[] nums) {
        int start=0;
        int count=0;
        for(int end=start+2;end<nums.length;end++){
            if(nums[start]==0){
                nums[start]=1;
               nums[start+1]= (nums[start+1]==0)?1:0;
                nums[end]=(nums[end]==0)?1:0;
                count++;
            }
            start++;
        }
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=1){
                return -1;
            }
        }
        return count;
    }
}