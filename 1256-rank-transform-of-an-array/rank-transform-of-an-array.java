class Solution {
    public int[] arrayRankTransform(int[] arr) {
        int n= arr.length;
        int[] nums = new int[n];
        for(int i=0;i<n;i++){
            nums[i]=arr[i];
        }
       Arrays.sort(nums);
       int rank=1;
       HashMap<Integer,Integer> r = new HashMap<>();
       for(int i : nums){
         if(!r.containsKey(i)){
            r.put(i,rank++);
         }
       }
       for(int i=0;i<n;i++){
        arr[i]=r.get(arr[i]);
       }
       return arr;
    }
}