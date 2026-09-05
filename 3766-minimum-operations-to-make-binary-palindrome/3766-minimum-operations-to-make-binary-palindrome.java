class Solution {
    public int[] minOperations(int[] nums) {
        int ans[]=new int[nums.length];
        for(int i=0;i<nums.length;i++){
            String org=Integer.toBinaryString(nums[i]);
            String rev=new StringBuilder(org).reverse().toString();
            if(org.equals(rev)){
                ans[i]=0;
                continue;
            }
            int plusOne=nums[i]+1;
            int minusOne=nums[i]-1;
            while(true){  
                String orgplus=Integer.toBinaryString(plusOne);
                String revplus=new StringBuilder(orgplus).reverse().toString();
                if(orgplus.equals(revplus)){
                    ans[i]=plusOne-nums[i];
                    break;
                }
                String orgminus=Integer.toBinaryString(minusOne);
                String revminus=new StringBuilder(orgminus).reverse().toString();
                 if(orgminus.equals(revminus)){
                    ans[i]=nums[i]-minusOne;
                    break;
                }
                plusOne++;
                minusOne--;
            }
        }
        return ans;
    }
}