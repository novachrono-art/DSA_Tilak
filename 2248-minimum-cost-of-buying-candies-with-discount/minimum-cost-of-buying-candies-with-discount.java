class Solution {
    public int minimumCost(int[] cost) {
        int n=cost.length;
        int ct=0;
        int res=0;
        Arrays.sort(cost);
        for(int i=n-1;i>=0;i--){
            ct++;
            if(ct%3!=0){
                res+=cost[i];
            }
        }
        return res;
    }
}