class Solution {
    public List<List<Integer>> findWinners(int[][] matches) {
        List<List<Integer>> res = new ArrayList<>();
        Map<Integer,Integer> mp = new HashMap<>();
        for(int i=0;i<matches.length;i++){
            mp.putIfAbsent(matches[i][0],0);
            mp.put(matches[i][1],mp.getOrDefault(matches[i][1],0)+1);
        }
        List<Integer> los = new ArrayList<>();

        List<Integer> win = new ArrayList<>();
        for(int val: mp.keySet()){
            
            int freq= mp.get(val);
           if(freq==0) win.add(val);
           else if(freq==1) los.add(val);
        }
        Collections.sort(win);
        Collections.sort(los);
        res.add(win);
        res.add(los);
        return res;
    }
}