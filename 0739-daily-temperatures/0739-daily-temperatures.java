class pair{
    int index;
    int val;
    public pair(int i,int v){
        this.index=i;
        this.val=v;
    }
}

class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        Stack<pair> s=new Stack<>();
        s.push(new pair(temperatures.length-1,temperatures[temperatures.length-1]));
        int[] ans=new int[temperatures.length];
        ans[ans.length-1]=0;
        for(int i=ans.length-2;i>=0;i--){
            while(!s.isEmpty() && s.peek().val<=temperatures[i]){
                s.pop();
            }
            if(s.isEmpty()){
                ans[i]=0;
            }
            else{
                ans[i]=s.peek().index-i;
            }
            s.push(new pair(i,temperatures[i]));
        }
        return ans;
    }
}