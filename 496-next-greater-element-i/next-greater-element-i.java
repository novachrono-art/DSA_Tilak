class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int[] ans = new int[nums1.length];
        
        for(int i=0;i<nums1.length;i++){
            int val= nums1[i];
            int ind=-1;
            for(int j=0;j<nums2.length-1;j++){
                if(nums2[j]==val){
                    for(int k=j+1;k<nums2.length;k++){
                        if(nums2[k]>val){
                            ind=nums2[k];
                            break;
                        }
                        
                    }
                    break;
                }
             
        }
        ans[i]=ind;
        }
        
        return ans; 
    }
}