class Solution {
    public int threeSumClosest(int[] nums, int tar) {
          Arrays.sort(nums);
          int cum=nums[0]+nums[1]+nums[2];
          for(int i=0;i<nums.length-2;i++){
            int l=i+1;
            int r=nums.length-1;
            while(l<r){
            int cursum = nums[i]+nums[l]+nums[r];
            if(Math.abs(tar-cursum)<Math.abs(tar-cum)){
                cum=cursum;
            }
            if(cursum<tar) l++;
            else if(cursum>tar) r--;
            else return cursum;}
          }
          return cum;
    }
}