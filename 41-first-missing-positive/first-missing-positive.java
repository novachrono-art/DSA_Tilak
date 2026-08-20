class Solution {
    public int firstMissingPositive(int[] nums) {
        int n = nums.length;
        
        for(int i=0; i<n; i++)
            if(nums[i]<=0 || nums[i]>n)
            { nums[i]=n+1;
            }
        int ans=0;
        for(int i=0; i<n; i++){
            int val= Math.abs(nums[i]);
            if(val>=1 && val<=n){
            int ind = val-1;
            nums[ind]= -Math.abs(nums[ind]);
            } }
            for(int i=0; i<n; i++){
            if(nums[i]>0)
                return i+1;}
        return n+1;
        } 
    } 