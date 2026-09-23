class Solution {
    public int minOperations(int[] nums, int x) {
       int n= nums.length;
       int sum=0;
       for(int i:nums) sum+=i;
       int tar = sum-x;
       if(tar==0) return n;
       if(tar<0) return -1;
       
       int len=-1;
       int curr=0;
       int left=0;
       for(int right=0;right<n;right++){
           curr+=nums[right];
           while(curr>tar && left<=right){
             curr-=nums[left];
             left++;
           }
           if(curr==tar) len= Math.max(len,right-left+1);

       }
       return len==-1 ? -1 : n-len;
    }
}