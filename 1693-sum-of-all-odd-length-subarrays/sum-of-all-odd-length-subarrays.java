class Solution {
    public int sumOddLengthSubarrays(int[] arr) {
        int sum=0;
        for(int i=0;i<arr.length;i++){
            int s2=0;
            for(int j=i;j<arr.length;j++){
                s2+=arr[j];
                if((j-i+1)%2!=0){
                    sum+=s2;
                }
            }
        }
       return sum;
    }
}