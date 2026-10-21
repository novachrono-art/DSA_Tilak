class Solution {
    public int majorityElement(int[] nums) {
        int n=nums.length;
        int ans=0;
        Map<Integer,Integer> mp =new HashMap<>();
        for(int i=0;i<n;i++){
            mp.put(nums[i],mp.getOrDefault(nums[i],0)+1);
            int val=mp.get(nums[i]);
            if(val>(n/2)) ans=nums[i];
        }
        return ans;
    }
}