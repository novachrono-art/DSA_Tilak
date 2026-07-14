class Solution {
    public double myPow(double x, int n) {
       long N=n;
       if(N<0){
        x= 1/x;
        N = -N;
       }
       return power(x,N);
    }
    public double power(double i,double j){
        if(j==0) return 1.0;
        if(j==1) return i;
        if(j%2==0) return power(i*i,j/2);
        return i*power(i,j-1);

    }
}