class Solution {
    public int findCircleNum(int[][] isConnected) {
        boolean[] vis=new boolean[isConnected.length];
        int ans=0;
        for(int i=0;i<isConnected.length;i++){
            if(!vis[i]){
                helper(isConnected,i,vis);
                ans++;
            }
        }
        return ans;
    }
    public void helper(int[][] isConnected,int curr,boolean[] vis){
        vis[curr]=true;
        for(int i=0;i<isConnected[curr].length;i++){
            if(curr==i){
                continue;
            }
            if(isConnected[curr][i]!=0 && !vis[i]){
                helper(isConnected,i,vis);
            }
        }  
    }
}