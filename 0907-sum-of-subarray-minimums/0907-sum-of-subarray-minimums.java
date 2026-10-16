class Solution {
    public int sumSubarrayMins(int[] arr) {
        int n = arr.length;
        int mod = 1_000_000_007;
        long sum = 0;
        Stack<Integer> st = new Stack<>();
        for (int i = 0; i <= n; i++) {
            while (!st.isEmpty() &&
                   (i == n || arr[st.peek()] > arr[i])) {
                int index = st.pop();
                int left = st.isEmpty() ? index + 1
                                        : index - st.peek();
                int right = i - index;
                sum = (sum + (long) arr[index] * left * right) % mod;
            }
            if (i < n) {
                st.push(i);
            }
        }
        return (int) sum;
    }
}