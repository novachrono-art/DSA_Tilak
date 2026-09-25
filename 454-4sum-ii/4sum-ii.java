class Solution {
    public int fourSumCount(int[] nums1, int[] nums2, int[] nums3, int[] nums4) {
        Map<Integer,Integer> mp = new HashMap<>();
        int ct=0;
        for(int i:nums1){
            for(int j:nums2){
                int tot=i+j;
                mp.put(tot,mp.getOrDefault(tot,0)+1);
            }
        }
        for(int i:nums3){
            for(int j:nums4){
                int tar=-(i+j);
                if(mp.containsKey(tar)){
                    ct+=mp.get(tar);
                }
            }
        }
        return ct;
    }
}