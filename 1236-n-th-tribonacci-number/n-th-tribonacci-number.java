class Solution {
    public int tribonacci(int n) {
        int[] dp= new int[38];
        Arrays.fill(dp,-1);
        dp[0]=0;
        dp[1]=1;
        dp[2]=1;
        return tri(n,dp); 
        
    }
    public int tri(int n,int[] dp){
        if(dp[n]!=-1) return dp[n];
        if(n==0) return 0;
        if(n==1 || n==2) return 1;
        dp[n]= tri(n-3,dp) + tri(n-2,dp) + tri(n-1,dp);
        return tri(n-3,dp) + tri(n-2,dp) + tri(n-1,dp);
    }
}