class Solution {
    List<List<String>> res = new ArrayList<>();
    public List<List<String>> solveNQueens(int n) {
        
        char[][] seen =new char[n][n];
        for(int i=0;i<n;i++){
            Arrays.fill(seen[i],'.');
        }
        help(seen,0,n);
        return res;
    }

    public void help(char[][] arr, int r, int n){
        if(r==n){
            List<String>li =new ArrayList<>();
            for(int i=0;i<n;i++){
                li.add(new String(arr[i]));
            }
            res.add(li);
            return;
        }
        for(int c=0;c<n;c++){
            if(safe(arr,r,c,n)){
                arr[r][c]='Q';
                help(arr,r+1,n);
                arr[r][c]='.';
            }
        }
    }

    public boolean safe(char[][] arr, int r, int c,int n){
        for(int i=0;i<r;i++){
            if(arr[i][c]=='Q') return false;
        }
        for(int i=r-1,j=c-1;i>=0 &&j>=0;i--,j--){
            if(arr[i][j]=='Q') return false;
        }
        for(int i=r-1,j=c+1;i>=0 && j<n;i--,j++){
            if(arr[i][j]=='Q') return false;
        }
        return true;
    }
}