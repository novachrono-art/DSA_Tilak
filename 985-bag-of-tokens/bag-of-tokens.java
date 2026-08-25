class Solution {
    public int bagOfTokensScore(int[] tokens, int power) {
        Arrays.sort(tokens);
        int l=0;
        int r=tokens.length-1;
        int sc=0;
        int max=0;
        while(l<=r){
            if(power>=tokens[l]){
                power-=tokens[l];
                l++;
                sc++;
                max=Math.max(max,sc);
            }
            else if(sc>0 && l<r){
                power+=tokens[r--];
                sc--;
            }
            else{
                break;
            }
        }
        return max;
    }
}