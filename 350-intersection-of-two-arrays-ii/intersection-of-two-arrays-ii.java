class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        int[] fr = new int[1001];
        for(int i=0;i<nums1.length;i++){
            fr[nums1[i]]++;
        }
        int res[] =new int[Math.max(nums1.length,nums2.length)];
        int j=0;
        for(int i=0;i<nums2.length;i++){
            if(fr[nums2[i]]>0) {
                res[j]=nums2[i];
                j++;
                fr[nums2[i]]--;
                }
        }
        return java.util.Arrays.copyOf(res,j);
    }
}