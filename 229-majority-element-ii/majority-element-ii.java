class Solution {
    public List<Integer> majorityElement(int[] nums) {
        List<Integer> li = new ArrayList<>();
        int n=nums.length;
        
        for(int i=0;i<n;i++){
            if(li.contains(nums[i])) continue;
            int ct=0;
            for(int j=0;j<n;j++){
                if(nums[i]==nums[j]){
                    ct++;
                }
            }
            if(ct>(n/3)) li.add(nums[i]);
        }
        return li;
    }
}