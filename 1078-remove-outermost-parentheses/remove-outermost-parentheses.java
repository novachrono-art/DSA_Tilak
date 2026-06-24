class Solution {
    public String removeOuterParentheses(String s) {
        StringBuilder k = new StringBuilder();
        int l=0;
        for(char c: s.toCharArray() ){
            if(c=='('){
                if(l>0) k.append(c);
                l++;
            }
            else{
                if(l>1) k.append(c);
                 l--;
            }    } return k.toString();
        
    }
}