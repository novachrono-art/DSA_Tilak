class Solution {
    public int climbStairs(int n) {
        int[] dp =new int[46];
        Arrays.fill(dp,-1);
        return help(n,dp);
}
  public int help(int n,int[] dp){
    if(dp[n]!=-1) return dp[n];
    if(n==0 || n==1) return 1;
    dp[n] =help(n-1,dp) +help(n-2,dp);
    return help(n-1,dp) +help(n-2,dp);
  }
}