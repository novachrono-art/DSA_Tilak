class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> li = new ArrayList<>();
        Arrays.sort(nums);
        int n=nums.length;
        int k=1;
        for(int i=0;i<n;i++){
           while(k<nums[i]){
            li.add(k);
            k++;
           }
           if(k==nums[i]){
            k++;
           }
        }
        while(k<=n){
            li.add(k);
            k++;
        }
        return li;
    }
}