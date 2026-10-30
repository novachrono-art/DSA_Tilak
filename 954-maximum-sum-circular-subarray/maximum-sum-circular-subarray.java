class Solution {
    public int maxSubarraySumCircular(int[] nums) {
        int sum=0;
        int max=nums[0];
        int min=nums[0];
        int currmax=0;
        int currmin=0;
        int n=nums.length;
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
            currmax=Math.max(nums[i],currmax+nums[i]);
            max=Math.max(max,currmax);

            currmin=Math.min(nums[i],currmin+nums[i]);
            min=Math.min(min,currmin);
        }
        if(max<0) return max;
        return Math.max(max,sum-min);
    }
}