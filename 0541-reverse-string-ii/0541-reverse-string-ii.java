class Solution {
    public String reverseStr(String s, int k) {

        int count = 1;
        int i = 0;
        int l = k;
        int n = s.length();

        StringBuilder sb = new StringBuilder();

        while (i < n) {

            int end = Math.min(i + k, n);

            if (count % 2 != 0) {
                sb.append(new StringBuilder(s.substring(i, end)).reverse());
            } else {
                sb.append(s.substring(i, end));
            }

            i = end;
            count++;
        }

        return sb.toString();
    }
}