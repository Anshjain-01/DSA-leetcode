class Solution {
    static class Edge{
        int src;
        int dest;
        int wt;
        public Edge(int s,int d,int w){
            this.src=s;
            this.dest=d;
            this.wt=w;
        }
    }
    static class Info{
        int ver;
        int cost;
        int stops;
        public Info(int v,int c,int s){
             this.ver=v;
             this.cost=c;
             this.stops=s;
        }
    }
    public void createGraph(int[][] flight,ArrayList<Edge>[] graph){
        for(int i=0;i<graph.length;i++){
            graph[i]=new ArrayList<>();
        }
        for(int i=0;i<flight.length;i++){
            int src=flight[i][0];
            int dest=flight[i][1];
            int wt=flight[i][2];
            Edge e=new Edge(src,dest,wt);
            graph[src].add(e);
        }
    }
    public int findCheapestPrice(int n, int[][] flights, int src, int dst, int k) {
        ArrayList<Edge>[] graph=new ArrayList[n];
        createGraph(flights,graph);
        int[] dist=new int[n];
        for(int i=0;i<n;i++){
            if(i!=src){
                dist[i]=Integer.MAX_VALUE;
            }
        }
        Queue<Info> q=new LinkedList<>();
        q.add(new Info(src,0,0));
        while(!q.isEmpty()){
            Info curr=q.remove();
            if(curr.stops>k){
                break;
            }
            for(int i=0;i<graph[curr.ver].size();i++){
                Edge e=graph[curr.ver].get(i);
                int v=e.dest;
                int wt=e.wt;
                if(curr.cost+wt<dist[v] && curr.stops<=k){
                    dist[v]=curr.cost+wt;
                    q.add(new Info(v,dist[v],curr.stops+1));
                }
            }
        }
        if(dist[dst]==Integer.MAX_VALUE){
            return -1;
        }
        else{
            return dist[dst];
        }
    }
}