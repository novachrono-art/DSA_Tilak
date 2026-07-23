class Solution {
    public int maxSubArray(int[] nums) {
        int n =nums.length;
        int sumc = nums[0];
        int max = nums[0];
        for(int i=1;i<n;i++){
              sumc= Math.max(nums[i], sumc+nums[i]);
             max = Math.max(max,sumc); 
        }   return max;
        }
}