class Solution {
     public List<List<Integer>> ans=new ArrayList<>();
    public List<List<Integer>> combinationSum3(int k, int n) {
       
        helper(1,n,k,new ArrayList<>());
        return ans;
    }
    public void helper(int start,int n,int k,List<Integer> list){
        if(list.size()==k){
            if(n==0){
                ans.add(new ArrayList<>(list));
            }
            return;
        }
        if(n<=0){
            return ;
        }
        for(int i=start;i<=9;i++){
            list.add(i);
            helper(i+1,n-i,k,list);
            list.remove(list.size()-1);
        }
    }
}