class Solution {
    public int passThePillow(int n, int time) {
       int d=1;
       int pos=1;
       while(time>0){
        if(pos==n) d=-1;
        else if(pos==1) d=1;
        pos+=d;
        time--;
       }
       return pos;
    }
}