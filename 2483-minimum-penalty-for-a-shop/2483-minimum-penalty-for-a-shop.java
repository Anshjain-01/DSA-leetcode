class Solution {
    public int bestClosingTime(String customers) {
        int penalty=0;
        for(int i=0;i<customers.length();i++){
            if(customers.charAt(i)=='Y'){
                penalty++;
            }
        }
        int minIdx=0;
        int minPen=penalty;
        for(int i=1;i<=customers.length();i++){
            if(customers.charAt(i-1)=='Y'){
                penalty--;
            }else{
                penalty++;
            }
            if(minPen>penalty){
                minPen=penalty;
                minIdx=i;
            }
        }
        return minIdx;
    }
}