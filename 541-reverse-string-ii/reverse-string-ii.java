class Solution {
    public String reverseStr(String s, int k) {
        char arr[] = s.toCharArray();
        for(int i=0;i<s.length();i+=k*2){
            int left=i;
            int right=Math.min(i+k-1,arr.length-1);
            while(left<right){
                char t=arr[left];
                arr[left]=arr[right];
                arr[right]=t;
                left++;
                right--;
            }
        }
        return new String(arr);
    }
}