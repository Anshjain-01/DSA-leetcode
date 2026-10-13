class Solution {
    public int characterReplacement(String s, int k) {
        int n=s.length();
        if(n==0 || k<0){
            return -1;
        }
        int freq[]=new int[26];
      
        int start=0;
        int maxFreq=0;
        int maxans=Integer.MIN_VALUE;
        for(int end=0;end<s.length();end++){
         int index=s.charAt(end)-'A';
         freq[index]++;
         maxFreq=Math.max(maxFreq,freq[index]);
         int currentLength=end-start+1;
         if(currentLength-maxFreq>k){
            freq[s.charAt(start)-'A']--;
            start++;
         }
         currentLength=end-start+1;
        maxans=Math.max(maxans,currentLength);
       
        }
        return maxans;
    }
}