class Solution {
    public int numOfSubarrays(int[] arr, int k, int threshold) {
        int n = arr.length;
        if (k > n) return 0;

        int sum = 0, count = 0;

        for (int i = 0; i < k; i++) {
            sum += arr[i];
        }

        if (sum >= threshold * k) count++;

        int w = sum;
        for (int i = k; i < n; i++) {
            w = w + arr[i] - arr[i - k];
            if (w >= threshold * k) {
                count++;
            }
        }

        return count;
    }
}
