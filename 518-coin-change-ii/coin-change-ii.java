class Solution {
    int[][] dp;
    public int change(int amount, int[] coins) {
        dp = new int[coins.length][amount+1];
        for(int[] r:dp){
            Arrays.fill(r,-1);
        }
        return help(amount,coins,coins.length-1);
    }
    public int help(int tar,int[] arr,int ind){
        if(tar==0){
            return 1;
        }
        if(ind<0) return 0;
        if(dp[ind][tar]!=-1){
            return dp[ind][tar];
        }
        int tk=0;
        if(arr[ind]<=tar){
             tk =help(tar-arr[ind],arr,ind);
        }

        int ntk = help(tar,arr,ind-1);
        dp[ind][tar]=tk+ntk;
        return tk+ntk;
    }
}