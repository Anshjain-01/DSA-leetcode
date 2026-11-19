class Solution {
    public int minimizeSum(int[] nums) {
        Arrays.sort(nums);
       if(nums.length<=3){
        return 0;
       }
       else{
        int fc=nums[nums.length-1]-nums[2];
        int sc=nums[nums.length-3]-nums[0];
        int tc=nums[nums.length-2]-nums[1];
        if(fc<sc){
            if(fc<tc) return fc;
            else return tc;
        }
        else{
            if(sc<tc)return sc;
            else return tc;
        }
       }
       
    }
}