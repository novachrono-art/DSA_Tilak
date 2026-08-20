class Solution {
    public int findFinalValue(int[] nums, int original) {
        if(!rec(nums,original)){
            return original;
        }
        return findFinalValue(nums,original*2);
        
    }
    public boolean rec(int[] nums, int tar){
          for(int num:nums){
            if(num==tar) return true;
          }
          return false;
    }
}