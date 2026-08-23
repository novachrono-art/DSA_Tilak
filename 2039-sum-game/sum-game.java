class Solution {
    public boolean sumGame(String s) {
        int n = s.length();
        int sl=0,sr=0,l=0,r=0;
        for(int i=0;i<n;i++){
            char ch = s.charAt(i);
            if(i<n/2){
                if(ch=='?'){
                    l++;
                }
                else{
                  sl+=ch-'0';
                }
            
            }
            else{
                if(ch=='?') r++;
                else sr+=ch-'0';
            }
        }
        // if(l+r==0) return sl!=sr;
        if((l+r)%2!=0) return true;
        // if(l==r) return sl!=sr;
        return 2*(sl-sr) != 9*(r-l);
    }
}