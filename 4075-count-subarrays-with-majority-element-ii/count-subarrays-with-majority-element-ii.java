class Solution {
    public long countMajoritySubarrays(int[] nums, int target) {
        int n = nums.length;
        int[] freq = new int[2*n+1];
        freq[n]=1;
        int indx=n;
        long pre=0;
        long res=0;
        for(int x:nums){
            if(x==target){
                pre=pre+freq[indx];
                indx++;
            } else{
                indx--;
                pre=pre-freq[indx];
            }
            freq[indx]++;
            res+=pre;
        }
        return res;
    }
}