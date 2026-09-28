class Solution {
    public int maxDepth(String s) {
        Stack<Character> stack=new Stack<>();
        int count=0;
        int maxans=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='('){
                stack.push('(');
                count++;
            }
            else if(s.charAt(i)==')'){
                maxans=Math.max(count,maxans);
                count--;
                stack.pop();
            } 
        }
        return maxans;
    }
}