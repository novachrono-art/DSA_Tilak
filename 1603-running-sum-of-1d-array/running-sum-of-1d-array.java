class Solution {
    public int[] runningSum(int[] nums) {
        int n=nums.length;
        int sum[] = new int[n];
        for(int i=0;i<n;i++){
             
             for(int j=0;j<=i;j++){
                sum[i]+=nums[j];
             }
             
        }
        return sum;
    }
}