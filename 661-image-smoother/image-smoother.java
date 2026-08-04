class Solution {
    public int[][] imageSmoother(int[][] img) {
        int res[][] =  new int[img.length][img[0].length];
        for(int i=0;i<img.length;i++){
            for(int j=0;j<img[0].length;j++){
                res[i][j] = smooth(img,i,j);
            }

        } return res;
    }
    public int smooth(int[][] arr,int p,int q){
        int r=arr.length;
        int c=arr[0].length;
        int sum=0;
        int ct=0;
        for(int i=-1;i<=1;i++){
            for(int j=-1;j<=1;j++){
                int np = p+i;
                int nq= q+j;
                if(np<0 || np>=r || nq<0 || nq>=c) continue;
                sum+=arr[np][nq];
                ct++;
            }
        }
        return sum/ct;
    }
}