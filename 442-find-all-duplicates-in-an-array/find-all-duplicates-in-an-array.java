class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> li = new ArrayList<>();
        int n=nums.length;
        if(n==1) return li;
        Arrays.sort(nums);
        for(int i=0;i<n-1;i++){
            if(nums[i]==nums[i+1]){
               li.add(nums[i]);
            }
        }
        return li;
    }
}