class Solution {
    public int missingInteger(int[] nums) {
        int n =nums.length;
        int sum=nums[0];
        int ind=0;
        for(int i=1;i<n;i++){
            if(nums[i]==nums[i-1]+1)
                sum+=nums[i];           
            else
                break;
        }
       Set<Integer> s = new HashSet<>();
       for(int i: nums){
        s.add(i);
       }
       while(s.contains(sum)){
        sum++;
       }
       return sum;
    }
}