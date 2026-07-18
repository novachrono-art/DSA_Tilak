class Solution {
    public int dominantIndex(int[] nums) {
        int lar = -1;
        int slar = -1;
        int ind=-1;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>lar){
                slar=lar;
                lar=nums[i];
                ind=i;
            }
            if(nums[i]<lar && nums[i]>slar){
                slar=nums[i];
            }

        }
        if(lar>=2*slar){
            return ind;
        }
        return -1;
    }
}