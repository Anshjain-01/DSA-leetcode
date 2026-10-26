class Solution {
    public int countIslands(int[][] grid, int k) {
        int m=grid.length;
        int n=grid[0].length;
        int ans=0;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
               
                if(grid[i][j]!=0){
                  long sum=helper(grid,i,j);
                  if(sum!=0 && sum%k==0){
                    ans++;
                  }  
                }
            }
        }
        return ans;
    }
    public long helper(int[][] grid,int i,int j){
        int m=grid.length;
        int n=grid[0].length;
        if(i<0 || j<0 || i>=m || j>=n || grid[i][j]==0 ){
            return 0L;
        }
        long sum=grid[i][j];
        grid[i][j]=0;
        sum+= helper(grid,i+1,j);
        sum+= helper(grid,i,j+1);
        sum+= helper(grid,i-1,j);
        sum+= helper(grid,i,j-1);
        return sum;
    }
}