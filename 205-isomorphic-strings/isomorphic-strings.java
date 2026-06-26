import java.util.HashMap;

class Solution {
    public boolean isIsomorphic(String s, String t) {
        HashMap<Character, Character> mpp1 = new HashMap<>();
        HashMap<Character, Character> mpp2 = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            char sc = s.charAt(i);
            char tc = t.charAt(i);

            if (mpp1.containsKey(sc)) {
                if (mpp1.get(sc) != tc) {
                    return false;
                }
            } else {
                mpp1.put(sc, tc);
            }

            
            if (mpp2.containsKey(tc)) {
                if (mpp2.get(tc) != sc) {
                    return false;
                }
            } else {
                mpp2.put(tc, sc);
            }
        }

        return true;
    }
}