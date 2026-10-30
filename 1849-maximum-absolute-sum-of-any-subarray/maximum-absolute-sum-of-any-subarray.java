class Solution {
    public int maxAbsoluteSum(int[] nums) {
        int maxSum =nums[0],currentMax = nums[0];
        int minSum =nums[0],currentMin = nums[0];
        
        for (int i = 1; i < nums.length; i++) {
            currentMax = Math.max(nums[i], currentMax + nums[i]);
            maxSum = Math.max(maxSum, currentMax);
            
            currentMin = Math.min(nums[i], currentMin + nums[i]);
            minSum = Math.min(minSum, currentMin);
        }
        
        return Math.max(maxSum, Math.abs(minSum));
    }
}