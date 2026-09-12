import java.util.HashMap;

class Solution {
    public boolean isIsomorphic(String s, String t) {
       int[] fr1 = new int[256];
       int[] fr2 = new int[256];
       for(int i=0;i<s.length();i++){
           char sc = s.charAt(i);
           char tc  = t.charAt(i);

           if(fr1[sc]!=fr2[tc]) return false;

           fr1[sc]=i+1;
           fr2[tc]=i+1;
       }
       return true;
    }
}