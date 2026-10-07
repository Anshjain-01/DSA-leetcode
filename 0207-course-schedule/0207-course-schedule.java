class Solution {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        boolean[] vis = new boolean[numCourses];
        boolean[] stack = new boolean[numCourses];
        for(int i = 0; i < numCourses; i++) {
            if(!vis[i]) {
                if(helper(prerequisites, i, vis, stack)) {
                    return false;
                }
            }
        }
        return true;
    }
    public boolean helper(int[][] graph, int curr, boolean[] vis, boolean[] stack) {
        vis[curr] = true;
        stack[curr] = true;
        for(int i = 0; i < graph.length; i++) {
            if(graph[i][1] == curr) {
                int next = graph[i][0];
                if(stack[next]) {
                    return true;
                }
                if(!vis[next] && helper(graph, next, vis, stack)) {
                    return true;
                }
            }
        }
        stack[curr] = false;
        return false;
    }
}