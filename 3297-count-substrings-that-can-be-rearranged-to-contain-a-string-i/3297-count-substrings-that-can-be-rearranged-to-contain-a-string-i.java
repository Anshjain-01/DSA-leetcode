class Solution {
    public long validSubstringCount(String word1, String word2) {
        HashMap<Character,Integer> map2=new HashMap<>();
        for(int i=0;i<word2.length();i++){
            map2.put(word2.charAt(i),map2.getOrDefault(word2.charAt(i),0)+1);
        }
        int start=0;
        HashMap<Character,Integer> map1=new HashMap<>();
        int found=0;
        long ans=0;
        for(int end=0;end<word1.length();end++){
            map1.put(word1.charAt(end),map1.getOrDefault(word1.charAt(end),0)+1);
            if(map2.containsKey(word1.charAt(end)) && map2.get(word1.charAt(end)).equals(map1.get(word1.charAt(end)))){
                found++;
            }
                while(found==map2.size()){
                ans+=(long)word1.length()-end;
                if(map2.containsKey(word1.charAt(start)) && map1.get(word1.charAt(start)).equals(map2.get(word1.charAt(start)))){
                    found--;
                }
               map1.put(word1.charAt(start),map1.get(word1.charAt(start))-1);
                start++;
                }    
        }
        return ans;
    }
}