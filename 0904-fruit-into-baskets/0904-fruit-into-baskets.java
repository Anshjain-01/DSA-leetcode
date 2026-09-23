class Solution {
    public int totalFruit(int[] fruits) {
        if(fruits.length==1){
            return 1;
        }
        HashMap<Integer,Integer> map=new HashMap<>();
        int start=0;
        int ans=0;
        for(int end=0;end<fruits.length;end++){
            map.put(fruits[end],map.getOrDefault(fruits[end],0)+1);
            while(map.size()>2){
                if(map.get(fruits[start])==1){
                    map.remove(fruits[start]);
                }else{
                    map.put(fruits[start],map.get(fruits[start])-1);
                }
                start++;
            }
            if(map.size()<=2){
                ans=Math.max(ans,end-start+1);
            }
        }
        return ans;
    }
}