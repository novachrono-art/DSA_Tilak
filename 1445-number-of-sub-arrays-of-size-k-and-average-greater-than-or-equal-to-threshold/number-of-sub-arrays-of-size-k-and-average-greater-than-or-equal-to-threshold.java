class Solution {
    public int numOfSubarrays(int[] arr, int k, int threshold) {
        int ct=0;
        int s=0;
        int sum=0;
        int max=0;
        for(int e=0;e<arr.length;e++){
            sum+=arr[e];
           
            if(e>=k-1){
                if((sum/k)>=threshold){
                ct++;
            }
            max=Math.max(max,ct);
                sum-=arr[s];
                s++;
            }
        }
        return max;
    }
}