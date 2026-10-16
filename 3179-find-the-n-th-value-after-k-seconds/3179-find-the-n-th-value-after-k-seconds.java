class Solution {
    public int valueAfterKSeconds(int n, int k) {
        int[] arr=new int[n];
        Arrays.fill(arr,1);
        while(k>0){
            int prefix=0;
              for(int i=0;i<n;i++){
                arr[i]=(arr[i]+prefix)%1000000007;
                prefix=arr[i]%1000000007;
              }
              k--;
        }
        return arr[n-1]%1000000007;
    }
}