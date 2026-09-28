class Solution {
    public int maxDepth(String s) {
        int ans=0;
        int ct=0;
        for(int i=0;i<s.length();i++){
            char ch =s.charAt(i);
            if(ch=='('){ ct++;
            ans=Math.max(ans,ct);
            }
            else if(ch==')'){
                ct--;
            }
        }
        return ans;
    }
}