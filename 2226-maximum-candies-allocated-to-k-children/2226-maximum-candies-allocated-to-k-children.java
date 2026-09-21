class Solution {
    public int maximumCandies(int[] candies, long k) {
        int maxEle=Integer.MIN_VALUE;
        for(int i=0;i<candies.length;i++){
            maxEle=Math.max(maxEle,candies[i]);
        }
        
        int low=1;
        int high=maxEle;
        int mid=1;
        while(low<=high){
            mid=low+(high-low)/2;
            long count=0;
            for(int i=0;i<candies.length;i++){
                count+=candies[i]/mid;
            }
          if(count>=k){
                low=mid+1;
            }else{
                high=mid-1;
            }

        }
        return high;
    }
}