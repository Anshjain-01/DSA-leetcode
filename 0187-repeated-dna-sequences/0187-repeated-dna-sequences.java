class Solution {
    public List<String> findRepeatedDnaSequences(String s) {
     List<String>  anslist=new ArrayList<>();
     List<String> temp=new ArrayList<>();
     StringBuilder sb=new StringBuilder();
     int start=0;
     for(int i=0;i<s.length();i++){
        sb.append(s.charAt(i));
        if(i-start+1==10){
            if(temp.contains(sb.toString()) && !anslist.contains(sb.toString())){
                anslist.add(sb.toString());
            }
            temp.add(sb.toString());
            sb.deleteCharAt(0);
            start++;
        }
     }   
     return anslist;
    }
}