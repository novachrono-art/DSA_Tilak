class Solution {
    public int maxSubarrayLength(int[] nums, int k) {
        Map<Integer,Integer> mpp = new HashMap<>();
        int l=0;
        int len=0;
        for(int r=0;r<nums.length;r++){
            int val = nums[r];
            mpp.put(val,mpp.getOrDefault(val,0)+1);
            while(mpp.get(val)>k){
                mpp.put(nums[l],mpp.get(nums[l])-1);
                l++;
            }
            len =Math.max(len,r-l+1);
        }
        return len;
    }
}