class Solution {
    public int fib(int n) {
        return fbn(n);
    }
    public int fbn(int n){
        if(n==0) return 0;
        if(n==1) return 1;
        return fbn(n-1)+fbn(n-2);
    }
}