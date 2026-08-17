import java.util.*;
class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        // int max=0;
        // int min=101;
        // for(int i=0;i<nums.length;i++){
            
        //     if(nums[i]>max) max=nums[i];
        //     if(nums[i]<min) min=nums[i];
        // }
        Arrays.sort(nums);
        int min=nums[0];
        int max=nums[nums.length-1];
        List<Integer> li = new ArrayList<>();
        for(int i=min;i<=max;i++){
            int tar=i;
            boolean check=true;
            for(int j:nums){
                if(j==tar){
                    check=false;
                    break;
                }
            }
            if(check) li.add(tar);
        }
        return li;
    }
}