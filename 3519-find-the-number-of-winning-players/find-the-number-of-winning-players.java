class Solution {
    public int winningPlayerCount(int n, int[][] pick) {
        int ct=0;
        for(int i=0;i<n;i++){
            int col[]= new int[11];
            for(int[] p:pick){
                if(i==p[0]){
                    if(++col[p[1]]>i){
                        ct++;
                        break;
                    }
                }
            }
        }
        return ct;
        
    }
}