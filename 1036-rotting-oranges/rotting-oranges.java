class Solution {
    public int orangesRotting(int[][] grid) {
         Queue<OrangePair> q = new LinkedList<>();
         for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(grid[i][j]==2){
                    q.add(new OrangePair(i,j,0));
                }
            }
         }
        int time=0;
         while(!q.isEmpty()){

            OrangePair rv =q.poll();
            time =Math.max(time,rv.time);
            if(grid[rv.row][rv.col]==10) continue;

            grid[rv.row][rv.col]=10;

            solve(rv.row-1,rv.col,rv.time,q,grid);
             solve(rv.row+1,rv.col,rv.time,q,grid);
              solve(rv.row,rv.col-1,rv.time,q,grid);
               solve(rv.row,rv.col+1,rv.time,q,grid);
            
         }

         for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(grid[i][j]==1){
                    return -1;
                }
            }
         }
         return time;

    }
    public void solve(int i,int j,int t,Queue<OrangePair> q,int[][] arr){
          if(i>=0 && i<arr.length && j>=0 && j<arr[0].length && arr[i][j]==1){
          arr[i][j]=2;
          q.add(new OrangePair(i,j,t+1));
          }
    }
}

class OrangePair{
    int row;
    int col;
    int time;
    OrangePair(int row,int col,int time){
    this.row=row;
    this.col=col;
    this.time=time;
    }
}