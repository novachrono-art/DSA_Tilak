class Solution {
    public int countQuadruplets(int[] nums) {
        int n=nums.length;
        int res=0;
        for(int i=0;i<n-3;i++){
            for(int j=i+1;j<n-2;j++){
                for(int k=j+1;k<n-1;k++){
                    for(int m=k+1;m<n;m++){
                        if(nums[i]+nums[j]+nums[k]==nums[m]){
                            res++;
                        }
                    }
                }
            }
        }
        return res;
    }
}