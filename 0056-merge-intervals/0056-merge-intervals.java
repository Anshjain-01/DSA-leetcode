class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals,(a,b)->Integer.compare(a[0],b[0]));
        int currentstart=intervals[0][0];
        int currentend=intervals[0][1];
        List<Integer> list=new ArrayList<>();
        for(int i=1;i<intervals.length;i++){
            if(currentend>=intervals[i][0]){
                currentend=Math.max(currentend,intervals[i][1]);
            }
            else{
                list.add(currentstart);
                list.add(currentend);
                currentstart=intervals[i][0];
                currentend=intervals[i][1];
            }
        }
        list.add(currentstart);
        list.add(currentend);
        int[][] ans=new int[list.size()/2][2];
        int indx=0;
        for(int i=0;i<list.size();i+=2){
            ans[indx][0]=list.get(i);
            ans[indx][1]=list.get(i+1);
            indx++;
        }
        return ans;
    }
}