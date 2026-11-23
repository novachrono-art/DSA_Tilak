
class Solution {
    public boolean canPartition(int arr[]) {
        int sum=0;
        for(int i:arr) sum+=i;
        if(sum%2!=0) return false;
        int tar=sum/2;
    Boolean dp[][] =new Boolean[arr.length][tar+1];
            return help(arr,tar,0,dp);

        }
        public boolean help(int[] arr,int tar,int ind,Boolean[][] dp){
            if(tar==0){
                return true;
            }
            if(ind==arr.length) return false;
            if(dp[ind][tar]!=null) return dp[ind][tar];
            boolean p=false;
            if(arr[ind]<=tar){
            p =help(arr,tar-arr[ind],ind+1,dp);
            }
            boolean np =help(arr,tar,ind+1,dp);
            dp[ind][tar] =p || np;
            return p || np;
        }
}