class Solution {
    public int evenNumberBitwiseORs(int[] nums) {
        int ans=0;
        for(int num:nums){
            ans|= num*((num+1)%2);
        }
        return ans;
    }
}