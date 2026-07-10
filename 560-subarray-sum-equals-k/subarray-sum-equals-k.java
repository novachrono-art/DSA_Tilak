class Solution {
    public int subarraySum(int[] nums, int k) {
        int ct=0;
        int sum=0;
        HashMap<Integer,Integer> prefix = new HashMap<>();
        prefix.put(0,1);
        for(int i=0;i<nums.length;i++){
            sum += nums[i];
            int remove=sum-k;
            
            if(prefix.containsKey(remove)){
                ct+=prefix.get(remove);
            }
          prefix.put(sum, prefix.getOrDefault(sum, 0) + 1);
        }
        return ct;
    }
    }