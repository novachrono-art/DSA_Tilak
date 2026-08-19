class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> li = new ArrayList<>();
        Set<Integer> s = new HashSet<>(); 
        for(int i=0;i<nums.length;i++){
            s.add(nums[i]);
        }
        int n=nums.length;
        for(int i=1;i<=n;i++){
            if(!s.contains(i)){
                li.add(i);
            }
        }
        return li;
    }
}