class Solution {
    int ct=0;
    public int coinChange(int[] coins, int amount) {
        int n=coins.length;
        int[][] dp=new int[n][amount+1];
       for(int[]r:dp){
           Arrays.fill(r,-1);
       }
        int res=help(coins,amount,n-1,dp);
        return res==Integer.MAX_VALUE ? -1 : res;
    }
    public int help(int[] arr,int k,int ind, int[][]dp){
        if(k==0){
            return 0;
        }
        if(ind<0) return Integer.MAX_VALUE;
        if(dp[ind][k]!=-1) return dp[ind][k];
        
        int take= Integer.MAX_VALUE;
        if(arr[ind]<=k){
            int tmp=help(arr,k-arr[ind],ind,dp);
            if(tmp!=Integer.MAX_VALUE){
                take=1+tmp;
            }
        }

        int nt=help(arr,k,ind-1,dp);
        dp[ind][k]= Math.min(take,nt);
        return Math.min(take,nt);
    }
}