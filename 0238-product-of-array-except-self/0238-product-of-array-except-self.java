class Solution {
    public int[] productExceptSelf(int[] nums) {
        if(nums.length<=1){
          return nums;
        }
        int[] left=new int[nums.length];
        int[] right=new int[nums.length];
        int l=1;
        left[0]=l;
        for(int i=1;i<nums.length;i++){
              l=l*nums[i-1];
              left[i]=l; 
        }
        int r=1;
        right[nums.length-1]=r;
        for(int i=nums.length-2;i>=0;i--){
              r=r*nums[i+1];
              right[i]=r;
        }
        for(int i=0;i<nums.length;i++){
            nums[i]=left[i]*right[i];
        }
        return nums;
    }
}