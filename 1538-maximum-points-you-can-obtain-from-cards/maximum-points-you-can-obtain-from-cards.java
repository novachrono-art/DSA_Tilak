class Solution {
    public int maxScore(int[] cp, int k) {
        int n=cp.length;
        int total= 0;
        for(int i:cp) total+=i;
        if(n==k) return total;
        int ws =n-k;
        int currsum=0;
        for(int i=0;i<ws;i++){
            currsum+=cp[i];
        }
        int minsum=currsum;
        for(int i=ws;i<n;i++){
           currsum+=cp[i]-cp[i-ws];
           minsum=Math.min(minsum,currsum);
        }
       return total-minsum;
    }
}