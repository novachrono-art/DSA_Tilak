class Solution {
    public int maxArea(int[] h) {
        int res=0;
        int i=0;
        int j=h.length-1;
        while(i<j){
            res=Math.max(res,(j-i)*(Math.min(h[i],h[j])));
            if(h[i]<h[j]) i++;
            else j--;
        }
        return res;
    }
}