class Solution {
    public String maxSumOfSquares(int num, int sum) {
        StringBuilder sb=new StringBuilder();
        int max=(int)Math.pow(10,num)-1;
        if(max<sum){
            return sb.toString();
        }
        if(9*num<sum){
            return "";
        }
        int tempSum=0;
        while(num>0){
            int digit=9;
            while(digit>=0){
                if(tempSum+digit<=sum){
                    tempSum+=digit;
                    sb.append(digit-'\0');
                    break;
                }
                digit--;
            }
            num--;
        }
        return sb.toString();
    }
}