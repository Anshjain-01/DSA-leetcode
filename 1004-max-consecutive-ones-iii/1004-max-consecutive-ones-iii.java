class Solution {
    public int longestOnes(int[] nums, int k) {
       int start=0;
       int ans=0;
       if(k==0){
        int count=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==1){
              count++;
              ans=Math.max(ans,count);
            }else{
                count=0;
            }
        }
        return ans;
       }
       for(int end=0;end<nums.length;end++){
        if(nums[end]==0 && k!=0){
            k--;
        }
        while(k==0 && (end+1)<nums.length){
            if(nums[end+1]==1){
                end++;
            }else{
                break;
            }
        }
       ans=Math.max(ans,end-start+1);
       while(k==0 && start<nums.length){
           if(nums[start]==0){
            k++;
           }
           start++;
       }
       } 
       return ans;
    }
}