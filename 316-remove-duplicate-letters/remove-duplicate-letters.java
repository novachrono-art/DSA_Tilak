class Solution {
    public String removeDuplicateLetters(String s) {
        int[] lastind = new int[26];
        for(int i=0;i<s.length();i++){
            lastind[s.charAt(i)-'a'] = i;
        }
        Stack<Integer> st = new Stack();
        boolean[] seen = new boolean[26];
        for(int i=0;i<s.length();i++){
            int ele = s.charAt(i)-'a';
            if(seen[ele]) continue;
            while(!st.isEmpty() && st.peek()>ele && i<lastind[st.peek()])
               seen[st.pop()] = false;
        st.push(ele);
        seen[ele]=true;
        }
        StringBuilder t = new StringBuilder();
        while(!st.isEmpty()){
            t.append((char)(st.pop()+'a'));
        }
        return t.reverse().toString();
    }
}