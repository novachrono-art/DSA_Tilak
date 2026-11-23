class Solution {
    int[][] dp;
    public int lengthOfLIS(int[] nums) {
         int n=nums.length;
        dp = new int[n][n+1];
        for(int[] r:dp){
            Arrays.fill(r,-1);
        }
       
        return help(nums,n-1,-1);
        
    }
    public int help(int[] nums,int i,int prev){
        if(i==0){
            if(prev==-1 || nums[0]<nums[prev]) return 1;
            return 0;
        }
        if(dp[i][prev+1]!=-1) return dp[i][prev+1];
        int ntk =help(nums,i-1,prev);
        int tk=0;
        if(prev==-1 || nums[i]<nums[prev]){
            tk =1+ help(nums,i-1,i);
        }
        dp[i][prev+1] =Math.max(ntk,tk);
        return Math.max(ntk,tk);
    
    }
}