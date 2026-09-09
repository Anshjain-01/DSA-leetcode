class Solution {
    public List<String> ans=new ArrayList<>();
    public List<String> letterCasePermutation(String s) {
         char[] chars=s.toCharArray();
         helper(chars,0);
         return ans;
    }
    public void helper(char[] chars,int i){
        if(i==chars.length){
            ans.add(new String(chars));
            return;
        }
         
            if(Character.isDigit(chars[i])){
               helper(chars,i+1);
            }
            else{
                 chars[i]=Character.toLowerCase(chars[i]);
                 helper(chars,i+1);
                 chars[i]=Character.toUpperCase(chars[i]);
                 helper(chars,i+1);
            }
    }
}