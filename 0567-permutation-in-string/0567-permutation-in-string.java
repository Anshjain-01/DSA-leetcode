class Solution {
    public boolean checkInclusion(String s1, String s2) {
         HashMap<Character,Integer> mapP=new HashMap<>();
        for(int i=0;i<s1.length();i++){
            mapP.put(s1.charAt(i),mapP.getOrDefault(s1.charAt(i),0)+1);
        }
        int start=0;
         StringBuilder sb=new StringBuilder();
         HashMap<Character,Integer> mapLocal=new HashMap<>();
         for(int end=0;end<s2.length();end++){
            char chars=s2.charAt(end);
            sb.append(chars);
            mapLocal.put(chars,mapLocal.getOrDefault(chars,0)+1);
            if(sb.length()==s1.length()){
               
               if(mapP.equals(mapLocal)){
                   return true;
               }
          mapLocal.put(s2.charAt(start), mapLocal.get(s2.charAt(start))-1);
                if(mapLocal.get(s2.charAt(start)) == 0){
                        mapLocal.remove(s2.charAt(start));
                }
                sb.deleteCharAt(0);
                start++;
            }
         }
         return false;
    }
}