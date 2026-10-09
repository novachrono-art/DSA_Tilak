class Solution {
    public int reverseBits(int n) {
        StringBuilder sb =new StringBuilder();
        for(int i=0;i<32;i++){
            sb.append(n%2);
           n= n>>>1;
        }
        int res=0;
        int p=1;
        for(int i=0;i<sb.length();i++){
             if(sb.charAt(31-i)=='1') res+=p;
             p=p*2;
        }
        return res;
    }
}