class Solution {
    public boolean asteroidsDestroyed(int m, int[] s) {
        Arrays.sort(s);
        long sum=m;
        for(int i=0;i<s.length;i++){
            
            if(s[i]>sum) return false;
            else sum+=s[i];
        }
        return true;
    }
}