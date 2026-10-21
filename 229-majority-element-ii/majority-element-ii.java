class Solution {
    public List<Integer> majorityElement(int[] nums) {
        List<Integer> li = new ArrayList<>();
        int n=nums.length;
        Map<Integer,Integer> mp =new HashMap<>();
        
        for(int i=0;i<n;i++){
            if(li.contains(nums[i])) continue;
            mp.put(nums[i],mp.getOrDefault(nums[i],0)+1);
            if(mp.get(nums[i])>(n/3)){
                li.add(nums[i]);
            }
        }
        return li;
    }
}