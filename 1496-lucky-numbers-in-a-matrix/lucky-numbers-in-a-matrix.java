class Solution {
    public List<Integer> luckyNumbers(int[][] arr) {
        List<Integer> li = new ArrayList<>();
        int r=arr.length;
        int c=arr[0].length;
        for(int i=0;i<arr.length;i++){
            int mincol=0;
            for(int j=1;j<arr[i].length;j++){
                if(arr[i][j]<arr[i][mincol])
                  mincol=j;
            }
        int p = arr[i][mincol];
        boolean lucky = true;
        for(int k=0;k<arr.length;k++){
            if(arr[k][mincol]>p){
                lucky=false;
                break;
            }
        }
        if(lucky) li.add(p);
    }
    return li;
    }
}