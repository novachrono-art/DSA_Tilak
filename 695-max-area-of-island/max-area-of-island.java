class Solution {
    public int maxAreaOfIsland(int[][] grid) {
        int ct=0;
        for(int i=0;i<grid.length;i++){
        
            for(int j=0;j<grid[0].length;j++){
                
                if(grid[i][j]==1){
                    int c1=help(grid,i,j);
                    ct=Math.max(ct,c1);
                }
            }
        }
        return ct;
    }

    public int help(int[][] arr,int i,int j){
        if(i<0 || j<0 || i>=arr.length || j>=arr[0].length || arr[i][j]==0){
            return 0;
        }
        arr[i][j]=0;
        
        return 1+help(arr,i+1,j)+help(arr,i-1,j)+ help(arr,i,j+1)+ help(arr,i,j-1);
    }
}