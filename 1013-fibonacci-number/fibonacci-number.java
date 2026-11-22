class Solution {
    public int fib(int n) {
        int[] dp =new int[31];
        Arrays.fill(dp,-1);
        return fbn(n,dp);
    }
    public int fbn(int n,int[] dp){
        if(dp[n]!=-1) return dp[n];
        if(n==0) return 0;
        if(n==1) return 1;
        dp[n]= fbn(n-1,dp)+fbn(n-2,dp);
        return fbn(n-1,dp)+fbn(n-2,dp);
    }
}