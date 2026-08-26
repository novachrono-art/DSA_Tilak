class Solution {
    public int[][] flipAndInvertImage(int[][] im) {
        int r = im.length;
        int c=im[0].length;
        for(int i=0;i<r;i++){            
                    int p=0;
                    int q=c-1;
                    while(p<q){
                        int temp=im[i][p];
                        im[i][p]=im[i][q];
                        im[i][q]=temp;
                        p++;q--;
                    }
        }
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                 if(im[i][j]==0){
                    im[i][j]=1;
                 }
                 else{
                    im[i][j]=0;
                 }       
            }
        }
        return im;
    }
}