class Solution {
    public int findJudge(int n, int[][] trust) {
        int[] sc = new int[n+1];
        for(int[] i : trust){
            sc[i[0]]--;
            sc[i[1]]++;
        }
        for(int i=1;i<=n;i++){
            if(sc[i]==n-1){
                return i;
            }
        }
        return -1;
    }
}