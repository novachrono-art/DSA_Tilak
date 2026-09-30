class Solution {
    public int characterReplacement(String s, int k) {
        int right=0;
        int left=0;
        int n=s.length();
        int len=0;
        int mfr=0;
        int f[] = new int[26];
        while(right<n){
            char c=s.charAt(right);
            f[c-'A']++;
            mfr =Math.max(mfr,f[c-'A']);
            if((right-left+1)-mfr>k){
                f[s.charAt(left)-'A']--;
                left++;
            }
            len=Math.max(len,right-left+1);
            right++;
        }
        return len;
    }
}