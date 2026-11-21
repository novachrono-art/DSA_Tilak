class Solution {
    public boolean exist(char[][] board, String word) {
        int m=board.length;
        int n=board[0].length;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(help(board,word,0,i,j))  return true;
            }
        }
        return false;
    }
    public boolean help(char[][] arr, String s, int ind,int sr,int sc){
           if(ind==s.length()){
               return true;
           }
           if(sr<0 || sc<0 || sr>=arr.length || sc>=arr[0].length || arr[sr][sc]!=s.charAt(ind)){
            return false;
           }
           boolean k=false;
           char temp =arr[sr][sc];
           arr[sr][sc]='*';
           k = help(arr,s,ind+1,sr-1,sc) ||  help(arr,s,ind+1,sr+1,sc) ||  help(arr,s,ind+1,sr,sc-1) ||  help(arr,s,ind+1,sr,sc+1);
           arr[sr][sc]=temp;
           return k;
    }
}