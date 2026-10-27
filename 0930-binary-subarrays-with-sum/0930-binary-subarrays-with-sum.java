class Solution {
    public int numSubarraysWithSum(int[] nums, int goal) {
        HashMap<Integer,Integer> map=new HashMap<>();
        int ans=0;
        int prefixsum=0;
        map.put(0,1);
        for(int end=0;end<nums.length;end++){
            prefixsum+=nums[end];
            int diff=prefixsum-goal;
            if(map.containsKey(diff)){
                ans+=map.get(diff);
            }
            map.put(prefixsum,map.getOrDefault(prefixsum,0)+1);
        }
        return ans;
    }
}