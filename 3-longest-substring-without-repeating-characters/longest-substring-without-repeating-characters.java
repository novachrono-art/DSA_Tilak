class Solution {
    public int lengthOfLongestSubstring(String s) {
        Set<Character> st = new HashSet<>();
        int len=0;
        int le=0;
        for(int ri=0;ri<s.length();ri++){
            while(st.contains(s.charAt(ri))){
                st.remove(s.charAt(le));
                le++;
            }
            st.add(s.charAt(ri));
            len=Math.max(len,ri-le+1);
        }
        return len;
    }
}