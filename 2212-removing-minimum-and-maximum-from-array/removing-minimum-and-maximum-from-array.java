class Solution {
    public int minimumDeletions(int[] nums) {
        int n=nums.length;
        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;
        int maxi=0;
        int mini=0;
        for(int i=0;i<nums.length;i++){
            if(max<nums[i]){
                max=nums[i];
                maxi=i;
            }
            if(min>nums[i]){
                min=nums[i];
                mini=i;
            }
        }
       int l=Math.min(maxi,mini);
       int r=Math.max(maxi,mini);
       int p = r+1;
       int q= n-l;
       int x= (l+1)+(n-r);
       return Math.min(p,Math.min(q,x));
    }
}