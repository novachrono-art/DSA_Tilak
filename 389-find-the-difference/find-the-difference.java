class Solution {
    public char findTheDifference(String s, String t) {
       int fr[] = new int[26];
       for(int i=0;i<s.length();i++){
        fr[s.charAt(i)-'a']++;
       }
        for(int i=0;i<t.length();i++){
        fr[t.charAt(i)-'a']--;
       }
       for(int i=0;i<fr.length;i++){
         if(fr[i]!=0) return (char)(i+'a');
       }
       return ' ';
    }
}