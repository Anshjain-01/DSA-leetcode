class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> st=new Stack<>();
        for(int i=0;i<asteroids.length;i++){
            if(st.isEmpty()){
                st.push(asteroids[i]);
                continue;
            }
            if(st.peek()>=0 && asteroids[i]<0 ){
                int curr=asteroids[i]; 
                
                while(!st.isEmpty()){
                    int n=st.peek();
                    if(n<0){
                        break;
                    }
                    else if(Math.abs(curr)>n){
                        st.pop();
                        continue;
                    }
                    else if(Math.abs(curr)==n){
                        st.pop();
                        curr=0;
                    }
                    else{
                        curr=n;
                        st.pop();
                        break;
                    }
                }
                if(curr==0){
                    continue;
                }
                st.push(curr);
            }
            else{
                st.push(asteroids[i]);
            }
        }
        int[] ans=new int[st.size()];
        for(int i=ans.length-1;i>=0;i--){
            ans[i]=st.pop();
        }
        return ans;
    }
}