class Solution {
    public List<String> ans=new ArrayList<>();
    public String[] map={"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
    public List<String> letterCombinations(String digits) {
         helper(digits,0,new StringBuilder());
         return ans;
    }
    public void helper(String digits,int idx,StringBuilder current){
        if(idx==digits.length()){
            ans.add(current.toString());
            return ;
        }
        String letters=map[digits.charAt(idx)-'0'];
        for(int i=0;i<letters.length();i++){
            current.append(letters.charAt(i));
            helper(digits,idx+1,current);
            current.deleteCharAt(current.length()-1);
        }
    }
}