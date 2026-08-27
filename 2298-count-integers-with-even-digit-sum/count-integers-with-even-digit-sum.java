class Solution {
    public int countEven(int num) {
        int ct=0;
        for(int i=1;i<=num;i++){
            int t=i;
            int sum=0;
            while(t>0){
                int d=t%10;
                sum+=d;
                t/=10;
            }
            if(sum%2==0) ct++;
        }
        return ct;
    }
}