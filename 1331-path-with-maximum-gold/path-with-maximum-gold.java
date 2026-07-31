class Solution {
    int max=0;
    int[] dx = {0,0,1,-1};
    int[] dy = {1,-1,0,0};
    
    public int getMaximumGold(int[][] grid) {
        int r=grid.length;
        int c=grid[0].length;
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                if(grid[i][j]!=0){
                    max=Math.max(max,recu(grid,i,j,r,c));
                }
            }
           
        } return max;
    }
    public int recu(int[][] grid,int x,int y,int r,int c){
        if(x<0||x>=r||y<0||y>=c||grid[x][y]==0) return 0;
        int curr=grid[x][y];
        grid[x][y]=0;
        int k=curr;
        for(int i=0;i<4;i++){
            int nx=x+dx[i];
            int ny=y+dy[i];
            k=Math.max(k,curr+recu(grid,nx,ny,r,c));
        }
        grid[x][y]=curr;
        return k;
    }
}