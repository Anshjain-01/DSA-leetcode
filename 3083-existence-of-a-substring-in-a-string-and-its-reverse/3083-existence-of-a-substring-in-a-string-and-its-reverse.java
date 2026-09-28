class Solution {
    public boolean isSubstringPresent(String s) {
        int start=0;
        String rev=new StringBuilder(s).reverse().toString();
        for(int end=2;end<=s.length();end++){
            if(rev.contains(s.substring(start,end)))return true;
            start++;
        }
        return false;
    }
}