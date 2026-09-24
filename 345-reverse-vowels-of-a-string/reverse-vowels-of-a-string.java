class Solution {
    public String reverseVowels(String s) {
        char ch[] =s.toCharArray();
        StringBuilder k = new StringBuilder();
        String v="aeiouAEIOU";
        for(int i=0;i<ch.length;i++){
            if(v.indexOf(ch[i])!=-1){
                k.append(ch[i]);
            }
        }
        int p =k.length()-1;
        for(int i=0;i<ch.length;i++){
            if(v.indexOf(ch[i])!=-1){
                ch[i]=k.charAt(p--);
            }
        }

        
        return new String(ch);
    }
}