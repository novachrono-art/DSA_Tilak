class Solution {
    public int matchPlayersAndTrainers(int[] players, int[] trainers) {
        Arrays.sort(players);
        Arrays.sort(trainers);
        int i=0;
        int j=0;
        
        while(j<trainers.length && i<players.length){
            if(players[i]<=trainers[j]){
                
                i++;
            } j++;
        }
        return i;
    }
}