class Solution {
    public int minMoves(int[] nums) {
        int op=0;
        int max=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>max) max=nums[i];
        }
         for(int i=0;i<nums.length;i++){
            op+=max-nums[i];
        }
        return op;
    }
}