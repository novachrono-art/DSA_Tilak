class Solution {
    public int maxActiveSectionsAfterTrade(String s) {
        int one=0;
        
        for(char c : s.toCharArray()){
            if(c=='1') one++;
        }
        s="1"+s+"1";
        int n=s.length();
        int i=0;
        int ans=one;
        while(i<n && s.charAt(i)=='1') i++;
        int b10=0;
        while(i<n && s.charAt(i)=='0'){
            b10++;
            i++;
        }
        while(i<n){
            int b11=0;
            while(i<n && s.charAt(i)=='1'){
                b11++;
                i++;
            }
            if(b11==0) break;

            int b20=0;
            while(i<n && s.charAt(i)=='0'){
                b20++;
                i++;
            }
            if(b20==0) break;
            ans = Math.max(ans,one+b10+b20);
            b10=b20;
        
        }
       return ans;
    }
}