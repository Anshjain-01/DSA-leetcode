class Solution {
    public int[] decrypt(int[] code, int k) {
        int[] ans=new int[code.length];
        for(int i=0;i<code.length;i++){
            int sum=0;
          if(k>0){
            int len=0;
            int j=(i+1)%code.length;
            while(len<k){
            sum+=code[j];
            j=(j+1)%code.length;
            len++;
            }
          }
          else if(k<0){
            int len=0;
            int j=(i-1+code.length)%code.length;
            while(len>k){
            sum+=code[j];
            j=(j-1+code.length)%code.length;
            len--;
            }
          }
            ans[i]=sum;
        }
        return ans;
    }
}