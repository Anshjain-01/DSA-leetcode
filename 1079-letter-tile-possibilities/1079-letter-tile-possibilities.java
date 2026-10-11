class Solution {
    public int ans=0;
    public int numTilePossibilities(String tiles) {
     boolean[] used=new boolean[tiles.length()];
     Arrays.fill(used,false);
     char[] temp=tiles.toCharArray();
     Arrays.sort(temp);
     tiles=new String(temp);
     helper(tiles,used);
     return ans;
    }
    public void helper(String tiles,boolean[] used){
             for(int i=0;i<tiles.length();i++){
                if(used[i]){
                    continue;
                }
                if(i>0 && tiles.charAt(i)==tiles.charAt(i-1) && used[i-1]==false){
                    continue;
                }
                used[i]=true;
                ans++;
                helper(tiles,used);
                used[i]=false;
             }
    }
}