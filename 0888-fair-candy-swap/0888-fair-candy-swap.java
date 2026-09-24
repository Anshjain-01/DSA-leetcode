class Solution {
    public int[] fairCandySwap(int[] al, int[] bob) {
        Arrays.sort(al);
        Arrays.sort(bob);
      int sum1=0;
      int sum2=0;
      for(int i=0;i<al.length;i++){
        sum1+=al[i];
      }
      for(int i=0;i<bob.length;i++){
        sum2+=bob[i];
      }
      int tgsum=(sum1+sum2)/2;
      int[] ans=new int[2];
      for(int i=0;i<al.length;i++){
        int target=tgsum-sum1+al[i];
        int val=helper(bob,target);
        if(val>0){
            ans[1]=val;
        }
      }
      for(int i=0;i<bob.length;i++){
        int target=tgsum-sum2+bob[i];
        int val=helper(al,target);
        if(val>0){
            ans[0]=val;
        }
      }
      return ans;
      
    }
    public int helper(int[] arr,int target){
        int i=0;
        int j=arr.length-1;
        while(i<=j){
            int mid=i+(j-i)/2;
            if(arr[mid]==target){
                return arr[mid];
            }
            else if(arr[mid]>target){
                j=mid-1;
            }else{
                i=mid+1;
            }
        }
        return -1;
    }
}