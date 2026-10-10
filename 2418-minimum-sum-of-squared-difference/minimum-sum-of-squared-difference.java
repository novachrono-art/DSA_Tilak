class Solution {
    public long minSumSquareDiff(int[] nums1, int[] nums2, int k1, int k2) {
        int n=nums1.length;
        int diff[] = new int[100050];
        long k=(long)k1+k2;
        long sum=0;
        int max=0;
        for(int i=0;i<n;i++){
            int x=Math.abs(nums1[i]-nums2[i]);
            diff[x]++;
            sum+=x;
            max=Math.max(max,x);

        }
        if(sum<=k) return 0;
        for(int i=max;i>0 && k>0;i--){
            long m=Math.min(diff[i],k);
            diff[i]-=m;
            diff[i-1]+=m;
            k-=m;
        }
        long ans=0;
        for(int i=0;i<=max;i++){
            ans+=(long)i*i*diff[i];
        }
        return ans;
    }
}