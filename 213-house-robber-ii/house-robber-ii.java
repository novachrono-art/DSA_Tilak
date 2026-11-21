class Solution {
    public int rob(int[] nums) {
        int n=nums.length;
        if(n==1) return nums[0];
        int dp1[] =new int[n];
        Arrays.fill(dp1,-1);
        int dp2[] =new int[n];
        Arrays.fill(dp2,-1);
        int res1=help(nums,1,n-1,dp1);
        int res2=help(nums,0,n-2,dp2);
        return Math.max(res1,res2);
    }
    public int help(int[]arr, int st,int ind,int[] dp){
        if(ind<st) return 0;
        if(ind==st) return arr[st];
        if(dp[ind]!=-1){
            return dp[ind];
        }
        int rob=arr[ind]+help(arr,st,ind-2,dp);
        int dont_rob =help(arr,st,ind-1,dp);
        dp[ind]=Math.max(rob,dont_rob);
        return Math.max(rob,dont_rob);
    }
}