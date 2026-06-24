import java.util.*;
class Solution {
    public int lengthOfLongestSubstring(String s) {
        int l=0;
        int max_len =0;
        Set<Character> c = new HashSet<>();
        for(int r=0; r<s.length();r++){
            while(c.contains(s.charAt(r))){
                c.remove(s.charAt(l));
                l++;
            }
            c.add(s.charAt(r));
            max_len = Math.max(max_len,r-l+1);
        }
        return max_len;
    }
}