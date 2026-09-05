class Solution {
    public int firstStableIndex(int[] a, int k) {
        int n = a.length;
        int[] mn = new int[n];
        mn[n - 1] = a[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            mn[i] = Math.min(a[i], mn[i + 1]);
        }
        int mx = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            mx = Math.max(mx, a[i]);
            if (mx - mn[i] <= k) return i;
        }
               return -1;
    }
}