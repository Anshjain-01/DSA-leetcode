class Solution {
    public String minWindow(String s, String t) {
        HashMap<Character,Integer> mapT=new HashMap<>();
        for(int i=0;i<t.length();i++){
            mapT.put(t.charAt(i),mapT.getOrDefault(t.charAt(i),0)+1);
        }
        int start=0;
        HashMap<Character,Integer> mapLocal=new HashMap<>();
        int formed=0;
        int minLength=Integer.MAX_VALUE;
        int minstart=0;
        for(int end=0;end<s.length();end++){
            mapLocal.put(s.charAt(end),mapLocal.getOrDefault(s.charAt(end),0)+1);
            if(mapT.containsKey(s.charAt(end)) && mapLocal.get(s.charAt(end)).equals(mapT.get(s.charAt(end)))){
                formed++;
            }
            while(formed==mapT.size()){
                if(minLength>(end-start+1)){
                    minLength=end-start+1;
                    minstart=start;
                }
            mapLocal.put(s.charAt(start),mapLocal.get(s.charAt(start))-1);
            if(mapT.containsKey(s.charAt(start)) && mapLocal.get(s.charAt(start))<mapT.get(s.charAt(start))){
                formed--;
            }
            start++;
            }
        }
        if(minLength==Integer.MAX_VALUE){
            return "";
        }
        return s.substring(minstart,minstart+minLength);
    }
}