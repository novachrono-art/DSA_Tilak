class Solution {
    public int hammingWeight(int n) {
        StringBuilder sb = new StringBuilder();
        while(n!=1){
            if(n%2==0) sb.append((char)(0+'0'));
            else sb.append((char)(1+'0'));
            n=n/2;
        }
        sb.append(1);
        sb.reverse();
        int ct=0;
        for(int i=0;i<sb.length();i++){
            if(sb.charAt(i)=='1') ct++;
        }
        return ct;
    }
}