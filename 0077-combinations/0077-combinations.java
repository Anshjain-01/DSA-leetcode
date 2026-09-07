class Solution {
    public  List<List<Integer>> ans=new ArrayList<>();
    public List<List<Integer>> combine(int n, int k) {
             helper(1,new ArrayList<>(),n,k);
             return ans;
    }
    public void helper(int start,List<Integer> list,int n, int k){
        if(list.size()==k){
            ans.add(new ArrayList<>(list));
            return;
        }
        for(int i=start;i<=n;i++){
            list.add(i);
            helper(i+1,list,n,k);
            list.remove(list.size()-1);
        }
    }
}