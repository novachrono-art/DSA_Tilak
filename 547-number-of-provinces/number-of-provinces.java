class Solution {
    public int findCircleNum(int[][] ic) {
        int n=ic.length;
        boolean seen[] = new boolean[n];
        int ct=0;
        for(int i=0;i<n;i++){
            if(!seen[i]){
                ct++;
                help(ic,seen,i);
            }
        }
        return ct;
    }
    public void help(int[][] ic,boolean[] seen,int nod){
         seen[nod] =true;
         for(int j=0;j<seen.length;j++){
            if(ic[nod][j]==1 && !seen[j]){
                help(ic,seen,j);
            }
         }
    }
}