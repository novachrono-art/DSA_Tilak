class Solution {
    public int numSubarraysWithSum(int[] nums, int goal) {
         return func(nums,goal)-func(nums,goal-1);
    }

    public int func(int[] nums, int goal){
        if(goal<0) return 0;
        int left=0;
        int ct=0;
        int sum=0;
        for(int r=0;r<nums.length;r++){
            sum+=nums[r];
            while(sum>goal){
                sum-=nums[left];
                left++;
            }
            ct+=r-left+1;
        }
        return ct;
    }
}