class Solution {
    public int maxIncreaseKeepingSkyline(int[][] grid) {
        int n = grid.length;
        int r[] = new int[n];
        int c[] = new int[n];
        for(int i=0;i<n;i++){
            int rmax=0;
            int cmax=0;
            for(int j=0;j<n;j++){
                rmax= Math.max(rmax,grid[i][j]);
                cmax = Math.max(cmax,grid[j][i]);
            }
            r[i] = rmax;
            c[i] = cmax;
        }
        int sum=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
               sum+= Math.min(r[i],c[j]) - grid[i][j];
            }
        }
        return sum;
    }
}