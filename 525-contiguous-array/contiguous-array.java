class Solution {
    public int findMaxLength(int[] nums) {
        int n=nums.length;
        for(int i=0;i<n;i++){
            if(nums[i]!=1){
                nums[i]=-1;
            }
        }
        Map<Integer,Integer> mp = new HashMap<>();
        int max=0;
        int sum=0;
        mp.put(0,-1);
        for(int i=0;i<n;i++){
            sum+=nums[i];
            if(mp.containsKey(sum)){
                int len=i-mp.get(sum);
                max=Math.max(max,len);
            }
            else{
                mp.put(sum,i);
            }
        }
        return max;
    }
}