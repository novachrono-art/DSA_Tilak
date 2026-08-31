class Solution {
    public int[] sortArrayByParityII(int[] nums) {
        Integer[] res= new Integer[nums.length];;
        for(int i=0;i<nums.length;i++){
            res[i]=nums[i];
        }
        Arrays.sort(res,(a,b)->Integer.compare(a%2,b%2));
        int ei=0;
        int oi=1;
        for(int i=0;i<nums.length;i++){
            if(res[i]%2!=0){
                nums[oi]=res[i];
                oi+=2;
            }
            else{
                nums[ei] = res[i];
                ei+=2;
            }
        }
        return nums;
    }
}