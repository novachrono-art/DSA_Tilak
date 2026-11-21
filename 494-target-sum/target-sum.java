class Solution {
    int ct=0;
    public int findTargetSumWays(int[] nums, int target) {
        help(nums,target,0);
        return ct;
    }
    public void help(int[] arr,int t,int ind){
        if(ind==arr.length){
            if(t==0){
                ct++;
            }
            return;
        }
        help(arr,t-arr[ind],ind+1);
        help(arr,t+arr[ind],ind+1);
    }
}