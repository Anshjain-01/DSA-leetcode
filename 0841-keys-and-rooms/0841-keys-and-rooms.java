class Solution {
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        boolean[] vis=new boolean[rooms.size()];
        vis[0]=true;
        helper(rooms,0,vis);
        for(int i=0;i<vis.length;i++){
            if(!vis[i]){
                return false;
            }
        }
          return true;
        }
       public void helper(List<List<Integer>> rooms,int curr,boolean[] vis){
       if(vis[curr]){
        List<Integer> list=rooms.get(curr);
        for(int j=0;j<list.size();j++){
            if(!vis[list.get(j)]){
                vis[list.get(j)]=true;
                helper(rooms,list.get(j),vis);
            }
        }
       }
   }
    }
  
