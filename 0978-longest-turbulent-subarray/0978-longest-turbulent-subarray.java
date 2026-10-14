class Solution {
    public int maxTurbulenceSize(int[] arr) {
        if (arr.length == 1) return 1;
        if (arr.length == 2) {
            return arr[0] == arr[1] ? 1 : 2;
        }
        int start = 0;
        boolean check = arr[0] > arr[1];
        int k = 1;
        int ans = (arr[0] == arr[1]) ? 1 : 2;
        for (int end = 2; end < arr.length; end++) {
            if (arr[k] == arr[k + 1]) {
                start = k + 1;
                if (k + 2 < arr.length) {
                    check = arr[k + 1] > arr[k + 2];
                }
            } else if (check && arr[k] < arr[k + 1]) {
                check = false;
            } else if (!check && arr[k] > arr[k + 1]) {
                check = true;
            } else {
                start = k;
                check = arr[k] > arr[k + 1];
            }
            k++;
            ans = Math.max(ans, end - start + 1);
        }
        return ans;
    }
}
