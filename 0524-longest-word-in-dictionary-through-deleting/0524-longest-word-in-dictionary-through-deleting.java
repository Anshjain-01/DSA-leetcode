class Solution {
    public String findLongestWord(String s, List<String> dictionary) {
        String ans="";
        for(int i=0;i<dictionary.size();i++){
            int j=0;
            int k=0;
            String temp=dictionary.get(i);
            while(j<s.length()){
                if(temp.charAt(k)==s.charAt(j)){
                    k++;
                }
                if(k==temp.length()){
                    break;
                }
                j++;
            }
            if(k!=temp.length()){
                continue;
            }
           if(ans.length()==0){
            ans=temp;
            continue;
           }
           if(ans.length()<temp.length()){
            ans=temp;
           }
           else if(ans.length()==temp.length()){
             if(temp.compareTo(ans)<0){
                 ans=temp;
               }
           }

        }
        return ans;
    }
}