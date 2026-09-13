class Solution {
    public List<Integer> findSubstring(String s, String[] words) {
        List<Integer> anslist=new ArrayList<>();
        HashMap<String,Integer> requiredMap=new HashMap<>();
        for(int i=0;i<words.length;i++){
            requiredMap.put(words[i],requiredMap.getOrDefault(words[i],0)+1);
        }
      
        for(int i=0;i<words[0].length();i++){
            int left=i;
            int right=i;
            HashMap<String,Integer> currMap=new HashMap<>();
            int count=0;
            while(right+words[0].length()<=s.length()){
                String currWord=s.substring(right,right+words[0].length());
                if(!requiredMap.containsKey(currWord)){
                  currMap.clear();
                  count=0;
                  left=right+words[0].length();
                }else{
                currMap.put(currWord,currMap.getOrDefault(currWord,0)+1);
                count++;
                while(currMap.get(currWord)>requiredMap.get(currWord)){
                      String leftWord=s.substring(left,left+words[0].length());
                      currMap.put(leftWord,currMap.get(leftWord)-1);
                      left+=words[0].length();
                      count--;
                }
                if(count==words.length){
                    anslist.add(left);
                    String leftWord=s.substring(left,left+words[0].length());
                    currMap.put(leftWord,currMap.get(leftWord)-1);
                    left+=words[0].length();
                    count--;
                }
                }
                right+=words[0].length();

            }
        }
        return anslist;
    }
}