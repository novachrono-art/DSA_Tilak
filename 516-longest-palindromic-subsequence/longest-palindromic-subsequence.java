class Solution {
    int[][] dp;
    public int longestPalindromeSubseq(String s) {
        dp = new int[s.length()][s.length()];
        for(int[] r:dp){
            Arrays.fill(r,-1);
        }
        return help(s,0,s.length()-1);
    }
    public int help(String s,int i,int j){
           if(i>j) return 0;
           if(i==j) return 1;
           if(s.charAt(i)==s.charAt(j)){
               return 2+help(s,i+1,j-1);
           }
           if(dp[i][j]!=-1) return dp[i][j];
           int pk =help(s,i+1,j);
           int npk =help(s,i,j-1);
           dp[i][j]= Math.max(pk,npk);
           return Math.max(pk,npk);
    }
}