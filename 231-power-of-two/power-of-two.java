class Solution {
    public boolean isPowerOfTwo(int n) {
        return help(n);
    }
    public boolean help(int n){
        if(n<=0) return false;
        if(n==1) return true;
        if(n%2!=0) return false;
        return help(n/2);
    }
}