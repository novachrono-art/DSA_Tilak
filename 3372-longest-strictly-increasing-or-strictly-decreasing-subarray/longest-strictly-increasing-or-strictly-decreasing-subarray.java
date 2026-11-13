class Solution {
    public int longestMonotonicSubarray(int[] nums) {
        int n=nums.length;
        int max=0;
        int ct=0;
        for(int i=0;i<n-1;i++){
            if(nums[i]<nums[i+1]){
                ct++;
                max=Math.max(max,ct);
            }
            else{
                ct=0;
            }
        }
        int maxi=0;
        int cat=0;
        for(int i=0;i<n-1;i++){
            if(nums[i]>nums[i+1]){
                cat++;
                maxi=Math.max(maxi,cat);
            }
            else{
                cat=0;
            }
        }
       return Math.max(maxi,max)+1;
    }
}