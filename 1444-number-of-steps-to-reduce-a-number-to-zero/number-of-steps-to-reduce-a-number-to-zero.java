class Solution {
    public int numberOfSteps(int num) {
        return help(num,0);
    }
   
    public int help(int num,int k){
        if(num==0) return k;
        if(num%2==0) return help(num/2,k+1);
        return help(num-1,k+1);
    }
}