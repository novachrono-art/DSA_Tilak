class Solution {
    public int minBitFlips(int start, int goal) {
        int num=start^goal;
       int ct=0;
       while(num>0){
            if(num%2==1) ct++;
            num=num/2;
       } 
       return ct;
    }
}