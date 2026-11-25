class Solution {
    Integer[][] dp;
    public int minimumTotal(List<List<Integer>> triangle) {
        dp = new Integer[triangle.size()][triangle.size()];
       
        return help(triangle,0,0);
    }
    public int help(List<List<Integer>> tri,int i,int j){
          if(i==tri.size()-1) return tri.get(i).get(j);
          if(dp[i][j]!=null) return dp[i][j];
          int down = help(tri,i+1,j);
          int diag =help(tri,i+1,j+1);
        
          return  dp[i][j]=tri.get(i).get(j) +Math.min(down,diag);
    }
}