class Solution {
    public int[] frequencySort(int[] nums) {
        Map<Integer,Integer> mp = new HashMap<>();
        for(int i:nums){
            mp.put(i,mp.getOrDefault(i,0)+1);
        }
        Integer arr[] = new Integer[nums.length];
        for(int i=0;i<nums.length;i++){
            arr[i]=nums[i];
        }
        Arrays.sort(arr, (a,b) ->{
            if(!mp.get(a).equals(mp.get(b))){
                return mp.get(a) - mp.get(b);
            }
            return b -a;
        });
        for(int i=0;i<arr.length;i++){
            nums[i]=arr[i];
        }
        return nums;
    }
}