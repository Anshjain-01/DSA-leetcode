class Solution {
    public int findKthPositive(int[] arr, int k) {
             HashSet<Integer> set=new HashSet<>();
             int maxValue=Integer.MIN_VALUE;
             for(int i=0;i<arr.length;i++){
            maxValue=Math.max(maxValue,arr[i]);
            set.add(arr[i]);
             }
             int i=1;
             while(i<=maxValue){
                if(!set.contains(i) && k>0){
                    k--;
                }
                if(!set.contains(i) && k==0){
                    return i;
                }
                i++;
             }
             k--;
             while(k>0){
                 k--;
                 i++;
             }
             return i;
             
    }
}