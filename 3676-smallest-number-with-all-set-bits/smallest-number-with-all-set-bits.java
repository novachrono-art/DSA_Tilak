class Solution {
    public int smallestNumber(int n) {
        int res=0;
        int p=1;
        while(res<n){
            res+=p;
            p=p*2;
        }
        return res;
    }
}