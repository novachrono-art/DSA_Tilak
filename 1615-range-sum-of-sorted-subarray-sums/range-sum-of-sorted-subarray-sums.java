class Solution {
    public int rangeSum(int[] nums, int n, int left, int right) {
        List<Integer> li = new ArrayList<>();    
        for(int i=0;i<nums.length;i++){
            int sum=0;
            for(int j=i;j<nums.length;j++){
                sum+=nums[j];
                li.add(sum);
            }
        }
        Collections.sort(li);
        int ans=0;
        int mod=1000000007;
        while(left<=right){
            ans=(ans+li.get(left-1))%mod;
            left++;
        }
        return ans;
    }
}