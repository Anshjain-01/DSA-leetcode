class Solution {
    public String removeKdigits(String num, int k) {
        if(num.length()<=k){
            return "0";
        }
        String ans=helper(num,k);
        int i=0;
        while(i<ans.length() && ans.charAt(i)=='0'){
            i++;
        }
        ans=ans.substring(i);
        if(ans.length()==0){
            return "0";
        }
     return  ans;
    }
    public String helper(String num,int k){
        if(k==0){
            return num;
        }
        for(int i=0;i<num.length();i++){
           if(i+1<num.length() && num.charAt(i)-'0'>num.charAt(i+1)-'0'){
            return helper(num.substring(0,i)+num.substring(i+1,num.length()),k-1);
           }
        }
       
        return num.substring(0,num.length()-k);
    }
}