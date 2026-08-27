class Solution {
    public int numWaterBottles(int numBottles, int numExchange) {
        int res=numBottles;
        while(numBottles>=numExchange){
            // res+=numBottles;
            int k=numBottles/numExchange;
            int r=numBottles%numExchange;
            res+=k;
            numBottles=k+r;
        }
        return res;
    }
}