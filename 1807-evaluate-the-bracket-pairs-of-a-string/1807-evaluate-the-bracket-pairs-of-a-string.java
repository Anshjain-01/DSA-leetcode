class Solution {
    public String evaluate(String s, List<List<String>> knowledge) {
        HashMap<String,String> map=new HashMap<>();
        for(int i=0;i<knowledge.size();i++){
            List<String> list=knowledge.get(i);
            map.put(list.get(0),list.get(1));
        }
        StringBuilder sb=new StringBuilder();
        StringBuilder temp=new StringBuilder();
       boolean open=false;
       for(int i=0;i<s.length();i++){
        if(s.charAt(i)=='('){
            open=true;
             temp.setLength(0);
            continue;
           
        }
        else if(s.charAt(i)==')'){
            if(map.containsKey(temp.toString())){
                sb.append(map.get(temp.toString()));
            }else{
                sb.append("?");
            }
            open=false;
            continue;
        }
        if(!open){
             sb.append(s.charAt(i));
        }else{
            temp.append(s.charAt(i));
        }
       }
       return sb.toString();
    }
}