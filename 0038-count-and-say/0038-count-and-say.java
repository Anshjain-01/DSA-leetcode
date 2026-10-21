class Solution {
    public String countAndSay(int n) {
        if(n<=1){
            return String.valueOf(n);
        }
        String digits="1";
        StringBuilder ans=new StringBuilder();
        while(n>1){
            ans.setLength(0);
            char curr=digits.charAt(0);
            int count=1;
            for(int i=1;i<digits.length();i++){
                char now=digits.charAt(i);
                if(now==curr){
                    count++;
                }
                else{
                    ans.append(count);
                    ans.append(curr);
                    curr=now;
                    count=1;
                }
            }
            ans.append(count);
            ans.append(curr);
            digits=ans.toString();
            n--;
        }
       return ans.toString();
    }
    
}