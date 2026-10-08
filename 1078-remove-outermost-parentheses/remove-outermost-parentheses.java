class Solution {
    public String removeOuterParentheses(String s) {
        int l=0;
        StringBuilder sb =new StringBuilder();
        for(char c: s.toCharArray()){
            if(c=='('){
                if(l>0) sb.append(c);
                l++;
            }
            else{
                if(l>1) sb.append(c);
                l--;
            }
        }
        return sb.toString();
    }
}