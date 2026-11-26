class Solution {
    int ct=0;
    public int islandPerimeter(int[][] arr) {
        boolean[][] seen = new boolean[arr.length][arr[0].length];
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                if(arr[i][j]==1){
                    help(arr,i,j,seen);
                    break;
                }
            }
        }

        return ct;
    }
    public void help(int[][] arr,int i,int j,boolean[][] seen){
          if(i<0 || j<0 || i>=arr.length || j>=arr[0].length || arr[i][j]==0){
               ct++;
               return;
          }
          if(seen[i][j]) return;
          seen[i][j]=true;
          help(arr,i+1,j,seen);
           help(arr,i-1,j,seen);
            help(arr,i,j-1,seen);
             help(arr,i,j+1,seen);
    }
}