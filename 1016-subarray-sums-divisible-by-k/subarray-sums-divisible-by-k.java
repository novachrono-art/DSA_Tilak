class Solution {
    public int subarraysDivByK(int[] nums, int k) {
        int ct=0;
        int sum=0;
        Map<Integer,Integer> mp =new HashMap<>();
        mp.put(0,1);
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
            int rem=(sum%k+k)%k;
            if(mp.containsKey(rem)){
                ct+=mp.get(rem);
            }
            mp.put(rem,mp.getOrDefault(rem,0)+1);
        }
        return ct;
    }
}