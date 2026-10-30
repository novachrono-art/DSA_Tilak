class Solution {
    public int maxVowels(String s, int k) {
        int max=0;
        int st=0;
        int ct=0;
        for(int e=0;e<s.length();e++){
            if(isvow(s.charAt(e))){
                ct++;
            }
            if(e>=k-1){
                max=Math.max(max,ct);
                
                if(isvow(s.charAt(st))){
                    ct--;
                }
                st++;
            }
           
        }
        return max;
    }
    public boolean isvow(char c){
        if(c=='a' || c=='e' || c=='i' || c=='o' || c=='u' ){
            return true;
        }
        return false;
    }
}