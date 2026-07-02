class Solution {
    public boolean checkPowersOfThree(int n) {
        // we can not use a power again
        while(n>0){
            if(n%3==2){
                return false;
            }
            n/=3;
        }
        return true;
    }
}