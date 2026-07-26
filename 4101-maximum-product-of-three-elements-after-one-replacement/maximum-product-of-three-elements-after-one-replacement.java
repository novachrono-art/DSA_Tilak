class Solution {
    public long maxProduct(int[] nums) {
     
        long lar=0;
        long slar=0;
        for(int num:nums){
            long x = Math.abs((long)num);
            if(x>lar){
                slar=lar;
                lar=x;
            }
            else if(x>slar){
                slar=x;
            }
        }
        return lar*slar*100000L;
    }
}