class Solution {
    public int numSubarraysWithSum(int[] nums, int goal) {
        Map<Integer,Integer> mp = new HashMap<>();
        int ans=0;
        int curr=0;
        mp.put(0,1);
        for(int num:nums){
            curr+=num;
            int tar=curr-goal;
            if(mp.containsKey(tar)){
                ans+=mp.get(tar);
            }
            mp.put(curr,mp.getOrDefault(curr,0)+1);
        }
        return ans;
    }
}