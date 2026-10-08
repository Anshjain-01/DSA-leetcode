class Solution {
    public int[] findOrder(int numCourses, int[][] prerequisites) {
        boolean[] vis=new boolean[numCourses];
        boolean[] stack=new boolean[numCourses];
        Stack<Integer> s=new Stack<>();
        boolean v=false;
        for(int i=0;i<numCourses;i++){
            if(!vis[i]){
                v= v || helper(prerequisites,vis,stack,i,s);
            }
        }
        if(v)return new int[0];
        int[] ans=new int[s.size()];
        int i=0;
        while(!s.isEmpty()){
            ans[i]=s.pop();
            i++;
        }
        return ans;
    }
    public boolean helper(int[][] graph,boolean[] vis,boolean[] stack,int curr,Stack<Integer> s){
        vis[curr]=true;
        stack[curr]=true;
        for(int i=0;i<graph.length;i++){
            if(curr==graph[i][1]){
                int next=graph[i][0];
                if(!vis[next] && helper(graph,vis,stack,next,s)){
                    return true;
                }
                else if(stack[next]){
                    return true;
                }
            }  
        }
        stack[curr]=false;
        s.push(curr);
        return false;
    }
}