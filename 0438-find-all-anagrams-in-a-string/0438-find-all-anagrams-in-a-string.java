class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        HashMap<Character,Integer> mapP=new HashMap<>();
        for(int i=0;i<p.length();i++){
            mapP.put(p.charAt(i),mapP.getOrDefault(p.charAt(i),0)+1);
        }
        int start=0;
         StringBuilder sb=new StringBuilder();
         HashMap<Character,Integer> mapLocal=new HashMap<>();
         List<Integer> ans=new ArrayList<>();
         for(int end=0;end<s.length();end++){
            char chars=s.charAt(end);
            sb.append(chars);
            mapLocal.put(chars,mapLocal.getOrDefault(chars,0)+1);
            if(sb.length()==p.length()){
               
               if(mapP.equals(mapLocal)){
                ans.add(start);
               }
                 
                  mapLocal.put(s.charAt(start), mapLocal.get(s.charAt(start)) - 1);

                  if(mapLocal.get(s.charAt(start)) == 0){
                                 mapLocal.remove(s.charAt(start));
                    }
                sb.deleteCharAt(0);
                start++;
            }
         }
         return ans;
    }
}