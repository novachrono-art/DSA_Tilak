class Solution {
    public int minBishopMoves(int[] sr, int[] tr) {
        if(sr[0]==tr[0] && sr[1]==tr[1]) return 0;
        if(Math.abs(sr[0]-tr[0])==Math.abs(sr[1]-tr[1])) return 1;
        if(((sr[0]+sr[1])%2)!= ((tr[0]+tr[1]))%2) return -1;
        return 2;
    }
}