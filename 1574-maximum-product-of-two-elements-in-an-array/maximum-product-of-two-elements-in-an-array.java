class Solution {
    public int maxProduct(int[] a) {
        int largest = 0;
        int slargest = 0;

        for (int i = 0; i < a.length; i++) {
            if (a[i] > largest) {
                slargest = largest;
                largest = a[i];
            } else if (a[i] > slargest) {
                slargest = a[i];
            }
        }

        return (largest - 1) * (slargest - 1);
    }
}