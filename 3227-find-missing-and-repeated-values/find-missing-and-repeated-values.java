class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        int ans[] = new int[2];
        int n = grid.length;
        int ct[] = new int[(n*n)+1];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                ct[grid[i][j]]++;
            }
        }
        for(int i=1;i<ct.length;i++){
            if(ct[i]==2) ans[0]=i;
            if(ct[i]==0) ans[1]=i;
        }
        return ans;
    }
}