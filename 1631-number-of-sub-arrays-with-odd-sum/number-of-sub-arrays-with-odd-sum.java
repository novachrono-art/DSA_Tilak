class Solution {
    public int numOfSubarrays(int[] arr) {
        final int mod=1000000007;
        long odd=0, even=0, ans=0;

        for(int x:arr){
            if(x%2==1){
                long newodd=even+1;
                long neweven=odd;
                odd=newodd;
                even=neweven;
            } else{
                even=even+1;
            }
            ans=(ans+odd)%mod;
        }
        return (int)ans;
    }
}