class Solution {
    public int findMaxLength(int[] nums) {
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0){
                nums[i]=-1;
            }
        }
        int[] prefix=new int[nums.length];
        prefix[0]=nums[0];
        for(int i=1;i<nums.length;i++){
            prefix[i]=nums[i]+prefix[i-1];
        }
        HashMap<Integer,Integer> map=new HashMap<>();
        int ans=0;
        for(int i=0;i<prefix.length;i++){
            if(map.containsKey(prefix[i])){
                ans=Math.max(i-map.get(prefix[i]),ans);
            }
            else if(prefix[i]==0){
                 ans=Math.max(i+1,ans);
            }
            else{
                map.put(prefix[i],i);
            }
        }
    return ans;
    }
}