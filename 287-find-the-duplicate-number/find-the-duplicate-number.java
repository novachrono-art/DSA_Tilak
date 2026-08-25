class Solution {
    public int findDuplicate(int[] nums) {
        Map<Integer,Integer> mp = new HashMap<>();
        for(int i:nums){
            mp.put(i,mp.getOrDefault(i,0)+1);
            int fr=mp.get(i);
            if(fr==2) return i;
        }
        return 0;
    }
}