class Solution {
    public boolean checkDivisibility(int n) {
        int c=n;
        int sum=0;
        int prod=1;
        while(n>0){
            int d=n%10;
            sum+=d;
            prod*=d;
            n/=10;
        }
         if(c%(prod+sum)==0) return true;
         return false;
    }
}