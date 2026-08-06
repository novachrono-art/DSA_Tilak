class Solution {
    public int smallestNumber(int n, int t) {
        
        for(int i=n;i<=100;i++){
            int prod=1;
            int k=i;
            while(k>0){
                int digit=k%10;
                prod = prod*digit;
                k = k/10;
            }
            if(prod%t==0) return i;
        }
        return -1;
    }
}