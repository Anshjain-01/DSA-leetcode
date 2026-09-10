class Solution {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> pq=new PriorityQueue<>(Collections.reverseOrder());
        for(int i=0;i<nums.length;i++){
            pq.add(nums[i]);
        }
        while(!pq.isEmpty()){
             k--;
            if(k==0){
                return pq.peek();
            }
            pq.remove();
           
        }
        return -1;
    }
}