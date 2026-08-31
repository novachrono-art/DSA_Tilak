class Solution {
    public int[] sortArrayByParity(int[] nums) {
        Integer temp[] = new Integer[nums.length];
        for(int i=0;i<nums.length;i++){
            temp[i]=nums[i];
        }
        Arrays.sort(temp,(a,b)-> Integer.compare(a%2,b%2));
        for(int i=0;i<nums.length;i++){
            nums[i]=temp[i];
        }
        return nums;
    }
}