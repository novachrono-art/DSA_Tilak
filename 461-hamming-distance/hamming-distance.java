class Solution {
    public int hammingDistance(int x, int y) {
       int num=x^y;
       int ct=0;
       while(num>0){
            if(num%2==1) ct++;
            num=num/2;
       } 
       return ct;
    }
}