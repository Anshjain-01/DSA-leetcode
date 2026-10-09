class Solution {
    public int numberOfSubstrings(String s) {
        HashMap<Character,Integer> map=new HashMap<>();
        int start=0;
        int ans=0;
        for(int end=0;end<s.length();end++){
            map.put(s.charAt(end),map.getOrDefault(s.charAt(end),0)+1);
             while(map.size()==3){
                ans+=(long)s.length()-end;
                if(map.get(s.charAt(start))>1){
                    map.put(s.charAt(start),map.get(s.charAt(start))-1);
                }else{
                    map.remove(s.charAt(start));
                }
                start++;
             }
        }
        return ans;
    }
}