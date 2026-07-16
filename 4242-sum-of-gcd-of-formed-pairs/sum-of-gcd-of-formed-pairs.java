class Solution {
    public static int getGCD(int a, int b) {
    return (b == 0) ? Math.abs(a) : getGCD(b, a % b);
    }

    public long gcdSum(int[] nums) {
        int n=nums.length;
        int[] arr = new int[n];
        int d=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            d=Math.max(d,nums[i]);
            int k=getGCD(nums[i],d);
            arr[i]=k;
        }
        long sum=0;
        Arrays.sort(arr);
        int i=0;
        int j=arr.length-1;
        while(i<j){
            sum+=getGCD(arr[i],arr[j]);
            i++;
            j--;
        }
        return sum;        
    }
}