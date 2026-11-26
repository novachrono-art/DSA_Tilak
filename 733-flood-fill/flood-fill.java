class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int og=image[sr][sc];
        if(og==color) return image;
        help(image,sr,sc,color,og);
        return image;
    }
    public void help(int[][] arr,int sr,int sc,int cl,int og){
             if(sr<0 || sr>=arr.length || sc <0 || sc>=arr[0].length || arr[sr][sc]!=og ){
                return;
             }
             arr[sr][sc]=cl;
             help(arr,sr+1,sc,cl,og);
              help(arr,sr-1,sc,cl,og);
               help(arr,sr,sc+1,cl,og);
                help(arr,sr,sc-1,cl,og);
    }
}