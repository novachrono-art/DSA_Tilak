class Solution {
    public int numIslands(char[][] grid) {
        int n=grid.length;
        int m=grid[0].length;
        int ct=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(grid[i][j]=='1'){
                    ct++;
                    help(i,j,grid);
                }
            }
        }
        return ct;
    }
    public void help(int i,int j,char[][] arr){
        if(i<0 || i>=arr.length || j<0 || j>=arr[0].length || arr[i][j]=='3' || arr[i][j]=='0'){
            return;
        }
        arr[i][j]='3';
        help(i+1,j,arr);
        help(i-1,j,arr);
        help(i,j+1,arr);
        help(i,j-1,arr);
    }
}