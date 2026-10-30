class Solution {
    public int numOfSubarrays(int[] arr, int k, int threshold) {
        int ct=0;
        for(int i=0;i<=arr.length-k;i++){
            int sum=0;
            for(int j=i;j<i+k;j++){
                sum+=arr[j];
            }
            int avg=sum/k;
            if(avg>=threshold){
                ct++;
            }
        }
        return ct;
    }
}