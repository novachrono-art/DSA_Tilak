class Solution {
    public int rob(int[] nums) {
        int n=nums.length;
        int[] dp =new int[n];
        Arrays.fill(dp,-1);
        return help(nums,n-1,dp);
    }
    public int help(int[] arr, int ind, int[] dp){
        if(ind<0) return 0;
        if(ind==0) return arr[0];
        if(dp[ind]!=-1) return dp[ind];
        int next=arr[ind]+help(arr,ind-2,dp);
        int skip= help(arr,ind-1,dp);
        dp[ind]= Math.max(skip,next);
        return dp[ind];
    }
}