class Solution {
    public int scoreOfParentheses(String s) {
        Stack<Character> st=new Stack<>();
        int ans=0;
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch=='('){
                st.push(ch);
            }
            else if(!st.isEmpty() && ch==')'){
                st.pop();
                int size=st.size();
                ans+=Math.pow(2,size);
                while(i+1<s.length() && s.charAt(i+1)==')' && !st.isEmpty()){
                    st.pop();
                    i++;
                }
            }
        }
        return ans;
    }
}