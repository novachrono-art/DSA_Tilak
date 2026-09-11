class Solution {
    private static long mod = 1000000007L;
    public int minAdjacentSwaps(int[] nums, int a, int b) {
        int k=0;       
        for(int i=0;i<nums.length;i++){
            if(nums[i]<a) nums[i]=0;
            else if(nums[i]>=a && nums[i]<=b) nums[i]=1;
            else nums[i]=2;
        }
       long c1=0;
       long c2=0;
       long s=0;
       for(int i=0;i<nums.length;i++){
           if(nums[i]==0){s+=c1+c2;
           }
           else if(nums[i]==1){
             s+=c2;
             c1++;
       }
       else{
        c2++;
       }
        }
    return (int) (s%mod);
    }
}