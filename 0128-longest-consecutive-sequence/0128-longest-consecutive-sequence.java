class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> set=new HashSet<>();
        for(int i=0;i<nums.length;i++){
            set.add(nums[i]);
        }
        int maxLength=0;
        for(int x:set){ 
             if(!set.contains(x-1)){
                  int current=x;
                  int length=1;
                  while(set.contains(current+1)){
                    current=current+1;
                    length++;
                  }
                   maxLength=Math.max(maxLength,length);
             }
            
        }
       return maxLength;
    }
}