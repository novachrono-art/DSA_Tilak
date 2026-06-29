class Solution {
    public int maxDepth(String s) {
        int ct=0;
        int ans=0;
        for(int i=0;i<s.length();i++){
            char k= s.charAt(i);
            if(k=='('){
                ct++;
                ans=Math.max(ans,ct);
            } else if(k==')'){
                ct--;
            }
        } return ans;
    }
}