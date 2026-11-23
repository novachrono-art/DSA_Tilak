class Solution {
    int[][] dp;
    public int uniquePathsWithObstacles(int[][] nums) {
        int m=nums.length;
        int n=nums[0].length;
        dp =new int[m][n];
        for(int[] r:dp){
            Arrays.fill(r,-1);
        }
        return help(0,0,m,n,nums);
    }

    public int help(int sr,int sc,int dr,int dc,int[][] arr){
        if(sr>=dr || sc>=dc || arr[sr][sc]==1){
            return 0;
        }
        if(sr==dr-1 && sc==dc-1) return 1;
        if(dp[sr][sc]!=-1) return dp[sr][sc];
        int right =help(sr,sc+1,dr,dc,arr);
        int left =help(sr+1,sc,dr,dc,arr);
        dp[sr][sc]=left+right;
        return left+right;
    }
}