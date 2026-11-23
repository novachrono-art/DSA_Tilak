class Solution {
    public int numDistinct(String s, String t) {
        int[][] dp =new int[s.length()+1][t.length()+1];
        for(int[] r:dp){
            Arrays.fill(r,-1);
        }
        return help(s,t,0,0,dp);
    }

    public int help(String s, String t, int i, int j,int[][] dp) {

        if (j ==t.length()) return 1;
        if (i ==s.length()) return 0;
        if(dp[i][j]!=-1){
            return dp[i][j];
        }
        int tk=0;
        if (s.charAt(i) == t.charAt(j)) {
             tk = help(s, t, i + 1, j + 1,dp);
        }
          int ntk= help(s, t, i + 1, j,dp);
         return dp[i][j]= tk+ntk;
        
}
}