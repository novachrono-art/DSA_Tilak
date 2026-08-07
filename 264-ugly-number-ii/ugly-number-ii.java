class Solution {
    public int nthUglyNumber(int n) {
        if(n==1) return 1;
        Set<Long> s = new HashSet<>();
        s.add(1L);
        long curr =1L;
        for(int i=1;i<n;i++){
            s.add(curr*2);
            s.add(curr*3);
            s.add(curr*5);

            long k = Long.MAX_VALUE;
            for(long x:s){
                if(x>curr && x<k){
                    k=x;
                }
            }
            curr=k;
        }
        return (int)curr;
        
    }
}