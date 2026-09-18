class Solution {
    public int distributeCandies(int[] nums) {
        int n=nums.length;
        HashSet<Integer> s = new HashSet<>();
        for(int i=0;i<nums.length;i++){
            s.add(nums[i]);
        }
        return Math.min(s.size(),n/2);
    }
}