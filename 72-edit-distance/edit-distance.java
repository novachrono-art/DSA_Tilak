class Solution {
    public int minDistance(String word1, String word2) {
        int[][] dp =new int[word1.length()+1][word2.length()+1];
        for(int[] r:dp){
            Arrays.fill(r,-1);
        }
        return help(word1,word2,word1.length(),word2.length(),dp);
    }
    public int help(String s,String p,int i,int j,int[][] dp){
        if(dp[i][j]!=-1) return dp[i][j];
        if(i==0) return j;
        if(j==0) return i;
        if(s.charAt(i-1)==p.charAt(j-1)){
            return help(s,p,i-1,j-1,dp);
        }
        int ins = 1+help(s,p,i,j-1,dp);
        int del = 1+ help(s,p,i-1,j,dp);
        int rep =1+help(s,p,i-1,j-1,dp);
        dp[i][j] = Math.min(ins,Math.min(del,rep));
        return Math.min(ins,Math.min(del,rep));
    }
}