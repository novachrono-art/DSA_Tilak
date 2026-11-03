class Solution {
    public int minMoves(int[] nums) {
        Arrays.sort(nums);
        int op=0;
        for(int i=0;i<nums.length;i++){
            op+=nums[nums.length-1]-nums[i];
        }
        return op;
    }
}