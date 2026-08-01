class Solution {
    public boolean predictTheWinner(int[] nums) {
        int n=nums.length;
        return check(nums,0,n-1)>=0;
    }
    public int check(int[] nums,int l,int r){
        if(l==r) return nums[l];
        int left=nums[l]-check(nums,l+1,r);
        int right=nums[r]-check(nums,l,r-1);
        return Math.max(left,right);
    }
}