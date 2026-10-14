class Solution {
    public long getDescentPeriods(int[] prices) {
        long ans=0;
        int start=0;
        for(int end=0;end<prices.length;end++){
            if(end>0 && prices[end-1]-prices[end]!=1){
                start=end;
            }
            ans+=end-start+1;
        }
        return ans;
    }
}