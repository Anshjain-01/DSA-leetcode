class Solution {
    public List<List<Integer>> allPathsSourceTarget(int[][] graph) {
        List<List<Integer>> anslist=new ArrayList<>();
        List<Integer> temp=new ArrayList<>();
        temp.add(0);
        helper(anslist,temp,0,graph);
        return anslist;
    }
    public static void helper(List<List<Integer>> anslist,List<Integer> temp,int currrow,int[][] graph){
        if(graph[currrow].length==0){
            return;
        }
        for(int j=0;j<graph[currrow].length;j++){
            temp.add(graph[currrow][j]);
             if(temp.get(temp.size()-1)==graph.length-1){
              anslist.add(new ArrayList<>(temp));
            }
            helper(anslist,temp,graph[currrow][j],graph);
            temp.remove(temp.size()-1);
        }
    }
}