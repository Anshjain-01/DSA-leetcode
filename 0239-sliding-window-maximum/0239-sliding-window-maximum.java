class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int[] ansarray=new int[nums.length-k+1];
        Deque<Integer> dq=new ArrayDeque<>();
        int ansIndex=0;
        int start=0;
        int max=Integer.MIN_VALUE;
        for(int end=0;end<nums.length;end++){
            while(!dq.isEmpty() && nums[dq.peekLast()]<=nums[end]){
             dq.removeLast();
            }
            dq.addLast(end);
            if(end-start+1==k){
                while(!dq.isEmpty() && dq.peekFirst()<start){
                    dq.removeFirst();
                }
                ansarray[ansIndex]=nums[dq.peekFirst()];
                ansIndex++;
                start++;
            } 
        }
        return ansarray;
    }
}