class Solution {
    public int findJudge(int n, int[][] trust) {
        Map<Integer,Integer> mp = new HashMap<>();
        Set<Integer> s = new HashSet<>();
        for(int i=0;i<trust.length;i++){
            int v = trust[i][0];
            int val = trust[i][1];
            s.add(v);
            mp.put(val,mp.getOrDefault(val,0)+1);
        }
        for(int i=1;i<=n;i++){
            if(mp.getOrDefault(i,0)==n-1 && !s.contains(i)){
                 return i;
            }
        }
        return -1;
    }
}