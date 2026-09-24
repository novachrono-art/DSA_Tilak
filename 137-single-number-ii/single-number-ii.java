class Solution {
    public int singleNumber(int[] arr) {
        Arrays.sort(arr);
        int n=arr.length;
        for(int i=0;i<n-1;i+=3){
            if(arr[i]!=arr[i+1]) return arr[i];
        }
        return arr[n-1];
    }
}