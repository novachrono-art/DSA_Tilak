class Solution {
    int[][] dp;
    public int uniquePaths(int m, int n) {
        dp =new int[m][n];
        for(int[] r:dp){
            Arrays.fill(r,-1);
        }
        return help(0,0,m-1,n-1);
        
    }
    public int help(int sr,int sc,int dr,int dc){
        if(sr>dr || sc>dc){
            return 0;
        }
        if(sr==dr && sc==dc){
            return 1;
        }
        if(dp[sr][sc]!=-1){
            return dp[sr][sc];
        }
        int down =help(sr+1,sc,dr,dc);
        int right =help(sr,sc+1,dr,dc);
       
       return dp[sr][sc] =down+right;
    }
}