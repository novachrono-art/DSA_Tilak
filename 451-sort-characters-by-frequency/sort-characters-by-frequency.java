class Solution {
    public String frequencySort(String s) {
        HashMap<Character,Integer> mp = new HashMap<>();
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            if(!mp.containsKey(ch)){
                mp.put(ch,1);
            } else{
                mp.put(ch,mp.get(ch)+1);
            }
        }
        PriorityQueue<Map.Entry<Character,Integer>> pq = new PriorityQueue<>(
            (a,b)-> b.getValue() - a.getValue() );

        pq.addAll(mp.entrySet());
        StringBuilder k = new StringBuilder();
        while(!pq.isEmpty()){
            Map.Entry<Character,Integer> ent = pq.poll();
            k.append(String.valueOf(ent.getKey()).repeat(ent.getValue()));
        }
        return k.toString();
    }
}