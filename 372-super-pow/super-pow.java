class Solution { 

    public int superPow(int a, int[] b) {
        a%=1337;
        int n=b.length;
        int res =1;
        for(int i=0;i<n;i++){
            res=(power(res, 10) * power(a, b[i])) % 1337;
        }
        return res;
        }
       

    
        public int power(int i,int j){
        if(j==0) return 1;
        if(j==1) return i%1337;
        i%=1337;
        if(j%2==0) return power((i*i)%1337,j/2);
        return i*power(i,j-1)%1337;

    }

    
}